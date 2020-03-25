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

	public abstract void usar(Jugador pJugador);
}
