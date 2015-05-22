package puntoventa_1_0_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import reportes.ReporteVenta;

public class VisualizarVentasInternalFrame extends javax.swing.JInternalFrame {

    public VisualizarVentasInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        tableModel = new DefaultTableModel();
        final String identificadores[] = {"ID", "Descripción", "Precio",
            "Cantidad", "Monto", "Fecha"};
        tableModel.setColumnCount(identificadores.length);
        tableModel.setColumnIdentifiers(identificadores);
        table.setModel(tableModel);
        setTitle("Ver ventas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        recargarButton = new javax.swing.JButton();
        imprimirButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        recargarButton.setText("Recargar");
        recargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarButtonActionPerformed(evt);
            }
        });

        imprimirButton.setText("Imprimir");
        imprimirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirButtonActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imprimirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recargarButton)
                    .addComponent(imprimirButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarButtonActionPerformed
        SelectorFechaVentaDialog d = new SelectorFechaVentaDialog(null, false);
        d.setModal(true);
        d.setVisible(true);
        int opc = d.getSelectedOption();
        Date f1 = null;
        Date f2 = null;
        if (opc == 1) {
            return;
        }
        f1 = d.getFecha1();
        f2 = d.getFecha2();
        int cmp = f1.compareTo(f2);
        if (cmp < 0) {
            // f1 < f2
            tableModel.setRowCount(0);
            RegistroVenta v = new RegistroVenta();
            List<RegistroVenta> lista = v.leeTodoDeArchivo();
            for (RegistroVenta w : lista) {
                Date f = w.getFecha();
                int cmp1 = f.compareTo(f1);
                int cmp2 = f.compareTo(f2);
                if ((cmp1 == 0 || cmp1 > 0) && (cmp2 == 0 || cmp2 < 0)) {
                    Object values[] = {w.getId(), w.getDescripcion(),
                        w.getPrecio(), w.getCantidad(), w.getMonto(),
                        w.getFecha()};
                    tableModel.addRow(values);
                }
            }
        } else if (cmp == 0) {
            // f1 = f2
            JOptionPane.showMessageDialog(null, 
                    "Las fechas deben ser distintas");
        } else {
            // f1 > f2
            JOptionPane.showMessageDialog(null, 
                    "La fecha 1 debe ser anterior a la fecha 2");
        }
    }//GEN-LAST:event_recargarButtonActionPerformed

    private void imprimirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirButtonActionPerformed
        List ventas = new ArrayList();
        RegistroVenta venta;
        ReporteVenta rventa;
        ventas.clear();
        
        int rowCount = table.getModel().getRowCount();//tableModel.getRowCount();
        for (int i = 0; i < rowCount; ++i) {
            int id = (int) tableModel.getValueAt(i, 0);
            String descripcion = (String) tableModel.getValueAt(i, 1);
            double precio = (double) tableModel.getValueAt(i, 2);
            int cantidad = (int) tableModel.getValueAt(i, 3);
            double monto = (double) tableModel.getValueAt(i, 4);
            Date fecha = (Date) tableModel.getValueAt(i, 5);
            venta = new RegistroVenta(id, descripcion, precio, cantidad, 
                    monto, fecha);
            rventa = new ReporteVenta(venta);
            ventas.add(rventa);
        }
        
        Map<String, Object> params = new HashMap<String, Object>();
        //params.put("title1", "Ventas");
        
        try {
            String reportSource = "C:\\Users\\cedoduarte\\Documents\\NetBeansProjects\\PuntoVenta_1_0_0\\src\\reportes\\miReporte.jrxml";
            /*
            String reportSource = "C:/users/cedoduarte/documents"
                    + "/netbeansprojects/puntoventa_1_0_0/src/reportes"
                    + "/ventas.jrxml";
            */
            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, params,
                    new JRBeanCollectionDataSource(ventas));
            JasperViewer vista = new JasperViewer(jp, false);
            vista.setVisible(true);
        } catch (JRException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_imprimirButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            table.print();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimirButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton recargarButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private MainFrame parent;
    private DefaultTableModel tableModel;
}
