package POO;

import java.util.ArrayList;
import java.util.Scanner;

//video 78 y 79 y 80: como calcular areas de poligonos
public class ATSEjercicioPoligonoMain {

	
	
							//**ARREGLO DINAMICO**//
	
	//no tengo que decirle en un principio cuantos elementos va a tener si no que segun voy mnetiendo elementos el arrayList sabe los elementos que tiene en ese momento el arreglo
	
	static ArrayList <ATSEjercicioPoligono> poligono = new ArrayList <ATSEjercicioPoligono>();
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		llenarPoligono(); //llamar a poligono
		
		//mostrar los datos y el area de cada poligono
		
		mostrarResultados();
		
		
		
		
		
	
		//LLENAR UN POLIGONO

	}
	
	
	public static void llenarPoligono() {
		
		char respuesta;
		int opcion;
		
		do {
			
			do {
			
				System.out.println("Digite el poligono que deseas (triangulo o rectangulo) ");
				System.out.println("1. Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Opcion: ");
				opcion = scanner.nextInt();
			}while(opcion <1 || opcion >2);
			
			switch(opcion) {
			
			case 1 : llenarTriangulo(); //Lenar un triangulo
					break;
			
			case 2: llenarRectangulo();//Lenar un rectangulo		
					break;
			
			
			}
			System.out.println("\nDesea introducir otro poligono(s/n)");
			respuesta = scanner.next().charAt(0);
			System.out.println("");
			
		}while(respuesta =='s' || respuesta == 'S');	
	}
	
	
	public static void llenarTriangulo() { // con static nos aseguramos que solo se usara en esta clase
		double lado1, lado2, lado3;
		
	
		System.out.println("Digite el lado 1 del triangulo: " );
		lado1 = scanner.nextDouble();
		

		System.out.println("Digite el lado 2 del triangulo: " );
		lado2 = scanner.nextDouble();
		

		System.out.println("Digite el lado 3 del triangulo: " );
		lado3 = scanner.nextDouble();
		
		ATSEjercicioTriangulo triangulo = new ATSEjercicioTriangulo(lado1, lado2, lado3); 
		
		//guardamos un triangulo dentro de nuestro areglo poligonos
		poligono.add(triangulo); 
	}
	
	public static void llenarRectangulo() {
		double lado1, lado2;
		
		System.out.println("Digite el lado1 del rectangulo: ");
		lado1 = scanner.nextDouble();
		
		System.out.println("Digitanos el lado 2: ");
		lado2 = scanner.nextDouble();
		
		ATSEjercicioRectangulo rectangulo = new ATSEjercicioRectangulo(lado1, lado2);
		
		poligono.add(rectangulo); // llenamos el array poligono con el objeto rectangulo
		}
	
	public static void mostrarResultados() {
		
		//recorreidno el arreglo de poliognos
		for(ATSEjercicioPoligono poli : poligono) {
			System.out.println(poli.toString()); //muestra los datos
			System.out.println("Area= " + poli.area());//muestra el area
			System.out.println("");
		}
	}
}
