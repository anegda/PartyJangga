/**
 * 
 */
package packjuego;


public class CasillaPrueba extends Casilla {

	//constructora

	public CasillaPrueba(){
		super();
	}
	
	//metodos adicionales

	public void usar(Jugador pJugador) {
		System.out.println("Has caido en una casilla de prueba!");
		ListaPruebas.getMiListaPruebas().imprimirPrueba();
	}
}
