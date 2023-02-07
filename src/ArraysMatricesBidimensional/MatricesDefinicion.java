package ArraysMatricesBidimensional;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatricesDefinicion {
//definicion de matriz,,,video 55
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		//***forma muy simple,,rellenandolo manualmente
//		int matriz [] [] = {{1,2,3}, {4,5,6}, {7,8,9}}; //matriz de 3*3*--3 filas 3 columnas
//		
//		for(int i= 0; i < 3;i++) {//numero de filas...el primer for para las filas
//			for(int j= 0; j <3;j++) {//numero de columnas..el segundo for para las columnas
//				System.out.print(matriz[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		int matriz[][], nFilas, nColumnas;
		
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("cuantas filas quieres que contega la matriz??"));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("cuantas columnas quieres que contega la matriz??"));
		
		matriz = new int [nFilas][nColumnas];
		
		
		System.out.println("Rellene la matriz");
		for(int i = 0; i <nFilas;i++) {
			for(int j= 0; j < nColumnas;j++) {
				System.out.print("Matriz [ "+i+"] ["+j+"] :  ");
				matriz [i][j] = scanner.nextInt();
				
			}
			
		}
		
		
		System.out.println("\n La matriz: ");
		for(int i = 0; i <nFilas;i++) { //numero de filas
			for(int j= 0; j < nColumnas;j++) { // numero de columnas
				System.out.print(matriz[i] [j] + " | ");
			}
			
			System.out.println("");
		}
		
	}
}
