package ArraysMatricesBidimensional;
import java.util.Arrays;
//video 57
//
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSHallarLaMatricTranspuesta {

	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner (System.in);
//		
//		int matriz [][], nFilas, nColumnas;
//		
//		nFilas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas filas deseas que se la matriz?"));
//		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas columnas deseas que se la matriz?"));
//		
//		matriz = new int[nFilas][nColumnas];
//		
//		
//		System.out.println("Rellene la matriz");
//		for(int i = 0; i < nFilas;i++) {
//			for(int j = 0; j < nColumnas;j++) {
//				System.out.print("La Matriz ["+i+"]["+j+"] :" );
//				matriz [i][j]= scanner.nextInt();
//			}
//		}
//		
//		
//		
//		//Mostrar el array
//		
//		System.out.println("\nLa Matriz original: ");
//		for(int i = 0; i < nFilas;i++) {
//			for(int j= 0; j < nColumnas;j++) {
//				System.out.print(matriz[i][j] + " ");
//			}
//		System.out.println("");
//		}
//		
//		
//		
//		//Algoritmo: transponiendo la Matriz
//		
//		int aux;
//		for(int i = 0; i < nFilas;i++) {
//			for(int j = 0; j < nColumnas;j++) {
//				
//				aux = matriz [i][j];
//				matriz [i][j] = matriz [j][i];
//				matriz [j][i] = aux;
//			}
//		}
//		
//		
//		System.out.println("\n La matriz transpuesta es: ");
//		for(int i = 0; i < nFilas;i++) {
//			for(int j = 0; j < nColumnas;j++) {
//				System.out.print(matriz [i][j] + " ");
//			}
//			System.out.println("");
//		}
//		
		

		
		
		
		
		
		
		
		
		//EJERCICIO 4: CREAR UINA MATRIZ DE TAMAÑO DE 7X7 Y RELLENARLA DE FORMA QUE LOS ELEMENTOS DE LA DIAOGNAL PRINCIPAL SEAN 1 Y EL RESTO 0.
		
		
		  //Variables
        int matriz[][] = new int[7][7];
        
        //Llenar de uno's en la diagonal
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
       
        System.out.println("Matriz resultante");
        //Mostrar matriz resultante
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }

	}

}
