package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATSDesplazarUnaPosicionEnArrays {
//Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicio hacia abajo: el primero pasa a ser segundo, el segundo tercero...y el ultimo primero.

	public static void main(String[] args) {


		Scanner scanner = new Scanner (System.in);
		
		int arreglo [] = new int [10];
		
		System.out.println("LLenar el arreglo");
		
		for(int i = 0; i < arreglo.length;i++) {
			
			System.out.print  ((i + 1) + ". Digite un numero:  ");
			arreglo[i] = scanner.nextInt();
			//arreglo [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			
		}
		
		int ultimoNumeroArreglo = arreglo[9]; // guardamos el ultimo elemento del arreglo
		
			// mover los valores una posicion
		
		for(int i = 8; i >=0;i-- ) { // porque el ultimo elemento ya lo tengo guardado en variable ultimoNumeroArreglo
			
			arreglo[i + 1] = arreglo[i];
		}
		
		arreglo[0] = ultimoNumeroArreglo; // poneoms ultimo elemento como primero
		
		System.out.println("\nEl nuevo arreglo es: ");
		for(int i = 0; i < arreglo.length;i++)
		System.out.println("La posicion " + i + " del arreglo es: " + arreglo[i]);
		
		
		
		
		
		/////EJERCICIO 10 CREAR UN PROGRAMA QUE LEA POR TECLDO UNA TABLA DE 10 NUMEROS ENTEROS Y DESPLACE N POSICIONES EN EL ARREGLO (N ES DIGITADO POR EL USUARIO)
		
//		Scanner in = new Scanner(System.in);
//        int arreglo[] = new int[10];
//        int aux;
//        for(int i=0; i<10;i++){
//            System.out.print((i+1)+".Digite:");
//            arreglo[i] = in.nextInt();
//        }
//       aux = arreglo[9];
//        for(int i=8; i>=0;i--){
//            
//            arreglo[i+1] = arreglo[i];
//        }
//        arreglo[0] = aux;
//        
//        System.out.println("Imprimiendo ne la posicion indicada: ");
//        for(int i=0; i<10;i++){
//            System.out.println((i+1)+".Numero:"+arreglo[i]);
	}

}
