/**
 * 
 */
package packjuego;


public class CasillaCambiarPosicion extends Casilla{
	
	int posIntercambio;
	//constructora
	
	public CasillaCambiarPosicion(int idCasilla)
	{
		super(idCasilla);
	}

	//metodos adicionales
	
	public void usar(Jugador pJugadorEnCasilla) {
		System.out.println("Has caido en una casilla de intercambiar posici�n");
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador jugadorRandom = null;
		boolean distinto = false;
		while (!distinto) {
			jugadorRandom = miListaJugadores.elegirJugadorRandom();
			if (!jugadorRandom.equals(pJugadorEnCasilla)) {
				distinto = true;
			}
		}
		int posJugadorEnCasilla = pJugadorEnCasilla.getPosicion();
		int posJugadorRandom = jugadorRandom.getPosicion();
		pJugadorEnCasilla.setPosicion(posJugadorRandom);
		jugadorRandom.setPosicion(posJugadorEnCasilla);
		System.out.println("Has intercambiado tu posici�n con " + jugadorRandom.getNombre());
		System.out.println("Ahora " + pJugadorEnCasilla.getNombre() + " se encuentra en la posici�n " + pJugadorEnCasilla.getPosicion());
		System.out.println("Ahora " + jugadorRandom.getNombre() + " se encuentra en la posici�n " + jugadorRandom.getPosicion());
	}
}