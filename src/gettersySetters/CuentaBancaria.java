package gettersySetters;

public class CuentaBancaria {
	
	
	private String titular;
	private double saldo=5000;
	private int pin=123;
	
	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public void retirar(double monto, int pinIngresado) {
		
		if(pinIngresado!=pin)
		{
			System.out.println("PIN INCORRECTO..");
			}
		
		
		if(monto>saldo) {
			
			throw new IllegalArgumentException("FONDO INSUFICIENTE");
		}
		
		
		
		saldo-=monto;
		System.out.println("RETIRO EXITOSO");
		System.out.println("SALDO RESTANTE: "+saldo);
		
		
	}
	

}
