package ar.edu.unq.poo2.tp6.banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{
	//Variables De Instancia
	
	//Constructor
	public SolicitudDeCreditoPersonal(Cliente cliente,double montoSolicitado,int plazoDeMeses) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoDeMeses = plazoDeMeses;
	}
		
	//Metodos
	@Override
	public boolean esAceptable() {
		return this.clienteCumpleConElMontoRequeridoAnual() && elMontoRequeridoMensualSuperaElMontoDeLaCuota();
	}
	
	@Override
	protected double porcentajeRequerido() {
		return 70;
	}
	
	private boolean clienteCumpleConElMontoRequeridoAnual() {
		return cliente.getSueldoNetoAnual() >= this.montoRequeridoAnual();
	}
	
	private double montoRequeridoAnual() {
		return 15000;
	}
}
