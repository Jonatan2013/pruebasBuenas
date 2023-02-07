package ArraysMatricesBidimensional;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSHacerMarcoConNumerosUnoYCeros {
// crear una matriz "marco" de tamaño de 5x5: todos us elementos deben ser 0 salvo los de los bordes que deber ser 1.
	
	public static void main(String[] args) {

		
		int matriz[][] = new int [5][5];
		
		// Rellenando la Matriz
		
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j<5;j++) {//delimita columnas
				
				if(i == 0 || i == 4) {
					matriz[i][j] = 1;
				}
				else if(j == 0 || j == 4) {
					matriz [i][j] = 1;
				}
			}
		}

		System.out.println("La Matriz es: \n");
		
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j<5;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		
		
		}
		//System.out.println("");
		
		
  }
}
