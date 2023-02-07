package POO;
//video 78 y 79 y 80: como calcular areas de poligonos

//superclase/ clase padre de : rectangulo/triangulo/main

// esta clase sera abstaracta ya que nno puedo implementar el metodo,,,
public abstract class ATSEjercicioPoligono {

	//ATRIBUTOS
	
	protected int numeroLados;
	
	
	
	//CONSTRUCTOR
	
	public ATSEjercicioPoligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}
	
	//METODOS

	public int getNumeroLados() {
		return numeroLados;
	
	}

	
	// esto es lo mismo que utilizar el metodo mostarDatos()
	@Override // estamos sobeescribiendo porque todo pertenece a option
	public String toString() {
		return "Número de lados es: " + numeroLados + "."; // aqui si tuviera 5 atributos tendria que ponerlo aqui para que me devuelva return de todos sus atributos
	}

	
	//declaramos el metodo area como abstracto,, asi las clases hijas tendra que implementar el metodo si o si o dara error a nivel de la clase porque no he implementado el emtodo abstracto
	public abstract double area(); 
		
	
	
	
	
	
	
}