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
	
	public Jugador elegirJugadorRandom() {
		Random r = new Random();
		int nJugador = r.nextInt(this.lista.size());
		Jugador jugadorParaIntercambiar = this.lista.get(nJugador);
		return jugadorParaIntercambiar;
	}		
	
	public boolean realizarTurno() {
		Iterator<Jugador> itr=this.getIterador();
		Tablero miTablero = Tablero.getMiTablero();
		ListaPreguntas miListaPreguntas = ListaPreguntas.getMiListaPreguntas();
		Jugador unJugador=null;
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
			System.out.println(unJugador.getNombre() + " estás en la casilla " + unJugador.getPosicion() + " sigue asi");
			if(!fin) {	
				fin=miTablero.usarCasillaPos(unJugador);
			}
			else {
				System.out.println("Enhorabuena " + unJugador.getNombre() + " has ganado!!");
			}
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println();
		}
		return(fin);
	}
	
	public void resetear() {
		this.lista.clear();
	}
	
 }