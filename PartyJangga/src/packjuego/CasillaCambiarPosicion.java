/**
 * 
 */
package packjuego;


public class CasillaCambiarPosicion extends Casilla{
	
	int posIntercambio;
	//constructora
	
	public CasillaCambiarPosicion(int idCasilla, int pPosIntercambio)
	{
		super(idCasilla);
		posIntercambio = pPosIntercambio;
	}

	//metodos adicionales
	
	public void usar(Jugador pJugador1) {
		pJugador1.setPosicion(posIntercambio);
	}
}