package ar.edu.unq.poo2.tp9.Mp3;

public class ModoPause extends ModoMP3{

	@Override
	public void reproducir(MP3 mp3) {
		mp3.setModo(new ModoPlay());
	}

	@Override
	public void pausar(MP3 mp3) {
		mp3.setModo(new ModoPlay());
	}

	@Override
	public void reiniciar(MP3 mp3) {
		mp3.setModo(new ModoSeleccionDeCanciones());
	}

	

}
