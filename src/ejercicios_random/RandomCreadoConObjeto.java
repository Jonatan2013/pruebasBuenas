package ejercicios_random;

import java.util.Random;

public class RandomCreadoConObjeto {

	public static void main(String[] args) {

///****hacerlo con la CLASE Ramdom *** creando un objeto****////
		
		
		int aleatorio = 0;
		
		Random r = new Random();
		
		aleatorio = (int) (r.nextDouble() * 100); // en el Double puedo poner otros tipos de datos....
		System.out.println(aleatorio);
		
	
		
	}

}
