package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
//Punto 1)

public class Counter {
	
	private List<Integer> arrayInt = new ArrayList<Integer>();

	public void addNumber(int i) {
		arrayInt.add(i);
	}

	public int cantidadDePares() {
		List<Integer> listaARecorrer = arrayInt;
		
		int paresVistos = 0;
		
		int i=0;
		
		while(listaARecorrer.size() != i) {
			if((listaARecorrer.get(i) % 2) == 0) { 
				paresVistos =+ 1; 
			}
			i++;
		}
		return paresVistos;
	}
		
	
	public int cantidadDeImpares() {
		List<Integer> listaARecorrer = arrayInt;
		
		int imparesVistos = 0;
		
		int i = 0;
		
		while(i < listaARecorrer.size() ) {
			if((listaARecorrer.get(i) % 2) == 1) { 
				imparesVistos = imparesVistos + 1; 
			}
			i++;
		}
		return imparesVistos;
	}
	public int cantidadDeMultiplosDe(int m) {
		List<Integer> listaARecorrer = arrayInt;
		
		int multiplosVistos = 0;
		
		for (int i=0; i < listaARecorrer.size();i++) {
			if((listaARecorrer.get(i) * m) % 2 == 0) { 
				multiplosVistos =+ 1; 
			}
		}
		return multiplosVistos;	
	}
	
	//Punto 2
	/*
	 * Otra opcion es hacerlo todo junto. Dentro del bucle ir comparando y guardando el maximo
	 */
	public int elMaximoParDelArreglo(int[] arregloDeNumeros) {
		
		List<Integer> paresDeDigitos = new ArrayList<Integer>();
		
		for(int i= 0;arregloDeNumeros != null;i++) {			
			if (arregloDeNumeros[i] % 2 == 0) {
				paresDeDigitos.add(i);
				paresDeDigitos.remove(i);
			}
			else { paresDeDigitos.remove(i);}
		}
		
		return this.elMaximoDelArreglo(paresDeDigitos);
	}
	
	public int elMaximoDelArreglo(List<Integer> arregloDeNumeros) {
		
		int elMaximoHastaAhora = arregloDeNumeros.get(0);
		
		for(int i= 0; !arregloDeNumeros.isEmpty();i++) {
			if(elMaximoHastaAhora < arregloDeNumeros.get(i)) {
				elMaximoHastaAhora = arregloDeNumeros.get(i);
				arregloDeNumeros.remove(i);
			}
			else {arregloDeNumeros.remove(i);}
		}
		
		return elMaximoHastaAhora ;
	}
	
	//Punto 3
	
	public int multiploEntreCeroYMilDe(int x,int y) {
		
		int multiploMayorHastaAhora = elMultiploSiEsEntreSinoMenosUno(x,y,0);
		
		int i = 1;
				
		while( i < 1000 ) {
		if(elMultiploSiEsEntreSinoMenosUno(x,y,i) > multiploMayorHastaAhora) {
			multiploMayorHastaAhora = i;
			}
		i++;
		}
		return multiploMayorHastaAhora;
	}
	
	public boolean esMultiploDe(int x,int y) {
		return (x * y) % 2 == 0;
	}
	
	public int elMultiploSiEsEntreSinoMenosUno(int x,int y, int z) {
		if(esMultiploDe(z,x) && esMultiploDe(z,y)) {
			return z;
		}
		else {
			return -1;
		}
	}
	
	
	//Punto 4
	
	String a = "abc";
	
	String s = a;
	
	String t;

	
	public int pruebaDeStringsUno() {
		return s.length();
	}
	//El valor que da es 3 y esta bien porque el string tiene 3 caracteres
	
	
	
	public int pruebaDeStringsDos() {
		return t.length();
	}
	//Da error porque la variable "t no tiene ningun valor asignado
	
	
	
	public String pruebaDeStringsTres() {
		return 1 + a;
	}
	//Se concatena el numero con el string y queda "1abc" es decir, el int se transforma en String
	
	public String pruebaDeStringsCuatro() {
		return a.toUpperCase();
	}
	//Se envia un mensaje para convertir cada caracter en mayuscula
	
	public int pruebaDeStringsCinco() {
		return "Libertad".indexOf("r");
	}
	//Devuelve la posicion del caracter en el string(es 4 porque empieza desde cero)
	
	public int pruebaDeStringsSeis() {
		return "Universidad".lastIndexOf("i");
	}
	//Devuelve la posicion del la ultima aparicion del string dado
	
	public String pruebaDeStringsSiete() {
		return "Quilmes".substring(2,4);
	}
	//Devuelve un substring del string dado. No incluye el ultimo valor del rango a substraer 
	// "Quilmes" --> "il" con un rango de (2,4)
	
	public boolean pruebaDeStringsOcho() {
		return (a.length() + a).startsWith("a");
	}
	//Como el resultado es 3a, el metodo devuelve false
	
	public boolean pruebaDeStringsNueve() {
		return s == a;
	}
	//"s" es equivalente a "a"
	
	public boolean pruebaDeStringsDiez() {
		return a.substring(1,3).equals("bc");
	}
	// la cadena substraida de a es "bc" (la posicion 3 no se toma)
	
	//Punto 5
	
	/*
	 *Pregunta 1)
	 *	*Son los tipos de datos que ya estan definidos en el lenguaje
	 *Pregunta 2)
	 *	*El int es un tipo primitivo e Integer es una clase Wrapper
	 *Pregunta 3)
	 *	El valor predeterminado de un int es cero
	 *	El valor predeterminado de un Integer es null
	 *Pregunta 4)
	 *	Se deben inicializar. No tienen valor predeterminado.
	 */
	private int x;
	
	private Integer y;
	
	public int getX() { 
		int xx;
		
		return x;
	}
	public Integer getY() {
		Integer yy;
		
		return y;
	}
	
}



















