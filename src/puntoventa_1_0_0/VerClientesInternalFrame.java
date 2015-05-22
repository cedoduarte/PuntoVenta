package puntoventa_1_0_0;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VerClientesInternalFrame extends javax.swing.JInternalFrame {

    public VerClientesInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        tableModel = new DefaultTableModel();
        final String identificadores[] = {"ID", "Nombre", "Dirección",
            "Teléfono", "e-mail"};
        tableModel.setColumnCount(identificadores.length);
        tableModel.setColumnIdentifiers(identificadores);
        table.setModel(tableModel);
        setTitle("Ver clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        recargarButton = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addComponent(recargarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recargarButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarButtonActionPerformed
        tableModel.setRowCount(0);
        EntidadCliente cliente = new EntidadCliente();
        List<EntidadCliente> clientes = cliente.leeTodoDeArchivo();
        for (EntidadCliente c : clientes) {
            Object values[] = {c.getId(), c.getNombre(), c.getDireccion(), 
                c.getTelefono(), c.getEmail()};
            tableModel.addRow(values);
        }
    }//GEN-LAST:event_recargarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton recargarButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private MainFrame parent;
    private DefaultTableModel tableModel;
}
