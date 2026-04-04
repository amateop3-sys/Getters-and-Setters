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
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
