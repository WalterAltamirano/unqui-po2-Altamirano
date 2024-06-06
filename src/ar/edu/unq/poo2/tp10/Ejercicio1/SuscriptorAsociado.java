package ar.edu.unq.poo2.tp10.Ejercicio1;

public class SuscriptorAsociado {
	private SuscriptorArticulo suscriptor;
	private String referenciaArticulo;
	
	public SuscriptorAsociado(SuscriptorArticulo suscriptor,String referencia) {
		super();
		this.suscriptor = suscriptor;
		this.referenciaArticulo = referencia;
	}
	
	public String getReferenciaArticulo() {
		return referenciaArticulo;
	}
	
	
	
	
}
