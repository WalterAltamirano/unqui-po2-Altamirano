package ar.edu.unq.poo2.tp9Composite.Warcraft;

import java.util.List;

import ar.edu.unq.poo2.tp3.Punto;

public class Ingeniero extends Personaje{
	
	private List<Laja> bolsaParaLajas;

	private PuntoMapa actual;
	
	@Override
	public void caminarA(PuntoMapa punto) {
		
		while(this.getPuntoActual() != punto) {
			this.dejarLajaSiHay();
			this.avanzar();
		}
		
	}
	
	private void avanzar() {
		/*
		 if(Si no hay mas camino en el eje x o llego al eje x, seguir en el eje y ))*/
		
		this.getPuntoActual().sumaDePuntos(this.actual, new Punto(1,0));
		
	}

	private void dejarLajaSiHay() {
		if(this.getCantidadDeLajas() != 0 && !this.hayLaja()) {
			this.dejarLaja();
		}
		
	}
	private boolean hayLaja() {
		return this.getPuntoActual().getTieneLaja();
	}

	private void dejarLaja() {
		this.getPuntoActual().setTieneLaja(true);
	}

	private int getCantidadDeLajas() {
		return this.bolsaParaLajas.size();
	}
	
	private PuntoMapa getPuntoActual() {
		return this.actual;
	}
	
	
}	
