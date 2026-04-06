package gettersySetters;

public class Estudiante {
	
	private int carnet;
	private String nombre;
	private float promedio;
	
	
	public int getCarnet() {
		return carnet;
	}
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		if(promedio< 0 && promedio> 100)
			throw new IllegalArgumentException("PROMEDIO INVALIDO...");
		this.promedio = promedio;
	}
	
	
	public boolean esBecado() {
		return promedio>=85;
			
		}
	}
	
	
	
	


