package arrays;

import javax.swing.JOptionPane;

public class ForEach {

	public static void main(String[] args) {

		//String [] paises = new String [5];
		
//		
//				paises[0] =	"España";
//				paises[1] =	"Italia";
//				paises[2] =	"Francia";
//				paises[3] =	"Inglaterra";
//				paises[4] =	"Argentina";
//				
//				for(String elemento:paises) {  // String elemento e sporque hay que crear una tabla del miusmo tipo "String"
//					//System.out.println(elemento);
//					System.out.println("pais: " + elemento);
//				
//				}
				
				
					// for echa con panel,, esto lo que hace relleno los datos de la tabla desde una PANEL, mucho MEJOR y mas RAPIDO.!!!!
				
//				String [] paises = new String [5];
//				
//				for(int i = 0; i < paises.length;i++) {
//					paises[i] = JOptionPane.showInputDialog("introduce pais " + (i+1));
//				}
//				
//				for(String elemento:paises) {
//					System.out.println(elemento);
//				}
//				
		
		
					// for each con in INT y para ello un Integer.paeseInt
		
			int edad [] = new int [5];
			
			for(int i = 0; i < edad.length;i++) {
				edad[i] = Integer.parseInt(JOptionPane.showInputDialog("introduce edad"));
			}
	
			for(int edades: edad) {
				System.out.println(edades);
			}
			
		
		
			
			String[] nombre = {"Jonatan", "Luis", "Alberto", "Andres"};
			
			for(String i : nombre) {
				System.out.println(i);
			}
		
		
	}

}
