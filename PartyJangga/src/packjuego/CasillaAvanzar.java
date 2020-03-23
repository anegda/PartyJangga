/**
 * 
 */
package packjuego;


public class CasillaAvanzar extends Casilla{

	private int cantAvanzar;
	
	//constructora
	
	public CasillaAvanzar(int idCasilla, int pAvanzar)
	{
		super(idCasilla);
		cantAvanzar = pAvanzar;
	}

	//metodos adicionales
	
	public void usar(Jugador pJugador) {
		pJugador.avanzarCasilla(cantAvanzar);
	}
}
