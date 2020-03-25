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
	
	public void usar(Jugador pJugadorEnCasilla) {
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador JugadorRandom = null;
		boolean distinto = false;
		while (!distinto) {
			JugadorRandom = miListaJugadores.elegirJugadorRandom();
			if (!JugadorRandom.equals(pJugadorEnCasilla)) {
				distinto = true;
			}
		}
		int posJugadorEnCasilla = pJugadorEnCasilla.getPosicion();
		int posJugadorRandom = JugadorRandom.getPosicion();
		pJugadorEnCasilla.setPosicion(posJugadorRandom);
		JugadorRandom.setPosicion(posJugadorEnCasilla);
	}
	
}