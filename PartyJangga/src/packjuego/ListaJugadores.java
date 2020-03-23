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
		Jugador unJugador=null;
		Iterator<Jugador> itr=this.getIterador();
		//Primero tiran todos el dado, para guardar el valor de la tirada los jugadores avanzan hasta la posicion que han sacado
		while(itr.hasNext()) {
			unJugador=itr.next();
			unJugador.avanzarCasilla(unJugador.tirarDados());
			this.lista.remove(unJugador);
			this.anadirOrdenadoJugador(unJugador);
		}
		Iterator<Jugador> itr2=this.getIterador();
		while(itr.hasNext()) {
			unJugador=itr2.next();
			unJugador.retrocederCasilla(unJugador.getPosicion());
		}
	}
	//Metodo que comparando las tiradas ordena el array de jugadores para decidir turno
	private void anadirOrdenadoJugador(Jugador pJugador){
		Iterator<Jugador> itr=this.getIterador();
		Jugador unJugador=null;
		boolean menor=false;
		int pos=0;
		while(itr.hasNext() && !menor) {
			unJugador=itr.next();
			if(unJugador.getPosicion()<pJugador.getPosicion()) {
				menor=true;
			}
			else {
				pos=pos+1;
			}
		}
		this.lista.add(pos,pJugador);
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
	
	public boolean realizarTurno() {
		Iterator<Jugador> itr=this.getIterador();
		Tablero miTablero = Tablero.getMiTablero();
		ListaPreguntas miListaPreguntas = ListaPreguntas.getMiListaPreguntas();
		Jugador unJugador;
		boolean correcto = false;
		boolean fin = false;
		//se juegan el dado extra
		while (itr.hasNext()) {
			unJugador=itr.next();
			Pregunta laPregunta = miListaPreguntas.realizarPregunta();
			correcto = unJugador.responderPregunta(laPregunta);
			if (correcto) {
				unJugador.recibirDadoExtra();
				correcto=false;
			}
		}
		//Realizan el turno en sí
		itr=this.getIterador();
		while(itr.hasNext() && !fin) {
			unJugador=itr.next();
			int tirada=unJugador.tirarDados();
			fin=unJugador.avanzarCasilla(tirada);
			if(!fin) {
				fin=miTablero.usarCasillaPos(unJugador.getPosicion(), unJugador);
			}
		}
		return(fin);
	}
 }