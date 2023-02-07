package arrays;

import java.util.Scanner;

public class PruebaMia {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		int a [] = new int[10];
		int b [] = new int[10];
		int c [] = new int[20];
		
		
		System.out.println("Rellene el arreglo A: ");
		for(int i = 0; i < 10; i++) {
			System.out.print((i +1 ) + ". Digite un numero: ");
			a[i] = scanner.nextInt();
		}

		
		
		
		System.out.println("\nRellene el arreglo B: ");
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduzca numero: ");
			b[i] = scanner.nextInt();
		}
		
		
		
		
		System.out.println("Arreglo C: :");
		
		
		int j=0;
		
		for(int i = 0; i < 10; i++) {
			
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		
		
		System.out.println("\nLos datos del arreglo A son:");
		for(int arreglo : a) {
			System.out.print(arreglo + " - ");
		}
		
		
		System.out.println("\nLos datos del arreglo B son:");
		for(int arregloB : b) {
			System.out.print(arregloB  + " - ");
		}
		
		
		
		System.out.println("\nLos datos del arreglo C son:");
		for(int arregloC : c) {
			System.out.print(arregloC + " - ");
		}
		
		
		
		
	}

}
