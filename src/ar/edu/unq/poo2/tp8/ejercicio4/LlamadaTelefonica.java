package ar.edu.unq.poo2.tp8.ejercicio4;

public abstract class LlamadaTelefonica {
	
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	public int getTiempo(){				//Operacion concreta de la clase abstracta
		return this.tiempo;
	}
	public int getHoraDelDia(){			//Operacion concreta de la clase abstracta
		return this.horaDelDia;
	}
	public abstract boolean esHoraPico();		//Operacion primitiva
	
	public float costoFinal(){				    //Un templeate method no puro
		 if(this.esHoraPico()){
			 return this.costoNeto()*1.2f*this.getTiempo();
		 }
		 else {
			 return this.costoNeto()*this.getTiempo();
		 }
	}
	public float costoNeto(){			//Metodo hook (Operacion de enganche)
		return this.getTiempo()*1;
	}
}
