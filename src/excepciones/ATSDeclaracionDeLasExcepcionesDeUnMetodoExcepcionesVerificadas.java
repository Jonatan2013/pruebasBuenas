package excepciones;
//video 84 :  Declaracion de las excepciones de un Metodo

//IOException : son EXCEPCIONES VERIFICADAS

//cuando Java encuantra una excepcion verificada nos da 2 opciones: 1. declaramos la excepcion que se puede dar en el metodo----2. Capturar la excepcion con un Try/Catch

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ATSDeclaracionDeLasExcepcionesDeUnMetodoExcepcionesVerificadas {

	public void leerArchivo  () throws FileNotFoundException { //DECLARAMOS la excepcion con un (throws FileNotFoundException)///**aqui podria declarar las excepciones que seria necesarioas***//
		
		File archivo = new File ("d:\\Users\\famil\\prueba.txt");
		FileReader fr = new FileReader(archivo);
		
	}
	
	
	public void leerArchivo2() throws FileNotFoundException {
		leerArchivo();
	}
	
	
	public static void main(String[] args) {

	
		

	}

}
