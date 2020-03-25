package packjuego;
public class Jugador {
	
	private int id;
	private String nombre;
	private int posicion;
	private boolean ganador;
	private boolean dadoExtra;
	
	public Jugador(int pID, String pNombre, int pPosicion, boolean pGanador, boolean pDadoExtra) {
		this.id=pID;
		this.nombre=pNombre;
		this.posicion=pPosicion;
		this.ganador=pGanador;
		this.dadoExtra=pDadoExtra;
	}
	
	public int tirarDados() {
		int tirada;
		Dado unDado = Dado.getMiDado(6);
		tirada=unDado.tirar();
		if (dadoExtra==true) {
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
	
	public boolean comprobarSiHaGanado() {
		if (this.ganador) {
			System.out.println("El jugador '" + this.nombre + "' con el id '" + this.id + "' es el ganador de la partida, enhorabuena.");
		}
		return this.ganador;
	}
	
	
	public boolean responderPregunta(Pregunta pPregunta) {
		boolean correcto = false;
		String pPrevioPregunta = "¿Que opcion elegiras?, si fallas te quedas sin dado crack: ";
		String miRespuesta = Teclado.getMiTeclado().leerString(pPrevioPregunta);
		correcto = pPregunta.completado(miRespuesta);		
		return correcto;
	}
	
	public boolean avanzarCasilla(int pAvanzar) {
		boolean winner = false;
		this.posicion=this.posicion+pAvanzar;
		if (this.posicion >= Tablero.getMiTablero().numCasillas()) {
			this.setGanador();
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
	
	public void setGanador() {
		this.ganador=true;
	}
	
	public boolean tieneEsteId(int pId) {
		boolean mismo=false;
		if(this.id==pId) {
			mismo=true;
		}
		return mismo;
	}
	public String getNombre() {
		return this.nombre;
	}
}
