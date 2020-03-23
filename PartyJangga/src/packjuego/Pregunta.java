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
	
	public void imprimirPregunta() 
	{
		System.out.println(this.pregunta);
	}
	
	public boolean completado(String pRespuesta)
	{
		boolean correcto = false;
		if(this.respuesta==pRespuesta) {
			correcto = true;
		}
		return correcto;
	}
	
}
