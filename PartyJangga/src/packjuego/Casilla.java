/**
 * 
 */
package packjuego;


public abstract class Casilla {
	
	//atributo
	protected int IdCasilla;
	
	//constructora
	public Casilla(int idCasilla) {
		IdCasilla = idCasilla;
	}

	//metodos adicionales
	public abstract void usar(Jugador pJugador);
}
