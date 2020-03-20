package packjuego;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;

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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fich);
		while(sc.hasNextLine()) {
			String prueba = sc.nextLine();
			Prueba nuevaPrueba = new Prueba(prueba);
			this.listaPruebas.add(nuevaPrueba);
		}
		sc.close();
	}
	private void rotarPruebas() {
		Prueba unaPrueba=null;
		unaPrueba=this.listaPruebas.get(0);
		this.listaPruebas.remove(0);
		this.listaPruebas.add(unaPrueba);
	}
	public void imprimirPrueba() {
		Prueba unaPrueba=this.listaPruebas.get(0);
		unaPrueba.imprimir();
		this.rotarPruebas();
	}
}
