package ar.edu.unq.poo2.tp5;


import java.util.Date;
import java.time.*;

public class Servicio extends Factura {
	
	//Variables De Instancia
	private double tasa;
	private double costoPorUnidadConsumida;
	private double cantidadDeUnidadesConsumidas;
	private LocalDate periodoDeFacturacion;	
	
	//Constructores
	public Servicio() {
		super();
	}
	public Servicio(double costoPorUnidad,double tasa, LocalDate periodoDeFacturacion,double cantidadDeUnidadesConsumidas, AgenciaRecaudadora agencia) {
		super();
		this.tasa = tasa;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		this.agencia = agencia;
		this.costoPorUnidadConsumida = costoPorUnidad;
		this.periodoDeFacturacion = periodoDeFacturacion;
	}	
	
		
	//Metodos
	@Override
	public double getPrecio() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
	
	public void aumentarUnidadConsumida() {
		cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas + 1d;
	}

	
	//Getters Y Setters
	public double getTasa() {
		return tasa;
	}
	
	public LocalDate getPeriodoDeFacturacion() {
		return periodoDeFacturacion;
	}
	public double getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	public void setCantidadDeUnidadesConsumidas(double cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	public double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}

	public void setCostoPorUnidadConsumida(double costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}
	
	
}
