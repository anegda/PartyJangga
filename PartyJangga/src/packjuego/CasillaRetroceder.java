/**
 * 
 */
package packjuego;


public class CasillaRetroceder extends Casilla{
	
	private int cantRetroceder;
	
	//constructora
	
	public CasillaRetroceder(int idCasilla, int pRetroceder){
		super(idCasilla);
		cantRetroceder = pRetroceder;
	}
	
	//metodos adicionales
	
	public void usar(Jugador pJugador) {
		pJugador.retrocederCasilla(cantRetroceder);
	}
}
