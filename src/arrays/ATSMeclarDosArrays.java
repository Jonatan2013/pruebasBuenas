package arrays;
//video 46
import java.util.Scanner;

//import javax.swing.JOptionPane;

public class ATSMeclarDosArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int [] a = new int [10];
		int [] b = new int [10];
		int [] c = new int [20]; // este array sera la mecla del array a y b.
		
		
		//Pedimos introducir datos en el arreglo a.
		
		
		System.out.println("Digite el primer arreglo\n");
		
		for(int i = 0; i < a.length;i++) {
			
			System.out.print((i + 1) + ". Digite un numero: ");
			a [i] = scanner.nextInt();
			
		}
		
		
		//Pedimos introducir datos en el arreglo b.
		
		System.out.println("\nDigite el sengundo arreglo");
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.print((i +1) + ". Introduce un numero: ");
			b [i] = scanner.nextInt();
		}
		
		
		//Creamos la tabla c ---mezlar los datos de arrays a y b
		// utilizamos el iterador i para a y b
		// y el iterador j para el arreglo c.
		
		int j = 0;
		
		for(int i = 0; i < 10; i++) {
			
			c[j] = a [i]; // 1º elemento de  a, 2º elemento..... cada vez que i de una vuelta 
			j++;
			c[j] = b[i]; // 1º elemento de b, 2º elemto......
			j++;
		}
		
		
		
		//imprimir los datos de los arrays -- a, b y c
		
	
		
		System.out.println("\n Los datos del array --a-- son: " );
		for(int i: a) {
			System.out.print(i + " - ");
		}
		System.out.println();
		
		System.out.println("\n Los datos del array -- b-- son:" );
		for(int i: b) {
			System.out.print(i + " - ");
		}
		System.out.println();
		
		System.out.println("\n Los datos del array -- c-- son:" );
		for(int i: c) {
			System.out.print(i + " - ");
		}
		
		
		
		
		
		
		
		
		
		
		//////////////////////////EJERCICIO 6 DEL VIDEO 46 DE JAVA -- ATS
		///////////****** LEER LOS DATOS CORRESPODIENTE A DOS TABLAS DE 12 ELEMENTOS NUMERUICOS, Y MEZCLARLOS EN UNA TERCERA DE LA FORMA: 3 DE LA TABLA A, 3 DE LA TABLA B, OTROS 3 DE LA TABLA A Y TROS 3 TABLA B..
		
//		Scanner leer = new Scanner (System.in);
//        int numero1[], numero2[], contador1, contador2; 
//        numero1 = new int [12];
//        numero2 = new int [12];
//        contador1 = 0;
//        contador2 = 0;
//        boolean verdad = false;
//        
//        
//        System.out.println("PRIMERA TABLA");
//        for(int i=0; i<12; i++){
//            System.out.println((i+1)+" DIGITE UN NUMERO");
//            numero1[i] = leer.nextInt();
//        } 
//        System.out.println("SEGUNDA TABLA");
//        for(int i=0; i<12; i++){
//            System.out.println((i+1)+" DIGITE UN NUMERO");
//            numero2[i] = leer.nextInt();
//        }
//       
//            while(verdad == false){
//            do{
//                System.out.print(numero1[contador1]+",");
//                contador1++;
//            }while(contador1%3!=0);
//                System.out.print(" ");
//            do{
//                System.out.print(numero2[contador2]+",");
//                contador2++;
//            }while(contador2%3!=0);
//                System.out.print(" ");
//            if(contador2==12){
//            verdad=true;
//            }
//		
//		
//		
//		//////////////////////////esto es de la inteligencia artifical y no se lo que hace porque no lo he comprobado..ppero se supone que lo mimo juntar 3 tablas
		
//		public static int[] mergeArrays(int[] arr1, int[] arr2) {
//		    int length = arr1.length + arr2.length;
//		    int[] result = new int[length];
//		    
//		    int i = 0;
//		    for (int item : arr1) {
//		        result[i] = item;
//		        i++;
//		    }
//		    
//		    for (int item : arr2) {
//		        result[i] = item;
//		        i++;
//		    }
//		    
//		    return result;
//		}
//
//		// Ejemplo de uso:
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = {4, 5, 6};
//		int[] arr3 = mergeArrays(arr1, arr2);

//		
		
	}

}
