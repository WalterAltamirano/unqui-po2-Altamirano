package ar.edu.unq.poo2.tp5;

import ar.edu.unq.poo2.tp5.interfaces.*;

public abstract class Factura implements Registrable{
	
	//Variables De Instancia
	protected AgenciaRecaudadora agencia;
	
	//Constructores?
	public Factura() {
		super();
	}

	//Metodos
	
//	public abstract double getPrecio();
	
	public void registrarse() {
		agencia.registrarPago(this);
	}
	
	
	/*Reflexion
	 Una interfaz define un mensaje que necesitan varias clases que no estan relacionadas
	 Cada clase que la implemente, la va a definir a su manera.
	 Entonces si la alguna clase necesita un parametro pero las otras no, en esas que no necesitan ese parametro
	 Simplemente se ignora. Como haciamos en objetos 1.
	 
	Si tuviera que agregarlo, lo hago por el polimorfismo (Aunque no haga nada) se vio en objetos 1 en wollok
	 **ACLARACION: Ese metodo que no hace nada viola el Principio De Segregacion de Interfaces
	 			    Lo mejor es crear una interfaz pequeña pero especifica.
	public void registrarPago(Factura factura) {
		
	}
	*/
}
