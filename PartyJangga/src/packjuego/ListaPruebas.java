package packjuego;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ListaPruebas {
	private ArrayList<Prueba> listaPruebas;
	private static ListaPruebas miListaPruebas=null;
	
	//Constructora
	private ListaPruebas() {
		this.listaPruebas= new ArrayList<Prueba>();
	}
	//(MAE)
	public static synchronized ListaPruebas getMiListaPruebas() {
		if(ListaPruebas.miListaPruebas==null) {
			ListaPruebas.miListaPruebas=new ListaPruebas();
		}
		return ListaPruebas.miListaPruebas;
	}
	//Otros metodos
	public void leerFicheroPruebas() {
		InputStream fich=null;
		try {
			fich = new FileInputStream(System.getProperty("user.dir")+File.separator+"prueba.txt");
			Scanner sc = new Scanner(fich);
			while(sc.hasNextLine()) {
				String prueba = sc.nextLine();
				Prueba nuevaPrueba = new Prueba(prueba);
				this.listaPruebas.add(nuevaPrueba);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}
	}
	private Prueba elegirRandomPrueba( ) {
		Random r = new Random();
		int nPrueba = r.nextInt(this.listaPruebas.size()) + 1;
		Prueba laPrueba = this.listaPruebas.get(nPrueba-1);
		return laPrueba;
	}
	public void imprimirPrueba() {
		Prueba unaPrueba=this.elegirRandomPrueba();
		unaPrueba.imprimir();
	}
}
