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
		System.out.println("Has caido en una casilla de retroceder");
		pJugador.retrocederCasilla(this.cantRetroceder);
		System.out.println("Has retrocedido " + this.cantRetroceder + " casillas");
	}
}
