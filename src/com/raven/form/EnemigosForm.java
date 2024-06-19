package com.raven.form;

import controllers.EnemigosController;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import model.Enemigos;

public class EnemigosForm extends javax.swing.JPanel {
    
    public EnemigosForm() {
        initComponents();
        setOpaque(false);
        getEnemigos();
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    private void getEnemigos() {
        EnemigosController ec = new EnemigosController();
        ArrayList<Enemigos> enemigos = ec.listarEnemigos();

        javax.swing.JLabel[] nombreLabels = {
            nombreEnemigo, nombreEnemigo1, nombreEnemigo2, nombreEnemigo3,
            nombreEnemigo4, nombreEnemigo5, nombreEnemigo6, nombreEnemigo7, nombreEnemigo8
        };
        
        javax.swing.JLabel[] vidaLabels = {
            Vida, Vida1, Vida2, Vida3, Vida4, Vida5, Vida6, Vida7, vida8
        };
        
        javax.swing.JLabel[] dañoLabels = {
            daño, daño1, daño2, daño3, daño4, daño5, daño6, daño7, daño8
        };
        
        javax.swing.JLabel[] velocidadLabels = {
            Velocidad, Velocidad1, Velocidad2, Velocidad3, Velocidad4,
            Velocidad5, Velocidad6, Velocidad7, velocidad8
        };

        // Iteramos sobre la lista de enemigos y llenamos los JLabels correspondientes
        for (int i = 0; i < enemigos.size() && i < nombreLabels.length; i++) {
            Enemigos enemigo = enemigos.get(i);
            nombreLabels[i].setText(enemigo.getNombre());
            vidaLabels[i].setText(String.valueOf(enemigo.getVida()));
            dañoLabels[i].setText(String.valueOf(enemigo.getDaño()));
            velocidadLabels[i].setText(String.valueOf(enemigo.getVelocidad()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        roundPanel1 = new com.raven.swing.RoundPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreEnemigo = new javax.swing.JLabel();
        roundPanel15 = new com.raven.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Vida = new javax.swing.JLabel();
        daño = new javax.swing.JLabel();
        Velocidad = new javax.swing.JLabel();
        roundPanel2 = new com.raven.swing.RoundPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreEnemigo1 = new javax.swing.JLabel();
        roundPanel16 = new com.raven.swing.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Vida1 = new javax.swing.JLabel();
        Velocidad1 = new javax.swing.JLabel();
        daño1 = new javax.swing.JLabel();
        roundPanel3 = new com.raven.swing.RoundPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nombreEnemigo2 = new javax.swing.JLabel();
        roundPanel17 = new com.raven.swing.RoundPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Vida2 = new javax.swing.JLabel();
        daño2 = new javax.swing.JLabel();
        Velocidad2 = new javax.swing.JLabel();
        roundPanel4 = new com.raven.swing.RoundPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nombreEnemigo3 = new javax.swing.JLabel();
        roundPanel18 = new com.raven.swing.RoundPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Vida3 = new javax.swing.JLabel();
        daño3 = new javax.swing.JLabel();
        Velocidad3 = new javax.swing.JLabel();
        roundPanel5 = new com.raven.swing.RoundPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        nombreEnemigo4 = new javax.swing.JLabel();
        roundPanel20 = new com.raven.swing.RoundPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Vida4 = new javax.swing.JLabel();
        daño4 = new javax.swing.JLabel();
        Velocidad4 = new javax.swing.JLabel();
        roundPanel6 = new com.raven.swing.RoundPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        nombreEnemigo5 = new javax.swing.JLabel();
        roundPanel21 = new com.raven.swing.RoundPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Velocidad5 = new javax.swing.JLabel();
        daño5 = new javax.swing.JLabel();
        Vida5 = new javax.swing.JLabel();
        roundPanel7 = new com.raven.swing.RoundPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        nombreEnemigo6 = new javax.swing.JLabel();
        roundPanel22 = new com.raven.swing.RoundPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Vida6 = new javax.swing.JLabel();
        daño6 = new javax.swing.JLabel();
        Velocidad6 = new javax.swing.JLabel();
        roundPanel8 = new com.raven.swing.RoundPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nombreEnemigo7 = new javax.swing.JLabel();
        roundPanel23 = new com.raven.swing.RoundPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Vida7 = new javax.swing.JLabel();
        daño7 = new javax.swing.JLabel();
        Velocidad7 = new javax.swing.JLabel();
        roundPanel9 = new com.raven.swing.RoundPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        nombreEnemigo8 = new javax.swing.JLabel();
        roundPanel24 = new com.raven.swing.RoundPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        vida8 = new javax.swing.JLabel();
        daño8 = new javax.swing.JLabel();
        velocidad8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel9.setBackground(new java.awt.Color(25, 25, 25));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/FantasmaOtro.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        roundPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 218, 180));

        nombreEnemigo.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo.setText("Report Monthly");
        nombreEnemigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel1.add(nombreEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 206, -1));

        roundPanel15.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Vida");
        roundPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Velocidad");
        roundPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Daño");
        roundPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Vida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida.setForeground(new java.awt.Color(102, 255, 102));
        Vida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida.setText("10");
        roundPanel15.add(Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        daño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño.setForeground(new java.awt.Color(153, 0, 0));
        daño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño.setText("10");
        roundPanel15.add(daño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 40, -1));

        Velocidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad.setText("10");
        roundPanel15.add(Velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        roundPanel1.add(roundPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 60));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Ojo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        roundPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 180));

        nombreEnemigo1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo1.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo1.setText("Report Monthly");
        nombreEnemigo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel2.add(nombreEnemigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 219, -1));

        roundPanel16.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Vida");
        roundPanel16.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Velocidad");
        roundPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Daño");
        roundPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        Vida1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida1.setForeground(new java.awt.Color(102, 255, 102));
        Vida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida1.setText("10");
        roundPanel16.add(Vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        Velocidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad1.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad1.setText("10");
        roundPanel16.add(Velocidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        daño1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño1.setForeground(new java.awt.Color(153, 0, 0));
        daño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño1.setText("10");
        roundPanel16.add(daño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        roundPanel2.add(roundPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Slime.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel3.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 180));

        nombreEnemigo2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo2.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo2.setText("Report Monthly");
        nombreEnemigo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel3.add(nombreEnemigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));

        roundPanel17.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Vida");
        roundPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Velocidad");
        roundPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Daño");
        roundPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        Vida2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida2.setForeground(new java.awt.Color(102, 255, 102));
        Vida2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida2.setText("10");
        roundPanel17.add(Vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño2.setForeground(new java.awt.Color(153, 0, 0));
        daño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño2.setText("10");
        roundPanel17.add(daño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        Velocidad2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad2.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad2.setText("10");
        roundPanel17.add(Velocidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        roundPanel3.add(roundPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel4.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel4.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Esqueleto.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        roundPanel4.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 190));

        nombreEnemigo3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo3.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo3.setText("Report Monthly");
        nombreEnemigo3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel4.add(nombreEnemigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));

        roundPanel18.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Vida");
        roundPanel18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Velocidad");
        roundPanel18.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Daño");
        roundPanel18.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        Vida3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida3.setForeground(new java.awt.Color(102, 255, 102));
        Vida3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida3.setText("10");
        roundPanel18.add(Vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño3.setForeground(new java.awt.Color(153, 0, 0));
        daño3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño3.setText("10");
        roundPanel18.add(daño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        Velocidad3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad3.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad3.setText("10");
        roundPanel18.add(Velocidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));

        roundPanel4.add(roundPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel5.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/SlimeVioleta.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundPanel5.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 218, 170));

        nombreEnemigo4.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo4.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo4.setText("Report Monthly");
        nombreEnemigo4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel5.add(nombreEnemigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 206, -1));

        roundPanel20.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Vida");
        roundPanel20.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Velocidad");
        roundPanel20.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Daño");
        roundPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 10, 40, -1));

        Vida4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida4.setForeground(new java.awt.Color(102, 255, 102));
        Vida4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida4.setText("10");
        roundPanel20.add(Vida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        daño4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño4.setForeground(new java.awt.Color(153, 0, 0));
        daño4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño4.setText("10");
        roundPanel20.add(daño4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        Velocidad4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad4.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad4.setText("10");
        roundPanel20.add(Velocidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 50, -1));

        roundPanel5.add(roundPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 60));

        roundPanel6.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setOpaque(false);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/fantasma.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        roundPanel6.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 170));

        nombreEnemigo5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo5.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo5.setText("Report Monthly");
        nombreEnemigo5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel6.add(nombreEnemigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 219, -1));

        roundPanel21.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Vida");
        roundPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Velocidad");
        roundPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Daño");
        roundPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 10, 40, -1));

        Velocidad5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad5.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad5.setText("10");
        roundPanel21.add(Velocidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        daño5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño5.setForeground(new java.awt.Color(153, 0, 0));
        daño5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño5.setText("10");
        roundPanel21.add(daño5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        Vida5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida5.setForeground(new java.awt.Color(102, 255, 102));
        Vida5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida5.setText("10");
        roundPanel21.add(Vida5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        roundPanel6.add(roundPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel7.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel7.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setOpaque(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Dragon.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        roundPanel7.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 230, 170));

        nombreEnemigo6.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo6.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo6.setText("Report Monthly");
        nombreEnemigo6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel7.add(nombreEnemigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));

        roundPanel22.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Vida");
        roundPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Velocidad");
        roundPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Daño");
        roundPanel22.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 10, 40, -1));

        Vida6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida6.setForeground(new java.awt.Color(102, 255, 102));
        Vida6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida6.setText("10");
        roundPanel22.add(Vida6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        daño6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño6.setForeground(new java.awt.Color(153, 0, 0));
        daño6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño6.setText("10");
        roundPanel22.add(daño6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        Velocidad6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad6.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad6.setText("10");
        roundPanel22.add(Velocidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        roundPanel7.add(roundPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setOpaque(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Murcielago.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        roundPanel8.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 170));

        nombreEnemigo7.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo7.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo7.setText("Report Monthly");
        nombreEnemigo7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel8.add(nombreEnemigo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));

        roundPanel23.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Vida");
        roundPanel23.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Velocidad");
        roundPanel23.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Daño");
        roundPanel23.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 10, 40, -1));

        Vida7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vida7.setForeground(new java.awt.Color(102, 255, 102));
        Vida7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vida7.setText("10");
        roundPanel23.add(Vida7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        daño7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño7.setForeground(new java.awt.Color(153, 0, 0));
        daño7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño7.setText("10");
        roundPanel23.add(daño7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        Velocidad7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Velocidad7.setForeground(new java.awt.Color(0, 153, 204));
        Velocidad7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Velocidad7.setText("10");
        roundPanel23.add(Velocidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        roundPanel8.add(roundPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 60));

        roundPanel9.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel9.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setOpaque(false);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Boss.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        roundPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 228, 170));

        nombreEnemigo8.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreEnemigo8.setForeground(new java.awt.Color(220, 220, 220));
        nombreEnemigo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEnemigo8.setText("Report Monthly");
        nombreEnemigo8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel9.add(nombreEnemigo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));

        roundPanel24.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Vida");
        roundPanel24.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Velocidad");
        roundPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Daño");
        roundPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 10, 40, -1));

        vida8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vida8.setForeground(new java.awt.Color(102, 255, 102));
        vida8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vida8.setText("10");
        roundPanel24.add(vida8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, -1));

        daño8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño8.setForeground(new java.awt.Color(153, 0, 0));
        daño8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño8.setText("10");
        roundPanel24.add(daño8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 30, -1));

        velocidad8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velocidad8.setForeground(new java.awt.Color(0, 153, 204));
        velocidad8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidad8.setText("10");
        roundPanel24.add(velocidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        roundPanel9.add(roundPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 60));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(roundPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel9);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1090, 650));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Velocidad;
    private javax.swing.JLabel Velocidad1;
    private javax.swing.JLabel Velocidad2;
    private javax.swing.JLabel Velocidad3;
    private javax.swing.JLabel Velocidad4;
    private javax.swing.JLabel Velocidad5;
    private javax.swing.JLabel Velocidad6;
    private javax.swing.JLabel Velocidad7;
    private javax.swing.JLabel Vida;
    private javax.swing.JLabel Vida1;
    private javax.swing.JLabel Vida2;
    private javax.swing.JLabel Vida3;
    private javax.swing.JLabel Vida4;
    private javax.swing.JLabel Vida5;
    private javax.swing.JLabel Vida6;
    private javax.swing.JLabel Vida7;
    private javax.swing.JLabel daño;
    private javax.swing.JLabel daño1;
    private javax.swing.JLabel daño2;
    private javax.swing.JLabel daño3;
    private javax.swing.JLabel daño4;
    private javax.swing.JLabel daño5;
    private javax.swing.JLabel daño6;
    private javax.swing.JLabel daño7;
    private javax.swing.JLabel daño8;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreEnemigo;
    private javax.swing.JLabel nombreEnemigo1;
    private javax.swing.JLabel nombreEnemigo2;
    private javax.swing.JLabel nombreEnemigo3;
    private javax.swing.JLabel nombreEnemigo4;
    private javax.swing.JLabel nombreEnemigo5;
    private javax.swing.JLabel nombreEnemigo6;
    private javax.swing.JLabel nombreEnemigo7;
    private javax.swing.JLabel nombreEnemigo8;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel15;
    private com.raven.swing.RoundPanel roundPanel16;
    private com.raven.swing.RoundPanel roundPanel17;
    private com.raven.swing.RoundPanel roundPanel18;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel20;
    private com.raven.swing.RoundPanel roundPanel21;
    private com.raven.swing.RoundPanel roundPanel22;
    private com.raven.swing.RoundPanel roundPanel23;
    private com.raven.swing.RoundPanel roundPanel24;
    private com.raven.swing.RoundPanel roundPanel3;
    private com.raven.swing.RoundPanel roundPanel4;
    private com.raven.swing.RoundPanel roundPanel5;
    private com.raven.swing.RoundPanel roundPanel6;
    private com.raven.swing.RoundPanel roundPanel7;
    private com.raven.swing.RoundPanel roundPanel8;
    private com.raven.swing.RoundPanel roundPanel9;
    private javax.swing.JLabel velocidad8;
    private javax.swing.JLabel vida8;
    // End of variables declaration//GEN-END:variables
}
