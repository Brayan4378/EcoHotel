/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author BrayanOcampo
 */public class IDGenerador {
    
    // Contadores desde 0
    private static int contadorReserva = 0;
    private static int contadorHuesped = 0;
    private static int contadorHabitacion = 0;

    // Metodos que permiten que los ID´s no vayan a ser iguales
    public static String generarIDReserva() {
        return "Ht" + (++contadorReserva);
    }

    public static String generarIDHuesped() {
        return "Hs" + (++contadorHuesped);
    }   
    
    public static String generarIDHabitacion(){
        return "Hb" + (++contadorHabitacion);
    }
}
