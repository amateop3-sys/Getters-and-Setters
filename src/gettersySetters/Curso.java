package gettersySetters;

public class Curso {
	
	private String nombreclase;
	private double nota1, nota2, nota3;
	
	
	
	public String getNombreclase() {
		return nombreclase;
	}


	
	public void setNombreclase(String nombreclase) {
		this.nombreclase = nombreclase;
	}

	
	

	public void setNota1(double nota1) {
		if(nota1>=0 && nota1<=100) this.nota1= nota1;
	}

	
	public void setNota2(double nota2) {
		if(nota2>=0 && nota2<=100) this.nota2= nota2;
		
	}
	
	
	public void setNota3(double nota3) {
		if(nota3>=0 && nota3<=100) this.nota3= nota3;
	}
	
	
	
	
	public double promedio() {
		return (nota1+nota2+nota3)/3;
	}
	
	
	
	public String estado() {
		return promedio() >=61? "APROVADO" : "REPROVADO";
		}
	}
	
	
	
	
	
	
	


