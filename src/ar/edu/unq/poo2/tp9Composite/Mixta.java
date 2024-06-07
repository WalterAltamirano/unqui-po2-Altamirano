package ar.edu.unq.poo2.tp9Composite;

import java.util.ArrayList;
import java.util.List;


public class Mixta implements Cultivo {

	private List<Cultivo> cultivos = new ArrayList<Cultivo>();
	
	
	@Override
	public int getGanancia() {
		List<Cultivo> regiones = this.cultivos;
		
		int ganancias = regiones.stream().mapToInt(region -> region.getGanancia() / this.getCantidadDeCultivos()).sum();
		
		return ganancias;
	}
	
	public void agregarRegion(Cultivo cultivo) {
		cultivos.add(cultivo);		
	}

	
	public void eliminarRegion(Cultivo cultivo) {
		cultivos.remove(cultivo);
	}

	
	public Cultivo obtenerRegion(int nroDecultivo) {
		return cultivos.get(nroDecultivo);
	}
	
	private int getCantidadDeCultivos() {
		return this.cultivos.size();
	}
	
}
