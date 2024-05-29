package ar.edu.unq.poo2.tp9.Mp3;

public class ModoSeleccionDeCanciones extends ModoMP3 {
	
	
	public ModoSeleccionDeCanciones() {
		super();
	}

	@Override
	public void reproducir(MP3 mp3) {
		mp3.setModo(new ModoPlay());
	}

	@Override
	public void pausar(MP3 mp3) throws Exception {
		throw new Exception("No hay ninguna cancion en reproduccion");
	}

	@Override
	public void reiniciar(MP3 mp3) throws Exception {
		throw new Exception("No hay ninguna cancion en reproduccion o pausada");
	}
	
	
}
