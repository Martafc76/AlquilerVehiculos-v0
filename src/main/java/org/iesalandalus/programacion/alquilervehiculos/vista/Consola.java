package org.iesalandalus.programacion.alquilervehiculos.vista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final String PATRON_FECHA = "dd/MM/yyyy";

	private Consola() {

	}

	public static void mostrarCabecera(String mensaje) {
		System.out.println(mensaje);
		StringBuilder delineado = new StringBuilder();
		for (int i = 0; i < mensaje.length(); i++) {
			delineado.append("-");
		}
		
		System.out.println(delineado);
	}

	public static void mostrarMenu() {
		System.out.println("Eliga una de las siguientes opciones: ");
		for (Opcion opcion : Opcion.values()) {
			System.out.println(opcion);
		}
	}

	private static String leerCadena(String mensaje) {
		System.out.printf("Introduce %s:", mensaje);
		return Entrada.cadena();
	}

	private static int leerEntero(String mensaje) {
		System.out.printf("Introduce %s: ", mensaje);
		return Entrada.entero();
	}

	private static LocalDate leerFecha(String mensaje) {
		System.out.printf("Introduce %s (%s): ", mensaje, PATRON_FECHA);
		return LocalDate.parse(Entrada.cadena(), FORMATO_FECHA);
	}

	public static Opcion elegirOpcion() {

		Opcion opcion = null;
		do {

			int indice = leerEntero("la opción deseada ");
			try {
				opcion = Opcion.get(indice);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opcion == null);

		return opcion;
	}

	public static Cliente leerCliente() {
		Cliente cliente = null;
		do {
			System.out.println("Introduce los datos del cliente: ");

			try {
				cliente = new Cliente(leerNombre(), leerCadena("el dni"), leerTelefono());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (cliente == null);
		return cliente;

	}

	public static Cliente leerClienteDni() {
		Cliente cliente = null;
		do {
			try {
				cliente = Cliente.getClienteConDni(leerCadena("el dni del cliente"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (cliente == null);

		return cliente;


	}

	public static String leerNombre() {
		return leerCadena("el nombre");
	}

	public static String leerTelefono() {
		return leerCadena("el número de telefono");

	}

	public static Turismo leerTurismo() {
		Turismo turismo = null;
		do {
			System.out.println("Introduce los datos del turismo: ");

			try {
				turismo = new Turismo(leerCadena("la marca"), leerCadena("el modelo"), leerEntero("la cilindrada"),
						leerCadena("la matricula"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (turismo == null);
		return turismo;

	}

	public static Turismo leerTurismoMatricula() {
		Turismo turismo = null;
		do {
			try {
				turismo = Turismo.getTurismoConMatricula(leerCadena("la matricula del turismo"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (turismo == null);

		return turismo;

	}

//cliente,turismo,fechaAlquiler
	public static Alquiler leerAlquiler() {
		Alquiler alquiler = null;
		do {
			System.out.println("Introduce los datos del alquiler: ");

			try {
				alquiler = new Alquiler(leerCliente(), leerTurismo(), leerFecha("la fecha"));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (alquiler == null);
		return alquiler;

	}

	public static LocalDate leerFechaDevolucion() {
		return leerFecha("la fecha de devolución");

	}
	
}
