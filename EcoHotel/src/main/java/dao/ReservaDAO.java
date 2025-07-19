/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.ReservaDTO;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class ReservaDAO {
    
private ArrayList<ReservaDTO> reservas = new ArrayList();

    public ReservaDAO() {
        this.reservas = reservas;
    }
    
    // Metodo para registrar una reserva
    public boolean guardarReserva(ReservaDTO reserva){
       for (ReservaDTO r : reservas ) {
           if( r.getId().equals(r.getId())){
               return false;
           }
       } 
       reservas.add(reserva);
       return true;
   } 
    
    //
    public ReservaDTO buscarReserva(String id) {
        for (ReservaDTO r : reservas) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

   
    public boolean eliminarReserva(ReservaDTO reserva){
        for (ReservaDTO r : reservas) {
           if( r.getId().equals(reserva.getId())){
               reservas.remove(r);
               return true;
           }
       }
       return false;
   }
   
    public boolean editarReserva(String id, ReservaDTO reserva) {
        for (ReservaDTO r : reservas) {
            if (r.getId().equals(id)) {
                r.setFechaEntrada(reserva.getFechaEntrada());
                r.setFechaSalida(reserva.getFechaSalida());
                return true;
            }
        }
        return false;
    }
    
}
