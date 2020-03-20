package packjuego;

public class Prueba {
	//Atributo
	private String descripcion;
	//Constructura
	public Prueba(String pDescripcion) {
		this.descripcion=pDescripcion;
	}
	//otros metodos
	public void imprimir() {
		System.out.println("Realiza la siguiente prueba! (si no la cumples no pasa nada, pero no seas soso)");
		System.out.println(this.descripcion);
	}
	//hola hugooo <3
}
