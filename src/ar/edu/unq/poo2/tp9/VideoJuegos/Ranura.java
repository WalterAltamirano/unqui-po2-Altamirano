package ar.edu.unq.poo2.tp9.VideoJuegos;

public class Ranura {
	
	private boolean estaAbierta = false; //Inicializo cerrada
	
	public Ranura() {
		super();
	}
	
	public void abrir() {
		this.estaAbierta = true;
	}
	public void cerrar() {
		this.estaAbierta = false;
	}
	public boolean getEstaAbierta() {
		return this.estaAbierta;
	}
}
