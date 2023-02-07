package arrays;

import java.util.Arrays;

public class CompararArraysEquals {

	public static void main(String[] args) {

		
		//COMPARACIN DE DOS TABLAS _(Arrays.equals)
		
		
			//double sueldos [] = new double [5];
			//double pagaExtra [] = new double [5];
			//
			//System.out.println(sueldos == pagaExtra); // me saldra false aunque en este momento son iguales , 0, ya que las referencias de las tablas son diferentes, ubicaciones.
			//
			
			//double sueldos[] = {1000, 1500, 2000};
			//double pagaExtra[] = {1000, 1500, 2000};
			//System.out.println(Arrays.equals(sueldos, pagaExtra));// nos salda true ya que con el metodo EQUALS comparamos los valores, y es true porque tienen los mismo valores en el mismo orden.

					
		int sueldo[] = {1000, 1500, 5000};
		int pagaExtra[] = {1000, 1500, 5000};
		
		System.out.println(sueldo==pagaExtra);// asi no comparas valores solo referencias por lo tanto es FALSE
		
		System.out.println(Arrays.equals(sueldo, pagaExtra)); // aqui si comparamos valores, y como son iguales en valores t orden...TRUE
		
		
		
		
		
		
		
		
		
		
		
	}

}
