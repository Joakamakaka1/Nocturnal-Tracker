package com.raven.form;

import com.raven.chart.ModelChart;
import controllers.PartidasController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import model.Partidas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        setOpaque(false);
        init();
        cargarDatosGrafica();
    }

    private void init() {
        PartidasController partidasController = new PartidasController();
        ArrayList<Partidas> partidas = partidasController.listarPartidas();

        int[] meses = new int[12];

        for (Partidas p : partidas) {
            if (p.getClienteID() == Login.getClienteId()) {
                LocalDateTime fechaHoraInicio = LocalDateTime.ofInstant(p.getFechaHoraInicio().toInstant(), ZoneId.systemDefault());
                int mes = fechaHoraInicio.getMonthValue() - 1;

                if (mes >= 0 && mes < 12) {
                    meses[mes]++;
                } else {
                    System.out.println("No existe mes");
                }
            }
        }
        chart.addLegend("Veces jugados", new Color(0, 55, 255), new Color(104, 49, 200));

        chart.addData(new ModelChart("Enero", new double[]{meses[0]}));
        chart.addData(new ModelChart("Febrero", new double[]{meses[1]}));
        chart.addData(new ModelChart("Marzo", new double[]{meses[2]}));
        chart.addData(new ModelChart("Abril", new double[]{meses[3]}));
        chart.addData(new ModelChart("Mayo", new double[]{meses[4]}));
        chart.addData(new ModelChart("Junio", new double[]{meses[5]}));
        chart.addData(new ModelChart("Julio", new double[]{meses[6]}));
        chart.addData(new ModelChart("Agosto", new double[]{meses[7]}));
        chart.addData(new ModelChart("Septiembre", new double[]{meses[8]}));
        chart.addData(new ModelChart("Octubre", new double[]{meses[9]}));
        chart.addData(new ModelChart("Noviembre", new double[]{meses[10]}));
        chart.addData(new ModelChart("Diciembre", new double[]{meses[11]}));
        chart.start();

        lineChart.addLegend("Veces jugados", new Color(255, 0, 0), new Color(104, 49, 200));
        lineChart.addData(new ModelChart("Enero", new double[]{meses[0]}));
        lineChart.addData(new ModelChart("Febrero", new double[]{meses[1]}));
        lineChart.addData(new ModelChart("Marzo", new double[]{meses[2]}));
        lineChart.addData(new ModelChart("Abril", new double[]{meses[3]}));
        lineChart.addData(new ModelChart("Mayo", new double[]{meses[4]}));
        lineChart.addData(new ModelChart("Junio", new double[]{meses[5]}));
        lineChart.addData(new ModelChart("Julio", new double[]{meses[6]}));
        lineChart.addData(new ModelChart("Agosto", new double[]{meses[7]}));
        lineChart.addData(new ModelChart("Sep", new double[]{meses[8]}));
        lineChart.addData(new ModelChart("Oct", new double[]{meses[9]}));
        lineChart.addData(new ModelChart("Nov", new double[]{meses[10]}));
        lineChart.addData(new ModelChart("Dic", new double[]{meses[11]}));
        lineChart.start();
    }

    private void cargarDatosGrafica() {
        int[] personajes = {0, 0, 0, 0};

        PartidasController pc = new PartidasController();
        ArrayList<Partidas> partidas = pc.listarPartidas();

        for (Partidas p : partidas) {
            if (p.getClienteID() == Login.getClienteId() && p.getClienteID() != null) {
                switch (p.getNombrePj()) {
                    case "Disparador":
                        personajes[0]++;
                        break;
                    case "Caballero":
                        personajes[1]++;
                        break;
                    case "Samurai":
                        personajes[2]++;
                        break;
                    case "Bandido":
                        personajes[3]++;
                        break;
                    default:
                        System.out.println("Personaje no encontrado");
                }
            }
        }

        DefaultPieDataset dt = new DefaultPieDataset();

        int totalPersonal = personajes[0] + personajes[1] + personajes[2] + personajes[3];
        if (totalPersonal != 0) {
            if (personajes[0] == 0) {
                //dt.setValue("Disparador", (0));
            } else {
                dt.setValue("Disparador", (Math.round(personajes[0] * 100) / totalPersonal));
            }

            if (personajes[1] == 0) {
                //dt.setValue("Caballero", (0));
            } else {
                dt.setValue("Caballero", (Math.round(personajes[1] * 100) / totalPersonal));
            }

            if (personajes[2] == 0) {
                //dt.setValue("Samurai", (0));
            } else {
                dt.setValue("Samurai", (Math.round(personajes[2] * 100) / totalPersonal));
            }

            if (personajes[3] == 0) {
                //dt.setValue("Bandido", (0));
            } else {
                dt.setValue("Bandido", (Math.round(personajes[3] * 100) / totalPersonal));
            }
        }

        JFreeChart grafico = ChartFactory.createPieChart("Personajes jugados", dt, false, true, false);
        grafico.setBackgroundPaint(new Color(51, 51, 51));

        PiePlot piePlot = (PiePlot) grafico.getPlot();
        piePlot.setBackgroundPaint(new Color(51, 51, 51));

        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(250, 300));
        grafico.getTitle().setPaint(Color.WHITE);

        circlePanel.setLayout(new BorderLayout());
        circlePanel.add(panel, BorderLayout.NORTH);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.raven.swing.RoundPanel();
        chart = new com.raven.chart.Chart();
        roundPanel3 = new com.raven.swing.RoundPanel();
        lineChart = new com.raven.chart.LineChart();
        roundPanel1 = new com.raven.swing.RoundPanel();
        circlePanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        roundPanel2.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1089, 330));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 1101, 330));

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 0, 750, 310));

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        circlePanel.setForeground(new java.awt.Color(51, 51, 51));
        circlePanel.setOpaque(false);
        circlePanel.setPreferredSize(new java.awt.Dimension(240, 240));
        circlePanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout circlePanelLayout = new javax.swing.GroupLayout(circlePanel);
        circlePanel.setLayout(circlePanelLayout);
        circlePanelLayout.setHorizontalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        circlePanelLayout.setVerticalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 310));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart;
    private javax.swing.JPanel circlePanel;
    private com.raven.chart.LineChart lineChart;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
}
