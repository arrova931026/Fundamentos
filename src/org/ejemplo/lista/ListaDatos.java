package org.ejemplo.lista;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * LIST: Son Tipos de colecciones, permiten guardar, redimensionar y tener sus propios métodos
 * 
 */
public class ListaDatos {
	
	public static void listaNombres() {
		try {
			//Creación de lista de Java.Util
			List<String> lista = new ArrayList<String>();
				
			//Agregado de información a la lista
			lista.add("Juan");
			lista.add("Carmen");
			lista.add("Laura");
			lista.add("Erick");
			lista.add("Carlos");
			lista.add("Karla");
			lista.add("Carolina");
			
			//Modificación de un dato de la lista.
			lista.set(5, "Carla");
			
			//Obtención de dato
			System.out.println("Dato : " + lista.get(3));
			
			//Obtención de todos los datos
			for(int i = 0; i < lista.size(); i++) {
				System.out.println("Lista de datos: " + lista.get(i));
			}
		} catch (Exception e) {
			System.out.println("Exception: "+ e.getMessage());
			// TODO: handle exception
		}
	}
	
	//Método main 
	public static void main(String[] args) {
		 //Llamado a listaNombres.
		listaNombres();
	}

}
