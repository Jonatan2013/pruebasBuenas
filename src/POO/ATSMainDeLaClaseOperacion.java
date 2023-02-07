package POO;
//pertenece al ejericio ATSOperacion
//crearemos un objeto de la clase ATSOperacion

public class ATSMainDeLaClaseOperacion {
	
	
	public static void main(String [] args) {
	
		
		ATSOperacion operacion = new ATSOperacion ();
		
		
		operacion.leerNumeros();
		operacion.sumar();
		operacion.restar();
		operacion.multiplicar();
		operacion.division();
		operacion.mostrarResultados();
		
	}
	
}
