package gettersySetters;

public class Persona {
	

	// atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	
	

	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public int getEdad() {
		return edad;
	}




	

	// throw new para las clases
	public void setEdad(int edad) {
		
		if(edad<0) {
			throw new IllegalArgumentException("EL VALOR ES NEGATIVO, INGRESE UNO VALIDO...");
		}
		this.edad = edad;
	}





	public void mostrarPersona() {
		
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su apellido es: "+apellido);
		System.out.println("Su edad es: "+edad);
		
		

}
}