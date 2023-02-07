package POO;
//Video 77: Polimorfismo

// esta clase es la: superclase/clasePadre
public class ATSPolimorfismoVehiculo {

	//ATRIBUTOS
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//CONSTRUCTOR
	public ATSPolimorfismoVehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//METODOS
	
	public String geTMatricula() {
		return matricula;
	}
	
	public  String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String mostrarDatos() {
		return "La marca: " + marca + "\nLa matricula es: " + matricula + "\nEl modelo es: " + modelo + ". ";
	}
}
