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
		
		return this.jugada();
	}
	
	public String jugada() {
		if(this.hayPoquer()) {
			return this.poquer();
		}
		else if(this.hayColor()) {
			return this.color();
		}
		else if(this.hayTrio()) {
			return this.trio();
		}
		else {
			return this.nada();
		}
	}
	public boolean hayPoquer() {
		return this.valoresDeCartas().size() <= 2; 
	}
	public boolean hayColor() {
		return this.palosDeCartas().size()== 1; //iria && laParteDeColor()
	}
	public boolean hayTrio() {
		return this.valoresDeCartas().size() == 3;
	}
	
	public List<Integer> valoresDeCartas() {
		Stream<Carta> streamDeCartas = cartas.stream();
		
		return streamDeCartas.map(carta -> carta.valor())
			  	  .distinct()
			  	  .collect(Collectors.toList());
	}
	
	public List<Carta.PalosPoquer> palosDeCartas() {
		Stream<Carta> streamDeCartas = cartas.stream();
		
		return streamDeCartas.map(carta -> carta.palo())
			  	  .distinct()
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
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

