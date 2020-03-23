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
		pJugador.setGanador();
	}
}
