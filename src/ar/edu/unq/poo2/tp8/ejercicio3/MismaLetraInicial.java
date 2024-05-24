package ar.edu.unq.poo2.tp8.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends Filtro{
	
	 @Override
	 public List<WikipediaPage> getSimilarPages(WikipediaPage page,List<WikipediaPage> wikipedia) { 
		List<WikipediaPage> paginasSimilares = wikipedia.stream()
											   .filter(wikipediaPages -> 
											   this.primeraLetraDelTitulo(wikipediaPages.getTitle()) 
											   == this.primeraLetraDelTitulo(page.getTitle()))
				 							   .toList();
		return paginasSimilares;
	 }
	 private Character primeraLetraDelTitulo(String tituloDePagina) {
		 return tituloDePagina.charAt(0);
	 }
	 
}
