package ar.edu.unq.poo2.tp5;

import ar.edu.unq.poo2.tp5.interfaces.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.edu.unq.poo2.tp5.interfaces.Agencia;

public class AgenciaRecaudadora  {
	
	//Variables De Instancia
	private List<Factura> facturas = new ArrayList<Factura>();
	
	//Constructores
	public AgenciaRecaudadora() {
		super();
	}
	
	//Metodos
	public void registrarPago(Factura factura) {
		facturas.add(factura);
	}
	
	public int getCantidadDefacturas() {
		return facturas.size();
	}
}
