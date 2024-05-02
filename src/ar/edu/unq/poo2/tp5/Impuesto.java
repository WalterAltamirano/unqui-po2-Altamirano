package ar.edu.unq.poo2.tp5;

public class Impuesto extends Factura {

	//Variables De Instancia
	private Servicio servicioAsociado;
		
		
	//Constructores
	public Impuesto() {
		super();
	}

	public Impuesto(Servicio servicioAsociado, AgenciaRecaudadora agencia) {
		super();
		this.agencia = agencia;
		this.servicioAsociado = servicioAsociado;
	}
		
	//Metodos
	@Override
	public double getPrecio() {
		return servicioAsociado.getTasa();
	}
	
}
