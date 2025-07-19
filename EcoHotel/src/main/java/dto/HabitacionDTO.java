/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author BrayanOcampo
 */
public class HabitacionDTO {
    
    private String id;
    private String tipo;
    private String capacidad;
    private String estado;

    public HabitacionDTO(String id, String tipo, String capacidad, String estado) {
        setId(id);
        setTipo(tipo);
        setCapacidad(capacidad);
        setEstado(estado);
    }

    // Getters y Setters con validaciones
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
        if(tipo == null || tipo.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información");
        }
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        if(capacidad == null || capacidad.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información");
        }
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado == null || estado.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información");
        }
        this.estado = estado;
    }
    
}
