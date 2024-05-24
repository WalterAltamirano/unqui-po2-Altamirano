package ar.edu.unq.poo2.tp6.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Banco {
	//Variables De Instancia
	List<Cliente> clientes;
	List<SolicitudDeCredito> solicitudesDeCredito;
	
	List<SolicitudDeCredito> solicitudesAceptadas;   

	//Constructor
	public Banco() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
		this.solicitudesAceptadas = new ArrayList<SolicitudDeCredito>();
	}
		
	//Metodos
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitudCreditoPersonal(Cliente cliente,double montoSolicitado,int mesesAPagar) {      
		agregarSolicitudDeCredito(generarSolicitudDeCreditoPersonal(cliente,montoSolicitado,mesesAPagar));
	}
	
	public void registrarSolicitudCreditoHipotecario(Cliente cliente,double montoSolicitado, int mesesAPagar, PropiedadInmobiliaria propiedadDelCliente) {
		agregarSolicitudDeCredito(generarSolicitudDeCreditoHipotecario(cliente,montoSolicitado,mesesAPagar, propiedadDelCliente));
	}
	public void evaluarSolicitudes() {
		List<SolicitudDeCredito> solicitudesFiltradas = solicitudesDeCredito.stream()
														.filter(solicitud -> solicitud.esAceptable())
														.collect(Collectors.toList());
		solicitudesAceptadas.addAll(solicitudesFiltradas);
	}
	public double montoTotalADesembolsar() {
		double totalADesembolsar = solicitudesAceptadas.stream()
				 .mapToDouble(solicitud -> solicitud.getMontoSolicitado())
				 .sum();
		return totalADesembolsar;
	}
	//Metodos Privados
	private SolicitudDeCreditoPersonal generarSolicitudDeCreditoPersonal(Cliente cliente, double montoSolicitado, int mesesAPagar) {
		return new SolicitudDeCreditoPersonal(cliente,montoSolicitado,mesesAPagar);
	}
	private SolicitudDeCreditoHipotecario generarSolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int mesesAPagar,PropiedadInmobiliaria propiedadInmobiliaria) {
		return new SolicitudDeCreditoHipotecario(cliente,montoSolicitado,mesesAPagar,propiedadInmobiliaria);
	}
	
	private void agregarSolicitudDeCredito(SolicitudDeCredito solicitudDeCredito) {
		solicitudesDeCredito.add(solicitudDeCredito);
	}
}
