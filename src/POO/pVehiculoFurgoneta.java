package POO;

public class pVehiculoFurgoneta extends pVehiculo {

	//ATRIBUTOS
	
	private int carga;
	
	//constructor
	
	public pVehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	
	
	//metodos
	
	public int getCarga() {
		return carga;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: " + matricula + "\nLa marca es: " + marca + "\nEl modelo es: " + modelo + "\nLa carga es: " + carga + " Kgs.";
	}
}
