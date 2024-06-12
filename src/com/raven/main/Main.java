package com.raven.main;

import Service.ClienteInterface;
import com.raven.event.EventMenu;
import com.raven.form.BuffosForm;
import com.raven.form.DataClienteForm;
import com.raven.form.EnemigosForm;
import com.raven.form.Form_1;
import com.raven.form.InicioForm;
import com.raven.form.Login;
import com.raven.form.PartidasForm;
import com.raven.form.PersonajeForm;
import com.raven.form.Registro;
import controllers.ClienteController;
import controllers.PartidasController;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Partidas;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        ClienteInterface clienteController = new ClienteController();

        PartidasController partidasController = new PartidasController();
        ArrayList<Partidas> partidas = partidasController.listarPartidas();

        EventMenu event = new EventMenu() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    showForm(new InicioForm(clienteController));

                } else if (index == 1) {
                    boolean bandera = false;
                    for (Partidas partida : partidas) {
                        if (partida.getClienteID() == Login.getClienteId()) {
                            bandera = true;
                            break;
                        } else {
                            bandera = false;
                        }
                    }
                    if (bandera == false) {
                        JOptionPane.showMessageDialog(null, "No se pudo cargar los datos del cliente con la id " + Login.getClienteId(), "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        showForm(new PartidasForm());
                    }

                } else if (index == 2) {
                    showForm(new PersonajeForm());
                } else if (index == 3) {
                    showForm(new EnemigosForm());
                } else if (index == 4) {
                    showForm(new BuffosForm());
                } else if (index == 5) {
                    boolean bandera = false;
                    for (Partidas partida : partidas) {
                        if (partida.getClienteID() == Login.getClienteId()) {
                            bandera = true;
                            break;
                        } else {
                            bandera = false;
                        }
                    }
                    if (bandera == false) {
                        JOptionPane.showMessageDialog(null, "No se pudo cargar los datos del cliente con la id " + Login.getClienteId(), "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        showForm(new DataClienteForm(clienteController));
                    }
                } else if (index == 6) {
                    boolean bandera = false;
                    for (Partidas partida : partidas) {
                        if (partida.getClienteID() == Login.getClienteId()) {
                            bandera = true;
                            break;
                        } else {
                            bandera = false;
                        }
                    }
                    if (bandera == false) {
                        JOptionPane.showMessageDialog(null, "No se pudo cargar los datos del cliente con la id " + Login.getClienteId(), "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        showForm(new Form_1());
                    }
                } else if (index == 8) {
                    System.out.println("Logout");
                    Login l = new Login();
                    l.setVisible(true);
                    dispose();
                } else {
                    showForm(new PersonajeForm());
                }
            }
        };
        menu1.initMenu(event);

        showForm(new InicioForm(clienteController));
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        menu1 = new com.raven.component.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("Nocturnal's");
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tracker");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 74, 50, 20));

        roundPanel1.setBackground(new java.awt.Color(25, 25, 25));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 180, 650));

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());
        roundPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 36, 1110, 660));

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel2;
    private com.raven.component.Menu menu1;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
