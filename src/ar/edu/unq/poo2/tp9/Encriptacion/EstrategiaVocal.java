package ar.edu.unq.poo2.tp9.Encriptacion;

import java.util.Arrays;
import java.util.List;

public class EstrategiaVocal extends EstrategiaEncriptador{
	
	private List<Vocales> vocalesEnum = Arrays.asList(Vocales.A,Vocales.E,Vocales.I,Vocales.O,Vocales.U);
	private List<Character> vocalesChar = Arrays.asList('a','e','i','o','u');
	@Override
	public String encriptar(String texto) {
		
		String palabraEncriptada = "";
	
		for(int i=0;texto.length() != i ;i++) {
			palabraEncriptada = palabraEncriptada + this.cambiarPorVocalSiguienteSiLoEs(texto.charAt(i));
		}
		
		return palabraEncriptada;
	}
	
	private Character cambiarPorVocalSiguienteSiLoEs(Character letra) {
		if(this.esVocal(letra)) {
			return this.vocalSiguienteA(this.buscarYDarLaLetraVocal(letra));
		}
		else {
			return letra;
		}
	}

	private Vocales buscarYDarLaLetraVocal(Character letra) {
		List<Vocales> vocales = this.vocalesEnum; 
		List<Vocales> vocalLocalizada = vocales.stream().filter(string -> string.getVocal() == letra).toList();
		
		return vocalLocalizada.get(0);
	}
	
	@Override
	public String desencriptar(String texto) {
		
		String palabraEncriptada = "";
	
		for(int i=0;texto.length() != i ;i++) {
			palabraEncriptada= palabraEncriptada + this.cambiarPorVocalAnteriorSiLoEs(texto.charAt(i));
		}
		
		return palabraEncriptada;
	}
	
	private char cambiarPorVocalAnteriorSiLoEs(Character letra) {
		if(this.esVocal(letra)) {
			return this.vocalAnteriorA(this.buscarYDarLaLetraVocal(letra));
		}
		else {
			return letra;
		}
	}
	
	private char vocalAnteriorA(Vocales vocal) {
		return vocal.anterior().getVocal();
	}
	private char vocalSiguienteA(Vocales vocal) {
		return vocal.siguiente().getVocal();
	}
	
	private boolean esVocal(Character letra) {
		return vocalesChar.contains(letra);
	}
}
