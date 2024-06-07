package ar.edu.unq.poo2.tp9Composite;

public interface Cultivo {
	
	public int getGanancia();
	
}
/*
 
 En este caso, pongo los mensajes que modifican la estructura del composite
 solo en el composite. Ya que en las hojas(Tipos de cultivos)
 no tiene sentido que esten ahi.
 
 Despues tambien como la superclase abstracta va a definir el mensaje polimorfico
 entonces la convierto en una interfaz.
 
 En esta solucion de diseño, los clientes no pueden enviar mensajes de modificacion
 estructura del composite a las hojas. 
 
 
 La otra solucion:
 *Es crear una clase abstracta que defina la operacion polimorfica y las operaciones
  que modifican la estructura del compuesto.
  *Las hojas van a tener los mensajes que modifican la estructura
    *Tendria sentido si las hojas es decir, los cultivos puedan combinarse
    de tal forma que formen un nuevo elemento que sea mixto. y que ese mixto
    tenga en su coleccion, esos cultivos combinados.
     !! Aca si tendria sentido que las hojas tengan los mensajes que manipulan
     la estructura del composite!!
 
 
 
 
 * */
 