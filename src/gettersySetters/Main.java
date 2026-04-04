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
			
		System.out.println("-------------------------------");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
