package org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Turismo {
	private static final String ER_MARCA = "([A-Z][a-z]+[- ]?([A-Z][a-z]+)*)|[A-Z]+";
	private static final String ER_MATRICULA = "\\d{4}([^\\WAEIOU\\-a-z]{3})";
	private String marca;
	private String modelo;
	private int cilindrada;
	private String matricula;
	
	
	public String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	private void setCilindrada(int cilindrada) {
		if(cilindrada <= 0 | cilindrada > 5000) {
			throw new IllegalArgumentException("ERROR: La cilindrada no es correcta.");
		}
		this.cilindrada = cilindrada;
		
	}
	public String getMatricula() {
		return matricula;
	}
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
