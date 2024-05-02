package ar.edu.unq.poo2.ejemploMockito;

public class GuerreroDeAzar implements IGuerrero {
	
	private Integer puntosDeVida;
	private Integer puntosDeAtaque;
	private IMoneda miMoneda;
	
	public GuerreroDeAzar(Integer unosPuntosDeVida, Integer unosPuntosDeAtaque, IMoneda unaMoneda) {
		puntosDeAtaque = unosPuntosDeAtaque;
		puntosDeVida = unosPuntosDeVida;
		miMoneda = unaMoneda;
	}
	
	@Override
	public void atacar(IGuerrero unGuerrero) {
		if(miMoneda.esCara()) {
			unGuerrero.descontarPuntosDeVida(this.puntosDeAtaque);	
		}
		else {
			this.descontarPuntosDeVida(this.puntosDeAtaque);
		}
	}
	
	@Override
	public void descontarPuntosDeVida(Integer unosPuntos) {
		
	}
}
