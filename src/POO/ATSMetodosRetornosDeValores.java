package POO;

import javax.swing.JOptionPane;
//video 65: Retorno de valores
//NO ES OBLIGATORIO TENER AMBOS CONCEPTOS DE ATRIBUTOS O METODOS AL CREAR UN OBJETO OBJETO

public class ATSMetodosRetornosDeValores {

	///ATRIBUTOS
	
	
	
	
	
	
	///METODOS
	
	public int suma(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	
	
	public int resta(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}
	
	
	public int multiplicacion(int numero1, int numero2) {
		int multiplicacion = numero1 * numero2;
		return multiplicacion;
	}
	
	public int division(int numero1, int numero2) {
		int division = numero1 / numero2;
		return division;
	}
	
	
	
	
	
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		ATSMetodosRetornosDeValores operacion = new ATSMetodosRetornosDeValores(); //creando objeto operacion
		
	    System.out.println("La suma es: " + operacion.suma(n1, n2));
		System.out.println("La resta es: " + operacion.resta(n1, n2));
		System.out.println("La multipliacion es: " + operacion.multiplicacion(n1, n2));
		System.out.println("La division es: " + operacion.division(n1, n2));
		
		//otra opcion seria por ejemplo crear variables auxiliares por ejempñlo
		// int suma = operacion.suma y depues imprimir llamando a la variable aux suma,,hacer esto para las cuatros operacines dentro de un metodo mostrarResultado por ejmplo
	
	}

}
