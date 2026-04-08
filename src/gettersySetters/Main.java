package gettersySetters;

import java.util.Scanner;

public class Main {

	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// EJERCICIO 1
		System.out.println("**** PERSONA ****");
		Persona p1= new Persona();
	
		// vulve a pedir el dato si no es valido
		while(true) {
			
		// try y catch para el main
		try {
			System.out.println("INGRESE SU EDAD: ");
			int edad= entrada.nextInt();
			p1.setEdad(edad);
			System.out.println("SE AGUARDÓ CORRECTAMENTE..");
			break; // evita que el while se vuelva infinito
			}
		
			
		catch (Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine(); // limpia el buffer
			
	
		}
		

		System.out.println("-------------------------------");
		}
		
		
		
		
		
		// EJERCICIO 2
		System.out.println("-------------------------------");
		System.out.println("**** PRODUCTO ****");
		Producto pr1= new Producto();
		
		while(true) {
			
		
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
		break;
		
		
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
		entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		}
		
		
		
		
	
		
		// EJERCICIO 3
		System.out.println("-------------------------------");
		System.out.println("**** CUENTA ****");
		CuentaBancaria cb1= new CuentaBancaria();
		
		while(true) {
		
		try {
			System.out.println("MONTO A RETIRAR: ");
			double monto= entrada.nextDouble();
			
			System.out.println("PIN: ");
			int pin= entrada.nextInt();
			
			cb1.retirar(monto, pin);
			
			break;
			
		}catch(Exception e) {
			System.out.println("ERROR "+e.getMessage());
			entrada.nextLine();
		}
		
		
		
		System.out.println("-------------------------------");
		
		}
		
		
		
		
		
		
		// EJERCICIO 4
		System.out.println("-------------------------------");
		System.out.println("**** CURSO Y CALIFICACIONES ****");
		Curso c1= new Curso();
		
		while(true) {
		
		try {
			
			System.out.println("NOTA 1: ");
			c1.setNota1(entrada.nextDouble());
			
			System.out.println("NOTA 2: ");
			c1.setNota2(entrada.nextDouble());
			
			System.out.println("NOTA 3: ");
			c1.setNota3(entrada.nextDouble());
			
			System.out.println("PROMEDIO: "+ c1.promedio());
			System.out.println("ESTADO: "+ c1.estado());
			
			break;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		}
		
		
		
		
		// EJERCICIO 5
		System.out.println("-------------------------------");
		System.out.println("**** ESTUDIANTE Y BECA ****");
		Estudiante e1= new Estudiante();
		
		while(true) {
		
		try {
			
			System.out.println("PROMEDIO: ");
			e1.setPromedio(entrada.nextFloat());
			
			System.out.println("ES BECADO?: "+ e1.esBecado());
			
			break;
			
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		}
		
		
		
		
		// EJERCICIO 6
		System.out.println("-------------------------------");
		System.out.println("**** TERMOMETRO INTELIGENTE ****");
		Termometro t1= new Termometro();
		
		while(true) {
		
		try {
			
			System.out.println("TEMPERATURA EN GRADOS CELSIUS: ");
			t1.setCelsius(entrada.nextDouble());
			
			System.out.println("TEMPERATURA EN GRADOS FAHRENHEIT: "+ t1.getFahrenheit());
			
			break;
			
	    	}catch(Exception e) {
	    	System.out.println("ERROR "+ e.getMessage());
		    entrada.nextLine();
		  }
		
		
		System.out.println("-------------------------------");
		}
		
		
		
		
		// EJERCICIO 7
		System.out.println("-------------------------------");
		System.out.println("**** RELOJ CON FORMATO ****");
		Reloj r1= new Reloj();
		
		while(true) {
		
		try {
			System.out.println("HORA: ");
			r1.setHora(entrada.nextInt());
			
			System.out.println("MINUTOS: ");
			r1.setMinuto(entrada.nextInt());
			
			System.out.println("SEGUNDOS: ");
			r1.setSegundo(entrada.nextInt());
			
			System.out.println("LA HORA ES: "+ r1.mostrarHora());
			
			
			break;
			
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine();
		}
		
		
	
		
		System.out.println("-------------------------------");
		}
		
		
		
		
		
		
		
		// EJERCICIO 8
		System.out.println("-------------------------------");
		System.out.println("**** CONTACTO CON TELÉFONO ****");
		Contacto con1= new Contacto();
		
		while(true) {
		
		try {
			
			entrada.nextLine();
			
			System.out.println("INGRESE SU NÚMERO DE TELEFONO: ");
			con1.setTelefono(entrada.nextLine());
			
			
			System.out.println("INGRESE SU EMAIL: ");
			con1.setEmail(entrada.nextLine());
			
			con1.mostrarContacto();
			
			break;
			
		}catch(Exception e) {
			System.out.println("ERROR "+ e.getMessage());
			entrada.nextLine();
		}
		
		
		System.out.println("-------------------------------");
		}
		
		
		
		
		
		// EJERCICIO 9
		System.out.println("-------------------------------");
		System.out.println("**** JUEGO CON PUNTAJE MÁXIMO ****");
		Jugador j1= new Jugador();
		

			while(true) {
			    try {
			

			        System.out.print("Nombre Jugador 1: ");
			        j1.setNombre(entrada.nextLine());

			        System.out.print("Puntaje Jugador 1: ");
			        int punteo1 = entrada.nextInt();

			        j1.actualizarPuntaje(punteo1);

			        break;

			    } catch (Exception e) {
			        System.out.println("ERROR: " + e.getMessage());
			        entrada.nextLine();
			    }
			}

			System.out.println("Jugador 1: " + j1.getNombre());
			System.out.println("Puntaje: " + j1.getPuntajeActual());
			System.out.println("Máximo: " + j1.getPuntajeMaximo());

		
		System.out.println("-------------------------------");
	
		
		
		
		
		// EJERCICIO 10
		System.out.println("-------------------------------");
		System.out.println("**** FACTURA CON TOTAL ****");
		Factura f1= new Factura();
		
		while(true) {
		
		try {
			
			f1.setCodigoFactura("2026-FAC-001");
			f1.setDescripcion("LITRO DE COCA-COLA");
			
			System.out.println("CANTIDAD: ");
			f1.setCantidad(entrada.nextInt());
			
			System.out.println("PRECIO UNITARIO: ");
			f1.setPrecioUnitario(entrada.nextDouble());
			
			
			f1.mostrarFactura();		
			
			break;
			
		}catch(Exception e) {
			System.out.println("ERRRO "+ e.getMessage());	
	
		}
		}
		
		// termina el programa
		entrada.close();
		
		
		
		
		
		
		
	}

}
