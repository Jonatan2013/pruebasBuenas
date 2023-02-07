package ejercicios_random;

import java.util.Random;

public class Dado2 {

	public static void main(String[] args) {
	
		
//		Random dado = new Random();
//		int aleatorio;
//		
//		for(int i =0; i < 10;i++) {
//			aleatorio = dado.nextInt(6) + 1; // en los parentesis se mete el num max., en este caso es el 6.
//			System.out.println(aleatorio);
//		}
		
		
		
		
		//////otra forma///////
		
		
		Random random = new Random();
		
		for (int i=0; i < 10; i++) {
	
			//int max = 6;
			//int min = 1; 
			//int numeroAleatorio = random.ints(min,max + 1).findAny().getAsInt();
			
			
			
			int numeroAleatorio = (int) (Math.random() * (6 - 1 + 1) + 1);
			System.out.println(numeroAleatorio);
		}




	}

}
