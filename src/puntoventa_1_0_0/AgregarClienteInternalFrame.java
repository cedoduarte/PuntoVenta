package puntoventa_1_0_0;

import javax.swing.JOptionPane;

public class AgregarClienteInternalFrame extends javax.swing.JInternalFrame {

    public AgregarClienteInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        idTextField.setEnabled(false);
        EntidadCliente cliente = new EntidadCliente();
        idTextField.setText(String.valueOf(cliente.getLastId()));
        setTitle("Agregar cliente");
    }
    
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        direccionTextField = new javax.swing.JTextField();
        telefonoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección");

        jLabel4.setText("Teléfono");

        jLabel5.setText("e-mail");

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
                    .addComponent(guardarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String id;
        String nombre;
        String direccion;
        String telefono;
        String email;
        
        id = idTextField.getText();
        nombre = nombreTextField.getText();
        direccion = direccionTextField.getText();
        telefono = telefonoTextField.getText();
        email = emailTextField.getText();
        
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
        
        // direccion
        if (direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba dirección");
            return;
        }
        
        // telefono
        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba teléfono");
            return;
        }
        char telefonoChars[] = telefono.toCharArray();
        for (char c : telefonoChars) {
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "El teléfono debe ser numérico");
                return;
            }
        }
        
        // email
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escriba el email");
            return;
        }
        if (!isValidEmailAddress(email)) {
            JOptionPane.showMessageDialog(null, "El email es incorrecto");
            return;
        }
        
        
        EntidadCliente cliente = new EntidadCliente(
                Integer.parseInt(idTextField.getText()),
                nombreTextField.getText(), direccionTextField.getText(),
                telefonoTextField.getText(), emailTextField.getText());
       
        String mensaje = cliente.guardaEnArchivo();
        JOptionPane.showMessageDialog(null, mensaje);
        if (!mensaje.equals("El registro ya existe")) {
            idTextField.setText("");
            nombreTextField.setText("");
            direccionTextField.setText("");
            telefonoTextField.setText("");
            emailTextField.setText("");
            idTextField.grabFocus();
        }
        idTextField.setText(String.valueOf(cliente.getLastId()));
    }//GEN-LAST:event_guardarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField telefonoTextField;
    // End of variables declaration//GEN-END:variables

    private MainFrame parent;
}
