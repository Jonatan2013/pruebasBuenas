package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LlenarUnArraysChar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
		
		char [] letras = new char[nElementos];
		
		System.out.println("Digite los elementos del arreglo: ");
		
		for(int i = 0; i < nElementos;i++) {
			System.out.println("Digite un caracter");
			letras[i] = scanner.next().charAt(0);
			
		}
		
		System.out.println("\n Los caracterres del arreglo son: ");
		for(int i = 0; i < nElementos;i++) {
			System.out.println(letras [i] + " ");
		}
		
		
		scanner.close();

	}

}
