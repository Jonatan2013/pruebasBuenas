package arrays;
//video: 50 ejercicio separa los numeros pares e impares de un arreglo
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSInsertarUnNumeroEnUnArregloOrdenado {
//Leer 10 enteros en una tabla. Guardar en otra tabla los elemnetos pares de la primera y a conticunacion los elementos impares.
	
	//video 50 array
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		int arreglo [] = new int [10]; // creamos el arreglo para 10 elementos
		int conteo_pares = 0, conteo_impares=0;
		
		System.out.println("Llenar el arreglo");
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ". Digite un numero:  ");
			arreglo[i] = scanner.nextInt();
			
			if(arreglo[i] % 2 == 0) {
				conteo_pares++;
			}else {
				conteo_impares++;
			}
		}
		
				//crear los siguientes arreglos
		
		int par [] = new int[conteo_pares];// creamos el arreglo para almacenar los numeros pares,,entre corchete va conteo_pares para que asi cree los espacios de memoria al igual que los numeros pares
		int impares [] = new int[conteo_impares];// creamos el arreglo para almacenar los numeros pares,,entre corchete va conteo_pares para que asi cree los espacios de memoria al igual que los numeros impares
		
		int conteo_pares = 0;//el iterador de pares
		int conteo_impares = 0; // eñ iteredor de impares
		
		//Almacenamos los numeros pares en su arreglo y los impares tambien
		
		for(int i = 0; i <10;i++) {
			if(arreglo[i] % 2 == 0) {
				par[conteo_pares] = arreglo[i];
				conteo_pares++; 
			}else {
				impares[conteo_impares] = impares[i];
				conteo_impares++;
			}
		}
		
		System.out.println("\n Arreglo pares: ");
		for(int i = 0;i<10;i++) {
			System.out.println(par[i] + " - ");
		}
		System.out.println("");
		
		System.out.println("\n Arreglo impares: ");
		for(int i = 0; i <10;i++) {
			System.out.println(impares[i] + " - ");
		}
		System.out.println("");
		
		
		
		
		
		
		///***EJERCICIO 14: LEER DOS SERIES DE 10 ENTEROS, QUE ESTARN ORDENADOS CRECIENTEMENTE. cOPIAR (FUSIONAR) LAS DOS TABLAS EN UNA TERCERA DE FORMA QUE SIGAN ORDENADOS.
		
//		int serie1[] = {2,12,13,20,25,33,36,37,38,39};
//		int serie2[] = {11,14,15,16,17,18,22,40,45,50};
//		int fusion[] = new int[20];
//		int ite_serie1=0, ite_serie2=0, ite_fusion=0;
//
//		while(ite_serie1<10 || ite_serie2<10){                  // mientras haya una serie sin recorrer por completo
//
//		    if(ite_serie1<10 && ite_serie2<10){                 // si no se ha excedido la dimensión de alguna serie
//		        if(serie1[ite_serie1] < serie2[ite_serie2]){    // si el valor menor es de la serie 1
//		            fusion[ite_fusion] = serie1[ite_serie1];    // agregamos el valor de serie 1
//		            ite_fusion++;                               // incrementamos el iterador de la fusion
//		            ite_serie1++;                               // incrementamos el iterador de la serie 1
//
//		        } else {                                        // sino, si el valor menor es de la serie 2
//		            fusion[ite_fusion] = serie2[ite_serie2];    // agregamos su valor
//		            ite_fusion++;                               // incrementamos el iterador de la fusión
//		            ite_serie2++;                               // incrementamos el iterador de la serie 2
//		        }
//		    } else if (ite_serie1<10 && ite_serie2>9) {         // si aun quedan valores en la serie 1 y terminamos con la serie 2
//		        fusion[ite_fusion] = serie1[ite_serie1];        // agregamos el valor de serie 1
//		        ite_fusion++;                                   // incrementamos el iterador de la fusión
//		        ite_serie1++;                                   // incrementamos el iterador de la serie 1
//
//		    } else {                                            // si aun quedan valores de la serie 2 y terminamos con la serie 1
//		        fusion[ite_fusion] = serie2[ite_serie2];        // agregamos el valor de serie 2
//		        ite_fusion++;                                   // incrementamos el iterador de la fusión
//		        ite_serie2++;                                   // incrementamos el iterador de la serie 2
//		    }
//		}
//
//		System.out.println("La fusión de las dos series es: ");
//		for(int i:fusion){
//		    System.out.print(i+" ");                            // imprimimos la fusión de las 2 series
//		}
//		System.out.println(" ");
//		
		
		
		
		
		
		
		
		
	}

}
