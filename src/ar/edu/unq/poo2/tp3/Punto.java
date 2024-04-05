package ar.edu.unq.poo2.tp3;

public class Punto {
	
	private int x;
	private int y;

	public Punto(int x, int y) {
		super();
		this.setXY(x, y);
	}
	
	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Punto sumaDePuntos(Punto primerPunto, Punto segundoPunto) {
		return new Punto(this.sumaDeCoordenadaXDe_Y_(primerPunto,segundoPunto),this.sumaDeCoordenadaYDe_Y_(primerPunto,segundoPunto));
	}
	
	public int sumaDeCoordenadaXDe_Y_(Punto primerPunto,Punto segundoPunto) {
		return primerPunto.getX() + segundoPunto.getX();
	}
	public int sumaDeCoordenadaYDe_Y_(Punto primerPunto,Punto segundoPunto) {
		return primerPunto.getY() + segundoPunto.getY();
	}
	
//	public void mover_PosicionesDeXDel_(int posicionNueva,Punto puntoAModificar) {
//		puntoAModificar.setX(posicionNueva);
//	}
//	
//	public void mover_PosicionesDeYDel_(int posicionNueva,Punto puntoAModificar) {
//		puntoAModificar.setY(posicionNueva);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
