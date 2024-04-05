package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Multioperador {
	
	
	
	public int sumatoriaDe(List<Integer> arrayDeEnteros) {
		
		int sumatoriaHastaAhora = 0;
		
		for(int i=0; arrayDeEnteros.size() != i;i++) {
			sumatoriaHastaAhora =+ arrayDeEnteros.get(i);
		}
		return sumatoriaHastaAhora;
	}
	
	public int laRestaDeTodos(List<Integer> arrayDeEnteros) {
		
		int restaHastaAhora = 0;
		
		for(int i=0; arrayDeEnteros.size() != i;i++) {
			restaHastaAhora =- arrayDeEnteros.get(i);
		}
		return restaHastaAhora;
	}
	
	public int multiplicacionDe(List<Integer> arrayDeEnteros) {
		
		int multiplicacionHastaAhora = arrayDeEnteros.get(0);
		
		for(int i=1; arrayDeEnteros.size() != i;i++) {
			multiplicacionHastaAhora = arrayDeEnteros.get(i) * multiplicacionHastaAhora;
		}
		return multiplicacionHastaAhora;
	}
}
