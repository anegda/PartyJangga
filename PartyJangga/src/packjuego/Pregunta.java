/**
 * 
 */
package packjuego;


public class Pregunta {
	//atributo

	private String pregunta;
	private String respuesta;
	
	//constructora

	public Pregunta (String pPregunta, String pRespuesta) 
	{
		this.pregunta = pPregunta;
		this.respuesta = pRespuesta;
	}
	
	//metodos adicionales
	
	public void imprimirPregunta() {
		System.out.println(this.pregunta);
		System.out.println("Escribe la letra correspondiente a la respuesta en minúsculas");
	}
	
	public boolean completado(String pRespuesta){
		boolean correcto = false;
		if(this.respuesta.contentEquals(pRespuesta)) {
			System.out.println("Has acertado la pregunta!");
			correcto = true;
		}
		return correcto;
	}
}
