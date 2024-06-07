package ar.edu.unq.poo2.tp9Composite.Warcraft;

public abstract class Personaje {
	
	
	public abstract void caminarA(PuntoMapa punto);
	
	public void agregarPersonaje(Personaje personaje) {}
	
	public void eliminarPersonaje(Personaje personaje) {}
	
	public void obtenerPersonaje(int nroPersonaje) {}
	
}
