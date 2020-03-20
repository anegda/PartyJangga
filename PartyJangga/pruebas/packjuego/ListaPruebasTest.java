package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPruebasTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMiListaPruebas() {
		ListaPruebas lista= ListaPruebas.getMiListaPruebas();
		assertNotNull(lista);
	}

	@Test
	public void testLeerFicheroPruebasImprimirPrueba() {
		ListaPruebas lista= ListaPruebas.getMiListaPruebas();
		lista.leerFicheroPruebas();
		//Imprime la primera prueba
		lista.imprimirPrueba();
		//Imprime la segunda prueba
		lista.imprimirPrueba();
		//Probando con un archivo de pocas pruebas hemos comprobado que las pruebas se rotan, es decir, una vez aparece por pantalla se coloca al final de la lista
	}
}
