/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import dao.HabitacionDAO;
import dto.HabitacionDTO;

/**
 *
 * @author BrayanOcampo
 */
public class HabitacionControlador {
    
     private HabitacionDAO dao;

    public HabitacionControlador() {
        this.dao = new HabitacionDAO();
    }

    public boolean registrarHabitacion(String id, String tipo, String capacidad,String estado) {
        if (id == null || id.isBlank() || tipo == null || tipo.isBlank() || capacidad == null || 
                capacidad.isBlank() || estado == null || estado.isBlank()) {
            return false;
        }

        HabitacionDTO habitacion = new HabitacionDTO(id, tipo, capacidad, estado);
     
        return dao.guardarHabitacion(habitacion);
    }

    public HabitacionDTO buscarHabitacion(String id) {
        if (id == null || id.isBlank()) {
            return null;
        }
        return dao.buscarHabitacion(id);
    }

    public boolean editarHabitacion(String id, String tipoActualizado, String capacidadActualizada,String estadoActualizado) {
        if (id == null || id.isBlank() || tipoActualizado == null || tipoActualizado.isBlank() || capacidadActualizada == null || 
                capacidadActualizada.isBlank() || estadoActualizado == null || estadoActualizado.isBlank()) {
            return false;
        }

        HabitacionDTO actualizada = new HabitacionDTO(id, tipoActualizado, capacidadActualizada, estadoActualizado);
        return dao.editarHabitacion(actualizada, id);
    }

    public boolean eliminarHabitacion(String id) {
        if (id == null || id.isBlank()) {
            return false;
        }

        HabitacionDTO habitacion = dao.buscarHabitacion(id);
        if (habitacion != null) {
            return dao.eliminarHabitacion(habitacion);
        }
        return false;
    }
    
   
    public ArrayList<HabitacionDTO> obtenerTodasLasHabitaciones(){
        return dao.getHabitaciones();
    }
    
    // Faltan las validaciones 
    
}
