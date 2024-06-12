package com.raven.form;

import controllers.MejorasController;
import java.util.ArrayList;
import model.Mejoras;

public class BuffosForm extends javax.swing.JPanel {

    public BuffosForm() {
        initComponents();
        setOpaque(false);
        getMejoras();
    }

    private void getMejoras() {
        MejorasController me = new MejorasController();
        ArrayList<Mejoras> mejoras = me.listarMejoras();

        javax.swing.JLabel[] nombreLabels = {
            nombreMejora, nombreMejora1, nombreMejora2, nombreMejora3};

        javax.swing.JLabel[] precioLabels = {
            buffo, buffo1, buffo2, buffo3};

        javax.swing.JLabel[] buffLabels = {
            precio, precio1, precio2, precio3};

        // Iteramos sobre la lista de buffos y llenamos los JLabels correspondientes
        for (int i = 0; i < mejoras.size() && i < nombreLabels.length; i++) {
            Mejoras mejora = mejoras.get(i);
            nombreLabels[i].setText(mejora.getNombreMejora());
            precioLabels[i].setText(String.valueOf(mejora.getBuffo()));
            buffLabels[i].setText(String.valueOf(mejora.getPrecio()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel3 = new com.raven.swing.RoundPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nombreMejora2 = new javax.swing.JLabel();
        roundPanel15 = new com.raven.swing.RoundPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        buffo2 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        roundPanel8 = new com.raven.swing.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        roundPanel11 = new com.raven.swing.RoundPanel();
        jLabel8 = new javax.swing.JLabel();
        roundPanel13 = new com.raven.swing.RoundPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        roundPanel12 = new com.raven.swing.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        roundPanel10 = new com.raven.swing.RoundPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        roundPanel4 = new com.raven.swing.RoundPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nombreMejora = new javax.swing.JLabel();
        roundPanel16 = new com.raven.swing.RoundPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        buffo = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        roundPanel6 = new com.raven.swing.RoundPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        nombreMejora3 = new javax.swing.JLabel();
        roundPanel17 = new com.raven.swing.RoundPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        buffo3 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        roundPanel5 = new com.raven.swing.RoundPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        nombreMejora1 = new javax.swing.JLabel();
        roundPanel14 = new com.raven.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buffo1 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/PocionVelocidad.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        roundPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, -1, -1));

        nombreMejora2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreMejora2.setForeground(new java.awt.Color(220, 220, 220));
        nombreMejora2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreMejora2.setText("Report Monthly");
        nombreMejora2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel3.add(nombreMejora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 217, -1));

        roundPanel15.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Precio:");
        roundPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Buffo:");
        roundPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        buffo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buffo2.setForeground(new java.awt.Color(153, 0, 0));
        buffo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buffo2.setText("jLabel3");
        roundPanel15.add(buffo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, 20));

        precio2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 0));
        precio2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precio2.setText("jLabel3");
        roundPanel15.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, 20));

        roundPanel3.add(roundPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 70));
        roundPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 10));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 320));

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipos de buffos ");
        roundPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("En nuestro videojuego, los buffos son mejoras temporales que los personajes");
        roundPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 470, -1));
        roundPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 460, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("pueden comprar para incrementar sus habilidades en el juego.");
        roundPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 470, -1));

        roundPanel11.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/active-man-launching-his-own-start-up.png"))); // NOI18N
        roundPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        roundPanel8.add(roundPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 170));

        roundPanel13.setBackground(new java.awt.Color(153, 0, 153));
        roundPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Velocidad:");
        roundPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Incrementa la velocidad de movimiento de tu personaje,");
        roundPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("permitiéndole moverse más rápidamente por el campo de batalla.");
        roundPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        roundPanel8.add(roundPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 470, 90));

        roundPanel12.setBackground(new java.awt.Color(51, 0, 153));
        roundPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Vida:");
        roundPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Incrementa la cantidad de puntos de vida de tu personaje, ");
        roundPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("permitiéndole resistir más daño");
        roundPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        roundPanel8.add(roundPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 470, 90));

        roundPanel10.setBackground(new java.awt.Color(255, 153, 0));
        roundPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Daño:");
        roundPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Incrementa el poder de ataque de tu personaje, permitiéndole infligir ");
        roundPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("más daño a los enemigos con cada golpe o disparo.");
        roundPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        roundPanel8.add(roundPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 470, 90));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buffos");
        roundPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 0, 550, 650));

        roundPanel4.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel4.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/PocionVida.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 210, 170));

        nombreMejora.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreMejora.setForeground(new java.awt.Color(220, 220, 220));
        nombreMejora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreMejora.setText("Report Monthly");
        nombreMejora.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel4.add(nombreMejora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 217, -1));

        roundPanel16.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Precio:");
        roundPanel16.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Buffo:");
        roundPanel16.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        buffo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buffo.setForeground(new java.awt.Color(153, 0, 0));
        buffo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buffo.setText("jLabel3");
        roundPanel16.add(buffo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, -1));

        precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 0));
        precio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precio.setText("jLabel3");
        roundPanel16.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        roundPanel4.add(roundPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 70));
        roundPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 10));

        add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 310));

        roundPanel6.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel6.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setOpaque(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/PocionDaño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        roundPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 210, 170));

        nombreMejora3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreMejora3.setForeground(new java.awt.Color(220, 220, 220));
        nombreMejora3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreMejora3.setText("Report Monthly");
        nombreMejora3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel6.add(nombreMejora3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 217, -1));

        roundPanel17.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Precio:");
        roundPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Buffo:");
        roundPanel17.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        buffo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buffo3.setForeground(new java.awt.Color(153, 0, 0));
        buffo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buffo3.setText("jLabel3");
        roundPanel17.add(buffo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, -1));

        precio3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 0));
        precio3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precio3.setText("jLabel3");
        roundPanel17.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        roundPanel6.add(roundPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 70));
        roundPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 10));

        add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 230, 310));

        roundPanel5.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel5.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setOpaque(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/PocionDaño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        roundPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 210, 190));

        nombreMejora1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombreMejora1.setForeground(new java.awt.Color(220, 220, 220));
        nombreMejora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreMejora1.setText("Report Monthly");
        nombreMejora1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel5.add(nombreMejora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 217, -1));

        roundPanel14.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Precio:");
        roundPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buffo:");
        roundPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        buffo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buffo1.setForeground(new java.awt.Color(153, 0, 0));
        buffo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buffo1.setText("jLabel3");
        roundPanel14.add(buffo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, 20));

        precio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 0));
        precio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precio1.setText("jLabel3");
        roundPanel14.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, 20));

        roundPanel5.add(roundPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 70));
        roundPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 10));

        add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 320));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buffo;
    private javax.swing.JLabel buffo1;
    private javax.swing.JLabel buffo2;
    private javax.swing.JLabel buffo3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombreMejora;
    private javax.swing.JLabel nombreMejora1;
    private javax.swing.JLabel nombreMejora2;
    private javax.swing.JLabel nombreMejora3;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private com.raven.swing.RoundPanel roundPanel10;
    private com.raven.swing.RoundPanel roundPanel11;
    private com.raven.swing.RoundPanel roundPanel12;
    private com.raven.swing.RoundPanel roundPanel13;
    private com.raven.swing.RoundPanel roundPanel14;
    private com.raven.swing.RoundPanel roundPanel15;
    private com.raven.swing.RoundPanel roundPanel16;
    private com.raven.swing.RoundPanel roundPanel17;
    private com.raven.swing.RoundPanel roundPanel3;
    private com.raven.swing.RoundPanel roundPanel4;
    private com.raven.swing.RoundPanel roundPanel5;
    private com.raven.swing.RoundPanel roundPanel6;
    private com.raven.swing.RoundPanel roundPanel8;
    // End of variables declaration//GEN-END:variables
}
