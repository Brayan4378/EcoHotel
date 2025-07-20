/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.ReservaDAO;
import dto.*;
import excepciones.DatoInvalidoException;
import excepciones.ReservaYaExisteException;
import excepciones.ReservaNoEncontradaException;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author BrayanOcampo
 */
public class ReservaControlador {
    
    private ReservaDAO reservaDAO;
    
    public ReservaControlador(){
        this.reservaDAO = new ReservaDAO();
    }
    
    public boolean registrarReserva(String id, LocalDate fechaEntrada, LocalDate fechaSalida, HuespedDTO huesped, HabitacionDTO habitacion) {
        // Validar campos obligatorios
        if (id == null || id.isBlank() || fechaEntrada == null || fechaSalida == null || huesped == null || habitacion == null) {
            throw new DatoInvalidoException("Todos los campos de la reserva son obligatorios.");
        }
        // Validar fechas
        if (fechaSalida.isBefore(fechaEntrada)) {
            throw new DatoInvalidoException("La fecha de salida no puede ser anterior a la de entrada.");
        }
        // Verificar que la reserva no exista
        if (reservaDAO.buscarReserva(id) != null) {
            throw new ReservaYaExisteException("La reserva con ID " + id + " ya existe.");
        }

        // Crear la reserva con huesped y habitacion asignados
        ReservaDTO reserva = new ReservaDTO(id, fechaEntrada, fechaSalida);
        reserva.setHuesped(huesped);
        reserva.setHabitacion(habitacion);

        // Guardar 
        return reservaDAO.guardarReserva(reserva);
        }

        // Busca y devuelve una reserva por su ID
        public ReservaDTO buscarReserva(String id) {
            if (id == null || id.isBlank()) {
                throw new DatoInvalidoException("Debe ingresar un ID válido para buscar.");
            }
            ReservaDTO reserva = reservaDAO.buscarReserva(id);
            if (reserva == null) {
                throw new ReservaNoEncontradaException("No se encontró una reserva con el ID: " + id);
            }
            return reserva;
        }
    
   // Elimina una reserva existente por medio del ID
    public boolean eliminarReserva(String id) {
        ReservaDTO reserva = buscarReserva(id); // Valida existencia de la reserva
        boolean eliminada = reservaDAO.eliminarReserva(reserva);

        if (!eliminada) {
            throw new ReservaNoEncontradaException("No se pudo eliminar la reserva con ID: " + id);
        }
        return true;
    }

    // Edita la reserva
    public boolean editarReserva(String id, LocalDate nuevaEntrada, LocalDate nuevaSalida) {
        // Validar campos
        if (id == null || id.isBlank() || nuevaEntrada == null || nuevaSalida == null) {
            throw new DatoInvalidoException("Todos los campos son obligatorios para editar.");
        }

        // Validar fechas
        if (nuevaSalida.isBefore(nuevaEntrada)) {
            throw new DatoInvalidoException("La fecha de salida no puede ser anterior a la de entrada.");
        }

        ReservaDTO existente = buscarReserva(id); // Valida si existe, sino, manda una excepcion "ReservaYaExisteException"

        // Crear la reserva actualizada
        ReservaDTO nuevaReserva = new ReservaDTO(id, nuevaEntrada, nuevaSalida);

        boolean editada = reservaDAO.editarReserva(id, nuevaReserva);

        if (!editada) {
            throw new ReservaNoEncontradaException("No se pudo editar la reserva con ID: " + id);
        }
        return true;
    }
    
    public ArrayList<ReservaDTO> obtenerTodasLasReservas(){
        return reservaDAO.getReservas();
    }
    }
    
    


