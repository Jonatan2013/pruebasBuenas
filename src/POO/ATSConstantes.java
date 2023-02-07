package POO;
//video 69: Constantes
// variables con un valor fijo..como PI

public class ATSConstantes {

		private final String nombre; //constante
		private int edad;
		
	
			//constructor
		public ATSConstantes(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}
	
		
		public void mostrarDatos() {
			System.out.println("El nombre es: " + nombre);
			System.out.println("La edad es: " + edad);
		}
		
		
		
		//getters/setters**solo para la edad,,nombre es Constante
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		

		public int getEdad() {
			return edad;
		}



		
		public String getNombre() {
			return nombre;
		}


	
	
	
	
	public static void main(String[] args) {
		
		
		
		ATSConstantes persona = new ATSConstantes("Jonatan", 34);
		
		
		persona.setEdad(22);//saldra en consola 22 y no 34
		persona.mostrarDatos();
		

	}




	

}
