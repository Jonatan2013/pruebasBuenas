package POO;
//Video 77: Polimorfismo


public class ATSPolimorfismoVehiculoDeportivo extends ATSPolimorfismoVehiculo {

	
	private int cilindrada; //creo un atributo mas los heredados
	
	public ATSPolimorfismoVehiculoDeportivo (String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	
	@Override //introduzco nPuertas ya que ese no lo heredo
	public String mostrarDatos() {
		return "La marca: " + marca + "\nLa matricula es: " + matricula + "\nEl modelo es: " + modelo + "\nLa cilindradas es: " + cilindrada + ". ";
	}
	
	
}
