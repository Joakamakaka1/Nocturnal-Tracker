package com.raven.form;

import controllers.PersonajesController;
import java.util.ArrayList;

import model.Personajes;

public class PersonajeForm extends javax.swing.JPanel {

    public PersonajeForm() {
        initComponents();
        setOpaque(false);
        getPersonajes();
    }

    private void getPersonajes() {
        PersonajesController ec = new PersonajesController();
        ArrayList<Personajes> personajes = ec.listarPersonajes();

        javax.swing.JLabel[] nombreLabels = {
            nombrePersonaje, nombrePersonaje1, nombrePersonaje2, NombrePersonaje3,};

        javax.swing.JLabel[] vidaLabels = {
            vida, vida1, vida2, vida3,};

        javax.swing.JLabel[] dañoLabels = {
            daño, daño1, daño2, daño3,};

        javax.swing.JLabel[] velocidadLabels = {
            velocidad, velocidad1, velocidad2, velocidad3,};

        // Iteramos sobre la lista de enemigos y llenamos los JLabels correspondientes
        for (int i = 0; i < personajes.size() && i < nombreLabels.length; i++) {
            Personajes personaje = personajes.get(i);

            nombreLabels[i].setText(personaje.getNombre());
            vidaLabels[i].setText(String.valueOf(personaje.getVida()));
            dañoLabels[i].setText(String.valueOf(personaje.getDaño()));
            velocidadLabels[i].setText(String.valueOf(personaje.getVelocidad()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        nombrePersonaje = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        roundPanel15 = new com.raven.swing.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vida = new javax.swing.JLabel();
        daño = new javax.swing.JLabel();
        velocidad = new javax.swing.JLabel();
        roundPanel2 = new com.raven.swing.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        nombrePersonaje1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        roundPanel16 = new com.raven.swing.RoundPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        daño1 = new javax.swing.JLabel();
        velocidad1 = new javax.swing.JLabel();
        roundPanel3 = new com.raven.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        nombrePersonaje2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        roundPanel18 = new com.raven.swing.RoundPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        daño2 = new javax.swing.JLabel();
        velocidad2 = new javax.swing.JLabel();
        roundPanel4 = new com.raven.swing.RoundPanel();
        jLabel12 = new javax.swing.JLabel();
        NombrePersonaje3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        roundPanel17 = new com.raven.swing.RoundPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        daño3 = new javax.swing.JLabel();
        velocidad3 = new javax.swing.JLabel();
        roundPanel8 = new com.raven.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundPanel11 = new com.raven.swing.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        roundPanel10 = new com.raven.swing.RoundPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        roundPanel12 = new com.raven.swing.RoundPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        roundPanel13 = new com.raven.swing.RoundPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        roundPanel14 = new com.raven.swing.RoundPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 220, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Shooter.png"))); // NOI18N
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 220, 180));

        nombrePersonaje.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombrePersonaje.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje.setText("Report Monthly");
        nombrePersonaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel1.add(nombrePersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 206, -1));
        roundPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 20));

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
        roundPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Daño");
        roundPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        vida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vida.setForeground(new java.awt.Color(102, 255, 102));
        vida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vida.setText("10");
        roundPanel15.add(vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño.setForeground(new java.awt.Color(153, 0, 0));
        daño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño.setText("10");
        roundPanel15.add(daño, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        velocidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velocidad.setForeground(new java.awt.Color(0, 153, 204));
        velocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidad.setText("10");
        roundPanel15.add(velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        roundPanel1.add(roundPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 60));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 240, 320));

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Samurai.png"))); // NOI18N
        roundPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 220, 180));

        nombrePersonaje1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombrePersonaje1.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje1.setText("Report Monthly");
        nombrePersonaje1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel2.add(nombrePersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 219, -1));
        roundPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 20));

        roundPanel16.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Vida");
        roundPanel16.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Velocidad");
        roundPanel16.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Daño");
        roundPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        vida1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vida1.setForeground(new java.awt.Color(102, 255, 102));
        vida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vida1.setText("10");
        roundPanel16.add(vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño1.setForeground(new java.awt.Color(153, 0, 0));
        daño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño1.setText("10");
        roundPanel16.add(daño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        velocidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velocidad1.setForeground(new java.awt.Color(0, 153, 204));
        velocidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidad1.setText("10");
        roundPanel16.add(velocidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        roundPanel2.add(roundPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 60));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 240, 320));

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Bandido.jpg"))); // NOI18N
        roundPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 170));

        nombrePersonaje2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        nombrePersonaje2.setForeground(new java.awt.Color(220, 220, 220));
        nombrePersonaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombrePersonaje2.setText("Report Monthly");
        nombrePersonaje2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel3.add(nombrePersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));
        roundPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 20));

        roundPanel18.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Vida");
        roundPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Velocidad");
        roundPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Daño");
        roundPanel18.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        vida2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vida2.setForeground(new java.awt.Color(102, 255, 102));
        vida2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vida2.setText("10");
        roundPanel18.add(vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño2.setForeground(new java.awt.Color(153, 0, 0));
        daño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño2.setText("10");
        roundPanel18.add(daño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        velocidad2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velocidad2.setForeground(new java.awt.Color(0, 153, 204));
        velocidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidad2.setText("10");
        roundPanel18.add(velocidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        roundPanel3.add(roundPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 60));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 240, 310));

        roundPanel4.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel4.setPreferredSize(new java.awt.Dimension(230, 245));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Cballero.png"))); // NOI18N
        roundPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 170));

        NombrePersonaje3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        NombrePersonaje3.setForeground(new java.awt.Color(220, 220, 220));
        NombrePersonaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombrePersonaje3.setText("Report Monthly");
        NombrePersonaje3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        roundPanel4.add(NombrePersonaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 217, -1));
        roundPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 20));

        roundPanel17.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Vida");
        roundPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Velocidad");
        roundPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Daño");
        roundPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        vida3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vida3.setForeground(new java.awt.Color(102, 255, 102));
        vida3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vida3.setText("10");
        roundPanel17.add(vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        daño3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daño3.setForeground(new java.awt.Color(153, 0, 0));
        daño3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daño3.setText("10");
        roundPanel17.add(daño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        velocidad3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velocidad3.setForeground(new java.awt.Color(0, 153, 204));
        velocidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        velocidad3.setText("10");
        roundPanel17.add(velocidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, -1));

        roundPanel4.add(roundPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 60));

        add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 310));

        roundPanel8.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipos de personajes");
        roundPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Personajes");
        roundPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        roundPanel11.setBackground(new java.awt.Color(102, 102, 255));
        roundPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/active-young-man-gaming-on-handheld-console.png"))); // NOI18N
        roundPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        roundPanel8.add(roundPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 170));
        roundPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 460, 10));

        roundPanel10.setBackground(new java.awt.Color(255, 153, 0));
        roundPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Caballero:");
        roundPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Un guerrero fuerte y resistente en combate cuerpo a cuerpo.");
        roundPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        roundPanel8.add(roundPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 470, 70));

        roundPanel12.setBackground(new java.awt.Color(51, 0, 153));
        roundPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ladrón:");
        roundPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Un personaje ágil y rápido  experto en ataques furtivos y evasiones.");
        roundPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        roundPanel8.add(roundPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 470, 70));

        roundPanel13.setBackground(new java.awt.Color(153, 0, 153));
        roundPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Un guerrero equilibrado de cuarpo a cuerpo");
        roundPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Samurai:");
        roundPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        roundPanel8.add(roundPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 470, 70));

        roundPanel14.setBackground(new java.awt.Color(102, 153, 255));
        roundPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Un personaje experto en el uso de armas de largo alcance.");
        roundPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Disparador:");
        roundPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        roundPanel8.add(roundPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 470, 70));

        add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 550, 650));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombrePersonaje3;
    private javax.swing.JLabel daño;
    private javax.swing.JLabel daño1;
    private javax.swing.JLabel daño2;
    private javax.swing.JLabel daño3;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombrePersonaje;
    private javax.swing.JLabel nombrePersonaje1;
    private javax.swing.JLabel nombrePersonaje2;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel10;
    private com.raven.swing.RoundPanel roundPanel11;
    private com.raven.swing.RoundPanel roundPanel12;
    private com.raven.swing.RoundPanel roundPanel13;
    private com.raven.swing.RoundPanel roundPanel14;
    private com.raven.swing.RoundPanel roundPanel15;
    private com.raven.swing.RoundPanel roundPanel16;
    private com.raven.swing.RoundPanel roundPanel17;
    private com.raven.swing.RoundPanel roundPanel18;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel3;
    private com.raven.swing.RoundPanel roundPanel4;
    private com.raven.swing.RoundPanel roundPanel8;
    private javax.swing.JLabel velocidad;
    private javax.swing.JLabel velocidad1;
    private javax.swing.JLabel velocidad2;
    private javax.swing.JLabel velocidad3;
    private javax.swing.JLabel vida;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables
}
