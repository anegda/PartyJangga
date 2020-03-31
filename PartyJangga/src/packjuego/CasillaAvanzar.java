/**
 * 
 */
package packjuego;


public class CasillaAvanzar extends Casilla{

	private int cantAvanzar;
	
	//constructora
	
	public CasillaAvanzar(int idCasilla, int pAvanzar){
		super(idCasilla);
		cantAvanzar = pAvanzar;
	}

	//metodos adicionales
	
	public void usar(Jugador pJugador) {
		System.out.println("Has caido en una casilla de avanzar");
		pJugador.avanzarCasilla(this.cantAvanzar);
		System.out.println("Has avanzado "+ this.cantAvanzar +" casillas!!");
	}
}
