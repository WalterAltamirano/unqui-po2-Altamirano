package ar.edu.unq.poo2.tp9.Encriptacion;

public class EncriptadorNaive {
	
	EstrategiaEncriptador estrategia;
	
	public EncriptadorNaive() {
		super();
	}
	
	public EncriptadorNaive(EstrategiaEncriptador estrategia) {
		super();
		this.estrategia = estrategia;
	}
	
	public String transformar(String texto) {
		return estrategia.encriptar(texto);
	}
	
	public String decifrar(String texto) {
		return estrategia.desencriptar(texto);
	}
	public void setEstrategia(EstrategiaEncriptador estrategia) {
		this.estrategia = estrategia;
	}
}
