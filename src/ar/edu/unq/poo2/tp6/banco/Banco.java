package ar.edu.unq.poo2.tp6.banco;

import java.util.List;

public class Banco {
	//Variables De Instancia
	List<Cliente> clientes;
	List<SolicitudDeCredito> solicitudesDeCredito;
	
	//List<SolicitudDeCredito> solicitudesAceptadas;    opcion o sino crear un metodo que devuelva esta lista
	//List<SolicitudDeCredito> solicitudesRechazadas;

	//Constructor
	public Banco() {
		super();
	}
		
	//Metodos
	public void agregarCliente(Cliente cliente) {
		//hacer
	}
	
	public void solicitarCreditoPersonal(Cliente cliente,float montoSolicitado,int mesesAPagar) {       //No va Cliente como param porq ya lo conoce (lo agregamos con el "agregarCliente")
		//Hacer
	}
	
	public void solicitarCreditoHipotecario(Cliente cliente,float montoSolicitado, int mesesAPagar, PropiedadInmobiliaria propiedadDelCliente) {
		//Hacer
	}
	
	public void evaluarSolicitudes() {
		//Hacer
	}
	
	
	//Metodos Privados
	private SolicitudDeCreditoPersonal generarSolicitudDeCreditoPersonal() {
		return new SolicitudDeCreditoPersonal();
	}
	private SolicitudDeCreditoHipotecario generarSolicitudDeCreditoHipotecario() {
		return new SolicitudDeCreditoHipotecario();
	}
}
