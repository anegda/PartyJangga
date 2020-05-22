package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	Jugador j1, j2, j3, j4;
	
	@Before
	public void setUp() {
		j1 = new Jugador("Ane", 1, false);
		j2 = new Jugador("Urko", 1, false);
		j3 = new Jugador("Hugo", 1, false);
		j4 = new Jugador("Marcos", 1, false);
	}

	@After
	public void tearDown() {
		j1 = null;
		j2 = null;
		j3 = null;
		j4 = null;
		
		ListaJugadores.getMiListaJugadores().resetear();
	}

	@Test
	public void testGetMiJuego() {
		fail("Not yet implemented");
	}

	@Test
	public void testJugarPartida() {
		Juego.getMiJuego().jugarPartida();
	}

	@Test
	public void testAddJugador() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGrupoJugadores() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTablero() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetListaPreguntas() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetListaPruebas() {
		fail("Not yet implemented");
	}

	//constructora

	//métodos adicionales
}
