package POO;

import javax.swing.JOptionPane;

//video 63: POO - Metodos: paramentros y argumentos

public class ATSMetodosParametrosYArgumentos {

			///ATRIBUTOS
	
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//Metodos
	
	public  void sumar(int numero1, int numero2) {
		suma = numero1 + numero2;
	}
	
	
	public  void restar(int numero1, int numero2) {
		resta = numero1 - numero2;
	}

	
	public  void multiplicar(int numero1, int numero2) {
		multiplicacion = numero1 *numero2;
	}

	
	public  void dividir(int numero1, int numero2) {
		division = numero1 / numero2;
	}
	
	
	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		ATSMetodosParametrosYArgumentos operacion = new ATSMetodosParametrosYArgumentos(); // objeto operacion creado
		
		operacion.sumar(n1, n2);
		operacion.restar(n1, n2);
		operacion.multiplicar(n1, n2);
		operacion.dividir(n1, n2);
		
		operacion.mostrarResultados();
		
		
		
	}

}
