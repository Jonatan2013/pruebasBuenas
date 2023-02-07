package ejercicios_random;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Adivinar2 {

	public static void main(String[] args) {

		
//		int numero=0;
//		int aleatorio;
//		int contador = 0;
//		
//		
//		
//		aleatorio = (int) (Math.random() * 100);
//		
//		
//		boolean bandera = false;
//		while(aleatorio != numero && contador < 5) {
//			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
//			
//		if(aleatorio > numero) {
//			System.out.println("introduce un numero mayor");
//			contador++;
//		}else {
//			System.out.println("introduce un numero menor");
//			contador++;
//			
//			}
//			
//		}
//		
//		System.out.println("\n El numero aleatorio es: " + aleatorio);
//		System.out.println("\n Enorabuena adivinastes el numero!!!!");
//		System.out.println("\n Has necesitado: " + contador + " intentos");
//		
//		
//		
		
		
		
					////	********otra forma de hacerlo **********////
		
		Random random = new Random();
		
		int max = 100;
		int min = 1; 
		int contador=0;
		
		int numeroAleatorio = random.ints(min,max + 1).findAny().getAsInt();
		
		Scanner scanner =new Scanner(System.in);
		int numeroIntroducido=0;
		
		while (numeroIntroducido!=numeroAleatorio && contador<5) {
			
			System.out.println("Introduce un numero del 1 al 100");
			numeroIntroducido =scanner.nextInt();
			
			if (numeroIntroducido<numeroAleatorio){
				System.out.println("es mayor");
				contador++;
			}
			else if (numeroIntroducido>numeroAleatorio){
				System.out.println("es menor");
				contador++;
				
			}
			
		}
		System.out.println(numeroAleatorio);
		System.out.println("has necesitado " + contador + " " + "intentos");
		
		
		
		
	}

}
