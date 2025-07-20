/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import dao.HabitacionDAO;
import dto.HabitacionDTO;
import excepciones.*;
import herramientas.IDGenerador;

/**
 *
 * @author BrayanOcampo
 */
public class HabitacionControlador {
    
     private HabitacionDAO dao;

    public HabitacionControlador() {
        this.dao = new HabitacionDAO();
    }
    
    public boolean registrarHabitacion(String id, String tipo, String capacidad, String estado) {
        // Validar tipo
        if (tipo == null || tipo.isBlank()) {
            throw new DatoInvalidoException("Debe de registrar el tipo de habitacion");
        }
        // Validar capacidad
        if (capacidad == null || capacidad.isBlank()) {
            throw new DatoInvalidoException("Debe de establecer la capacidad de la habitacion");
        }
        // Validar estado
        if (estado == null || estado.isBlank()) {
            throw new DatoInvalidoException("Establezca en qué estado se encuentra la habitacion");
        }
        // Validar que la capacidad sea numérica
        try {
            Integer.parseInt(capacidad.trim());
        } catch (NumberFormatException e) {
            throw new DatoInvalidoException("La capacidad debe ser un número entero.");
        }
    
        // Crear la habitacion
        HabitacionDTO habitacion = new HabitacionDTO(id, tipo, capacidad, estado);

        // Guarda en el DAO
        return dao.guardarHabitacion(habitacion);  
    }

    public HabitacionDTO buscarHabitacion(String id) {
        // Validar id
        if (id == null || id.isBlank()) {
            throw new HabitacionNoDisponibleException("La habitacion no existe");
        }
        // Busca en el dao
        return dao.buscarHabitacion(id);
    }

    public boolean editarHabitacion(String id, String tipoActualizado, String capacidadActualizada,String estadoActualizado) {
        // Validar tipo
        if (tipoActualizado == null || tipoActualizado.isBlank()) {
            throw new DatoInvalidoException("Debe de registrar el tipo de habitacion");
        }
        // Validar capacidad
        if (capacidadActualizada == null || capacidadActualizada.isBlank()) {
            throw new DatoInvalidoException("Debe de establecer la capacidad de la habitacion");
        }
        // Validar estado
        if (estadoActualizado == null || estadoActualizado.isBlank()) {
            throw new DatoInvalidoException("Establezca en qué estado se encuentra la habitacion");
        }
    
        HabitacionDTO actualizada = new HabitacionDTO(id, tipoActualizado, capacidadActualizada, estadoActualizado);
        return dao.editarHabitacion(actualizada, id);
        
    }

    public boolean eliminarHabitacion(String id) {
        if (id == null || id.isBlank()) {
            throw new DatoInvalidoException("ID no valido");
        }

        HabitacionDTO habitacion = dao.buscarHabitacion(id);
        if (habitacion != null) {
            return dao.eliminarHabitacion(habitacion);
        }
        throw new HabitacionNoDisponibleException("No se encontro una habitacion registrada con ese ID");
    }
    
   
    public ArrayList<HabitacionDTO> obtenerTodasLasHabitaciones(){
        return dao.getHabitaciones();
    } 
}
