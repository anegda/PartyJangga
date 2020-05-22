/**
 * 
 */
package packjuego;


public class CasillaAvanzar extends Casilla{
	//atributos
	private int cantAvanzar;
	
	//Constructora
	public CasillaAvanzar(int pAvanzar){
		super();
		this.cantAvanzar = pAvanzar;
	}

	//metodos adicionales
	public void usar(Jugador pJugador) {
		System.out.println("Has caido en una casilla de avanzar");
		pJugador.avanzarCasilla(this.cantAvanzar);
		System.out.println("Has avanzado "+ this.cantAvanzar +" casillas!!");
	}
}
