/**
 * 
 */
package packjuego;


public class CasillaFinal extends Casilla{

	//constructora
	
	public CasillaFinal(int idCasilla){
		super(idCasilla);
	}

	//metodos adicionales

	public void usar(Jugador pJugador) {
		System.out.println("Has llegado a la casilla final!");
	}
}
