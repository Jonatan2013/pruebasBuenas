package ejercicios_random;

import java.util.Random;

public class RandomConFor {

	public static void main(String[] args) {

		
				///****numero Aleatorio en un RANGO con un FOR****/////
		
	
		
		Random dado = new Random();
		int aleatorio;
		
		
		for(int i= 0; i < 10; i++) {
				
			//aleatorio = dado.nextInt(10); cualquiera de las dos opcines sale lo musmo
			aleatorio = dado.nextInt(9) + 1;
			
			System.out.print(aleatorio);
						
		}
	

		
		
			///// intervalo numero aleatorio en 20 y 30*****////
		
		
		//Random dado = new Random();
//		int aleatorio;
//		
//		
//		for(int i= 0; i < 10; i++) {
//				
//			//aleatorio = dado.nextInt(10); cualquiera de las dos opcines sale lo musmo
//			aleatorio = dado.nextInt(30-20+1) + 20;
//			
//			System.out.print(aleatorio);
//			
//			
//		}
	
		

	}

}
