package ar.edu.unq.poo2.tp10.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class SistemaReferenciaPublicaciones {

	private List<SuscriptorArticulo> suscriptores;
	//private List<ArticuloCientifico> articulos;
	private List<SuscriptorAsociado> suscriptoresConReferencias;
	
	public SistemaReferenciaPublicaciones() {
		super();
//		this.suscriptores = new ArrayList<SuscriptorArticulo>();
//		this.articulos = new ArrayList<ArticuloCientifico>();
	}
	
	
	public void agregarSuscriptor(SuscriptorArticulo suscriptor, String referenciaArticulo) {
		suscriptores.add(suscriptor);
		suscriptoresConReferencias.add(new SuscriptorAsociado(suscriptor, referenciaArticulo));
	}
	public void eliminarSuscriptor(SuscriptorAsociado suscriptor) {
		//suscriptoresConReferencias.remove(suscriptor); //Habria que filtrarlo
		suscriptores.remove(suscriptor);
	}
	public void cargarArticulo(ArticuloCientifico articulo) {
		
	}
	
	/*
	  Puede ser posible agregar una lista de intereses de los articulos
	  que necesiten los miembros
	   *Los miembros le enviarian un mensaje a este sistema donde le indican
	    algun campo del articulo que les interesa y, al momento de que llega un
	    nuevo articulo, se verifica que este en la lista de interes.
	  
	  //Otra opcion
	   * Lo que se puede hacer es que este sistema, al momento de que llega un nuevo
	      articulo ni mira que es y lo notifica a cada miembro, donde cada miembro
	      tendria la responsabilidad de verificar si es de su interes	  
	  
	  
	 
	  
	 
	  */
}
