package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSOrdenamientosMetodoBurbujaBusquedarEnArrays {
// este metodo ordena de forma creciente el arrays.. video 52
// este metodo se llama Metodo Burbuja porque lo que hace es colocar al principio los elementos/valores mas pequeños en la primera posicion,,,como las burbujas d eun refresco,,suben para arriba.
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		int arreglo [];
		int nElementos;
		int aux;//esta variable nos sirve para intercambiar los valores en el Metodo Burbuja
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que va a tener el arreglo: "));
		
		arreglo = new int [nElementos];//Le asignamos el numero de elementos al arreglo
		
		for(int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ". Digite un numero: ");
			arreglo[i] = scanner.nextInt();
		}
		
		
		//Metodo burbuja----tiene dos for anidados...
		
		for(int i = 0; i < (nElementos - 1); i++) {// -1 porque no hace falta que recorra toda la tabla...
			for(int j = 0; j < (nElementos - 1);j++) {
				
				if(arreglo[j] > arreglo[j +1]) {//Si numeroActual > numeroSiguiente intercambiamos los valores
					
					aux = arreglo[j];
					arreglo[j] = arreglo [j + 1];
					arreglo[j + 1] = aux;
				}
			}
		}
		
		//Mostrando el arreglo ordenado en forma creciente
		
		System.out.println("\n Arreglo ordenado en forma CRECIENTE: ");
		for(int i=0; i < nElementos; i++) {
			System.out.print(arreglo[i] + " - ");
		}
		System.out.println("");
		
		
		
		//Mostrando el arreglo ordenado en forma decreciente
		
		System.out.println("\n Arreglo ordenado en forma DECRECIENTE: ");
			
		for(int i = (nElementos - 1); i >= 0;i--) {
			System.out.print(arreglo[i] + " - ");
		}
		System.out.println("");
		
		
		
		
		
		
		
		
	}

}
