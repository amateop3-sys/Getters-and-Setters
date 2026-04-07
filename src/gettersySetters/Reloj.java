package gettersySetters;

public class Reloj {
	
	
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora<0 && hora>23) {
			throw new IllegalArgumentException("HORA INVALIDA...");
			
		}
		this.hora = hora;
		
		
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto<0 && minuto >59) {
			throw new IllegalArgumentException("MINUTO INVALIDO...");
		}
		this.minuto = minuto;
		
		
		
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo<0 && segundo>59) {
			throw new IllegalArgumentException("SEGUNDO INVALIDO...");
		}
		this.segundo = segundo;
	}
	
	
	
	public String mostrarHora() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
