package puntoventa_1_0_0;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Punto de venta 1.0.0");
    }
    
    private void loadInternalFrame(JInternalFrame internalFrame) {
        internalFrame.setClosable(true);
        internalFrame.setIconifiable(true);
        internalFrame.setMaximizable(true);
        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        quitarMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        agregarUsuarioMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        agregarClienteMenuItem = new javax.swing.JMenuItem();
        visualizarClientesMenuItem = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        agregarProductoMenuItem = new javax.swing.JMenuItem();
        visualizarProductosMenuItem = new javax.swing.JMenuItem();
        visualizarVentas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        venderMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        acercaDeMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        quitarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quit.png"))); // NOI18N
        quitarMenuItem.setText("Quitar");
        quitarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitarMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Datos");

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        jMenu7.setText("Usuarios");

        agregarUsuarioMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        agregarUsuarioMenuItem.setText("Agregar usuario");
        agregarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuarioMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(agregarUsuarioMenuItem);

        jMenu2.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients.png"))); // NOI18N
        jMenu5.setText("Clientes");

        agregarClienteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addClient.png"))); // NOI18N
        agregarClienteMenuItem.setText("Agregar");
        agregarClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarClienteMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(agregarClienteMenuItem);

        visualizarClientesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewClient.png"))); // NOI18N
        visualizarClientesMenuItem.setText("Visualizar");
        visualizarClientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarClientesMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(visualizarClientesMenuItem);

        jMenu2.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/products.png"))); // NOI18N
        jMenu6.setText("Productos");

        agregarProductoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addProduct.png"))); // NOI18N
        agregarProductoMenuItem.setText("Agregar");
        agregarProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(agregarProductoMenuItem);

        visualizarProductosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewProducts.png"))); // NOI18N
        visualizarProductosMenuItem.setText("Visualizar");
        visualizarProductosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarProductosMenuItemActionPerformed(evt);
            }
        });
        jMenu6.add(visualizarProductosMenuItem);

        jMenu2.add(jMenu6);

        visualizarVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        visualizarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewSales.png"))); // NOI18N
        visualizarVentas.setText("Visualizar ventas");
        visualizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarVentasActionPerformed(evt);
            }
        });
        jMenu2.add(visualizarVentas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Proceso");

        venderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        venderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sell.png"))); // NOI18N
        venderMenuItem.setText("Vender");
        venderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(venderMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        acercaDeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        acercaDeMenuItem.setText("Acerca de");
        acercaDeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(acercaDeMenuItem);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitarMenuItemActionPerformed

    private void venderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderMenuItemActionPerformed
        loadInternalFrame(new VenderInternalFrame(this));
    }//GEN-LAST:event_venderMenuItemActionPerformed

    private void acercaDeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeMenuItemActionPerformed
        JOptionPane.showMessageDialog(null,
                "Autor: Carlos Enrique Duarte Ortiz");
    }//GEN-LAST:event_acercaDeMenuItemActionPerformed

    private void agregarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClienteMenuItemActionPerformed
        loadInternalFrame(new AgregarClienteInternalFrame(this));
    }//GEN-LAST:event_agregarClienteMenuItemActionPerformed

    private void visualizarClientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarClientesMenuItemActionPerformed
        loadInternalFrame(new VerClientesInternalFrame(this));
    }//GEN-LAST:event_visualizarClientesMenuItemActionPerformed

    private void agregarProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoMenuItemActionPerformed
        loadInternalFrame(new AgregarProductoInternalFrame(this));
    }//GEN-LAST:event_agregarProductoMenuItemActionPerformed

    private void visualizarProductosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarProductosMenuItemActionPerformed
        loadInternalFrame(new VerProductosInternalFrame(this));
    }//GEN-LAST:event_visualizarProductosMenuItemActionPerformed

    private void visualizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarVentasActionPerformed
        loadInternalFrame(new VisualizarVentasInternalFrame(this));
    }//GEN-LAST:event_visualizarVentasActionPerformed

    private void agregarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioMenuItemActionPerformed
        loadInternalFrame(new AgregarUsuarioInternalFrame(this));
    }//GEN-LAST:event_agregarUsuarioMenuItemActionPerformed

    public void agregaInternalFrame(JInternalFrame internalFrame) {
        desktopPane.add(internalFrame);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDeMenuItem;
    private javax.swing.JMenuItem agregarClienteMenuItem;
    private javax.swing.JMenuItem agregarProductoMenuItem;
    private javax.swing.JMenuItem agregarUsuarioMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem quitarMenuItem;
    private javax.swing.JMenuItem venderMenuItem;
    private javax.swing.JMenuItem visualizarClientesMenuItem;
    private javax.swing.JMenuItem visualizarProductosMenuItem;
    private javax.swing.JMenuItem visualizarVentas;
    // End of variables declaration//GEN-END:variables
}

