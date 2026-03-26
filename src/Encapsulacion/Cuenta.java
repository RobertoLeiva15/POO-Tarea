package Encapsulacion;

public class Cuenta {
	//ATRIBUTOS
	 private String titular;
	 private double saldo;
	 
	 public Cuenta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	 }
	 public void depositar(double monto) {
	        saldo += monto;
	    }
	 
	    public void retirar(double monto) {
	        if (saldo - monto >= 0) {
	            saldo -= monto;
	        } else {
	            System.out.println("No hay saldo suficiente");
	        }
	    }

	    public void mostrar() {
	        System.out.println("Titular: " + titular + " Saldo: " + saldo);
	    }
}
