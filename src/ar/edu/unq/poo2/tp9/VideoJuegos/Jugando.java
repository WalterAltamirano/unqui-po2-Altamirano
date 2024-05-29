package ar.edu.unq.poo2.tp9.VideoJuegos;

public class Jugando extends EstadoMaquina {
	
	private int jugadoresAJugar;
	
	public Jugando(int cantJugadores) {
		super();
		this.jugadoresAJugar = cantJugadores; 
	}
	
	@Override
	public void botonDeInicioApretado(MaquinaVideoJuego maquina) {
		maquina.getPantalla().mostrar("Ha decidido finalizar el juego");
		maquina.setEstado(new StandBy());
	}
	@Override
	public void ingresarCantidadDeFichas(int cantidad,MaquinaVideoJuego maquina) {
		//La ranura esta cerrada. No hace nada.
	}
	
	
}
