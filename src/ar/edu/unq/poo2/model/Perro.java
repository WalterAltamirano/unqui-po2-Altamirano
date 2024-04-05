package ar.edu.unq.poo2.model;

public class Perro {
	
	private int energia = 100;
	
	private String nombre;
	
	public int energia() {
		return energia;
	}
	
	public void ladrar() {
		energia =- 5;
	}
}
