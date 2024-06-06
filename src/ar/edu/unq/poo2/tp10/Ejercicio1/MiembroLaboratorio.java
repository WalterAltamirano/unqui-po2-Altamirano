package ar.edu.unq.poo2.tp10.Ejercicio1;

import java.util.List;
import java.util.stream.Stream;

public class MiembroLaboratorio implements SuscriptorArticulo {
	
	private SistemaReferenciaPublicaciones sistema;
	//private String referenciaArticuloInteres;
	
	
	public MiembroLaboratorio(String referenciaArticulo) {
		super();
		//this.referenciaArticuloInteres = referenciaArticulo;
		//this.sistema.agregarSuscriptor(this);  
		//En la implementacion de observer, se agrega directamente en el constructor
		//quien va a ser el observador(Miembro) del 
		//sujeto(SistemaReferenciaPublicaciones)
	}
	
	
	
	@Override
	public void nuevoArticulo(ArticuloCientifico articulo) {
		
		
	}

	public void suscribirseAArticulosDe(String referenciaArticulo) {
		sistema.agregarSuscriptor(this);
		
	}

	
	
}

/*
   @Override
	public void nuevoArticulo(ArticuloCientifico articulo) {
		List<String> palabrasClaveArticulo = articulo.getPalabrasClave();
		
		Stream<String> streamPalabras = palabrasClaveArticulo.stream()
										.filter(palabraClave -> palabraClave == this.getReferenciaArticuloInteres())
										;
		
	}
 
  public String getReferenciaArticuloInteres() {
		return referenciaArticuloInteres;
	}
  
  */
