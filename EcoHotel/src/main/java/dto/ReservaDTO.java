/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;

/**
 *
 * @author BrayanOcampo
 */
public class ReservaDTO {
    
    private String id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public ReservaDTO(String id, LocalDate fechaEntrada, LocalDate fechaSalida) {
        setId(id);
        setFechaEntrada(fechaEntrada);
        setFechaSalida(fechaSalida);
    }

    // Getters y Setters con validaciones
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
        if(fechaEntrada == null){
            throw new IllegalArgumentException("Este campo debe contener información");
        }
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalidad) {
        if(fechaSalida == null){
            throw new IllegalArgumentException("Este campo debe contener información");
        }
        this.fechaSalida = fechaSalida;
    }
}
