package ejercicios_random;

import java.util.Random;

public class Dado4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int max = 6;
		int min = 1; 
		
		int numero1=0;
		int numero2=0;
		int numero3=0;
		int numero4=0;
		int numero5=0;
		int numero6=0;
		
		for(int i=0;i<20;i++) {
			
		int numeroAleatorio = random.ints(min,max + 1).findAny().getAsInt();
		System.out.println(numeroAleatorio);
		
			if (numeroAleatorio==1) {		
				numero1++;
			}
			else if  (numeroAleatorio==2) {
				numero2++;
			}
			else if  (numeroAleatorio==3) {
				numero3++;
			}
			else if  (numeroAleatorio==4) {
				numero4++;
			}
			else if  (numeroAleatorio==5) {
				numero5++;
			}
			else if  (numeroAleatorio==6) {
				numero6++;
			}
		}
		System.out.println("hay " + numero1 + " numeros 1");
		System.out.println("hay " + numero2 + " numeros 2");
		System.out.println("hay " + numero3 + " numeros 3");
		System.out.println("hay " + numero4 + " numeros 4");
		System.out.println("hay " + numero5 + " numeros 5");
		System.out.println("hay " + numero6 + " numeros 6");
		int total= numero1 + numero2 + numero3 + numero4 + numero5 + numero6;
		System.out.println("hay " + total + " numeros");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		

	
}

