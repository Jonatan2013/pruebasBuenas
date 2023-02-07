package POO;

public class pVehiculoTurismo extends pVehiculo {

	
	//ATRIBUTOS +
	
	private int numeroPuertas;
	
	
	//constructor
	
	public pVehiculoTurismo (String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
		
	}
	
	//METODOS
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: " + matricula + "\nLa marca es: " + marca + "\nEl modelo es: " + modelo + "\nEl numero de puertas es: " + numeroPuertas + " puerta/s";
	}
}
