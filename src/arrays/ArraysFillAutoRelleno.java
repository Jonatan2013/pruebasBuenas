package arrays;

import java.util.Arrays;

public class ArraysFillAutoRelleno {

	public static void main(String[] args) {
	
		

	//inicializo en las 6 posiscione sque hay son el valor 1234 en todas.(Arrays.fill)
		
		
//
//				int sueldo [] =  new int [5];
//
//
//				Arrays.fill(sueldo, 1234);
//				System.out.println(Arrays.toString(sueldo));




		// Valor por defecto con el metodo FILL de la clase Arrays y aumentar sueldo en cada iteracion (Arrays.fill)
				
				

			double [] sueldos = new double [10];
			
			Arrays.fill(sueldos, 0 , 5, 500);	
			Arrays.fill(sueldos, 5, 10, 1000); // desde la posicion 5 a la 10 un valor por defecto, 1000.
			
			for(int i = 0; i < sueldos.length; i++) {
				
			sueldos[i] +=  (0.5* sueldos[i]);
			System.out.println(sueldos[i]);
				
			}

		
		
		
		
		
		
		
		
		

	}

}
