package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaJugadoresTest {

	Jugador j1, j2, j3, j4;
	ListaPreguntas listaP=ListaPreguntas.getMiListaPreguntas();
	@Before
	public void setUp() {
		j1 = new Jugador(1, "Ane", 1, false);
		j2 = new Jugador(2, "Urko", 1, false);
		j3 = new Jugador(3, "Hugo", 1, false);
		j4 = new Jugador(4, "Marcos", 1, false);
		listaP.leerFicheroPreguntas();
	}
	//atributos

	@After
	public void tearDown() {
		j1 = null;
		j2 = null;
		j3 = null;
		j4 = null;
		
		ListaJugadores.getMiListaJugadores().resetear();
	
	}

	@Test
	public void testGetMiListaJugadores() {
		ListaJugadores.getMiListaJugadores();
	}

	@Test
	public void testAddJugador() {
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador unJugador = null;
		miListaJugadores.addJugador(j1);
		miListaJugadores.addJugador(j2);
		miListaJugadores.addJugador(j3);
		miListaJugadores.addJugador(j4);
		
		unJugador = miListaJugadores.buscarJugadorPorID(1);
		assertTrue(j1.equals(unJugador));
		unJugador = miListaJugadores.buscarJugadorPorID(2);
		assertTrue(j2.equals(unJugador));
		unJugador = miListaJugadores.buscarJugadorPorID(3);
		assertTrue(j3.equals(unJugador));
		unJugador = miListaJugadores.buscarJugadorPorID(4);
		assertTrue(j4.equals(unJugador));
	}

	@Test
	public void testElegirJugadorRandom() {
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		Jugador unJugador = null;
		miListaJugadores.addJugador(j1);
		miListaJugadores.addJugador(j2);
		miListaJugadores.addJugador(j3);
		miListaJugadores.addJugador(j4);
		
		unJugador = miListaJugadores.elegirJugadorRandom();
		//aqui no va a dar bien la prueba, es simplemente para ver si el jugador que elige es al azar
		assertFalse(unJugador.equals(j1));
		assertFalse(unJugador.equals(j2));
		assertFalse(unJugador.equals(j3));
		assertFalse(unJugador.equals(j4));
	}

	@Test
	public void testRealizarTurno() {
		ListaJugadores miListaJugadores = ListaJugadores.getMiListaJugadores();
		miListaJugadores.addJugador(j1);
		miListaJugadores.addJugador(j2);
		miListaJugadores.addJugador(j3);
		miListaJugadores.addJugador(j4);
		
		
		miListaJugadores.realizarTurno();
	}

}
