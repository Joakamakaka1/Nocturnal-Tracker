package com.raven.form;

import Service.ClienteInterface;
import javax.swing.JOptionPane;
import model.Cliente;


public class InicioForm extends javax.swing.JPanel {
    
    private final ClienteInterface clienteController;
    Cliente cliente = null;
    
    public InicioForm(ClienteInterface clienteController) {
        this.clienteController = clienteController;
        initComponents();
        setOpaque(false);
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        roundPanel2 = new com.raven.swing.RoundPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        shooterPanel3 = new com.raven.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        shooterPanel = new com.raven.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        roundPanel8 = new com.raven.swing.RoundPanel();
        txtUser = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreEnemigo5 = new javax.swing.JLabel();
        shooterPanel1 = new com.raven.swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        shooterPanel2 = new com.raven.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/active-man-and-woman-collaborate-on-web-design.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, -30, 370, 320));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/social-planner-calendar-for-time-management.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        roundPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 110));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informacion");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("En nuestro tracker podrás ver los diferentes elementos que encontramos en el juego ");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 520, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Podras encontrar informacion de los enemigos, personajes, etc");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        btnLogin.setBackground(new java.awt.Color(153, 153, 255));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin.setText("Ir ahora");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        roundPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Público");
        roundPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/3d-casual-life-check-mark-in-box-blue.png"))); // NOI18N
        roundPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 20, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1060, 140));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/bubble-gum-diet-and-weight-loss-programme.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 110));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Estadisticas");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("En nuestro tracker podrás ver las estadisticas de tus partidas para seguir tu progreso");
        roundPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 520, -1));

        jLabel15.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Podrás encontrar gráficos e información varia");
        roundPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(153, 153, 255));
        btnLogin1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin1.setText("Ir ahora");
        btnLogin1.setToolTipText("Tus muertos");
        btnLogin1.setBorder(null);
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogin1MouseClicked(evt);
            }
        });
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        roundPanel2.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Privado");
        roundPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/casual-life-3d-red-cross-icon.png"))); // NOI18N
        roundPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 30, 30, -1));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1060, 140));

        shooterPanel3.setBackground(new java.awt.Color(153, 0, 153));
        shooterPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shooterPanel3MouseClicked(evt);
            }
        });
        shooterPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Data");
        shooterPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 60));

        add(shooterPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 250, 60));

        shooterPanel.setBackground(new java.awt.Color(204, 153, 0));
        shooterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shooterPanelMouseClicked(evt);
            }
        });
        shooterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Data");
        shooterPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 60));

        add(shooterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 250, 60));

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUser.setText("Nombre");
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel8.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 270, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿Comenzamos a revisar tus estadisticas y datos de Nocturnal Hunters?");
        roundPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 600, -1));

        nombreEnemigo5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        nombreEnemigo5.setForeground(new java.awt.Color(255, 255, 255));
        nombreEnemigo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreEnemigo5.setText("Bienvenido, ");
        nombreEnemigo5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel8.add(nombreEnemigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, -1));

        add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1060, 200));

        shooterPanel1.setBackground(new java.awt.Color(102, 102, 255));
        shooterPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shooterPanel1MouseClicked(evt);
            }
        });
        shooterPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Data");
        shooterPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        add(shooterPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 230, 60));

        shooterPanel2.setBackground(new java.awt.Color(51, 0, 153));
        shooterPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shooterPanel2MouseClicked(evt);
            }
        });
        shooterPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Data");
        shooterPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 60));

        add(shooterPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 250, 60));
    }// </editor-fold>//GEN-END:initComponents
    

    private void shooterPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shooterPanelMouseClicked

    }//GEN-LAST:event_shooterPanelMouseClicked

    private void shooterPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shooterPanel1MouseClicked

    }//GEN-LAST:event_shooterPanel1MouseClicked

    private void shooterPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shooterPanel3MouseClicked

    }//GEN-LAST:event_shooterPanel3MouseClicked

    private void shooterPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shooterPanel2MouseClicked

    }//GEN-LAST:event_shooterPanel2MouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseClicked

    }//GEN-LAST:event_btnLogin1MouseClicked

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed

    }//GEN-LAST:event_btnLogin1ActionPerformed
    
     private void cargarDatos() {
        Integer clienteId = Login.getClienteId();

        if (clienteId != null) {
            cliente = clienteController.buscarPorId(clienteId);

            if (cliente != null) {
                txtUser.setText(cliente.getUsuario());
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo cargar los datos del cliente con la id " + clienteId, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La ID del cliente es nula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nombreEnemigo5;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel8;
    private com.raven.swing.RoundPanel shooterPanel;
    private com.raven.swing.RoundPanel shooterPanel1;
    private com.raven.swing.RoundPanel shooterPanel2;
    private com.raven.swing.RoundPanel shooterPanel3;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
