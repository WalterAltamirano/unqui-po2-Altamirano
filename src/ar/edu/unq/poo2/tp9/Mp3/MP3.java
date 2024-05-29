package ar.edu.unq.poo2.tp9.Mp3;

public class MP3 {
	
	private ModoMP3 modoDeReproduccion;
	
	private Song cancion;
	
	public MP3(ModoMP3 modoDeReproduccion) {
		super();
		this.modoDeReproduccion = modoDeReproduccion;
	}

	public void playSong() throws Exception {
		this.cancion.play();
		this.modoDeReproduccion.reproducir(this);
	}

	public void pauseSong() throws Exception {
		this.cancion.pause();
		this.modoDeReproduccion.pausar(this);
	}

	public void stopSong() throws Exception {
		this.cancion.stop();
		this.modoDeReproduccion.reiniciar(this);
	}

	void setModo(ModoMP3 modo) {
		this.modoDeReproduccion = modo;
		
	}
	
	
}
