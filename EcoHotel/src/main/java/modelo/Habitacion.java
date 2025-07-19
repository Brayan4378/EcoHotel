/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author BrayanOcampo
 */
public class Habitacion {
    
    //Atributos privados
    private String id;
    private String tipo;
    private String capacidad;
    private String estado;

    //Constructor de la clase Habitacion con parametros
    public Habitacion(String id, String tipo, String capacidad, String estado) {
        setId(id);
        setTipo(tipo);
        setCapacidad(capacidad);
        setEstado(estado);
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

 
    
}
