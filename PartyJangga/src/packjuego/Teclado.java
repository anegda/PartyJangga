package packjuego;

import java.util.Scanner;

public class Teclado {
	//atributos
	private static Teclado miTeclado;
	private Scanner sc = new Scanner(System.in);;
	//constructora
	
	public static synchronized Teclado getMiTeclado() {
		if (Teclado.miTeclado==null) {
			Teclado.miTeclado=new Teclado();
		}
		return(Teclado.miTeclado);
	}
	
	//m�todos adicionales
	public int leerEntero(String pString) {
		int n=0;
		while(n<2 || n>8) {
			System.out.print(pString);
			n = sc.nextInt();
		}
		return n;
	}
	public String leerString(String pString) {
		String s;
		System.out.print(pString);
		s = sc.next();
		return s;
	}
}
