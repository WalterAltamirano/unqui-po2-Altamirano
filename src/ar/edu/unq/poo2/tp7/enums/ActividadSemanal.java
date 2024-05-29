package ar.edu.unq.poo2.tp7.enums;

public class ActividadSemanal {
	
	public enum DiaDeLaSemana {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}
	
	private DiaDeLaSemana diaDeSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(Deporte deporte, DiaDeLaSemana diaDeSemana, int duracion,int horaDeInicio) {
		super();
		this.deporte = deporte;
		this.diaDeSemana = diaDeSemana;
		this.duracion = duracion;
		this.horaDeInicio = horaDeInicio;
	}
	
	public int costoDeActividad() {
		if(this.esDeLunesAMiercoles())
			return this.costoDeLunesAMiercoles() + this.costoPorComplejidad();
		else {
			return this.costoDeJuevesADomingo() + this.costoPorComplejidad();
		}
	}
	
	private int costoPorComplejidad() {
		return deporte.getComplejidad() * this.valorPorComplejidad();
	}
	
	private int valorPorComplejidad() {
		return 200;
	}
	
	private int costoDeLunesAMiercoles() {
		return 500;
	}
	private int costoDeJuevesADomingo() {
		return 1000;
	}
	
	private boolean esDeLunesAMiercoles() {
		return diaDeSemana == DiaDeLaSemana.LUNES 
				|| diaDeSemana == DiaDeLaSemana.MARTES 
				|| diaDeSemana == DiaDeLaSemana.MIERCOLES;
	}
	
	@Override
	public String toString() {
		return "Deporte: " + this.getDeporte() 
			   + "." + " Dia: " + this.getDiaDeSemana() + "A LAS: " 
			   + this.getHoraDeInicio() + "." + " Duracion: " 
			   + this.getDuracion() + "horas(s).";
	}
	
	//Getters
	public DiaDeLaSemana getDiaDeSemana() {
		return this.diaDeSemana;
	}
	
	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}
	
}
