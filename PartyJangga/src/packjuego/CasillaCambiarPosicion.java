

/**
 * 
 */
package packjuego;


public class CasillaCambiarPosicion extends Casilla{
	//No tiene atributos
	
	//Constructora
	public CasillaCambiarPosicion(){
		super();
	}

	//metodos adicionales
	public void usar(Jugador pJugadorEnCasilla) {
		System.out.println("Has caido en una casilla de intercambiar posición");
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador jugadorRandom = null;
		boolean distinto = false;
		while (!distinto) {
			jugadorRandom = miListaJugadores.elegirJugadorRandom();
			if (!jugadorRandom.equals(pJugadorEnCasilla)) {
				distinto = true;
			}
			//Se elige un jugador aleatorio de la lista de jugadores
			//Hasta que este jugador no sea distinto a pJugadorEnCasilla se repite este proceso en bucle
		}
		int posJugadorEnCasilla = pJugadorEnCasilla.getPosicion();
		int posJugadorRandom = jugadorRandom.getPosicion();
		//Obtenemos las dos antiguas posiciones de los dos jugadores
		pJugadorEnCasilla.setPosicion(posJugadorRandom);
		jugadorRandom.setPosicion(posJugadorEnCasilla);
		//Se intercambian las posiciones
		System.out.println("Has intercambiado tu posición con " + jugadorRandom.getNombre());
		System.out.println("Ahora " + pJugadorEnCasilla.getNombre() + " se encuentra en la posición " + pJugadorEnCasilla.getPosicion());
		System.out.println("Ahora " + jugadorRandom.getNombre() + " se encuentra en la posición " + jugadorRandom.getPosicion());
		//Se avisa por pantalla
	}
}