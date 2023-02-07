package arrays;

import javax.swing.JOptionPane;

public class ATSBusquedaSecuencialArray {
//video 54
//buscar un elemento dentro de un array... Esta busqueda lo hace independientemente si la tabla esta ordenada o desordenada..
	
	public static void main(String[] args) {
	
		int [] arreglo = {4, 1, 5, 2, 3};
		int dato;

		dato = Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres buscar?"));
		
		boolean bandera = false;
		
		
		//BUSQUEDA SECUENCIAL
		
		int i= 0;
		while(i < arreglo.length && bandera == false ) {
			
			if(arreglo[i] == dato) {
				bandera = true;
			}
			i++;	
		}
		
		if(bandera == false) {
			JOptionPane.showMessageDialog(null, " El numero no se encuentra en la tabla");
		}else {
			JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la poscion: " + (i -1));
		}
		

	}
}