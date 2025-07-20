/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.HuespedDAO;
import dto.HuespedDTO;
import excepciones.DatoInvalidoException;
import excepciones.HuespedNoEncontradoException;
import excepciones.HuespedYaExisteException;
import herramientas.IDGenerador;
import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class HuespedControlador {

    private HuespedDAO dao;

    public HuespedControlador() {
        dao = new HuespedDAO();
    }

    // Método para registrar un nuevo huésped
    public void registrarHuesped(String id, String nombre, String documento, String telefono) throws DatoInvalidoException, HuespedYaExisteException {
        if (nombre == null || nombre.isBlank()) {
            throw new DatoInvalidoException("El nombre no puede estar vacío.");
        }
        if (documento == null || documento.isBlank()) {
            throw new DatoInvalidoException("El documento no puede estar vacío.");
        }
        if (telefono == null || telefono.isBlank()) {
            throw new DatoInvalidoException("El teléfono no puede estar vacío.");
        }

        // Crea el huesped
        HuespedDTO nuevo = new HuespedDTO(id, nombre, documento, nombre, telefono);

        // Guarda usando el DAO (puede lanzar excepción si ya existe)
        dao.guardarHuesped(nuevo);
    }

    // Método para editar los datos de un huésped
    public boolean editarHuesped(String id, String nuevoNombre, String nuevoDocumento, String nuevoCorreo, String nuevoTelefono) throws DatoInvalidoException, HuespedNoEncontradoException {
        if (id == null || id.isBlank()) {
            throw new DatoInvalidoException("El ID no puede estar vacío.");
        }
        if (nuevoNombre == null || nuevoNombre.isBlank()) {
            throw new DatoInvalidoException("El nuevo nombre no puede estar vacío.");
        }
        if (nuevoDocumento == null || nuevoDocumento.isBlank()) {
            throw new DatoInvalidoException("El nuevo documento no puede estar vacío.");
        }
        if (nuevoCorreo == null || nuevoCorreo.isBlank()){
            throw new DatoInvalidoException("El nuevo correo no puede estar vacio");
        }
        if (nuevoTelefono == null || nuevoTelefono.isBlank()) {
            throw new DatoInvalidoException("El nuevo teléfono no puede estar vacío.");
        }

        HuespedDTO huesped = new HuespedDTO(id, nuevoNombre, nuevoDocumento, nuevoCorreo, nuevoTelefono);
        return dao.editarHuesped(id, huesped);
    }

    // Método para eliminar un huésped
    public boolean eliminarHuesped(String id) throws DatoInvalidoException, HuespedNoEncontradoException {
        if (id == null || id.isBlank()) {
            throw new DatoInvalidoException("Debe proporcionar un ID para eliminar.");
        }
        HuespedDTO huesped = dao.buscarHuesped(id);
        if(huesped != null){
            return dao.eliminarHuesped(huesped);
        }
        throw new HuespedNoEncontradoException("El ID proporcionado no pertenece a ningun huesped");
    }

    // Método para buscar un huésped por ID
public HuespedDTO buscarHuesped(String id) throws DatoInvalidoException, HuespedNoEncontradoException {
        if (id == null || id.isBlank()) {
            throw new DatoInvalidoException("Debe proporcionar un ID válido.");
        }

        return dao.buscarHuesped(id);
    }

    // Método para obtener todos los huespedes
    public ArrayList<HuespedDTO> obtenerHuespedes() {
        return dao.getHuespedes();
    }
}

