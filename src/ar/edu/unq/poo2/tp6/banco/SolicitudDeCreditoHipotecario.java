package ar.edu.unq.poo2.tp6.banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	//Variables De Instancia
	private PropiedadInmobiliaria propiedadDelCliente;
	
	//!!Podria crear la fecha aca y hacer directamente el calculo aca!!
	
	//Constructor
	public SolicitudDeCreditoHipotecario(Cliente cliente,double montoSolicitado,int plazoDeMeses, PropiedadInmobiliaria propiedadInmobiliaria) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoDeMeses = plazoDeMeses;
		this.propiedadDelCliente = propiedadInmobiliaria; 
	}	
		
	//Metodos
	@Override
	public boolean esAceptable() {
		return this.elMontoRequeridoMensualSuperaElMontoDeLaCuota() 
			&& this.elMontoSolicitadoNoSuperaElPorcentajeRequeridoDelValorFiscalDeLaPropiedad() ;
	}	
	
	@Override
	protected double porcentajeRequerido() {
		return 50;
	}
	
	private double porcentajeRequeridoPropiedad() {
		return 70;
	}
	
//	private boolean noSuperaLosAñosRequeridosAlFinalizarElCredito() {
//		return cliente.getEdad()  this.calcularMesesAAños();
//	}
	
	private int calcularMesesAAños() { // !!Tengo que crear una fecha de nacimiento en cliente para sumarle los meses y luego pedirle el año.()!!
		return this.plazoDeMeses ;
	}
	
	private boolean elMontoSolicitadoNoSuperaElPorcentajeRequeridoDelValorFiscalDeLaPropiedad() {
		return this.montoSolicitado < this.valorFiscalRequerido();
	}
	
	private double valorFiscalRequerido() {
		return (propiedadDelCliente.getValorFiscal() * this.porcentajeRequeridoPropiedad()) / 100;
	}
}
