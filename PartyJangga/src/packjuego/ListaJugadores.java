package packjuego;
import java.util.*;
public class ListaJugadores {
	private ArrayList<Jugador> lista;
	private static ListaJugadores miListaJugadores=null;
	
	private ListaJugadores() {
		this.lista=new ArrayList<Jugador>();
	}
	
	public static synchronized ListaJugadores getMiListaJugadores() {
		if (ListaJugadores.miListaJugadores==null) {
			ListaJugadores.miListaJugadores=new ListaJugadores();
	}
	return(ListaJugadores.miListaJugadores);
	}
	
	private Iterator<Jugador> getIterador() {
		return(this.lista.iterator());
	}
	
	public void annadirJugador(Jugador pJugador) {
		this.lista.add(pJugador);
	}
	
	public void eliminarJugador(Jugador pJugador) {
		this.lista.remove(pJugador);
	}
	//reordenar un arrayList
	public void decidirTurno() {
		
	}
	
	public Jugador buscarJugadorPorID(int pID) {
		Jugador unJugador=null;
		Iterator<Jugador> itr=this.getIterador();
		boolean encontrado=false;
		int tirada;
		while (itr.hasNext() && !encontrado) {
			unJugador=itr.next();
			if (unJugador.tieneEsteId(pID)) {
				encontrado=true;
			}
		}
		if (!encontrado) {
			unJugador=null;
		}
		return(unJugador);
	}
	
	public boolean realizarTurno() {
		Iterator<Jugador> itr=this.getIterador();
		Jugador unJugador;
		boolean fin;
		while (itr.hasNext()) {
			unJugador=itr.next();
			ListaPreguntas.imprimirPregunta();
			unJugador.responderPregunta();
		}

		itr=this.getIterador();
		
		while(itr.hasNext() && !fin) {
			unJugador=itr.next();
			int tirada=unJugador.tirarDados();
			unJugador.avanzarCasilla(tirada);
			fin=Tablero.usarCasillaPos(unJugador.getPosicion());
		}
		return(fin);
	}
 }