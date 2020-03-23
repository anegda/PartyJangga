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
	
	private Tablero()
	{
		this.tablero= new ArrayList<Casilla>();
	}
	
	//metodos adicionales
	
	private Iterator<Casilla> getIterador()
	{
		return this.tablero.iterator();
	}
	
	public void annadirCasilla(Casilla pCasilla) {
		this.tablero.add(pCasilla);
	}
	
	public void eliminarCasilla(Casilla pCasilla) {
		this.tablero.remove(pCasilla);
	}
	
 	public static Tablero getMiTablero() 
	{
		if(Tablero.miTablero==null) {
			Tablero.miTablero=new Tablero();
		}
		return Tablero.miTablero;
	}
 	
 	public Casilla buscarCasillaPorPosicion(int pPosicion) 
 	{
 		Iterator<Casilla> itr = this.getIterador();
 		Casilla unaCasilla = null;
 		int pos = 0;
 		while (itr.hasNext() && pos != pPosicion) 
 		{
 			unaCasilla = itr.next();
 			pos++;
 		}	
 		return unaCasilla;
 	}
 	public boolean usarCasillaPos(int pPos, Jugador pJugador) 
 	{
 		Tablero tableroJuego = Tablero.getMiTablero();
 		Casilla casillaActual = tableroJuego.buscarCasillaPorPosicion(pPos);
 		casillaActual.usar(pJugador);
 		
 	}
	
}
