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
		miJuego.setGrupoJugadores();
		//set tablero
		Tablero miTablero = Tablero.getMiTablero();
		miTablero.setTablero();
		//set preguntas
		ListaPreguntas listaPreguntas = ListaPreguntas.getMiListaPreguntas();
		listaPreguntas.leerFicheroPreguntas();
		//set Pruebas
		ListaPruebas listaPruebas = ListaPruebas.getMiListaPruebas();
		listaPruebas.leerFicheroPruebas();
		System.out.println("Empieza la partida \n");
		ListaJugadores lista = ListaJugadores.getMiListaJugadores();
		//se empieza con la partida
		boolean fin=false;
		while(!fin) {
			fin=lista.realizarTurno();
		}
	}
	
	private void setGrupoJugadores() {
		Teclado miTeclado = Teclado.getMiTeclado();
		
		String pMensajePrevio = "Cuantos de vosotros vais a echar una partida: ";
		String pMensajeNombre = "Como te vas a llamar: "; 
		
		int numJugadores = miTeclado.leerEntero(pMensajePrevio);
		int pos = 0; 
		
		while (pos < numJugadores) {
			pos++;
			String nombreJugador = miTeclado.leerString(pMensajeNombre);
			ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
			Jugador unJugador = new Jugador(nombreJugador, 1, false);
			miListaJugadores.addJugador(unJugador);
		}
	}
	
}
