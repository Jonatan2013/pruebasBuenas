package POO;

import javax.swing.JOptionPane;

//video: 71 - obtener areay permietro de un cuadrado/cuadrilatero


public class ATSEjercicioCuadrilatero {

	//ATRIBUTOS
	
	private float lado1;
	private float lado2;
	
	
					//***CONSTRUCTORES Y METODOS***///
	
	
			//METODO CONSTRUCTOR 1 (CUADRILATERO)
	public ATSEjercicioCuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	
			//METODO CONSTRUCTOR 1 (CUADRADO)
	
	public ATSEjercicioCuadrilatero(float lado1) { //los 4 lados son iguales
		this.lado1 = this.lado2 = lado1;
		
	}


	
			//METODOS GETTERS
	public float getPerimetro() {
		float perimetro = 2 * (lado1 + lado2);
		return perimetro;
	}
	
	public float getArea() {
		float area = (lado1 * lado2);
		return area;
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		ATSEjercicioCuadrilatero c1; // creado el objeto pero no a inicilizado usando sus atributos ni llmar al constructor
		
		float lado1, lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1 "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2"));
		
		
		if(lado1 == lado2) {//esto es un cuadrado
			c1 = new ATSEjercicioCuadrilatero(lado1);//aqui creamos el objeto de un cuadraro
		}else {
			c1 = new ATSEjercicioCuadrilatero(lado1,lado2);//aqui creamos el objeto de un cuadrilatero
		}
		
		System.out.println("El perimetro es: " + c1.getPerimetro());
		System.out.println("\nEl area es: " + c1.getArea());
		

		
		
		
		
		
		
		
		
		
		///***EJERCICIO 2: Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición dentro del mismo.
		//Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero

		
		
//		  //Matriz(tabla) de objetos por donde se desplazará
//        Movimiento objeto[][] = new Movimiento[6][6];
//
//        //Variables de posición inicial del objeto
//        int fila =2, col = 2;
//
//        //Objeto a mover
//        objeto[fila][col] = new Movimiento(fila, col);
//
//        //Imprime la coordada inicial del objeto
//        System.out.println("Coordenada inicial: [" + fila + "][" + col + "]");
//
//        //Menú de opciones para desplazarse, el ciclo finaliza hasta detectar el caracter 'Q'
//        char a;
//        do
//        {
//            a = JOptionPane.showInputDialog("Movimientos: \nW = Arriba\nS = Abajo\nA = Izquierda\nD = Derecha\nQ = Salir").charAt(0);
//            a = Character.toUpperCase(a);
//
//            //fil_aux y col_aux recordaran la última posición del objeto para borrarlo cuando cambie la posición
//            int fil_aux = fila, col_aux = col;
//            switch (a)
//            {
//                case 'W':
//                    fila = objeto[fila][col].arriba();
//                    break;
//                case 'S':
//                    fila = objeto[fila][col].abajo();
//                    break;
//                case 'A':
//                    col = objeto[fila][col].izquuierda();
//                    break;
//                case 'D':
//                    col = objeto[fila][col].derecha();
//                    break;
//                case 'Q':
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida");
//            }
//
//            //El objeto en la nuava posicón será igual al objeto antes del movimiento
//            objeto[fila][col] = objeto[fil_aux][col_aux];
//
//            //Se comprueba que no se borre el objeto cuando llegue a los límites de la matriz para evitar que se pierdan los datos y genere un error
//            if (fila != fil_aux || col != col_aux)
//                objeto[fil_aux][col_aux] = null;
//
//        }while (a!='Q');
//    }
//}
//
//
//package Ejercicio2;
//
//public class Movimiento
//{
//    private int fila, col;
//
//    public Movimiento(int fila, int col) {
//        this.fila = fila;
//        this.col = col;
//    }
//
//    public int arriba()
//    {
//        if (fila != 0)
//        {
//           fila--;
//        }
//        mensaje("ARRIBA");
//        return fila;
//    }
//    public int abajo()
//    {
//        if(fila != 5)
//        {
//            fila++;
//        }
//        mensaje("ABAJO");
//        return fila;
//    }
//    public int izquuierda()
//    {
//        if (col != 0)
//        {
//            col--;
//        }
//        mensaje("IZQUIERDA");
//        return col;
//    }
//    public int derecha()
//    {
//        if (col != 5)
//        {
//            col++;
//        }
//        mensaje("DERECHA");
//        return col;
//    }
//
//    //Imprime mensaje con las coordenadas actuales del objeto
//    public void mensaje(String msj)
//    {
//        System.out.println(msj + ", coordenadas: [" + fila + "][" + col + "]");
	}

}
