package POO;

import javax.swing.JOptionPane;

//video 62: creacion y concepto de metodos

public class ATSOperacion {

					//ATRIBUTOS
	
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	
	
					//METODOS
					
	//Metodo para pedirle al ussuario que nos digite 2 numeros
	
	
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	}
	
	
	public void sumar() {
		suma = numero1 + numero2;
	}
	
	
	public void restar() {
		resta = numero1 - numero2;
	}
	
	public void multiplicar() {
		multiplicacion = numero1 * numero2;
	}
	
	public void division() {
		division = numero1 / numero2;
	}
	
	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}


}
