package ar.edu.unq.poo2.tp7.enums;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretariaDeportesMunicipio {
	
	private List<ActividadSemanal> actividadesSemanales;
	
	public SecretariaDeportesMunicipio() {
		super();
		this.actividadesSemanales = new ArrayList<ActividadSemanal>();
	}
	
	public SecretariaDeportesMunicipio(List<ActividadSemanal> actividades) {
		super();
		this.actividadesSemanales = actividades;
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.actividadesSemanales.add(actividad);
	}
	
	public List<ActividadSemanal> actividadesDeFutbol() {
		List<ActividadSemanal> actividades = this.actividadesSemanales;
		
		List<ActividadSemanal> actividadesDeFutbol = actividades.stream()
												   .filter(actividad -> 
												   actividad.getDeporte() == Deporte.FUTBOL)
												   .collect(Collectors.toList());
		return actividadesDeFutbol;
	}
	
	public List<ActividadSemanal> actividadesSegunComplejidad(int complejidad) {
		List<ActividadSemanal> actividades = this.actividadesSemanales;
		
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
		List<ActividadSemanal> actividades = this.actividadesSemanales;
		
		int horasTotales = actividades.stream()
						   .mapToInt(actividad -> actividad.getDuracion()).sum();
		
		return horasTotales;
		
	}
	
	public ActividadSemanal laActividadSemanalDeMenorCostoDe(Deporte deporteDeInteres) {
		List<ActividadSemanal> actividades = this.actividadesSemanales;
		
		ActividadSemanal actividadDeMenorCosto = actividades.stream()
												 .filter(actividad -> actividad.getDeporte() == deporteDeInteres)
												 .min(Comparator.comparing(ActividadSemanal::costoDeActividad)).orElse(null);
												 
		return actividadDeMenorCosto;
	}
	
//	public Map<Deporte, ActividadSemanal> actividadSemanalMasEconomica() {
//		List<ActividadSemanal> actividades = this.actividadesSemanales;
//		
//		Map<Deporte,ActividadSemanal> actividadesEconomicasSegunDeporte = 
//				actividades.stream()
//				.collect(Collectors.groupingBy(ActividadSemanal::costoDeActividad))
//		
//		return ;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
