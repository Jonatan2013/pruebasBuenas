package POO;
//video 65: Metodo Constructor
// que es un constructor y para que se dedica..
public class ATSMetodoConstructorPersona {

	//ATRIBUTOS
	
	String nombre;
	int edad;
	
				//METODOS
	
			//metodo contructor
			//es el unico que no lleva el tipoderetorno y siempre debe de ser public,,es el unico metodo que no tiene que poner ningun tipo de retorno
	
	
	
	public ATSMetodoConstructorPersona(String nombre, int edad) {// ME SIRVE CUANDO CREO EL OBJETO PARA METERSELO CON PARAMETROS
		  this.nombre = nombre;// el this.nombre hace referencia al atributo y el nombre al paramerto la variable creada con nombre
		  this.edad = edad;
	}
	
	
	public void mostarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
	public static void main(String[] args) {
	
		ATSMetodoConstructorPersona persona = new ATSMetodoConstructorPersona("Jonatan", 34);
		
		persona.mostarDatos();

	}

}
