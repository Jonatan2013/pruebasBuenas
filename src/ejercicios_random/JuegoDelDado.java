package ejercicios_random;

import javax.swing.JOptionPane;

public class JuegoDelDado {

	public static void main(String[] args) {
		
		int numero;
		int contador = 0;
		int aleatorio;
		
		aleatorio = (int) (Math.random() * 100); // genera un numero aleatorio entre 0-100.
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			
			if(aleatorio > numero) {
				System.out.println("introduzca un numero mayor");
			}else {
				System.out.println("introduce un numero menor");
			}
			contador++;           // asi contabilizamos los intentos del usuario
		}while(numero != aleatorio);
			
			
			System.out.println("\n ¡¡¡GENIAL ADIVINASTES EL NUMERO!!!!!, HAS NECESITADO:" + contador + " INTENTOS");
	
	}

}
