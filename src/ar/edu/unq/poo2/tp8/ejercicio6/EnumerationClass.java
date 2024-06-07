package ar.edu.unq.poo2.tp8.ejercicio6;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {
	
	/*
	 Enumeration es una interface que tiene el siguietne protocolo:
		
		*hasMoreElements() 
		//Devuelve un booleano si es que le queda al menos un elemento mas
		
		*nextElement() 
		//Devuelve el siguiente elemento de una enumeracion sino arroja una excepcion
		
	 Se utilizan para especificar los flujos de entrada a un archivo SequenceInputStream.
	 
	 
	 La clase Vector
	   El metodo elements() (vector.elements())
	   //Devuelve un Enumeration de los componentes del vector
	 
	 La clase que adapta a Vector, implementa hasNextElements() y nextElement()
	 y conoce a vector. 
	 
	 La interface Enumeration<E> es el objetivo
	 La clase Vector es el adaptado o adaptable
	 *Nombre de la clase adaptador* es quien adapta el protocolo hasNextElements() nextElement()
	 para Vector
	 
	 
	 
	 El tema esta en que tiene que devolver algo que sea de tipo Enumeration<E>
	 
	 
	 * */
	
	
	public static void main(String args[])
    {
		//Se puede incializar un Enumeration con el tipo que quiera
       // Enumeration<String> months;
		//Enumeration es una interface que tiene el siguietne protocolo
		Enumeration months;
		//Un vector parece ser un tipo de coleccion
        Vector<String> monthNames = new Vector<>();
 
        monthNames.add("January");
        monthNames.add("February");
        monthNames.add("March");
        monthNames.add("April");
        monthNames.add("May");
        monthNames.add("June");
        monthNames.add("July");
        monthNames.add("August");
        monthNames.add("September");
        monthNames.add("October");
        monthNames.add("November");
        monthNames.add("December");
        months = monthNames.elements();
 
        while (months.hasMoreElements()) {
            System.out.println(months.nextElement());
        }
    }
}
