package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSRellenarNumerosYLaInversa {

	public static void main(String[] args) {
													//leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
		
		
		Scanner scanner = new Scanner (System.in);
		
		float[] numeros = new float[5];
		
		
		System.out.println("Guardando los datos en el arreglo");
		
		for(int i = 0; i < numeros.length;i++) {
			//System.out.print((i + 1) + ". Introduce un numero: " + " ");
			//numeros[i] = scanner.nextFloat();
			
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog((i +1) + ". Introduce numero: " + " ")); // esto sustituye al scanner
			
		}
		
		
		System.out.println("\nEl arreglo esta compuesto por los sigueintes numeros:" );
		
		for(float i: numeros) {
			System.out.println(i);
		}
		
		
		
		/////desde aqui en adelante lo que hacmeos en cambiar el orden introducido de los valores a la inversa
		
		
		System.out.println("\n******VALORES A LA INVERSA*******");
		
		for(int i = 0; i < numeros.length/2;i++) { //.length Se divide por dos, porque en cada ciclo imprimirá dos resultados
			float variableTemporal = numeros[i]; // esta variable se crea para guardar los datos temporales porque vamos a marchar el valor cuando intercambiemos possiciones.
			numeros[i] = numeros[numeros.length - 1- i];
			numeros[numeros.length - 1 - i] = variableTemporal;
		}
		
		System.out.println("El arregloa  la inversa");
		for(float i: numeros) {
			System.out.println(i);
		}
	}

}
