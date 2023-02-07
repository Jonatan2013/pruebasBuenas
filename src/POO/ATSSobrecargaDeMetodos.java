package POO;
//video 66: Sobrecarga de Metodos
//sobrecarga de metedos constructores y metodos normales

public class ATSSobrecargaDeMetodos {

		//ATRIBUTOS
	
	String nombre;
	int edad;
	String dni;
	
	
	//METODOS
	
	//**Genero este constructor por el metodo rapido, bootn secuendario--fource..
	
	
	//CONSTRUCTORES
	public ATSSobrecargaDeMetodos(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
	public ATSSobrecargaDeMetodos(String dni) {
		
		this.dni = dni;
	}


	//METODOS
	public void correr() {
		System.out.println("Soy " + nombre + " , tengo " + edad + " años y estoy corriendo una maraton");
	}
	
	
	public void correr(int km) {
		System.out.println("He corrido: " + km + " Kilometros");
	}
	
	
	
	
	private void dni(String dni) {
		System.out.println("El dni es: " + dni);
		
	}

	
	
	
	
	

	public static void main(String[] args) {
	
		
		ATSSobrecargaDeMetodos persona = new ATSSobrecargaDeMetodos("Janire", 34);
		
		persona.correr();
		persona.correr(10);
		
		
		ATSSobrecargaDeMetodos persona2 = new ATSSobrecargaDeMetodos("72404819");
		
		persona2.dni("456456");
	}



	


	

	

}
