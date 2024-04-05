package ar.edu.unq.poo2.tp3;

import java.util.Date;
import java.time.*;

public class Persona {
	
	private String nombre;
	
	private LocalDate fechaDeNacimiento;
	
	private int añoActual;
	
	public Persona(String nombre,LocalDate fechaDeNacimiento, int añoActual) {
		super();
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombre = nombre;
		this.añoActual = añoActual;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public int edad() {
		return añoActual - fechaDeNacimiento.getYear();
	}
	
	/*
	 * Pregunta 1a)
	 * 	No, no lo sabe. Encapsulamiento se llama
	 */
	
	public boolean menorQue(Persona personaA, Persona personaB) {
		return personaA.edad() < personaB.edad();
	}
	
	
}
