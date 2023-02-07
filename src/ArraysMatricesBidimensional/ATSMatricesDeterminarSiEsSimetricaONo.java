package ArraysMatricesBidimensional;

import java.util.Scanner;

import javax.swing.JOptionPane;
// mirar si una arrays es simetrica... para ello tiene que tener el mismo nFilas == nColumnas,,,y cuando conviertes las filas columnas y el valor del array es igual...
//video 56

public class ATSMatricesDeterminarSiEsSimetricaONo {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner (System.in);
		
		int matriz [][], nFilas, nColumnas;
		boolean simetrica = true;
		
		
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("cuantas filas quieres que contega la tabla"));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("cuantas columnas qiuoers que contega la tabla"));
		
		matriz = new int[nFilas][nColumnas];
		
		System.out.println("Digite una matriz: ");
		for(int i = 0; i < nFilas;i++) {
			for(int j = 0; j < nColumnas;j++) {
				System.out.print("Matriz: ["+i+"]["+j+"]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		
		
		//algoritmo para ver si la tabla es SIMETRICA!
		
		if(nFilas == nColumnas) { // si el numero de filas es igual al numero de columnas
			
			int i;
			int j = 0;
			
			i=0;
			while(i<nFilas && simetrica == true) {
				j=0;
				while(j<nColumnas && simetrica == true) {
					if(matriz [i][j] != matriz[j][i]) {
					simetrica = false;
				}
				j++;
			}
			i++;
			
		}
		
			if(simetrica == true) {
			JOptionPane.showMessageDialog(null, "La matriz SÍ es SIMETRICA");
			}
		
			else {
			JOptionPane.showMessageDialog(null, "La tabla NO es SIMÉTRICA");
			}
		
		}	
		else {
		JOptionPane.showMessageDialog(null, "La matriz no es simetrica");	
		}
	
		
	}

}
