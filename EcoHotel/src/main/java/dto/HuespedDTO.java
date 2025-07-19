/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author BrayanOcampo
 */
public class HuespedDTO {
    
    private String id;
    private String nombre;
    private String documento;
    private String correo;
    private String telefono;

    public HuespedDTO(String id, String nombre, String documento, String correo, String telefono) {
        setId(id);
        setNombre(nombre);
        setDocumento(documento);
        setCorreo(correo);
        setTelefono(telefono);
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información.");
        }
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información.");
        }
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if(correo == null || correo.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información.");
        }
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono == null || telefono.isBlank()){
            throw new IllegalArgumentException("Este campo debe contener información.");
        }
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
       
      
}
