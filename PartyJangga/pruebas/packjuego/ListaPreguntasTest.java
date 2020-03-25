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
		//Imprime la Pregunta
		Pregunta unaPregunta=lista.realizarPregunta();
		//Imprime la Pregunta
		lista.realizarPregunta();
	}
}
