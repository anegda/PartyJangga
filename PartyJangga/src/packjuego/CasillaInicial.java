/**
 * 
 */
package packjuego;

/**
 * @author Urko
 *
 */
public class CasillaInicial extends Casilla{

	//constructora

	public CasillaInicial(){
		super();
	}
	//metodos adicionales

	public void usar(Jugador pJugador) {
		pJugador.setPosicion(1);
	}
}
