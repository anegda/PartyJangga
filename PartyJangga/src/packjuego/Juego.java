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
		Juego unaPartida = Juego.getMiJuego();
		unaPartida.setGrupoJugadores();
		unaPartida.setTablero();
		unaPartida.setListaPreguntas();
		unaPartida.setListaPruebas();
		ListaJugadores lista = ListaJugadores.getMiListaJugadores();
		lista.decidirTurno();
		
		//se empieza con la partida
		boolean fin=false;
		while(!fin) {
			fin=lista.realizarTurno();
		}
	}
	
	public void addJugador(int pID, String pNombre, int pPosicion, boolean pGanador, boolean pDadoExtra) {
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador unJugador = new Jugador(pID, pNombre, pPosicion, pGanador, pDadoExtra);
		miListaJugadores.addJugador(unJugador);
	}
	
	public void setGrupoJugadores() {
		Teclado miTeclado = Teclado.getMiTeclado();
		
		String pMensajePrevio = "Cuantos de vosotros vais a echar una partida: ";
		String pMensajeNombre = "Como te vas a llamar: "; 
		
		int numJugadores = miTeclado.leerEntero(pMensajePrevio);
		int pos = 0; 
		
		while (pos < numJugadores) {
			pos++;
			String nombre = miTeclado.leerString(pMensajeNombre);
			Juego.getMiJuego().addJugador(pos, nombre, 1, false, false);
		}
	}
	public void setTablero() {
		
	}
	public void setListaPreguntas() {
		ListaPreguntas listaPreguntas = ListaPreguntas.getMiListaPreguntas();
		listaPreguntas.leerFicheroPreguntas();
	}
	public void setListaPruebas() {
		ListaPruebas listaPruebas = ListaPruebas.getMiListaPruebas();
		listaPruebas.leerFicheroPruebas();
	}
}
