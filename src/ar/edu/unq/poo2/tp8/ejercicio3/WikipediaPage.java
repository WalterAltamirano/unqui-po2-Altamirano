package ar.edu.unq.poo2.tp8.ejercicio3;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	
	String getTitle();  /*retorna el título de la página.*/

	
	List<WikipediaPage> getLinks(); /*retorna una Lista de las páginas de 
									 Wikipedia con las que se conecta.*/
	
	Map<String,WikipediaPage> getInfobox();  /*retorna un Map con un valor en texto y la pagina que 
											   describe ese valor que aparecen en los infobox de la 
											   página de Wikipedia.*/
	
}
