package ar.edu.unq.poo2.tp9.VideoJuegos;

public class EsperandoFichas extends EstadoMaquina {
	
	
	
	@Override
	public void botonDeInicioApretado(MaquinaVideoJuego maquina) {
		if(maquina.getFichasInsertadas() == 0) {
			maquina.getPantalla().mostrar("No hay fichas ingresadas. Por favor Ingrese al menos una ficha.");
		}
		else if(maquina.getFichasInsertadas() == 2){
			this.acreditarFichas(maquina);
			maquina.setEstado(new Jugando(2));
		}
		else {
			this.acreditarFichas(maquina);
			maquina.setEstado(new Jugando(1));
		}
	}
	
	@Override
	public void ingresarCantidadDeFichas(int cantidad,MaquinaVideoJuego maquina) {
		maquina.agregarFichas(cantidad);
		if(maquina.getFichasInsertadas() > 2) { //Si pone mas de dos entonces asumo que quieren jugar dos jugadores
			maquina.getPantalla().mostrar("Ingresar como maximo 2 fichas");
			maquina.retirarFichas(cantidad);
			maquina.getUsuario().recibirFichas(cantidad);
		}
	}
	private void acreditarFichas(MaquinaVideoJuego maquina) { 
		maquina.getPantalla().mostrar("Cargando...");
		maquina.setFichasInsertadas(0);
		maquina.getRanura().cerrar();
	}
	/*
	 Habria que poner como variable de instancia a la maquina para 
	 que sea colaborador interno 
	*/
}
