package POO;
// video 68: encapsulamiento y metodos accesores (Setters y Getters)
//esta pertenece tambien a la clase EncapsulamientoGettersYSettersYMetodosAccesores..

//desde la clase creo lo que son los atributos haciendolo privados,,,solo se puede utilizar a traves del setter y getters en el mismo paquete,,creando objeto desde otra pagina..Main


public class ATSEncapsulamientoGettersYSetterBis {

	//atributos
	private int edad;
	private String nombre;
	
	
	
	
	
	//setters y getters
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	

}
