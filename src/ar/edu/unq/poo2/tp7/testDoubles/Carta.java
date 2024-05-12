package ar.edu.unq.poo2.tp7.testDoubles;

import java.util.ArrayList;
import java.util.List;

public class Carta {
	
	//Enum 
	public enum PalosPoquer {
		PICA, CORAZONES, TREBOL, DIAMANTE
	}

	private PalosPoquer paloDeCarta;
	//Variables de Instancia
	private int valor;
	
	//Constructor
	public Carta(PalosPoquer palo,int valor) {
		super();
		this.paloDeCarta = palo;
		this.valor = valor;
	}
	
	//Metodos
	public int valor() {
		return this.valor;
	}
	public PalosPoquer palo() {
		return this.paloDeCarta;
	}
	
	public boolean esSuperiorA(Carta carta) {
		return this.valor() > carta.valor();
	}
	
	public boolean poseeElMismoPaloQue(Carta carta) {
		return this.palo() == carta.palo();
	}
	
//	enum Valor {
//	J,Q,K
//}	
//	private Valor valorAdicional;
	
//	public Carta(Palos palo, Valor valor) {
//	super();
//	this.paloDeCarta = palo;
//	this.valorAdicional = valor;
//}
}
