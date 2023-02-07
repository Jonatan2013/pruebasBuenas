package arrays;

import java.util.Arrays;

public class OrdenarArraysAscDesc {

	public static void main(String[] args) {

						// sirve para ordenadar de forma ASCENDENTE una tabla (Arrays.sort)
		
		
		
								//Arrays.sort(datos);
		
		
//		int [] arreglo = new int [3];
//		arreglo[0]= 10;
//		arreglo[1]= 150;
//		arreglo[2]= 20;
//		
//		Arrays.sort(arreglo);
//		
//	System.out.println(Arrays.toString(arreglo));
//	
//		// otra forma de recorrer la tabla y printarla
//		for(int i = 0; i < arreglo.length;i++) {
//			System.out.println(arreglo[i]);
//		}
//		
//


				// Sirve para ordenadar de forma DESCENDENTE una tabla (Arrays.sort)
		
		
		int [] arreglo = new int [3];
		arreglo[0]= 10;
		arreglo[1]= 150;
		arreglo[2]= 20;
		

		Arrays.sort(arreglo);
		
		
		
		for(int i = arreglo.length-1; i >=0 ; i--) {
			System.out.println(arreglo[i]);
			//solo uno de los dos system,, son validos los dos
			//System.out.println(Arrays.toString(arreglo));
	}

			

	}

}
