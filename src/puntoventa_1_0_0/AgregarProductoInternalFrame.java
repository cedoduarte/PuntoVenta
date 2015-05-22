package puntoventa_1_0_0;

import javax.swing.JOptionPane;

public class AgregarProductoInternalFrame extends javax.swing.JInternalFrame {

    public AgregarProductoInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        idTextField.setEnabled(false);
        EntidadProducto producto = new EntidadProducto();
        idTextField.setText(String.valueOf(producto.getLastId()));
        setTitle("Agregar producto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        precioTextField = new javax.swing.JTextField();

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioTextField)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String id;
        String nombre;
        String precio;
        
        id = idTextField.getText();
        nombre = nombreTextField.getText();
        precio = precioTextField.getText();
        
        // id
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el id");
            return;
        }
        char idChars[] = id.toCharArray();
        for (char c : idChars) {
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "El id debe ser numérico");
                return;
            }
        }
        
        // nombre
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el nombre");
            return;
        }
        
        // precio
        if (precio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el precio");
            return;
        }
        char precioChars[] = precio.toCharArray();
        for (char c : precioChars) {
            if (!Character.isDigit(c)) {
                if (c != '.') {
                    JOptionPane.showMessageDialog(null, 
                            "El precio debe ser numérico");
                    return;
                }
            }
        }
        
        EntidadProducto producto = new EntidadProducto(
                Integer.parseInt(idTextField.getText()),
                nombreTextField.getText(), 
                Double.parseDouble(precioTextField.getText()));
        String mensaje = producto.guardaEnArchivo();
        JOptionPane.showMessageDialog(null, mensaje);
        if (!mensaje.equals("El registro ya existe")) {
            idTextField.setText("");
            nombreTextField.setText("");
            precioTextField.setText("");
            idTextField.grabFocus();
        }
        idTextField.setText(String.valueOf(producto.getLastId()));
    }//GEN-LAST:event_guardarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioTextField;
    // End of variables declaration//GEN-END:variables

    private MainFrame parent;
}
