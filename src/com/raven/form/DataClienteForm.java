package com.raven.form;

import Service.ClienteInterface;
import javax.swing.JOptionPane;
import model.Cliente;

public class DataClienteForm extends javax.swing.JPanel {

    private final ClienteInterface clienteController;
    Cliente cliente = null;

    public DataClienteForm(ClienteInterface clienteController) {
        this.clienteController = clienteController;
        initComponents();
        setOpaque(false);
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        roundPanel4 = new com.raven.swing.RoundPanel();
        btnDataUser = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        nombrePersonaje1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        roundPanel8 = new com.raven.swing.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        roundPanel14 = new com.raven.swing.RoundPanel();
        roundPanel15 = new com.raven.swing.RoundPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roundPanel11 = new com.raven.swing.RoundPanel();
        roundPanel9 = new com.raven.swing.RoundPanel();
        roundPanel12 = new com.raven.swing.RoundPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel13 = new com.raven.swing.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roundPanel10 = new com.raven.swing.RoundPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        roundPanel2 = new com.raven.swing.RoundPanel();
        roundPanel5 = new com.raven.swing.RoundPanel();
        btnDataGmail = new javax.swing.JButton();
        txtGmail = new javax.swing.JTextField();
        nombrePersonaje = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        roundPanel3 = new com.raven.swing.RoundPanel();
        nombrePersonaje2 = new javax.swing.JLabel();
        nombrePersonaje3 = new javax.swing.JLabel();
        roundPanel6 = new com.raven.swing.RoundPanel();
        btnDeleteAccount = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel4.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDataUser.setText("Guardar cambios");
        btnDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataUserActionPerformed(evt);
            }
        });
        roundPanel4.add(btnDataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtPassword.setEditable(false);
        txtPassword.setText("Contraseña");
        txtPassword.setEnabled(false);
        roundPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, -1));

        txtUser.setEditable(false);
        txtUser.setText("Usuario");
        txtUser.setEnabled(false);
        roundPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        roundPanel1.add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 270, 170));

        nombrePersonaje1.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        nombrePersonaje1.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje1.setText("Nocturnal ID");
        nombrePersonaje1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel1.add(nombrePersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("solo para pc");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 510, 210));

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/active-guy-with-a-cup-of-coffee-and-computer-working-from-home.png"))); // NOI18N
        roundPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Nombre");
        roundPanel8.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 250, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Los jugadores pueden administrar su cuenta en el videojuego. ");
        roundPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 410, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Administracion de cuenta");
        roundPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));
        roundPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 460, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mi perfil");
        roundPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        roundPanel14.setBackground(new java.awt.Color(153, 0, 153));
        roundPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel15.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Permite a los usuarios modificar su información personal");
        roundPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Actualizar Información:");
        roundPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        roundPanel14.add(roundPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 480, 70));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Permite ajustar preferencias de notificación y privacidad ");
        roundPanel14.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seguridad de la Cuenta:");
        roundPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        roundPanel8.add(roundPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 470, 70));

        roundPanel11.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundPanel8.add(roundPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 210, 170));

        roundPanel9.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundPanel8.add(roundPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 210, 170));

        roundPanel12.setBackground(new java.awt.Color(51, 0, 153));
        roundPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Permite a los usuarios modificar su información personal");
        roundPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actualizar Información:");
        roundPanel12.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        roundPanel13.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Permite a los usuarios modificar su información personal");
        roundPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Actualizar Información:");
        roundPanel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        roundPanel12.add(roundPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 480, 70));

        roundPanel8.add(roundPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 470, 70));

        roundPanel10.setBackground(new java.awt.Color(255, 153, 0));
        roundPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Muestra toda la información relevante del usuario");
        roundPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Datos del Cliente:");
        roundPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        roundPanel8.add(roundPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 470, 70));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/boton-editar.png"))); // NOI18N
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        roundPanel8.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 530, 650));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel5.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDataGmail.setText("Guardar cambios");
        btnDataGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataGmailActionPerformed(evt);
            }
        });
        roundPanel5.add(btnDataGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtGmail.setText("Gmail");
        roundPanel5.add(txtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        roundPanel2.add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 270, 170));

        nombrePersonaje.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        nombrePersonaje.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje.setText("Informacion personal");
        nombrePersonaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel2.add(nombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("solo para pc");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 510, 210));

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrePersonaje2.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        nombrePersonaje2.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombrePersonaje2.setText("sesión");
        nombrePersonaje2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel3.add(nombrePersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, -1));

        nombrePersonaje3.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        nombrePersonaje3.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje3.setText("Gestion de inicios de ");
        nombrePersonaje3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel3.add(nombrePersonaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, -1));

        roundPanel6.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeleteAccount.setText("Cerrar sesion en todas partes");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });
        roundPanel6.add(btnDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 40));

        roundPanel3.add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 270, 170));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("solo para pc");
        roundPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 510, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataUserActionPerformed
        cliente.setId(Login.getClienteId());
        cliente.setUsuario(txtUser.getText());
        cliente.setPassword(txtPassword.getText());

        clienteController.editarCliente(cliente);
    }//GEN-LAST:event_btnDataUserActionPerformed

    private void btnDataGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataGmailActionPerformed
        cliente.setId(Login.getClienteId());
        cliente.setGmail(txtGmail.getText());

        clienteController.editarCliente(cliente);
    }//GEN-LAST:event_btnDataGmailActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres eliminar tu cuenta?");

        if (confirmacion == JOptionPane.YES_OPTION) {
            cliente.setId(Login.getClienteId());
            clienteController.eliminar(cliente);

            Login login = new Login();
            login.setVisible(true);
        }

    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        txtUser.setEnabled(true);
        txtPassword.setEnabled(true);
        txtUser.setEditable(true);
        txtPassword.setEditable(true);        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void cargarDatos() {
        Integer clienteId = Login.getClienteId();

        if (clienteId != null) {
            cliente = clienteController.buscarPorId(clienteId);

            if (cliente != null) {
                txtUser.setText(cliente.getUsuario());
                txtPassword.setText(cliente.getPassword());
                txtGmail.setText(cliente.getGmail());
                txtNombre.setText(cliente.getUsuario());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo cargar los datos del cliente con la id " + clienteId, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La ID del cliente es nula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataGmail;
    private javax.swing.JButton btnDataUser;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombrePersonaje;
    private javax.swing.JLabel nombrePersonaje1;
    private javax.swing.JLabel nombrePersonaje2;
    private javax.swing.JLabel nombrePersonaje3;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel10;
    private com.raven.swing.RoundPanel roundPanel11;
    private com.raven.swing.RoundPanel roundPanel12;
    private com.raven.swing.RoundPanel roundPanel13;
    private com.raven.swing.RoundPanel roundPanel14;
    private com.raven.swing.RoundPanel roundPanel15;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel3;
    private com.raven.swing.RoundPanel roundPanel4;
    private com.raven.swing.RoundPanel roundPanel5;
    private com.raven.swing.RoundPanel roundPanel6;
    private com.raven.swing.RoundPanel roundPanel8;
    private com.raven.swing.RoundPanel roundPanel9;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
