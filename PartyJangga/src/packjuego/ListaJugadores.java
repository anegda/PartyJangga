package packjuego;
import java.util.*;
public class ListaJugadores {
	
	private ArrayList<Jugador> lista;
	private static ListaJugadores miListaJugadores=null;
	
	//no tiene maximo de jugadores
	
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
	
	public void addJugador(Jugador pJugador) {
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
		Tablero miTablero = Tablero.getMiTablero();
		ListaPreguntas miListaPreguntas = ListaPreguntas.getMiListaPreguntas();
		Jugador unJugador;
		boolean correcto = false;
		boolean fin = false;
		while (itr.hasNext() && !fin) {
			unJugador=itr.next();
			Pregunta laPregunta = miListaPreguntas.realizarPregunta();
			correcto = unJugador.responderPregunta(laPregunta);
			if (correcto) {
				unJugador.recibirDadoExtra();
				correcto=false;
			}
			int tirada=unJugador.tirarDados();
			unJugador.avanzarCasilla(tirada);
			int pos = unJugador.getPosicion();
			fin = miTablero.usarCasillaPos(pos, unJugador);
		}
		return(fin);
	}
 }