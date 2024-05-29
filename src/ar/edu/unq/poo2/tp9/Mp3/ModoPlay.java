package ar.edu.unq.poo2.tp9.Mp3;

public class ModoPlay extends ModoMP3 {

	public ModoPlay() {
		super();
	}
	
	@Override
	public void reproducir(MP3 mp3) throws Exception {
		throw new Exception("La cancion esta siendo reproducida");
	}

	@Override
	public void pausar(MP3 mp3) {
		mp3.setModo(new ModoPause());
		
	}

	@Override
	public void reiniciar(MP3 mp3) {
		mp3.setModo(new ModoSeleccionDeCanciones());
	}
	
	
}
