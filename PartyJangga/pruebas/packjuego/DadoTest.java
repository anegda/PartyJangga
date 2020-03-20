package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DadoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMiDado() {
		Dado dado = Dado.getMiDado(6);
		assertNotNull(dado);
	}

	@Test
	public void testTirar() {
		Dado dado = Dado.getMiDado(6);
		dado.tirar();
		//Comprobamos que por pantalla nos aparecen los distintos valores de ala tirada
		dado.tirar();
	}

}
