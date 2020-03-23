package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreguntaTest {
	Pregunta p1, p2;
	@Before
	public void setUp() throws Exception {
		p1= new Pregunta("quiero salir a la calle? a) si b) no c) tal vez d)yo que se","a");
		p2= new Pregunta("Estas contenta? a) si b) no c) tal vez d) yo que se","b");
	}

	@After
	public void tearDown() throws Exception {
		p1=null;
		p2=null;
	}

	@Test
	public void testPregunta() {
		assertNotNull(p1);
		assertNotNull(p2);
	}

	@Test
	public void testImprimirPregunta() {
		p1.imprimirPregunta();
		p2.imprimirPregunta();
		//Comprobamos que el formato en el que se imprimi esta bien
	}

	@Test
	public void testCompletado() {
		assertTrue(p1.completado("a"));
		assertFalse(p1.completado("b"));
		assertFalse(p1.completado("c"));
		assertFalse(p1.completado("d"));
		
		assertTrue(p2.completado("b"));
		assertFalse(p2.completado("a"));
		assertFalse(p2.completado("c"));
		assertFalse(p2.completado("z"));
	}

}
