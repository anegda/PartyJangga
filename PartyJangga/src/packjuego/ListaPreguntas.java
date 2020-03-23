/**
 * 
 */
package packjuego;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPreguntas {
	//atributo
	
	private ArrayList<Pregunta> listaPreguntas;
	private static ListaPreguntas miListaPreguntas=null;
	
	//constructora
	
	private ListaPreguntas(){
		this.listaPreguntas= new ArrayList<Pregunta>();
	}
	
	//metodos adicionales
	
 	public static ListaPreguntas getMiListaPreguntas() 
	{
		if(ListaPreguntas.miListaPreguntas==null) {
			ListaPreguntas.miListaPreguntas=new ListaPreguntas();
		}
		return ListaPreguntas.miListaPreguntas;
	}
	public void leerFicheroPreguntas() {
		InputStream fich=null;
		try {
			fich = new FileInputStream(System.getProperty("user.dir")+File.separator+"preguntas.txt");
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Scanner sc = new Scanner(fich);
		while(sc.hasNextLine()) {
			String pregunta = sc.nextLine();
			String respuesta = sc.nextLine();
			Pregunta nuevaPregunta = new Pregunta(pregunta,respuesta);
			this.listaPreguntas.add(nuevaPregunta);
		}
		sc.close();
	}
	
	public Pregunta realizarPregunta() {
		Pregunta unaPregunta = this.listaPreguntas.get(0);
		unaPregunta.imprimirPregunta();
		this.rotarPregunta();
		return unaPregunta;
	}
	private void rotarPregunta( ) {
		Pregunta unaPregunta=null;
		unaPregunta=this.listaPreguntas.get(0);
		this.listaPreguntas.remove(0);
		this.listaPreguntas.add(unaPregunta);
	}
	
}