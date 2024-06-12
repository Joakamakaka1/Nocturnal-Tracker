/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Joakamakaka
 */
public class Partidas {

    private Integer id;

    private Date fechaHoraInicio;

    private String duracion;

    private String resultado;

    private String nombrePj;

    private Integer clienteID;

    private Integer enemigosEliminados;

    public Integer getIdPartidas() {
        return id;
    }

    public void setIdPartidas(Integer idPartidas) {
        this.id = idPartidas;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getEnemigosEliminados() {
        return enemigosEliminados;
    }

    public void setEnemigosEliminados(Integer enemigosEliminados) {
        this.enemigosEliminados = enemigosEliminados;
    }

    public String getNombrePj() {
        return nombrePj;
    }

    public void setNombrePj(String nombrePj) {
        this.nombrePj = nombrePj;
    }
}
