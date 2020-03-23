/**
 * 
 */
package packjuego;


public class CasillaPrueba extends Casilla {

	//constructora

	public CasillaPrueba(int idCasilla)
	{
		super(idCasilla);
	}
	
	//metodos adicionales

	public void usar(Jugador pJugador) {
		ListaPruebas.getMiListaPruebas().imprimirPrueba();
	}
}
