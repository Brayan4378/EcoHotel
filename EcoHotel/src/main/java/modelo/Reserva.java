/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author BrayanOcampo
 */
public class Reserva {
    
    // Atributos privados
    private String id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    // Constructor de Reserva con parametros
    public Reserva(String id, LocalDate fechaEntrada, LocalDate fechaSalida) {
        setId(id);
        setFechaEntrada(fechaEntrada);
        setFechaSalida(fechaSalida);
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    } 
}
