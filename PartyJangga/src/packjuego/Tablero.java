/**
 * 
 */
package packjuego;

import java.util.ArrayList;
import java.util.Iterator;


public class Tablero {
	//atributo
	
	private ArrayList<Casilla> tablero;
	private static Tablero miTablero=null;
	
	//constructora
	
	private Tablero(){
		this.tablero= new ArrayList<Casilla>();
	}
	
	//metodos adicionales
	
	private Iterator<Casilla> getIterador(){
		return this.tablero.iterator();
	}
	
	public void annadirCasilla(Casilla pCasilla) {
		this.tablero.add(pCasilla);
	}
	
	public void eliminarCasilla(Casilla pCasilla) {
		this.tablero.remove(pCasilla);
	}
	
 	public static Tablero getMiTablero() {
		if(Tablero.miTablero==null) {
			Tablero.miTablero=new Tablero();
		}
		return Tablero.miTablero;
	}
 	
 	public int numCasillas() {
 		return this.tablero.size();
 	}
 	
 	public Casilla buscarCasillaPorPosicion(int pPosicion) {
 		Iterator<Casilla> itr = this.getIterador();
 		Casilla unaCasilla = null;
 		int pos = 0;
 		while (itr.hasNext() && pos != pPosicion) {
 			unaCasilla = itr.next();
 			pos++;
 		}	
 		return unaCasilla;
 	}
 	public boolean usarCasillaPos(int pPos, Jugador pJugador) {
 		boolean winner = false;
 		Tablero tableroJuego = Tablero.getMiTablero();
 		Casilla casillaActual = tableroJuego.buscarCasillaPorPosicion(pPos);
 		casillaActual.usar(pJugador);
 		if(pJugador.getPosicion() >= this.numCasillas()) {
 			winner = true;
 		}
 		return winner;
 	}	
 	
 	public void setTablero( ) {
 		Casilla casilla1 = new CasillaInicial(1);
 		Casilla casilla2 = new CasillaPrueba(2);
 		Casilla casilla3 = new CasillaPrueba(3);
 		Casilla casilla4 = new CasillaRetroceder(4, 3);
 		Casilla casilla5 = new CasillaPrueba(5);
 		Casilla casilla6 = new CasillaAvanzar(6, 4);
 		Casilla casilla7 = new CasillaPrueba(7);
 		Casilla casilla8 = new CasillaPrueba(8);
 		Casilla casilla9 = new CasillaCambiarPosicion(9);
 		Casilla casilla10 = new CasillaPrueba(10);
 		Casilla casilla11 = new CasillaAvanzar(11, 4);
 		Casilla casilla12 = new CasillaPrueba(12);
 		Casilla casilla13 = new CasillaCambiarPosicion(13);
 		Casilla casilla14 = new CasillaPrueba(14);
 		Casilla casilla15 = new CasillaPrueba(15);
 		Casilla casilla16 = new CasillaRetroceder(16, 15);
 		Casilla casilla17 = new CasillaAvanzar(17, 3);
 		Casilla casilla18 = new CasillaPrueba(18);
 		Casilla casilla19 = new CasillaPrueba(19);
 		Casilla casilla20 = new CasillaFinal(20);
 		
 		this.tablero.add(casilla1);
 		this.tablero.add(casilla2);
 		this.tablero.add(casilla3);
 		this.tablero.add(casilla4);
 		this.tablero.add(casilla5);
 		this.tablero.add(casilla6);
 		this.tablero.add(casilla7);
 		this.tablero.add(casilla8);
 		this.tablero.add(casilla9);
 		this.tablero.add(casilla10);
 		this.tablero.add(casilla11);
 		this.tablero.add(casilla12);
 		this.tablero.add(casilla13);
 		this.tablero.add(casilla14);
 		this.tablero.add(casilla15);
 		this.tablero.add(casilla16);
 		this.tablero.add(casilla17);
 		this.tablero.add(casilla18);
 		this.tablero.add(casilla19);
 		this.tablero.add(casilla20);
 	}
	
}
