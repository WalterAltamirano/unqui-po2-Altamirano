package ar.edu.unq.poo2.tp6.caso1;

import java.util.List;

public interface IServidor {					//Interface "gorda" (Problema de raiz que viola Principio Segregacion de Interfaces)

	public List<Correo> recibirNuevos(String user, String pass);
	
	public void conectar(String nombreUsuario, String passusuario);	
	
	public float tazaDeTransferencia();
	
	public void realizarBackUp();
	
	public void resetear();
}
