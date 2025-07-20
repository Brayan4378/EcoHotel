/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.HuespedDTO;
import java.util.ArrayList;
import excepciones.HuespedYaExisteException;

/**
 *
 * @author BrayanOcampo
 */
public class HuespedDAO {
   
    private ArrayList<HuespedDTO> huespedes = new ArrayList();

    public HuespedDAO() {
        this.huespedes = new ArrayList<>();
    }
    
    // Metodo para registrar un huesped
    public boolean guardarHuesped(HuespedDTO huesped){
        for (HuespedDTO h : huespedes ) {
            if( h.getId().equals(huesped.getId())){
               throw new HuespedYaExisteException("Huesped con ID " + huesped.getId() + " ya existe.");
            }
        } 
        huespedes.add(huesped);
        return true;
} 
    // Metodo para buscar un huesped
    public HuespedDTO buscarHuesped(String id) {
        for (HuespedDTO h : huespedes) {
            if (h.getId().equals(id)) {
                return h;
        }
    }
    return null;
}

   // Metodo para eliminar un huesped
    public boolean eliminarHuesped(HuespedDTO huesped){
        for (HuespedDTO h : huespedes) {
            if( h.getId().equals(huesped.getId())){
                huespedes.remove(h);
                return true;
           }
       }
       return false;
}
   
    // Metodo para editar la informacion de un huesped (no incluye el ID)
    public boolean editarHuesped(String id, HuespedDTO huesped) {
        for (HuespedDTO h : huespedes) {
            if (h.getId().equals(id)) {
                h.setCorreo(huesped.getCorreo());
                h.setDocumento(huesped.getDocumento());
                h.setNombre(huesped.getNombre());
                h.setTelefono(huesped.getTelefono());
                return true;
        }
    }
    return false;
}   

    // Metodo para obtener todos los huespedes
    public ArrayList<HuespedDTO> getHuespedes() {
        return huespedes;
}
  
}
