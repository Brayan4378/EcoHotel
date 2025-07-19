/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.HuespedDTO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class HuespedDAO {
   
     private ArrayList<HuespedDTO> huespedes = new ArrayList();

    public HuespedDAO() {
        this.huespedes = huespedes;
    }
    
    // Metodo para registrar un huesped
    public boolean guardarHuesped(HuespedDTO huesped){
        for (HuespedDTO h : huespedes ) {
            if( h.getId().equals(h.getId())){
               return false;
            }
        } 
        huespedes.add(huesped);
        return true;
    } 
    
    public HuespedDTO buscarHuesped(String id) {
        for (HuespedDTO h : huespedes) {
            if (h.getId().equals(id)) {
                return h;
        }
    }
    return null;
}

   
   public boolean eliminarHuesped(HuespedDTO huesped){
       for (HuespedDTO h : huespedes) {
           if( h.getId().equals(huesped.getId())){
               huespedes.remove(h);
               return true;
           }
       }
       return false;
   }
   
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
}
