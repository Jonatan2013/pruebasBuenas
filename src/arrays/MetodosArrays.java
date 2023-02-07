package arrays;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MetodosArrays {

	
	
	public static void main(String[] args)  {
		//Scanner scanner = new Scanner (System.in);
		
		
//		int [] datos = new int[5];
//		
//		datos[0] = 1;
//		datos[1] = 2;
//		datos[2] = 3; 
//		datos[3]= 4;
//		datos[4] = 5;
						
		
//		System.out.println("Introduce el numero de elementos que deseas que tenga el array: ");
//		int numeroElemento = scanner.nextInt();
		
		
		int[]  arr = rellenarArray(5);// este cinco es simbolico,, ya que hjay que meter parametros pero en realidad el numeroElementos se mete en el metodo
		mostrarArray(arr);
		System.out.println(Arrays.toString(arr)); // esto hace lo mism que el metodo mostrararrays
	}

	
	
	
	public static int[] rellenarArray(int numeroElementos) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introduce el numero de elementos que desas que tenga el array: ");
		numeroElementos = scanner.nextInt();
		int a;
		
		int [] arr = new int [numeroElementos];
		
		for(int i = 0; i < numeroElementos;i++) {
			
			System.out.print("Introduce numero: ");
			arr[i] = scanner.nextInt();
			a = arr[i];
		}
		
		return arr;
	}
	
	
	
	
	

	
	public static void mostrarArray(int [] arr) {
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}

		
	}
	
	
}
