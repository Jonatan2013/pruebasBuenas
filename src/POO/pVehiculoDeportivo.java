package POO;

public class pVehiculoDeportivo extends pVehiculo {

	
	//ATRIBUTOS	
	
	private int cilindrada;
	
	//METODOS
	
	public pVehiculoDeportivo (String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	
	
	
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: " + matricula + "\nLa marca es: " + marca + "\nEl modelo es: " + modelo + "\nEl numero de cilindrada es: " + cilindrada + "c.c.";
	}
}
