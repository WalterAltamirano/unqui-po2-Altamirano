package ar.edu.unq.poo2.tp9.Encriptacion;

public enum Vocales {
	
	A('a'),E('e'),I('i'),O('o'),U('u');
	
	private char vocal;
	
	Vocales(char vocal) {
		this.vocal = vocal;
	}
	
	public char getVocal() {
		return this.vocal;
	}
	
	public Vocales siguiente() {
		return Vocales.values()[((this.ordinal()+1) % (Vocales.values().length))];
	}
	
	public Vocales anterior() {
		return Vocales.values()[((this.ordinal() - 1) % (Vocales.values().length))];
	}
}
