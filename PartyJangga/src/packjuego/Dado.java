package packjuego;
import java.util.Random;
public class Dado {
	//atributo
	private int caras; //numero de caras del dado
	private static Dado miDado=null;
	//Constructora 
	//(por si se quiere realizar una partida que dure m�s o menos se podr�a cambiar el n�mero de caras del dado)
	private Dado(int pCaras) {
		this.caras=pCaras;
	}
	//(MAE)
	public static synchronized Dado getMiDado(int pCaras) {
		if(Dado.miDado==null) {
			Dado.miDado=new Dado(pCaras);
		}
		return Dado.miDado;
	}
	//Otros metodos
	public int tirar() {
		Random r = new Random();
		int valorDado = r.nextInt(this.caras) + 1;
		System.out.println("El n�mero que has sacado es un: " + valorDado);
		return valorDado;
	}
}
