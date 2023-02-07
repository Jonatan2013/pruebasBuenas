package excepciones;
//video 85  : try cath para EXCEPCIONES VERIFICADAS

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ATSDeclaracionDeLasExcepcionesDeUnMetodoExcepcionesVerificadasParte2TryCatch {

	
	
	public void leerArchivo() throws FileNotFoundException, IOException {
		
		//por la busqueda del archivo la exception que se da es de FileNotFoundException que hereda de IOException
		
			File archivo = new File("d:\\Users\\famil\\prueba.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader bf = new BufferedReader(fr);
			
		
		//esto e slo que puede dar la exceptin de IOException
			
			String linea;
			while((linea = bf.readLine()) != null) {	
				System.out.println(linea);
			}
		}
	
	
	public void leerArchivo2() {
		
		try {
			
			leerArchivo();
			
		}catch(FileNotFoundException ex) {
			
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor, verifique la ruta");
			
		}catch(IOException e) {//creamos otro carch para capturar la exception por IOException
			JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
		}finally {			//es opcional pornerlo y el finally se ejecutara si o si aunque haya una excepcion o no en Try
			
		}
		
			System.out.println("Programa terminado");
	}
		
	
	
	
	
	public static void main(String[] args) {

		
		ATSDeclaracionDeLasExcepcionesDeUnMetodoExcepcionesVerificadasParte2TryCatch prueba = new ATSDeclaracionDeLasExcepcionesDeUnMetodoExcepcionesVerificadasParte2TryCatch();
		
		prueba.leerArchivo2();
		
		
		

	}

}
