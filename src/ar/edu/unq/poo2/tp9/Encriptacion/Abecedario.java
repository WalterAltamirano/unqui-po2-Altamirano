package ar.edu.unq.poo2.tp9.Encriptacion;

public enum Abecedario {
	
	a(1,"a","A","1"), b(2,"b","B","2"), c(3,"c","C","3"), d(4,"d","D","4"), e(5,"e","E","5"), f(6,"f","F","6"), g(7,"g","G","7"), h(8,"h","H","8"), i(9,"i","I","9"), j(10,"j","J","10"), k(11,"k","K","11"), l(12,"l","L","12"), m(13,"m","M","13"),
	n(14,"n","N","14"), o(15,"o","O","15"), p(16,"p","P","16"), q(17,"q","Q","17"), r(18,"r","R","18"),s(19,"s","S","19"), t(20,"t","T","20"), u(21,"u","U","21"), v(22,"v","V","22"), w(23,"w","W","23"), x(24,"x","X","24"), y(25,"y","Y","25"), z(26,"z","Z","26");
	
	private int numeroDeletra;
	private String letraMinuscula;
	private String letraMayuscula;
	private String numeroDeLetraString;
	Abecedario(int numeroDeletra,String letraMinuscula, String letraMayuscula, String numeroDeLetraCaracter) {
		this.numeroDeletra = numeroDeletra;
		this.letraMinuscula = letraMinuscula;
		this.letraMayuscula = letraMayuscula;
		this.numeroDeLetraString = numeroDeLetraCaracter;
	}
	
	public int getNumeroDeLetra() {
		return this.numeroDeletra;
	}
	
	public String getLetraMinuscula() {
		return this.letraMinuscula;
	}
	public String getLetraMayuscula() {
		return this.letraMayuscula;
	}
	public String getNumeroDeLetraString() {
		return this.numeroDeLetraString;
	}
}
