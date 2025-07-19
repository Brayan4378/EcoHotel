/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author BrayanOcampo
 */
public class Huesped {
    
    // Atributos privados
    private String id;
    private String nombre;
    private String documento;
    private String correo;
    private String telefono;

    // Constructor de Huesped con parametros
    public Huesped(String id, String nombre, String documento, String correo, String telefono) {
        setId(id);
        setNombre(nombre);
        setDocumento(documento);
        setCorreo(correo);
        setTelefono(telefono);
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
}
