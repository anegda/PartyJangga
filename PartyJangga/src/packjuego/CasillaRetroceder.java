/**
 * 
 */
package packjuego;
public class CasillaRetroceder extends Casilla{
	//atributos
	private int cantRetroceder;
	
	//Constructora
	public CasillaRetroceder(int pRetroceder){
		super();
		cantRetroceder = pRetroceder;
	}
	
	//metodos adicionales
	public void usar(Jugador pJugador) {
		System.out.println("Has caido en una casilla de retroceder");
		pJugador.retrocederCasilla(this.cantRetroceder);
		System.out.println("Has retrocedido " + this.cantRetroceder + " casillas");
	}
}
