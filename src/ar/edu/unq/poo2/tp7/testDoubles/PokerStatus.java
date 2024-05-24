package ar.edu.unq.poo2.tp7.testDoubles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class PokerStatus {

	private List<Carta> cartas = new ArrayList<Carta>();
	
	//private List<String> cartasString = new ArrayList<String>();
	//Constructor
	public PokerStatus() {
		super();
	}
	
	//Metodos
	//Primera parte de poquer
//	public boolean verificar(String carta1,String carta2,String carta3,String carta4,String carta5) {
//		List<String> cartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
//		Stream<String> stream = cartas.stream();
//		List<Character> valoresDeCartas = stream.map(carta -> carta.charAt(0))
//				  .distinct()
//				  .collect(Collectors.toList());
//		return valoresDeCartas.size() <= 2;
//	}
//
//


	
	//Poquer continuacion
	
	

//	public String verificar(String carta1,String carta2,String carta3,String carta4,String carta5) {
//		cartasString.addAll(Arrays.asList(carta1,carta2,carta3,carta4,carta5));
//		
//		return this.jugada();
//	}
//	public List<Character> valoresDeCartas() {
//		Stream<String> streamDeCartas = cartasString.stream();
//		
//		return streamDeCartas.map(cartaString -> cartaString.charAt(0))
//			  	  .distinct()
//			  	  .collect(Collectors.toList());
//	}
//	
//	public List<Character> palosDeCartas() {
//		Stream<String> streamDeCartas = cartasString.stream();
//		
//		return streamDeCartas.map(cartaString -> cartaString.charAt(1))
//			  	  .distinct()
//			  	  .collect(Collectors.toList());
//	}	
	
	//	Las cartas de poquer Punto 2)
	
	//Aca lo que puedo hacer es, en vez de recorrer toda la lista, preguntar por la condicion
	//De si hay una jugada o no especifica para cada metodo
	
	public String verificar(Carta carta1,Carta carta2,Carta carta3,Carta carta4,Carta carta5) {
		cartas.addAll(Arrays.asList(carta1,carta2,carta3,carta4,carta5));
		
		return this.jugadaDeLaMano();
	}
	
	private String jugadaDeLaMano() {
		List<Integer> aparicionesDeCadaValor = this.numeroDeAparicionesDe(this.valoresDeCartas());
		List<Integer> aparicionesDeCadaPalo = this.numeroDeAparicionesDe(this.palosDeCartas());
		
		if(aparicionesDeCadaValor.contains(4)) {
			return this.poquer();
		}
		else if(aparicionesDeCadaPalo.contains(5)){
			return this.color();
		}
		else if(aparicionesDeCadaValor.contains(3)) {
			return this.trio();
		}
		else {
			return this.nada();
		}
	}
	private List<Carta.PalosPoquer> palosDeCartas() {
		Stream<Carta> streamDeCartas = cartas.stream();
		
		return streamDeCartas.map(carta -> carta.palo())
			  	  .collect(Collectors.toList());
	}
	private List<Integer> valoresDeCartas() {
		Stream<Carta> streamDeCartas = cartas.stream();
		
		return streamDeCartas.map(carta -> carta.valor())
			  	  .collect(Collectors.toList());
	}
	private String poquer() {
		return "Poquer";
	}
	private String nada() {
		return "Nada";
	}
	private String trio() {
		return "Trio";
	}
	private String color() {
		return "Color";
	}
	private <T> List<Integer> numeroDeAparicionesDe(List<T> cosas) {
		
		//List<T> palos = this.palosDeCartas();
		
		List<Integer> aparicionesDeCadaValor = new ArrayList<Integer>();
	
		for(int i=0;cosas.size() != i;i++) {
			aparicionesDeCadaValor.add(aparicionesDe_En_(cosas.get(0),cosas));
		}
		return aparicionesDeCadaValor;
	}
	
	private <T> int aparicionesDe_En_(T palo, List<T> palos) {
		int cantidadDeApariciones = 0;
		for(int i= 0; palos.size() != i;i++){
			cantidadDeApariciones = 
				cantidadDeApariciones + this.unoSiCeroSino(palo == palos.get(i));
			}
			
		return cantidadDeApariciones; 
	}
	
	private int unoSiCeroSino(boolean condicion) {
		if(condicion){
			return 1;
		}
		else {
			return 0;
		}
	}
	
//	private List<Integer> numeroDeAparicionesDeCadaValor() {
//	
//	List<Integer> valores = this.valoresDeCartas();
//	
//	List<Integer> aparicionesDeCadaValor = new ArrayList<Integer>();
//
//	for(int i=0;valores.size() != i;i++) {
//		aparicionesDeCadaValor.add(aparicionesDeEn(valores.get(0),valores));
//	}
//	return aparicionesDeCadaValor;
//}
//
//private int aparicionesDeEn(int valor, List<Integer> valores) {
//	int cantidadDeApariciones = 0;
//	for(int i= 0; valores.size() != i;i++){
//		cantidadDeApariciones = 
//			cantidadDeApariciones + this.unoSiCeroSino(valor == valores.get(i));
//		}
//		
//	return cantidadDeApariciones; 
//}
//
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

