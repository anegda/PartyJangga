package packjuego;
import java.util.*;
import java.util.Random;

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
	
	public Jugador elegirJugadorRandom() {
		Random r = new Random();
		int nJugador = r.nextInt(this.lista.size()) + 1;
		Jugador jugadorParaIntercambiar = this.lista.get(nJugador-1);
		return jugadorParaIntercambiar;
	}	
	
	public Jugador buscarJugadorPorID(int pID) {
		Jugador unJugador=null;
		Iterator<Jugador> itr=this.getIterador();
		boolean encontrado=false;
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
	
	public void buscarGanador() {
		boolean fin = false;
		Jugador ganador=null;
		Iterator<Jugador> itr=this.getIterador();
		while (itr.hasNext() && !fin) {
			ganador=itr.next();
			fin = ganador.comprobarSiHaGanado();
		}	
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
			System.out.println(unJugador.getNombre()+" es tu turno!");
			Pregunta laPregunta = miListaPreguntas.realizarPregunta();
			correcto = unJugador.responderPregunta(laPregunta);
			if (correcto) {
				unJugador.recibirDadoExtra();
				correcto=false;
			}
			int tirada=unJugador.tirarDados();
			fin=unJugador.avanzarCasilla(tirada);
			if(!fin) {	
				fin=miTablero.usarCasillaPos(unJugador.getPosicion(), unJugador);
			}
			//decimos al jugador la posicion en la que ha acabado
			int posActual = unJugador.getPosicion();
			Integer.toString(posActual);
			System.out.println(unJugador.getNombre() + " estas en la casilla: " + posActual);
			System.out.println("\n");
		}
		return(fin);
	}
	public void resetear() {
		this.lista.clear();
	}
	
 }