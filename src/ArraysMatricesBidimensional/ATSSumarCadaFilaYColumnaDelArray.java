package ArraysMatricesBidimensional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSSumarCadaFilaYColumnaDelArray {
	// crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y cada columna
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][], nFilas, nColumnas;
		int sumaFilas, sumaColumnas;
		
		nFilas =Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de filas: "));
		nColumnas =Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero de columnas: "));
		
		matriz = new int [nFilas][nColumnas];
		
		
		System.out.println("Rellene la Matriz: ");
		
		for(int i = 0; i< nFilas;i++) {
			System.out.println("\nFila: " + i);
			for(int j = 0;j < nColumnas;j++) {
				System.out.print("Matriz ["+i+"]["+j+"] :  ");
				matriz[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
		//Matriz Original
		
		System.out.println("La Matriz original es: ");
		for(int i = 0; i < nFilas; i++) {
			for(int j= 0; j <nColumnas;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		// Algoritmo para la suma de filas
		
		System.out.println("\nLa Matriz sumando filas:");
		for(int i = 0; i < nFilas;i++ ) {
				sumaFilas = 0;
			for(int j=0; j < nColumnas;j++) {
				sumaFilas += matriz[i][j];
			}
			System.out.println("\n La suma de la fila ["+i+"] es: " + sumaFilas);
		}
		System.out.println("");
		
		//por ultimo sumamos las columnas
		
		System.out.println("\n La Matriz sumando columnas: ");
		for(int j=0; j < nColumnas;j++) {
			sumaColumnas=0;
			for(int i = 0; i < nFilas;i++) {
				sumaColumnas += matriz[i][j];
			}
			System.out.println("\n La suma de la columna ["+j+"] es: " + sumaColumnas);
		}
		
		
		
		
		//EJERCICIO 6: UTILIZANDO DOS MATRICES DE TAMAÑO 5X9 Y 9X5, CARGAR LA PRIMARA Y TRNASPOERLA EN LA SEGUNDA
		
		
		
//		   int[][] A = new int[5][9];
//	       int[][] AT = new int[9][5];
//	       
//	        System.out.println("INGRESE LOS VALORES DE LA MATRIZ A");
//	        for (int i = 0; i < 5; i++) {
//	            for (int j = 0; j < 9; j++) {
//	                System.out.print("("+(i+1)+","+(j+1)+"): ");
//	                A[i][j] = sc.nextInt();
//	            }
//	            System.out.println("");
//	        }
//	        
//	        for (int i = 0; i < 9; i++) {
//	            for (int j = 0; j < 5; j++) {
//	                AT[i][j] = A[j][i];
//	            }
//	        }
//	        
//	        System.out.println("TRANSPUESTA DE LA MATRIZ A");
//	        for (int i = 0; i < 9; i++) {
//	            for (int j = 0; j < 5; j++) {
//	                System.out.print("("+(i+1)+","+(j+1)+"): "+ AT[i][j]);
//	            }
//	            System.out.println("");
//		
	}

}
