package ar.edu.unq.poo2.tp6.caso1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor, Enviable {
	
	public List<Correo> recibirNuevos(String user, String pass) {			//El servidor debe conocer al usuario
		List<Correo> retorno = new ArrayList<Correo>();
	    this.conectar(user, pass);
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}

	@Override
	public float tazaDeTransferencia() {		// Metodo que no hace nada (Violacion del Principio Segregacion de Interfaces)
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {					// Metodo que no hace nada (Violacion del Principio Segregacion de Interfaces)
         //no corresponde	
	}

	@Override
	public void realizarBackUp() {				// Metodo que no hace nada (Violacion del Principio Segregacion de Interfaces)
		//no corresponde
		
	}



}
