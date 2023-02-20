package org.iesalandalus.programacion.alquilervehiculos.vista;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;

public class Vista {
	Controlador controlador;
	
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
		
	}
	
	public static void comenzar() {
		Opcion opcion = null;
		do {
			Consola.mostrarCabecera("Menú principal");
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcion();
			
		} while(opcion != Opcion.SALIR);
		
	}
	
	public static void main(String[] args) {
		comenzar();
	}
	

}
