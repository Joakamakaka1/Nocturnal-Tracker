package com.raven.form;

import controllers.PartidasController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Partidas;


public class PartidasForm extends javax.swing.JPanel {

    public PartidasForm() {
        initComponents();
        setOpaque(false);
        cargarPartidas();
    }

    private void cargarPartidas() {
        PartidasController partidasController = new PartidasController();
        ArrayList<Partidas> partidas = new ArrayList<>();

        Integer clienteId = Login.getClienteId();

        if (clienteId != null) {
            partidas = partidasController.listarPartidasPorId(clienteId);
        }

        DefaultTableModel model = (DefaultTableModel) tdPartidas.getModel();
        model.setRowCount(0);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for (Partidas partida : partidas) {
            String formattedDate = (partida.getFechaHoraInicio() != null) ? formatter.format(partida.getFechaHoraInicio()) : "N/A";
            model.addRow(new Object[]{
                partida.getIdPartidas(),
                formattedDate,
                partida.getDuracion(),
                partida.getResultado(),
                partida.getNombrePj() != null ? partida.getNombrePj() : "N/A",
                partida.getEnemigosEliminados() != null ? partida.getEnemigosEliminados() : "N/A"

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel8 = new com.raven.swing.RoundPanel();
        roundPanel9 = new com.raven.swing.RoundPanel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        personaje = new javax.swing.JLabel();
        fechaInicio = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        enemigos = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdPartidas = new javax.swing.JTable();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel9.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo2.setText("Fecha Inicio:");
        titulo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, -1));

        titulo3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo3.setText("Duracion:");
        titulo3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 20));

        titulo4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo4.setForeground(new java.awt.Color(255, 255, 255));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo4.setText("Resultado:");
        titulo4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Personaje:");
        titulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 140, -1));

        titulo6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo6.setForeground(new java.awt.Color(255, 255, 255));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo6.setText("Enemigos:");
        titulo6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, -1));

        personaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        personaje.setForeground(new java.awt.Color(255, 255, 255));
        personaje.setText("jLabel2");
        roundPanel9.add(personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 170, 30));

        fechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        fechaInicio.setText("jLabel2");
        roundPanel9.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 170, 30));

        duracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        duracion.setForeground(new java.awt.Color(255, 255, 255));
        duracion.setText("jLabel2");
        roundPanel9.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 40));

        resultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setText("jLabel2");
        roundPanel9.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, 30));

        enemigos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enemigos.setForeground(new java.awt.Color(255, 255, 255));
        enemigos.setText("jLabel2");
        roundPanel9.add(enemigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 170, 30));

        roundPanel8.add(roundPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 750, 250));

        titulo1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo1.setText("Partidas");
        titulo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel8.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        titulo5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        titulo5.setForeground(new java.awt.Color(255, 255, 255));
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo5.setText("Tus");
        titulo5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel8.add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/active-man-in-vr-glasses.png"))); // NOI18N
        roundPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1060, 270));

        tdPartidas.setBackground(new java.awt.Color(51, 51, 51));
        tdPartidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tdPartidas.setForeground(new java.awt.Color(255, 255, 255));
        tdPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nª Partida", "FechaInicio", "Duracion", "Resultado", "Personaje", "Enemigos"
            }
        ));
        tdPartidas.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tdPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdPartidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdPartidas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1060, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void tdPartidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdPartidasMouseClicked

        int selectedRow = tdPartidas.getSelectedRow();

        if (selectedRow >= 0) {
            String selectedDuracion = tdPartidas.getValueAt(selectedRow, 2).toString();
            String selectedEnemigos = tdPartidas.getValueAt(selectedRow, 5).toString();
            String selectedFechaInicio = tdPartidas.getValueAt(selectedRow, 1).toString();
            String selectedPersonaje = tdPartidas.getValueAt(selectedRow, 4).toString();
            String selectedResultado = tdPartidas.getValueAt(selectedRow, 3).toString();

            duracion.setText(selectedDuracion);
            enemigos.setText(selectedEnemigos);
            fechaInicio.setText(selectedFechaInicio);
            personaje.setText(selectedPersonaje);
            resultado.setText(selectedResultado);
        }
    }//GEN-LAST:event_tdPartidasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel enemigos;
    private javax.swing.JLabel fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel personaje;
    private javax.swing.JLabel resultado;
    private com.raven.swing.RoundPanel roundPanel8;
    private com.raven.swing.RoundPanel roundPanel9;
    private javax.swing.JTable tdPartidas;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    // End of variables declaration//GEN-END:variables
}
