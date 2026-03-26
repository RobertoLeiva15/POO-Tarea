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
	
	//Clase Producto 
	System.out.println("\n===== PRODUCTO =====");

	Producto prod1 = new Producto("P01", "Laptop", 8000);
	Producto prod2 = new Producto("P02", "Mouse", 120);

	prod1.aplicarDescuento(10);
	prod2.aplicarDescuento(20);

	prod1.mostrar();
	prod2.mostrar();
	
	//Clase Cuenta
	System.out.println("\n===== CUENTA =====");
	
    Cuenta c1 = new Cuenta("Roberto", 1000);
    c1.depositar(500);
    c1.retirar(200);
    c1.retirar(2000); // prueba para el error
    c1.mostrar();
    
    //Clase Libro
    System.out.println("\n===== LIBRO =====");
    Libro l1 = new Libro("Viernes de Dolores", "Miguel Ángel Asturias", 200);
    Libro l2 = new Libro("Hombres de maíz", "Miguel Ángel Asturias", 400);
    Libro l3 = new Libro("El tiempo principia en Xibalbá", "Luis de Lión", 350);
    if (l1.esLargo()) {
        System.out.println("El libro 1 es largo");
    }
    if (l2.esLargo()) {
        System.out.println("El libro 2 es largo");
    }
    if (l3.esLargo()) {
        System.out.println("El libro 3 es largo");
    }
    
    //Clase Calculadora
    System.out.println("\n===== CALCULADORA =====");

    Calculadora calc = new Calculadora();

    System.out.println("Suma: " + calc.sumar(50, 20));
    System.out.println("Resta: " + calc.restar(25, 5));
    System.out.println("Multiplicacion: " + calc.multiplicar(15, 7));
    System.out.println("Division: " + calc.dividir(10, 0)); // prueba del error
    
    //Clase Fecha
    
    System.out.println("\n===== FECHA =====");

    Fecha f1 = new Fecha(10, 5, 2024);
    Fecha f2 = new Fecha(32, 13, 2024);
    Fecha f3 = new Fecha(25, 12, 2024);

    System.out.println("Fecha 1 valida: " + f1.esValida());
    System.out.println("Fecha 2 valida: " + f2.esValida());
    System.out.println("Fecha 3 valida: " + f3.esValida());
	}
}
