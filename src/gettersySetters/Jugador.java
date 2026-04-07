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
		
	
	
	
	System.out.println("PUNTAJE NUEVO: "+ puntajeActual);
	System.out.println("PUNTAJE MAXIMO: "+puntajeMaximo);
	
	
	

}
}