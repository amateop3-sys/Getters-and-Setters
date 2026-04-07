package gettersySetters;

import java.util.Scanner;

public class Main {

	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// EJERCICIO 1
		Persona p1= new Persona();
	
		// try y catch para el main
		try {
			System.out.println("INGRESE SU EDAD: ");
			int edad= entrada.nextInt();
			p1.setEdad(edad);
			System.out.println("SE AGUARDÓ CORRECTAMENTE..");
			}
		
			
		catch (Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine(); // limpia el buffer
			
	
		}

		System.out.println("-------------------------------");
		
		// EJERCICIO 2
		Producto pr1= new Producto();
		
		try {
		
		System.out.println("PRECIO: ");
		double precio= entrada.nextDouble();
		pr1.setPrecio(precio);
		
		System.out.println("STOCK: ");
		int stock= entrada.nextInt();
		pr1.setStock(stock);
		
		System.out.println("CANTIDAD: ");
		int cantidad= entrada.nextInt();
		pr1.vender(cantidad);
		
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
		entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
	
		
		// EJERCICIO 3
		CuentaBancaria cb1= new CuentaBancaria();
		try {
			System.out.println("MONTO A RETIRAR: ");
			double monto= entrada.nextDouble();
			
			System.out.println("PIN: ");
			int pin= entrada.nextInt();
			
			cb1.retirar(monto, pin);
			
		}catch(Exception e) {
			System.out.println("ERROR "+e.getMessage());
			entrada.nextLine();
		}
		
		
		
		System.out.println("-------------------------------");
		
		
		
		// EJERCICIO 4
		Curso c1= new Curso();
		try {
			
			System.out.println("NOTA 1: ");
			c1.setNota1(entrada.nextDouble());
			
			System.out.println("NOTA 2: ");
			c1.setNota2(entrada.nextDouble());
			
			System.out.println("NOTA 3: ");
			c1.setNota3(entrada.nextDouble());
			
			System.out.println("PROMEDIO: "+ c1.promedio());
			System.out.println("ESTADO: "+ c1.estado());
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		
		
		
		// EJERCICIO 5
		Estudiante e1= new Estudiante();
		try {
			
			System.out.println("PROMEDIO: ");
			e1.setPromedio(entrada.nextFloat());
			
			System.out.println("ES BECADO?: "+ e1.esBecado());
			
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		
		
		// EJERCICIO 6
		Termometro t1= new Termometro();
		try {
			
			System.out.println("TEMPERATURA EN GRADOS CELSIUS: ");
			t1.setCelsius(entrada.nextDouble());
			
			System.out.println("TEMPERATURA EN GRADOS FAHRENHEIT: "+ t1.getFahrenheit());
			
			
	    	}catch(Exception e) {
	    	System.out.println("ERROR "+ e.getMessage());
		    entrada.nextLine();
		  }
		
		
		System.out.println("-------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
