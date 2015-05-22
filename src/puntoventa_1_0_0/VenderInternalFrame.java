package puntoventa_1_0_0;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VenderInternalFrame extends javax.swing.JInternalFrame {

    public VenderInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        total = 0.0;
        tableModel = new DefaultTableModel();
        final String[] identificadores = {"ID", "Descripción", "Precio", "Cantidad",
            "Monto"};
        tableModel.setColumnCount(identificadores.length);
        tableModel.setColumnIdentifiers(identificadores);
        table.setModel(tableModel);
        idTextField.setHorizontalAlignment(JTextField.RIGHT);
        cambioTextField.setText("0.0");
        efectivoTextField.setText("0.0");
        eliminarButton.setEnabled(false);
        pagarButton.setEnabled(false);
        totalTextField.setEditable(false);
        cantidadSpinner.setValue(1);
        setTitle("Vender");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidadSpinner = new javax.swing.JSpinner();
        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        pagarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        efectivoTextField = new javax.swing.JTextField();
        cambioTextField = new javax.swing.JTextField();

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

        jLabel1.setText("ID");

        jLabel2.setText("Cantidad");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        pagarButton.setText("Pagar");
        pagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        jLabel4.setText("Efectivo");

        jLabel5.setText("Cambio");

        idTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTextFieldKeyReleased(evt);
            }
        });

        efectivoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                efectivoTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadSpinner)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(eliminarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagarButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambioTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(efectivoTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(agregarButton)
                    .addComponent(pagarButton)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(efectivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cambioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        agregaProducto();
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            total -= Double.parseDouble(tableModel.getValueAt(selectedRow, 4)
                    .toString());
            totalTextField.setText(String.valueOf(total));
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto",
                            "Aviso", 1);
        }
        if (tableModel.getRowCount() == 0) {
            eliminarButton.setEnabled(false);
            efectivoTextField.setText("0.0");
            cambioTextField.setText("0.0");
        } else {
            double totalVenta = Double.parseDouble(totalTextField.getText());
            double efectivo = Double.parseDouble(efectivoTextField.getText());
            if (efectivo >= totalVenta) {
                pagarButton.setEnabled(true);
                cambioTextField.setText(String.valueOf(efectivo - total));
            } else {
                pagarButton.setEnabled(false);
                cambioTextField.setText("0.0");
            }
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void pagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarButtonActionPerformed
        int rowCount = tableModel.getRowCount();
        for (int i = 0; i < rowCount; ++i) {
            RegistroVenta v = new RegistroVenta(
                    Integer.parseInt(tableModel.getValueAt(i, 0).toString()), 
                    tableModel.getValueAt(i, 1).toString(),
                    Double.parseDouble(tableModel.getValueAt(i, 2).toString()),
                    Integer.parseInt(tableModel.getValueAt(i, 3).toString()),
                    Double.parseDouble(tableModel.getValueAt(i, 4).toString()),
                    new Date());
            v.registraVenta();
        }
        tableModel.setRowCount(0);
        totalTextField.setText("");
        efectivoTextField.setText("");
        cambioTextField.setText("");
        eliminarButton.setEnabled(false);
        pagarButton.setEnabled(false);
        idTextField.grabFocus();
    }//GEN-LAST:event_pagarButtonActionPerformed

    private void idTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyReleased
        if (evt.getKeyChar() == '\n') {
            agregaProducto();
        }
    }//GEN-LAST:event_idTextFieldKeyReleased

    private void efectivoTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_efectivoTextFieldKeyReleased
        if (!"".equals(totalTextField.getText())) {
            double total = Double.parseDouble(totalTextField.getText());
            double efectivo = Double.parseDouble(efectivoTextField.getText());
            if (total <= efectivo) {
                    pagarButton.setEnabled(true);
                    cambioTextField.setText(String.valueOf(efectivo - total));
            } else {
                    pagarButton.setEnabled(false);
                    cambioTextField.setText("0.0");
            }
        }
    }//GEN-LAST:event_efectivoTextFieldKeyReleased

    private void agregaProducto() {
        if (idTextField.getText().isEmpty()) {
            return;
        }
        if ((int) cantidadSpinner.getValue() <= 0) {
            return;
        }
        EntidadProducto producto = new EntidadProducto();
        producto = producto.leeDeArchivo(producto,
                Integer.parseInt(idTextField.getText()));
        if (producto == null) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado",
                    "Aviso", 1);
            return;
        }
        Object values[] = {idTextField.getText(), producto.getNombre(), 
            producto.getPrecio(), cantidadSpinner.getValue(),
            producto.getPrecio() * Integer.parseInt(cantidadSpinner.getValue()
                    .toString())};
        tableModel.addRow(values);
        total += producto.getPrecio() * Integer.parseInt(cantidadSpinner
                .getValue().toString());
        totalTextField.setText(String.valueOf(total));
        idTextField.setText("");
        cantidadSpinner.setValue(1);
        eliminarButton.setEnabled(true);
        idTextField.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JTextField cambioTextField;
    private javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JTextField efectivoTextField;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagarButton;
    private javax.swing.JTable table;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables

    private MainFrame parent;
    private DefaultTableModel tableModel;
    private double total;
}
