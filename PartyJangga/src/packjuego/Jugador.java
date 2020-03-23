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
	
	public void responderPregunta() {
		
	}
	
	public boolean avanzarCasilla(int pAvanzar) {
		this.posicion=this.posicion+pAvanzar;
		boolean fin=false;
		if(this.posicion>64) {
			fin=true;
		}
		return fin;
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
}
