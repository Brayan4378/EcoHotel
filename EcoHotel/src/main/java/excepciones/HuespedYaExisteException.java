/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author BrayanOcampo
 */
public class HuespedYaExisteException extends RuntimeException {
    
    public HuespedYaExisteException(String mensaje) {
        super(mensaje);
    }
}
