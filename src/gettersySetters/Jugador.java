package gettersySetters;

public class Jugador {
	
	
	private String nombre;
	private int puntajeActual;
	private int puntajeMaximo;
	
	
	
	
	
	public void actualizarPuntaje(int nuevoPuntaje) {
		if(nuevoPuntaje<0) {
			throw new IllegalArgumentException("NUEVO PUNTAJE INVALIDO...");
		}
		
		puntajeActual=nuevoPuntaje;	
		
	
	
	

	if(nuevoPuntaje>puntajeMaximo) {
		puntajeMaximo= nuevoPuntaje;
	}
		
}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getPuntajeActual() {
		return puntajeActual;
	}





	public void setPuntajeActual(int puntajeActual) {
		this.puntajeActual = puntajeActual;
	}





	public int getPuntajeMaximo() {
		return puntajeMaximo;
	}





	public void setPuntajeMaximo(int puntajeMaximo) {
		this.puntajeMaximo = puntajeMaximo;
	}









	
	
	
	
}