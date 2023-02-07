package POO;
//video 78 y 79 y 80: como calcular areas de poligonos


public class ATSEjercicioTriangulo extends ATSEjercicioPoligono {
	
	//ATRIBUTOS
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	//CONSTRUCTOR
	
	public ATSEjercicioTriangulo(double lado1, double lado2, double lado3) {
		super(3); //en vez d eponer int nLados asignamos nosotros el 3 ya que iempre va a ser 3.
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}


	
	//METODOS
	
	public double getLado1() {
		return lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public double getLado3() {
		return lado3;
	}



	@Override
	public String toString() {
		return "Triangulo: \n" + super.toString() + "\nlado1= " + lado1 + "\nlado2= " + lado2 + "\nlado3= " + lado3;
	}
	

	
	@Override
	//para caluclar el triangulo utilizo la Fomrula de Heron
	public double area() {
		double p = (lado1 + lado2 + lado3)/2;
		return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3) ));
	}
	
	

}
