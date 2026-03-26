package Encapsulacion;

public class Main {
	
	//Clase Persona
	public static void main(String[] args) {
	System.out.println("===== PERSONA =====");
	
	Persona p1=new Persona("Roberto", "Leiva", 19);
	Persona p2=new Persona("Carmen", "Salazar", 41);
	Persona p3=new Persona("Mynor", "Leiva", 43);
	
	p1.mostrar();
	p2.mostrar();
	p3.mostrar();
	
	//Clase Rectangulo
	System.out.println("\n===== RECTANGULO =====");
	
	Rectangulo r1=new Rectangulo(5,3);
	Rectangulo r2=new Rectangulo(8,6);
	
	System.out.println("Area r1: " + r1.area());
	System.out.println("Area r2: " + r2.area());
	
	if (r1.area() > r2.area()) {
	    System.out.println("El rectángulo 1 tiene mayor área");
	} else if (r2.area() > r1.area()) {
	    System.out.println("El rectángulo 2 tiene mayor área");
	} else {
	    System.out.println("Ambos tienen la misma área");
	}
	}
}
