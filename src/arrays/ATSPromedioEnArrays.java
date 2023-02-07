package arrays;
//video: 45
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSPromedioEnArrays {

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		 
		 int contadorCeros = 0;
		 int contadorNumerosPositivos = 0;
		 int contadorNumeroNegativos = 0;
		 
		 float sumaNumerosPositivos=0;
		 float sumaNumerosNegativos=0;
		 float mediaPositivos;
		 float mediaNegativos;
		 
		 
		 
		 float [] numeros = new float[5];
		 
		 System.out.println("Rellenando y guardando datos en el arreglo");
		 System.out.println();
		 
		 for(int i = 0; i < numeros.length;i++) {
			 
			 
			 numeros [i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) +". Introduce numero"));
			 
			
			 
			 if(numeros[i] == 0) {
				 contadorCeros++;
			 }else if(numeros[i] > 0 ) {
				 contadorNumerosPositivos++;
				 sumaNumerosPositivos += numeros[i];
			 }else {
				 contadorNumeroNegativos++;
				 sumaNumerosNegativos += numeros[i];
			 }
			 
			
			
		 }
		
		 
	
		 
		 
		 // media de los numeros positivos
		 
		 if(contadorCeros == 0) {
			 System.out.println("No se puede sacar la media de los numeros positivos (ya que es 0)  ");
		 }else {
			 mediaPositivos = sumaNumerosPositivos / contadorNumerosPositivos;
			 System.out.println("La media de numeros positivos es: " + mediaPositivos);
		 }
		 
		 
		 
		 // media de los numeros negativos
		
		 if(contadorCeros == 0) {
			 System.out.println("No se puede sacar la media de los numeros negativos (ya que es 0)");
		 }else {
			 mediaNegativos = sumaNumerosNegativos / contadorNumeroNegativos; 
			 System.out.println("La media de numeros negativos es: " + mediaNegativos);
		 }
		 
		 
		 
		 
		 
		 System.out.println("La cantidad de numero de ceros es:  " + contadorCeros);
		 
		 System.out.println("\n El arreglo esta compuesto por los siguientes numeros: ");
		 
		 	for(float i : numeros) {
		 		System.out.println(i);
		 	}
		
		 
		 	//Lo que hace este parte del codigo es que el Primer y el ultimo dato sean los dos primeros, el segnudo y penultimo dato sean los terceros y cuartos y asi sucesivamente....
		 	
		 	
		  float salario[] = new float[10];
		       
		  System.out.println("\n\nIntroduce los datos del segundo arreglo");
		 	  
		        // Solicitar numeros
		   for(int i = 0; i < salario.length ; i++){
		       salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el " + (i+1) + "° numero"));
		   }
		        
		        //Ordenarlos
		    for (int i = 0 ; i < (salario.length/2) ; i++){ //.length Se divide por dos, porque en cada ciclo imprimirá dos resultados
		        System.out.println(salario[i]); //Imprime el elemento del indice segun i
		        System.out.println(salario[(salario.length-1) - i]); // Arroja primero el último elemento (con .lenght-1) luego se le resta el i 
		    } 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		//// OTRO EJERCICIO IGUAL PERO CAMBIANDO EL NOMBRE DEL ARRAY, NADA MAS
		 	
//		 	int contadorCeros = 0;
//			int contadorNumerosPositivos = 0;
//			int contadorNumerosNegativos = 0;
//			
//			float sumaNumerosPositivos = 0;
//			float sumaNumerosNegativos = 0;
//			
//			float mediaNumerosPositivos;
//			float mediaNumerosNegativos;
//			
//			
//			float [] salario = new float [5];
//			
//			for(int i = 0; i < salario.length;i++) {
//				
//				salario[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce salario"));
//				
//				
//				if(salario[i] == 0) {
//					contadorCeros++;
//					
//				}else if(salario[i] > 0) {
//					contadorNumerosPositivos++;
//					sumaNumerosPositivos += salario[i];
//					
//				}else {
//					contadorNumerosNegativos++; // se que no hay salarios negativos pero supongamos que lo negativo son adelantos, embargos, etc.
//					sumaNumerosNegativos += salario[i];
//				}
//				
//				
//			}
//			
//			//La media de numerosPositivos
//			
//			if(contadorCeros == 0) {
//				System.out.println("No se puede hacer la media ya que es 0 (con cero imposible la media)");
//			}else {
//				mediaNumerosPositivos = sumaNumerosPositivos / contadorNumerosPositivos;
//				System.out.println("La media de salario positivos es: " + mediaNumerosPositivos);
//			}
//			
//			
//			//La media para numeros negativos
//			
//			if(contadorCeros == 0) {
//				System.out.println("No se puede hacer la media ya que es 0 (con cero imposible la media)");
//			}else {
//				mediaNumerosNegativos = sumaNumerosNegativos / contadorNumerosNegativos;
//				System.out.println("La media de salarios negativos (embargos, adelantos..) es de: " + mediaNumerosNegativos);
//			}
//			
//			System.out.println("La cantidad de numeros con Cero es: " + contadorCeros);
//			
//			System.out.println("\n El arreglo esta compuesto por los siguientes numeros");
//			
//			for(float i : salario) {
//				System.out.println(i);
//			}
//		 	
//		 	
//		 	
//		 	
//		 	
		 	
		 	
	
		
		 
	}

}
