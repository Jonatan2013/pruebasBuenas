package excepciones;
//video 83. excepciones
import java.io.BufferedReader;
import java.io.FileReader;
//import java.util.Scanner
import java.io.IOException;
import java.util.logging.Logger;


public class ATSExceptionIntorduccion  {

	public static void main(String[] args) { //throws IOException //, FileNotFoundException  {
	
		
	
	//Excepciones Verificadas (IOException): esto Java te obliga a que lo soluciones.
		  //Lectura de un archivo de texto(.txt)
					//esta excepcion no depende directamente del programador,,auque puede solucionarlo....por ejmplo: eliminacion de carpetas, mover de una ruta a otra, etc...
		
	
//	
//			BufferedReader bf = new BufferedReader(new FileReader("d:\\Users\\famil\\prueba.txt"));
//			String linea;
//
//			while((linea = bf.readLine()) != null ) {
//				System.out.println(linea);
//			}
//		
		
			
			
			
		//Excepciones No Verificadas (RunTimeException)
			//division entre cero, por ejmplo
			
			
	
			
			int num1 = 5, num2 = 0;
			
			try {
				
				int resultado = num1 / num2;
				
				System.out.println(resultado); 
				
			
			}catch(Exception e){
			
			System.out.println("No es posible dividir por cero");
			System.out.println("Intentelo de nuevo, por favor");
			
			}
			
	
			
	}

}
