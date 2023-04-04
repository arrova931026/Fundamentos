package org.ejemplo.variables;

/* 
 * TIPOS DE DATOS PRIMITIVOS int, short, double, byte, float, double, string, 
 * 
 *  MODIFICADORES DE ACCESO public, private, protected
 *  
 * 	METODO PRINCIPAL DE UNA CLASE main
 *  
 *  
 *  */

public class Empleado {

	// VARIABLES
	
	int id;
	private short edad;
	protected long clave;
	double salario;
	float bono;
	char inicial;
	boolean confirmacion;
	String nombre;

	public static void main(String[] args) {
		// VARIABLE LOCAL
		int x = 10;
		System.out.println("El valor de X =" + x);
	}
	
}
