package ejercicios_random;

import java.util.Random;

public class SorteoDeLetras {

	public static void main(String[] args) {

		Random random = new Random();
		
		char aleatorio = (char)(random.nextInt(26) + 'a');
		System.out.println(aleatorio);
		
		
		
		

	}

}
