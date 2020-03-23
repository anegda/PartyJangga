package packjuego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPreguntasTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLeerFicheroRealizarPreguntas() {
		//Ambos test se realizan a la vez
		ListaPreguntas lista= ListaPreguntas.getMiListaPreguntas();
		lista.leerFicheroPreguntas();
		//Imprime la primera Pregunta
		Pregunta unaPregunta=lista.realizarPregunta();
		//Miramos a ver si coge bien la respuesta
		assertTrue(unaPregunta.completado("a"));
		assertFalse(unaPregunta.completado("b"));
		assertFalse(unaPregunta.completado("c"));
		assertFalse(unaPregunta.completado("d"));
		//Imprime la segunda Pregunta
		lista.realizarPregunta();
		Pregunta terceraPregunta=lista.realizarPregunta();
		//Confirmamos que coge bien la respuesta correcta
		assertTrue(terceraPregunta.completado("b"));
	}
}
