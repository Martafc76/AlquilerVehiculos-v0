package org.iesalandalus.programacion.alquilervehiculos.vista;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Alquileres;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Clientes;

public class Vista {
	Controlador controlador;

	public void setControlador(Controlador controlador) {
		if(controlador == null) {
			throw new NullPointerException("ERROR: El controlador es nulo");
		}
		this.controlador = controlador;

	}

	public void comenzar() {
		Opcion opcion = null;
		do {
			Consola.mostrarCabecera("Menú principal");
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcion();

		} while (opcion != Opcion.SALIR);

	}

	public void terminar() {
		System.out.println("Que tengas un buen día!");
	}

	private void ejecutar(Opcion opcion) {
		switch (opcion) {
		
		case INSERTAR_CLIENTE: {
			insertarCliente();
			break;
		}

		case INSERTAR_TURISMO: {
			insertarTurismo();
			break;
		}

		case INSERTAR_ALQUILER: {
			insertarAlquiler();
			break;
		}

		case BUSCAR_CLIENTE: {
			buscarCliente();
			break;
		}

		case BUSCAR_TURISMO: {
			buscarTurismo();
			break;
		}

		case BUSCAR_ALQUILER: {
			buscarAlquiler();
			break;
		}

		case MODIFICAR_CLIENTE: {
			modificarCliente();
			break;
		}

		case BORRAR_CLIENTE: {
			borrarCliente();
			break;
		}

		case BORRAR_TURISMO: {
			borrarTurismo();
			break;
		}

		case BORRAR_ALQUILER: {
			borrarAlquiler();
			break;
		}

		case LISTAR_CLIENTES: {
			listarClientes();
			break;
		}

		case LISTAR_TURISMOS: {
			listarTurismos();
			break;
		}

		case LISTAR_ALQUILERES: {
			listarAlquieleres();
			break;
		}

		case LISTAR_ALQUILERES_CLIENTE: {
			listarAlquileresCliente();
			break;
		}

		case LISTAR_ALQUILERES_TURISMO: {
			listarAlquileresTurismo();
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}

	// Crea los métodos asociados a cada una de las opciones. Estos métodos deberán
	// mostrar una cabecera informando en que opción nos encontramos,
	// pedirnos los datos adecuados y realizar la operación adecuada llamando al
	// método correspondiente de nuestro controlador.
	// También deben controlar todas las posibles excepciones.

	private void insertarCliente() {
		System.out.println("Insertar cliente");
		try {
			controlador.insertar(Consola.leerCliente());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void insertarTurismo() {
		System.out.println("Insertar turismo");
		try {
			controlador.insertar(Consola.leerTurismo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void insertarAlquiler() {
		System.out.println("Insertar alquiler");
		try {
			controlador.insertar(Consola.leerAlquiler());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void buscarCliente() {
		System.out.println("Buscar cliente");
		try {
			controlador.buscar(Consola.leerCliente());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void buscarTurismo() {
		System.out.println("Buscar turismo");
		try {
			controlador.buscar(Consola.leerTurismo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void buscarAlquiler() {
		System.out.println("Buscar alquiler");
		try {
			controlador.buscar(Consola.leerAlquiler());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void modificarCliente() {
		System.out.println("Modificar cliente");
		try {
			controlador.modificar(Consola.leerClienteDni(), Consola.leerNombre(),Consola.leerTelefono());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void borrarCliente() {
		System.out.println("Borrar cliente");
		try {
			controlador.borrar(Consola.leerCliente());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void borrarTurismo() {
		System.out.println("Borrar turismo");
		try {
			controlador.borrar(Consola.leerTurismo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void borrarAlquiler() {
		System.out.println("Borrar Alquiler");
		try {
			controlador.borrar(Consola.leerAlquiler());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void listarClientes() {
		System.out.println("Listar clientes");
		try {
			controlador.getClientes();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void listarTurismos() {
		System.out.println("Listar turismos");
		try {
			controlador.getTurismos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void listarAlquileres() {
		System.out.println("Listar alquileres");
		try {
			controlador.getAlquileres();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void listarAlquileresCliente() {
		System.out.println("Listar alquileres de clientes");
		try {
			controlador.getAlquileres();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void listarAlquileresTurismo() {
		Turismo turismo;
		System.out.println("Listar alquileres de turismo");
		for(Alquileres alquileres : controlador.getAlquileres(turismo)) {
			System.out.println(alquileres);
		}
		try {
			controlador.getAlquileres(Consola.leerTurismo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

