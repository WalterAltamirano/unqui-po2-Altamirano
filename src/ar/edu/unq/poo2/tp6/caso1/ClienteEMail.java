package ar.edu.unq.poo2.tp6.caso1;					//openClosedPrinciple.caso1;

import java.util.ArrayList;

public class ClienteEMail implements Enviable { 
	
	 ServidorPop servidor;    
	 private String nombreUsuario;    
	 private String passusuario;      
	 ArrayList<Correo> inbox; 
	 ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		//this.conectar();
	}
	
	public void conectarse(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	@Override
	public void enviar(Correo correo){
		this.servidor.enviar(correo);
	}
	
	/*
	 public void enviar(String asunto, String destinatario, String cuerpo,Correo correo){ //Instanciarlo cuando hacemos el test
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
	  */
}
