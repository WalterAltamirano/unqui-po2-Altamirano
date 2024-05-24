package ar.edu.unq.poo2.tp6.banco;

public abstract class SolicitudDeCredito {
	
	//Variables De Instancia
	protected double montoSolicitado;
	protected int plazoDeMeses;
	protected Cliente cliente;
	
	//Constructor
	
	
	//Metodos
	public abstract boolean esAceptable();
	
	protected double getMontoPorMes() {
		return this.getMontoSolicitado() / this.plazoDeMeses;
	} 
	
	protected double getMontoSolicitado() {
		return this.montoSolicitado;
	}
	protected double montoRequeridoMensual() {
		return (cliente.getSueldoNetoMensual() * this.porcentajeRequerido()) / 100;
	}

	protected abstract double porcentajeRequerido();
	
	protected boolean elMontoRequeridoMensualSuperaElMontoDeLaCuota() {
		return this.montoRequeridoMensual() >= this.getMontoPorMes();
	}
}
