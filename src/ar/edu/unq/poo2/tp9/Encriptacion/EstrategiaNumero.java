package ar.edu.unq.poo2.tp9.Encriptacion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EstrategiaNumero extends EstrategiaEncriptador {
	
	private List<String> abecedarioNumeros= Arrays.asList("1", "2", "3","4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25","26");	
	private List<Abecedario> abecedario = Arrays.asList(Abecedario.a ,Abecedario.b, Abecedario.c, Abecedario.d, Abecedario.e, Abecedario.f, Abecedario.g, Abecedario.h,
			Abecedario.i, Abecedario.j, Abecedario.k, Abecedario.l, Abecedario.m,Abecedario.n, Abecedario.o, Abecedario.p, Abecedario.q, Abecedario.r, Abecedario.s, Abecedario.t, Abecedario.u, Abecedario.v, Abecedario.w, Abecedario.x, Abecedario.y, Abecedario.z) ;
	
	/*
	 * Otra opcion seria ordenar el texto que llega
	 * y asi cada letra esta en el orden del abecedario. Se reemplazan
	 * por el numero correspondiente y luego comparas con el texto original
	 * como deben ir los numeros ordenados 
	 * */

	@Override 
	public String encriptar(String texto) {
		
		String palabraEncriptada = "";
		
		int i=0;
		while(texto.length()-1 != i) {
			palabraEncriptada = palabraEncriptada + this.cambiarPorNumeroCorrespondiente(texto.substring(i,i+1)) + ",";
			i = i+1;
		}
		
		return palabraEncriptada = palabraEncriptada + this.cambiarPorNumeroCorrespondiente(texto.substring(i,i+1));
	}
	
	private int cambiarPorNumeroCorrespondiente(String letra) {
		List<Abecedario> abecedario = this.abecedario;
		List<Abecedario> letraAbecedario = abecedario.stream().filter(elementoLetra ->elementoLetra.getLetraMinuscula().equals(letra)).toList();
		List<Abecedario> letraMayusAbecedario = abecedario.stream().filter(elementoLetra -> elementoLetra.getLetraMayuscula().equals(letra)).toList();
		
		return this.obtenerNumeroSiNoEstaVacia(letraAbecedario,letraMayusAbecedario);
			
	}
	
	private int obtenerNumeroSiNoEstaVacia(List<Abecedario> letras, List<Abecedario> letras2) {
		if(letras.isEmpty()) {
			return letras2.get(0).getNumeroDeLetra();
		}
		else {
			return letras.get(0).getNumeroDeLetra();
		}
	}
	
	@Override
	public String desencriptar(String texto) {
		
		String palabraDesencriptada = "";
		
		for(int i=0; texto.length() != i; i++) {
			palabraDesencriptada = palabraDesencriptada + this.cambiarPorLetraCorrespondienteSiEsUnNumero(texto.substring(i,i+1));

		}
		
		return palabraDesencriptada;
	}
	
	private String cambiarPorLetraCorrespondienteSiEsUnNumero(String numeroDeletra) {
		if(!numeroDeletra.equals(" ")){
			List<Abecedario> abecedario = this.abecedario;
			List<Abecedario> letraAbecedario = abecedario.stream().filter(elementoLetra ->elementoLetra.getNumeroDeLetraString().equals(numeroDeletra)).toList();
			
			return letraAbecedario.get(0).getLetraMinuscula();
		}
		else {
			return "";
		}
		
		
		
			
	}
	
}
