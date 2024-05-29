package ar.edu.unq.poo2.tp9.VideoJuegos;

public class Usuario {
	
	private int fichas;
	
	public Usuario(int fichas) {
		super();
		this.fichas = fichas;
	}
	
	public int getFichas() {
		return this.fichas;
	}
	
	public void recibirFichas(int fichas) {
		this.fichas = this.fichas + fichas;
	}
	
	
}	
