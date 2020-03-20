package packjuego;
public class Juego {
	//atributo
	private static Juego miJuego=null;
	//constructora
	private Juego() {
	}
	//MAE
	public static synchronized Juego getMiJuego() {
		if(Juego.miJuego==null) {
			Juego.miJuego=new Juego();
		}
		return Juego.miJuego;
	}
	//Otros metodos
	public void jugarPartida() {
		//al inicio de toda partida se decide el turno
		ListaJugadores lista=ListaJugadores.getMiListaJugadores();
		lista.decidirTurno();
		
		//se empieza con la partida
		boolean fin=false;
		while(!fin) {
			fin=lista.realizarTurno();
		}
	}
}
