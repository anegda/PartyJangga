package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PruebaTest {
	Prueba p1, p2;
	@Before
	public void setUp() throws Exception {
		p1 = new Prueba("Haz algo");
		p2 = new Prueba("Haz otra cosa");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrueba() {
		assertNotNull(p1);
		assertNotNull(p2);
	}

	@Test
	public void testImprimir() {
		//Deberia imprimirse así:
		//Realiza la siguiente prueba! (si no la cumples no pasa nada, pero no seas soso)
		//descripcion de la prueba
		p1.imprimir();
		p2.imprimir();
	}

}
