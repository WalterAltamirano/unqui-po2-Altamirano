package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class EquipoDeTrabajo {
	
	private String nombreEquipo;
	
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
	}
	
	public String nombreEquipo() {
		return nombreEquipo;
	}
	
	public void agregarPersona(Persona persona) {
		integrantes.add(persona);
	}
	
	public void quitarPersona(Persona persona) {
		integrantes.remove(persona);
	}
//	public List<Integer> edades() {
//		return integrantes.map(persona -> persona.edad());
//	}
	
	public int promedioEdadEquipo() {
		
		List<Persona> personas = integrantes;
		
		int sumatoriaHastaAhora = 0;
		
		for(int i = 0; personas.size() != i ;i++) {
			sumatoriaHastaAhora = sumatoriaHastaAhora + this.edadDe(personas.get(i));
		}
		
		return sumatoriaHastaAhora / personas.size() ;
	}

	private int edadDe(Persona persona) {
		return persona.edad();
	}
}
