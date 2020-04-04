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
 			System.out.println("Enhorabuena " + pJugador.getNombre() + " has ganado!!");
 		}
 		return winner;
 	}	
 	
 	public void setTablero( ) {
 		//Lo hemos hecho a mano ya que no queriamos que las casillas siguiesen un patron concreto
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
 		Casilla casilla20  = new CasillaCambiarPosicion(13);
 		Casilla casilla21 = new CasillaPrueba(21);
 		Casilla casilla22 = new CasillaPrueba(22);
 		Casilla casilla23 = new CasillaRetroceder(23, 6);
 		Casilla casilla24 = new CasillaAvanzar(24, 4);
 		Casilla casilla25 = new CasillaRetroceder(25, 1);
 		Casilla casilla26 = new CasillaCambiarPosicion(26);
 		Casilla casilla27 = new CasillaPrueba(27);
 		Casilla casilla28 = new CasillaCambiarPosicion(28);
 		Casilla casilla29 = new CasillaAvanzar(29, 4);
 		Casilla casilla30 = new CasillaPrueba(30);
 		Casilla casilla31 = new CasillaRetroceder(31, 4);
 		Casilla casilla32 = new CasillaAvanzar(32, 4);
 		Casilla casilla33 = new CasillaPrueba(33);
 		Casilla casilla34 = new CasillaRetroceder(34, 3);
 		Casilla casilla35 = new CasillaCambiarPosicion(35);
 		Casilla casilla36 = new CasillaPrueba(36);
 		Casilla casilla37 = new CasillaAvanzar(37, 4);
 		Casilla casilla38 = new CasillaPrueba(38);
 		Casilla casilla39 = new CasillaRetroceder(39, 5);
 		Casilla casilla40 = new CasillaRetroceder(40, 7);
 		Casilla casilla41 = new CasillaPrueba(41);
 		Casilla casilla42 = new CasillaRetroceder(42, 2);
 		Casilla casilla43 = new CasillaPrueba(43);
 		Casilla casilla44 = new CasillaCambiarPosicion(44);
 		Casilla casilla45 = new CasillaAvanzar(45, 4);
 		Casilla casilla46 = new CasillaPrueba(46);
 		Casilla casilla47 = new CasillaRetroceder(47, 1);
 		Casilla casilla48 = new CasillaPrueba(48);
 		Casilla casilla49 = new CasillaCambiarPosicion(49);
 		Casilla casilla50 = new CasillaRetroceder(50, 3);
 		Casilla casilla51 = new CasillaPrueba(51);
 		Casilla casilla52 = new CasillaRetroceder(52, 3);
 		Casilla casilla53 = new CasillaAvanzar(53, 4);
 		Casilla casilla54 = new CasillaPrueba(54);
 		Casilla casilla55 = new CasillaCambiarPosicion(55);
 		Casilla casilla56 = new CasillaRetroceder(56, 6);
 		Casilla casilla57 = new CasillaAvanzar(57, 4);
 		Casilla casilla58 = new CasillaPrueba(58);
 		Casilla casilla59 = new CasillaCambiarPosicion(59);
 		Casilla casilla60 = new CasillaRetroceder(60, 15);
 		Casilla casilla61 = new CasillaAvanzar(61,3);
 		Casilla casilla62 = new CasillaCambiarPosicion(62);
 		Casilla casilla63 = new CasillaRetroceder(63, 62);
 		Casilla casilla64 = new CasillaFinal(64);
 		
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
 		this.tablero.add(casilla21);
 		this.tablero.add(casilla22);
 		this.tablero.add(casilla23);
 		this.tablero.add(casilla24);
 		this.tablero.add(casilla25);
 		this.tablero.add(casilla26);
 		this.tablero.add(casilla27);
 		this.tablero.add(casilla28);
 		this.tablero.add(casilla29);
 		this.tablero.add(casilla30);
 		this.tablero.add(casilla31);
 		this.tablero.add(casilla32);
 		this.tablero.add(casilla33);
 		this.tablero.add(casilla34);
 		this.tablero.add(casilla35);
 		this.tablero.add(casilla36);
 		this.tablero.add(casilla37);
 		this.tablero.add(casilla38);
 		this.tablero.add(casilla39);
 		this.tablero.add(casilla40);
 		this.tablero.add(casilla41);
 		this.tablero.add(casilla42);
 		this.tablero.add(casilla43);
 		this.tablero.add(casilla44);
 		this.tablero.add(casilla45);
 		this.tablero.add(casilla46);
 		this.tablero.add(casilla47);
 		this.tablero.add(casilla48);
 		this.tablero.add(casilla49);
 		this.tablero.add(casilla50);
 		this.tablero.add(casilla51);
 		this.tablero.add(casilla52);
 		this.tablero.add(casilla53);
 		this.tablero.add(casilla54);
 		this.tablero.add(casilla55);
 		this.tablero.add(casilla56);
 		this.tablero.add(casilla57);
 		this.tablero.add(casilla58);
 		this.tablero.add(casilla59);
 		this.tablero.add(casilla60);
 		this.tablero.add(casilla61);
 		this.tablero.add(casilla62);
 		this.tablero.add(casilla63);
 		this.tablero.add(casilla64);
 	}
	
}
