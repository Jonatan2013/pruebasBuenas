package POO;
//VIDEO 74: Herencia en POO

public class ATSHerenciaPOOPersona {

	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int edad;
	
	//CONSTRUCTOR YY METODOS
	
	
	//CONSTRUCTOR
	public ATSHerenciaPOOPersona(String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//METODOS
	
	public String getNombre() {
		return nombre;
	}
 
	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	
	
}
