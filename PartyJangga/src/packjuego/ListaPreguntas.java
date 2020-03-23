/**
 * 
 */
package packjuego;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPreguntas {
	//atributo
	
	private ArrayList<Pregunta> listaPreguntas;
	private static ListaPreguntas miListaPreguntas=null;
	
	//constructora
	
	private ListaPreguntas()
	{
		this.listaPreguntas= new ArrayList<Pregunta>();
	}
	
	//metodos adicionales
	
	private Iterator<Pregunta> getIterador()
	{
		return(this.listaPreguntas.iterator());
	}
	
 	public static ListaPreguntas getMiListaPreguntas() 
	{
		if(ListaPreguntas.miListaPreguntas==null) {
			ListaPreguntas.miListaPreguntas=new ListaPreguntas();
		}
		return ListaPreguntas.miListaPreguntas;
	}
	
	public Pregunta realizarPregunta() 
	{
		Iterator<Pregunta> itr = ListaPreguntas.getMiListaPreguntas().getIterador();
		Pregunta unaPregunta = itr.next();
		unaPregunta.imprimirPregunta();
		return unaPregunta;
	}
	
	public void rotarPregunta( ) 
	{
		
	}
	
	
	public void addPregunta(Pregunta pPregunta)
	{
		this.listaPreguntas.add(pPregunta);
	}
	
}