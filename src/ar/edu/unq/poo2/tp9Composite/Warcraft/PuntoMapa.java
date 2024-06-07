package ar.edu.unq.poo2.tp9Composite.Warcraft;

import ar.edu.unq.poo2.tp3.Punto;

public class PuntoMapa extends Punto {

	private boolean tieneLaja;
	
	public PuntoMapa(int x, int y) {
		super(x,y);
		this.tieneLaja = false;
	}
	public PuntoMapa(int x, int y,boolean valor) {
		super(x,y);
		this.tieneLaja = valor;
	}
	
	public boolean getTieneLaja() {
		return this.tieneLaja;
	}

	void setTieneLaja(boolean valor) {
		this.tieneLaja = valor;
	}
	
	
}
