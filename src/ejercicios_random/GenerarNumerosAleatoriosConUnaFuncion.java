package ejercicios_random;

import java.util.Scanner;

public class GenerarNumerosAleatoriosConUnaFuncion {
	

		public static int generaNumero(int num1, int num2){
	        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	    }
		
		
		public static void main(String[] args) {

			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Introduce el limite de numeros que quieres que genere");
			int limite = scanner.nextInt();
			
			System.out.println("Introduce un numero");
			int numero1 = scanner.nextInt();
			
			System.out.println("Introduce un numero");
			int numero2 = scanner.nextInt();
			
			for(int i = 0; i < limite; i++) {
				System.out.println(generaNumero(numero1, numero2));
			}
			
		}

		

	}

		



