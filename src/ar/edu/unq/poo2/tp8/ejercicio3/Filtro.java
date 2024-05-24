package ar.edu.unq.poo2.tp8.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage page,List<WikipediaPage> wikipedia);
}
