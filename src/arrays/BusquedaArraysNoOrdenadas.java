package arrays;

import javax.swing.JOptionPane;

public class BusquedaArraysNoOrdenadas {

	public static void main(String[] args) {

		
		//int arreglo [] = {100, 50, 200, 150};
		
//		int dato;// buscar este valor en la tabla preguntando al usuario que valor quiere buscar
//		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que deseas buscar:")); // esto es como un Scanner pero con panel
		
//		boolean bandera = false; // esto nos dira si hemos encontrado el valor o todavia no lo hemos encontrado
//		
//		int i = 0;
//		while(i < arreglo.length && bandera == false ) {
//			if(arreglo [i] == dato) { // solo entrara en el while mientras el valor solo sea true.
//			bandera = true;
//		}
//			i++;
//		
//	}
//	
//		// hasta aqui es el algoritmo para la busqueda del valor
//		// y los siguiente es el mensaje para el usuario
//		
//		if(bandera == false) {
//			JOptionPane.showMessageDialog(null, "El numero deseado a buscar no se encuentra en la tabla");
//		}else {
//			JOptionPane.showMessageDialog(null, "El número ha sido enconrtado en la posición: " + (i-1));; // el -1 se pone porque cuando termina el while i++ aumenta una posicion y enrta en el while de nuevo 
//																										// para  compruebar que ya no el false si no true, y poniendo -1 volvemos a la posicion donde se encuenrta el valor true.
//																					
//	}
		
		
		
		int arreglo [] = {125, 135, 258};
		
		int dato;
		dato = Integer.parseInt(JOptionPane.showInputDialog("introduzca valor que desesas buscar"));
		
		
		boolean bandera = false;
		
		int i = 0;
		while(i < arreglo.length && bandera == false) {
			
			if(arreglo[i] == dato) {
				bandera = true;
			}
			
			i++;
		}
		
		
		if(bandera == false) {
			JOptionPane.showMessageDialog(null, "el numero que deseas buscar no se encuentra en la tabla");
		}else {
			JOptionPane.showMessageDialog(null, "el numero se encuentra en la possicion: " + (i-1));
		}
		
		
		
		
		
		
		
		
		
		// ES EL MISMO EJEMPLO QUE EL DE ARRIBA, BUSQUEDA SECUENCIAL, PERO USANDO EL SCANNER, ES DECIR, POR CONSOLA EN VEZ DE POR PANELES.	
		
		

				//int sueldos [] = {1500, 2000, 100 ,205, 3000};
		
		
				//Scanner scanner = new Scanner (System.in);
		
		
				//System.out.println("Introduzca el sueldo a buscar en la tabla");
				//int datoUsuario;
				//datoUsuario = scanner.nextInt();
		
	
				//boolean bandera = false;
	
				//int i = 0;
				//while(i < sueldos.length && bandera == false) {
				//	if(sueldos[i] == datoUsuario) {
				//		bandera = true;
				//	}
				//	i++;
				//}
		
	
				//if (bandera == true) {
				//	System.out.println("el sueldo deseado se encuenrta en la posicion: " + (i-1));
				//}else {
				//	System.out.println("no se encuentra el valor deseado");
				//}
				
						
		
		
		
		
		
		
	}

}
