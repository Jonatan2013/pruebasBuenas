package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSOrdenamientoPorInserccion {
//Ordenar la tabla de forma creciente....los valores del arrays los de su izq es mayor ocupa ese lugar...**Si numeroIzq > numeroActual --cambio*** video 53
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int arreglo [];
		int nElementos, aux, pos;
		
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuanto elementos quieres que tenga el array: "));
		arreglo = new int [nElementos];
		
		System.out.println("\nRellene el arreglo: ");
		for(int i = 0; i < nElementos;i++) {
			System.out.print((i + 1) + ". Introduce un numero: ");
			arreglo [i] = scanner.nextInt();
			
		}
		
		
		
		//Ordenamiento por el Metodo Inserccion
		
		for(int i = 0; i < nElementos;i++) {
			
			pos = i;
			aux = arreglo[i];
			
			while((pos > 0) && (arreglo[pos - 1] > aux)) { // si el de la izq e smayor
				arreglo[pos] = arreglo [pos -1];// pues pos actual es igual al de la izq..
				pos--;
			}
			arreglo[pos] = aux; //refrescamos los valores
		}
		
		
		
		//Mostrar los arrays por pantalla de forma Ascendente y Descendiente
		System.out.println("\n Orden Ascendente: ");
		for(int i = 0; i < nElementos;i++) {
			System.out.print(arreglo[i] + " - ");
		}
		
		System.out.println("");
		
		System.out.println("\n Orden Descendiente");
		for(int i = (nElementos - 1); i >= 0; i--) {
			System.out.print(arreglo[i] + " - ");
		}
		System.out.println();
		
		
		
	}

}
