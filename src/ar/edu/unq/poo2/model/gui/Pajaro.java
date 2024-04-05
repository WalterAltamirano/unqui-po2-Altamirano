package ar.edu.unq.poo2.model.gui;

public class Pajaro {

	private int energia = 100;
	
	private String nombre;
	
	public int energia() {
		return energia;
	}
	
	public void cantar() {
		energia =- 5;
	}	
}
