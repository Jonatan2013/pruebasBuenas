package POO;
//video 78 y 79 y 80: como calcular areas de poligonos



public class ATSEjercicioRectangulo extends ATSEjercicioPoligono {


	//ATRIBUTOS
	
	private double lado1;
	private double lado2;
	

	//CONSTRUCTOR
	
	public ATSEjercicioRectangulo(double lado1, double lado2) {
		super(2);//como ya sabemos el numero de lados no es necesario mandarselo por el constructor..lo ponemos nosotros directamente desde aqui
		this.lado1= lado1;
		this.lado2= lado2;
	}


	public double getLado1() {
		return lado1;
	}


	public double getLado2() {
		return lado2;
	}


	@Override
	public String toString() {
		return "El Rectangulo: \n"+ super.toString() + "\nEl lado numero1 es: " + lado1 + "\nEl lado numero2 es: " + lado2;
								//super = me muestra el metodo toString() de la clase padre//muestra el numeor de lados	
	}
	
	@Override
	public double area() {
		return lado1 * lado2;
	}
	
	
}
