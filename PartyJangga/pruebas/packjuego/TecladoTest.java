package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TecladoTest {

	@Before
	public void setUp() {
		
	}

	@After
	public void tearDown() {
		
	}

	@Test
	public void testLeerEntero() {
		Teclado getMiTeclado = Teclado.getMiTeclado();
		String miPeticion = "Escribe '12345': ";
		int num = getMiTeclado.leerEntero(miPeticion);
		assertEquals(12345, num);	
	}

	@Test
	public void testLeerString() {
		Teclado getMiTeclado = Teclado.getMiTeclado();
		String miPeticion = "Escribe 'coco': ";
		String palabra = getMiTeclado.leerString(miPeticion);
		assertEquals("coco", palabra);
	}

}
