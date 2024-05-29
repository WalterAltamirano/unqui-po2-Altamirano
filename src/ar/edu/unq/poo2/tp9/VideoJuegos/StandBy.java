package ar.edu.unq.poo2.tp9.VideoJuegos;

public class StandBy extends EstadoMaquina{
	
	
	@Override
	public void botonDeInicioApretado(MaquinaVideoJuego maquina) {
		maquina.getRanura().abrir();
		maquina.getPantalla().mostrar("Ingrese Fichas");
		maquina.setEstado(new EsperandoFichas());
	}
	@Override
	public void ingresarCantidadDeFichas(int cantidad,MaquinaVideoJuego maquina) {
		//Por default esta cerrada la ranura
	}
}
