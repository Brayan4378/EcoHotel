/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dto.HabitacionDTO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class HabitacionDAO {
    
    private ArrayList<HabitacionDTO> habitaciones = new ArrayList();

    public HabitacionDAO() {
        this.habitaciones = new ArrayList<>();
    }
    
    // Metodo para registrar una habitacion
     public boolean guardarHabitacion(HabitacionDTO habitacion){
       for (HabitacionDTO h : habitaciones ) {
           if( h.getId().equals(h.getId())){
               return false;
           }
       } 
       habitaciones.add(habitacion);
       return true;
   } 
    
   public HabitacionDTO buscarHabitacion(String id) {
    for (HabitacionDTO h : habitaciones) {
        if (h.getId().equals(id)) {
            return h;
        }
    }
    return null;
}

   
   public boolean eliminarHabitacion(HabitacionDTO habitacion){
       for (HabitacionDTO h : habitaciones) {
           if( h.getId().equals(habitacion.getId())){
               habitaciones.remove(h);
               return true;
           }
       }
       return false;
   }
   
   public boolean editarHabitacion(HabitacionDTO habitacion, String id) {
    for (HabitacionDTO h : habitaciones) {
        if (h.getId().equals(id)) {
            h.setCapacidad(habitacion.getCapacidad());
            h.setEstado(habitacion.getEstado());
            h.setTipo(habitacion.getTipo());
            return true;
        }
    }
    return false;
}

    public ArrayList<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }
   
}
