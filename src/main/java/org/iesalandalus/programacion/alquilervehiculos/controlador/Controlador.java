package org.iesalandalus.programacion.alquilervehiculos.controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Alquileres;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Clientes;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Turismos;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;

public class Controlador {
	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
		if(modelo == null) {
			throw new NullPointerException("ERROR: Modelo es nulo");
		}
		
		if(vista == null) {
			throw new NullPointerException("ERROR: Vista es nula");
		}
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void comenzar() {
		vista.comenzar();
	    modelo.comenzar();
	}

	public void terminar() {
		vista.terminar();
	    modelo.terminar();
	}
	
	public void insertar(Cliente cliente) throws OperationNotSupportedException {
	    modelo.insertar(cliente);
	}

	public void insertar(Turismo turismo) throws OperationNotSupportedException {
	   modelo.insertar(turismo);
	}

	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		modelo.insertar(alquiler);
	  
	}

	public Cliente buscar(Cliente cliente) {
	  return modelo.buscar(cliente);
	}

	public Turismo buscar(Turismo turismo) {
	    return modelo.buscar(turismo);
	}

	public Alquiler buscar(Alquiler alquiler) {
	    return buscar(alquiler);
	    
	}
	
	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
	    modelo.modificar(cliente, nombre, telefono);
	}
	
	public void devolver(Alquiler alquiler, LocalDate fechaDevolucion) throws OperationNotSupportedException {
		modelo.devolver(alquiler, fechaDevolucion);
	}
	
	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		modelo.borrar(cliente);
	}
	
	public void borrar(Turismo turismo) throws OperationNotSupportedException {
		modelo.borrar(turismo);
	}
	
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		modelo.borrar(alquiler);
	}
	
	//
	public List<Cliente> getClientes(){
		return modelo.getClientes();
		}
	
	//
	public List<Turismo> getTurismos(){
		return modelo.getTurismos();
		}
	
	public List<Alquiler> getAlquileres(){
		return modelo.getAlquileres();
		}
		
	public List<Alquiler> getAlquileres(Cliente cliente){
		return modelo.getAlquileres(cliente);
	}
	
	public List<Alquiler> getAlquileres(Turismo turismo){
		return modelo.getAlquileres(turismo);
	}
}
