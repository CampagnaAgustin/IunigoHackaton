package net.codeJava.model;

public class Usuario {

	public String nombre;
	public String vencimientoVTV;
	public String vencimientoRegistro;
	public String vencimientoSeguro;
	public String vencimientoPatente;
	public Logro logro1;
	public Logro logro2;
	public Logro logro3;
	public Logro logro4;

	public Usuario(String nombre, String vencimientoVTV, String vencimientoRegistro, String vencimientoSeguro,
			String vencimientoPatente, Logro logro1, Logro logro2, Logro logro3, Logro logro4) {
		this.nombre = nombre;
		this.vencimientoVTV = vencimientoVTV;
		this.vencimientoRegistro = vencimientoRegistro;
		this.vencimientoSeguro = vencimientoSeguro;
		this.vencimientoPatente = vencimientoPatente;
		this.logro1 = logro1;
		this.logro2 = logro2;
		this.logro3 = logro3;
		this.logro4 = logro4;
		
	}
	
	static String prueba1MyDate1 = "2020-05-25";
	static String prueba1MyDate2 = "2020-05-25";
	static String prueba1MyDate3 = "2020-05-25";
	static String prueba1MyDate4 = "2020-05-25";
	static String prueba2MyDate1 = "2020-05-25";
	static String prueba2MyDate2 = "2020-05-25";
	static String prueba2MyDate3 = "2020-05-25";
	static String prueba2MyDate4 = "2020-05-25";
	static Logro prueba1Logro1 = new Logro("Sin Accidentes por un año", "img/logroAccidentes.png", "100% de descuento en tu proximo mes", true);
	static Logro prueba1Logro2 = new Logro("Sin multas", "img/logro-multas.png", "15% de descuento en restaurantes seleccionados", false);
	static Logro prueba1Logro3 = new Logro("Pago en tiempo", "img/logro-pago.png", "10% de descuento en tu seguro", true);
	static Logro prueba1Logro4 = new Logro("Maestro al volante", "img/logroAccidentes.png", "Sos el dios del drift", false);
	static Logro prueba2Logro1 = new Logro("Sin Accidentes por un año", "/images/logro1.jpg", "20% de descuento en tu proximo auto asegurado con Iunigo", true);
	static Logro prueba2Logro2 = new Logro("Sin multas", "/images/logro2.jpg", "15% de descuento en restaurantes seleccionados", false);
	static Logro prueba2Logro3 = new Logro("Pago en tiempo", "/images/logro3.jpg", "10% de descuento en tu seguro", true);
	static Logro prueba2Logro4 = new Logro("Sin accidentes por un año", "/images/logro4.jpg", "100% de descuento en tu proximo mes", false);

	public static Usuario prueba1 = new Usuario("Pepito", prueba1MyDate1, prueba1MyDate2, prueba1MyDate3, prueba1MyDate4, prueba1Logro1, prueba1Logro2, prueba1Logro3, prueba1Logro4);
	public static Usuario prueba2 = new Usuario("Fulanita", prueba2MyDate1, prueba2MyDate2, prueba2MyDate3, prueba2MyDate4, prueba2Logro1, prueba2Logro2, prueba2Logro3, prueba2Logro4);

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getVencimientoVTV() {
		return vencimientoVTV;
	}
	public void setVencimientoVTV(String vencimientoVTV) {
		this.vencimientoVTV = vencimientoVTV;
	}
	public String getVencimientoRegistro() {
		return vencimientoRegistro;
	}
	public void setVencimientoRegistro(String vencimientoRegistro) {
		this.vencimientoRegistro = vencimientoRegistro;
	}
	public String getVencimientoSeguro() {
		return vencimientoSeguro;
	}
	public void setVencimientoSeguro(String vencimientoSeguro) {
		this.vencimientoSeguro = vencimientoSeguro;
	}
	public String getVencimientoPatente() {
		return vencimientoPatente;
	}
	public void setVencimientoPatente(String vencimientoPatente) {
		this.vencimientoPatente = vencimientoPatente;
	}
	public Logro getLogro1() {
		return logro1;
	}
	public void setLogro1(Logro logro1) {
		this.logro1 = logro1;
	}
	public Logro getLogro2() {
		return logro2;
	}
	public void setLogro2(Logro logro2) {
		this.logro2 = logro2;
	}
	public Logro getLogro3() {
		return logro3;
	}
	public void setLogro3(Logro logro3) {
		this.logro3 = logro3;
	}
	public Logro getLogro4() {
		return logro4;
	}
	public void setLogro4(Logro logro4) {
		this.logro4 = logro4;
	}



}
