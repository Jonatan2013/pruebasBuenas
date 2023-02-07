package ejercicios_random;

import javax.swing.JOptionPane;

public class Adivinar1 {

	public static void main(String[] args) {

		
		int numero;
		int aleatorio;
		int contador = 0;
		
		aleatorio = (int) (Math.random() * 100);
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
			if(aleatorio > numero) {
				System.out.println("inrtoduce un numero mayor");
				contador++;
			}else {
				System.out.println("introduce un numero menor");
				contador++;
			}
		}while(numero != aleatorio);
		
		System.out.println("\n ENORABUENA ADIVINASTE EL NUMERO!!!!!!!");
		
		
		if(contador < 5) {
			System.out.println("ERES UN CRACK!!!! ");
			System.out.println("Solo has necesitado:  " + contador + " intentos");
		}else {
			System.out.println("\n Has necesitado: " + contador + " intentos");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
