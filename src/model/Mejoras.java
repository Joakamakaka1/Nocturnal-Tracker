/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Joakamakaka
 */
public class Mejoras {
    
    private Integer id, clienteId, precio;
    
    private String buffo, nombreMejora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getBuffo() {
        return buffo;
    }

    public void setBuffo(String buffo) {
        this.buffo = buffo;
    }

    public String getNombreMejora() {
        return nombreMejora;
    }

    public void setNombreMejora(String nombreMejora) {
        this.nombreMejora = nombreMejora;
    } 
}
