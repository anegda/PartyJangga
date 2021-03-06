package packjuego;
public class Jugador {
	
	private String nombre;
	private int posicion;
	private boolean dadoExtra;
	
	public Jugador(String pNombre, int pPosicion, boolean pDadoExtra) {
		this.nombre=pNombre;
		this.posicion=pPosicion;
		this.dadoExtra=pDadoExtra;
	}
	
	public int tirarDados() {
		int tirada;
		Dado unDado = Dado.getMiDado(6);
		tirada=unDado.tirar();
		if (this.dadoExtra==true) {
			tirada=tirada+unDado.tirar();
			this.dadoExtra=false;
		}
		return(tirada);
	}
	
	public int getPosicion() {
		return this.posicion;
	}
	
	public void setPosicion(int pPosicion) {
		this.posicion = pPosicion;
	}
	
	public boolean responderPregunta(Pregunta pPregunta) {
		boolean correcto = false;
		String pPrevioPregunta = "�Que opcion elegir�s?, si fallas te quedas sin dado crack: ";
		String miRespuesta = Teclado.getMiTeclado().leerString(pPrevioPregunta);
		correcto = pPregunta.completado(miRespuesta);		
		return correcto;
	}
	
	public boolean avanzarCasilla(int pAvanzar) {
		boolean winner = false;
		this.posicion=this.posicion+pAvanzar;
		Tablero miTablero =Tablero.getMiTablero();
		if (this.posicion >= miTablero.numCasillas()) {
			winner = true;
		}
		return winner;
	}
	
	public void retrocederCasilla(int pRetroceder) {
		this.posicion=this.posicion-pRetroceder;
	}
	
	public void recibirDadoExtra() {
		this.dadoExtra=true;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
