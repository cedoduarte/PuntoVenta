package puntoventa_1_0_0;

import javax.swing.JOptionPane;

public class AgregarUsuarioInternalFrame extends javax.swing.JInternalFrame {

    private MainFrame parent;
    
    public AgregarUsuarioInternalFrame(MainFrame parent) {
        initComponents();
        this.parent = parent;
        idTextField.setEnabled(false);
        EntidadUsuario usuario = new EntidadUsuario();
        idTextField.setText(String.valueOf(usuario.getLastId()));
        setTitle("Agregar usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contrasenyaTextField = new javax.swing.JPasswordField();
        repitaContrasenyaTextField = new javax.swing.JPasswordField();

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Repita contraseña");

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
                                .addComponent(contrasenyaTextField)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repitaContrasenyaTextField)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(contrasenyaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repitaContrasenyaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String id;
        String nombre;
        String contrasenya;
        String repitaContrasenya;

        id = idTextField.getText();
        nombre = nombreTextField.getText();
        contrasenya = contrasenyaTextField.getText();
        repitaContrasenya = repitaContrasenyaTextField.getText();
        
        // contraseñas
        if (!contrasenya.equals(repitaContrasenya)) {
            JOptionPane.showMessageDialog(null, 
                    "Las contraseñas deben ser iguales");
            return;
        }        

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
        
        EntidadUsuario usuario = new EntidadUsuario(
                Integer.parseInt(idTextField.getText()),
                nombreTextField.getText(),
                contrasenyaTextField.getText());
        String mensaje = usuario.guardaEnArchivo();
        JOptionPane.showMessageDialog(null, mensaje);
        if (!mensaje.equals("El registro ya existe")) {
            idTextField.setText("");
            nombreTextField.setText("");
            contrasenyaTextField.setText("");
            repitaContrasenyaTextField.setText("");
            idTextField.grabFocus();
        }
        idTextField.setText(String.valueOf(usuario.getLastId()));
    }//GEN-LAST:event_guardarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenyaTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPasswordField repitaContrasenyaTextField;
    // End of variables declaration//GEN-END:variables
}
