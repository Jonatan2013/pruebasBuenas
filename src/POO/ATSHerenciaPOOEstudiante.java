package POO;
//VIDEO 74: Herencia en POO 2º parte

public class ATSHerenciaPOOEstudiante  extends ATSHerenciaPOOPersona {

	
	//ATRIBUTOS (ATRIBUTOS HEREDADOS DE LA CLASE Persona + los 2 nuevos creados)
	private int codigoEstudiante;
	private float notaFinal;
	

	//constructor**algo mas especial ya que parte es heredado de clase Persona
	
	public ATSHerenciaPOOEstudiante(String nombre,String apellido,int edad, int codigoEstudiantes, float notaFinal) {
		super(nombre, apellido,edad);//ya esta inicializados dentro de la clase Persona
		this.codigoEstudiante = codigoEstudiante; //los dos nuevos
		this.notaFinal = notaFinal;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: "+ getEdad() + "\nCodigoEstudiante: "  + codigoEstudiante + "\nNota Final: " + notaFinal );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
