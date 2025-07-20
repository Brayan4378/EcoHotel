/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author BrayanOcampo
 */
public class ReservaNoEncontradaException extends RuntimeException {
    
    public ReservaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
