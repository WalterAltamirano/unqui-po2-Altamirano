package ar.edu.unq.poo2.tp7.enums;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretariaDeportesMunicipio {
	
	private List<ActividadSemanal> actividadesSemanales;
	
	
	public SecretariaDeportesMunicipio() {
		super();
		this.actividadesSemanales = new ArrayList<ActividadSemanal>();
	}
	
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
		
		List<ActividadSemanal> actividadesDeFutbol = actividades.stream()
												   .filter(actividad -> 
												   actividad.getDeporte() == Deporte.FUTBOL)
												   .collect(Collectors.toList());
		return actividadesDeFutbol;
	}
	
	public List<ActividadSemanal> actividadesSegun(int complejidad) {
		List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
		
		List<ActividadSemanal> actividadesSegunComplejidad = actividades.stream()
				  .filter(actividad -> 
				  this.complejidadDelDeporte(actividad.getDeporte()) == complejidad)
				  .collect(Collectors.toList());
		return actividadesSegunComplejidad;
		
	}
	private int complejidadDelDeporte(Deporte deporte) {
		return deporte.getComplejidad();
	}
	
	public int cantidadDeHorasTotalesDeActividadesSemanales() {
		List<ActividadSemanal> actividades = actividadesSemanales;
		
		int horasTotales = actividades.stream()
						   .mapToInt(actividad -> actividad.getDuracion()).sum();
		
		return horasTotales;
		
	}
	
	public ActividadSemanal laActividadSemanalDeMenorCostoDe(Deporte deporteDeInteres) {
		List<ActividadSemanal> actividades = actividadesSemanales;
		
		ActividadSemanal actividadDeMenorCosto = actividades.stream()
												 .filter(actividad -> actividad.getDeporte() == deporteDeInteres)
												 .min(Comparator.comparing(ActividadSemanal::costoDeActividad)).orElse(null);
												 
		return actividadDeMenorCosto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
