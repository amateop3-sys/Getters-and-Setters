package gettersySetters;

public class Contacto {
	
	
	private String nombre;
	private String telefono;
	private String email;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		if(!telefono.matches("\\d{8}")) // \\d: Representa cualquier dígito numérico. Se usa doble barra invertida \\ para escapar la secuencia, {8}: Indica que el dígito anterior debe repetirse exactamente 8 veces.
			throw new IllegalArgumentException("NÚMERO DE TELEFONO INVALIDO... DEBE TENER 8 DIGITOS.");
		this.telefono = telefono;
	}
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(!email.contains("@")) { // el contains sirve para verificar si una secuencia de caracteres (o un objeto) está presente dentro de otra cadena.
			throw new IllegalArgumentException("EMAIL INVALIDO... DEBE TENER @.");
		}
		this.email = email;
	}
	
	
	
	
	public void mostrarContacto() {
		System.out.println("TELÉFONO: "+ telefono);
		System.out.println("EMAIL: "+ email);
		
	}
	
	
	
	
	
	
	

}
