package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSArraysFormaCrecienteYDecreciente {

	public static void main(String[] args) {
	//LEER POR TECLADO UNA SERIE DE 10 NUMEROS ENTEROS. lA APLICACIN DEBE INDICARNOS SI LOS NUMEROS ESTAN ORDENADOS, CRECIENTE O DECRECIENTE O QUE SEAN IGUALES.
		
		
		Scanner scanner = new Scanner (System.in);
		
		int arreglo [] = new int [10]; 
		boolean creciente = false, decreciente = false;
		

		System.out.println("Llenar el arreglo");
		
		for(int i = 0; i < arreglo.length;i++ ) {
			
			//arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			
			System.out.print((i + 1) + ". Digite un numero:  ");
			arreglo[i] =  scanner.nextInt();
		}
		
		// creamos  el codigo para ver si son creciente/decreciente/desordenados/iguales
		
		for(int i = 0;i < 9; i++) {
			
			if(arreglo[i] < arreglo[i+1]) { // creciente 1-2-3-4
				creciente = true;
			}
			
			if(arreglo[i] > arreglo[i + 1]) {// decreciente4-3-2-1
				decreciente =true;
			}
			
		}
		 
		System.out.println();
		if(creciente == true && decreciente == false) {
			System.out.println("La serie de numero esta en forma ascendente");
		}else if(creciente == false && decreciente == true) {
			System.out.println("La serie esta en forma decreciente");
		}else if(creciente == true && decreciente ==true) {
			System.out.println("La serie de numeros esta desordenado");
		}else if(creciente == false && decreciente == false) {
			System.out.println("Todos los numeros de la serie son iguales.");
		}
		
		
		
		
		
		
		
		
		
		//EJERCICIO 8 DEL VIDEO ARRAYS Nº47
		
//		  Scanner entrada = new Scanner(System.in);
//	        int a[] = new int[10];
//	        int numero, posicion;
//
//	// Introduciendo los primeros 8 elementos del arreglo.
//	        for (int i = 0; i < 8; i++) {
//	            System.out.print((i + 1) + ". Digite un número: ");
//	            a[i] = entrada.nextInt();
//	        }
//
//	// Ingresar 2 número en posiciones determinadas por el usuario.
//	        for (int i = 0; i < 2; i++) {
//	            
//	            System.out.print("\nDigite una posición entre 1-10 del arreglo "
//	                           + "\ndonde quiere ingresar el número anterior: ");
//	            posicion = entrada.nextInt();
//	            
//	            System.out.print("\nDigite un número más para ingresar: ");
//	            numero = entrada.nextInt();
//	            
//	            int cont = 9;
//	            for (int j = cont; j >= posicion; j--) {
//	                a[j] = a[j - 1];
//	            }
//	            a[posicion-1] = numero;
//	                        
//	        }
//	        
//	// Imprimiendo el arreglo.
//	        System.out.print("El arreglo es: ");
//	        for (int i = 0; i < 10; i++) {
//	            System.out.print(a[i] + ", ");
//	        }
//	        System.out.print("\b\b.");
//		
	}

}
