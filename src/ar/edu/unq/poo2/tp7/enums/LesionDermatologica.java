package ar.edu.unq.poo2.tp7.enums;

public enum LesionDermatologica {
	
	ROJO("Peligroso",3), GRIS("Mejorando",2),AMARILLO("Sanando",1),MIEL("Curada",0);
	
	//Variables de Instancia
	private String descripcion;
	private int nivelDeRiesgo;
	
	//Constructor
	LesionDermatologica(String descripcion, int nivelDeRiesgo) {
		this.setDescripcion(descripcion);
		this.setNivelDeRiesgo(nivelDeRiesgo);
	}
	
	
	//Metodos 
	public void imprimirLesion() {
		System.out.print("La lesion es " + this.name());
	}
	public LesionDermatologica siguiente() {
		return LesionDermatologica.values()[((this.ordinal()+1) % (LesionDermatologica.values().length))];
	}
	

	//Getters Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
}

/*
ROJO() {
	@Override
	public String descripcion() {
		return "El color representa una lesion reciente";
	}
	@Override
	public Color siguiente() {
		return GRIS;
	}
	
}, GRIS(){
	@Override
	public String descripcion() {
		return "El color representa una lesion que se esta pudriendo";
	}
	@Override
	public Color siguiente() {
		return AMARILLO;
	}
	
}, AMARILLO() {
	@Override
	public String descripcion() {
		return "El color representa una lesion que esta infectada";
	}
	@Override
	public Color siguiente() {
		return MIEL;
	}
	
}, MIEL() {
	@Override
	public String descripcion() {
		return "El color representa que la lesion ya esta curada";
	}
	
	@Override
	public Color siguiente() {
		return ROJO;
	}
};

*/