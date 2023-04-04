package org.ejemplo.leer;
//Importaciones de paquetes de java para lectura de datos.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Clase para captura de datos.
public class LeerDatos {
	
	//	Método para la lectura de datos a través de la clase BufferedReader.	
	
	public static void leerBufferedReader(){
			try {
				//Nota: A diferencia de Scanner que solo puede leer un kb 
				//BufferedReader puede leer hasta 4 kb.
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Escribe un ID: ");
				String id = reader.readLine();
				
				System.out.println("Escribe un Nombre: ");
				String nombre = reader.readLine();
				
				System.out.println("Escribe un Salario: ");
				String salario = reader.readLine();
				
				System.out.println("Datos: " + id + "," + nombre + "," + salario);
				
			} catch (Exception e) {
				System.out.println("Exception : "+e.getMessage());
			}
						
	}
	
	//Método para la lectura de datos a través de la clase Scanner.
	public static void leerScanner() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Escribe un ID: ");
			int id = scanner.nextInt();
			
			System.out.println("Escribe un Nombre: ");
			String nombre = scanner.next();
			
			System.out.println("Escribe un Salario: ");
			double salario = scanner.nextDouble();
			
			System.out.println("Datos: " + id + "," + nombre + "," + salario);
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}
	
	//Método main para llamar a los métodos de lectura declarados arriba.
	public static void main(String[] args) {
		
		//llamada al método de lectura de datos con BufferedReader.
		leerBufferedReader();
		
		//llamada al método de lectura de datos con Scanner.
		leerScanner();
	
	}

}
