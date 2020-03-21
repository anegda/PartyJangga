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

	public CasillaInicial(int idCasilla)
	{
		super(idCasilla);
	}
	//metodos adicionales

	public void usar(Jugador pJugador) {
		pJugador.setPosicion(1);
	}
}
