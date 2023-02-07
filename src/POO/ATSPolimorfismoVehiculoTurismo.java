package POO;
//Video 77: Polimorfismo
public class ATSPolimorfismoVehiculoTurismo extends ATSPolimorfismoVehiculo {

	
	private int nPuertas;
	
	public ATSPolimorfismoVehiculoTurismo (String matricula, String marca, String modelo, int nPuertas) {
		super(matricula,marca,  modelo); //los atributos que hereda la clase
		this.nPuertas  = nPuertas; //mas el atributo nPuertas
	}
	
	public int getnPuertas() {
		return nPuertas;
	}
	
	@Override //introduzco nPuertas ya que ese no lo heredo
	public String mostrarDatos() {
		return "La marca: " + marca + "\nLa matricula es: " + matricula + "\nEl modelo es: " + modelo + "\nNumero de puertas: " + nPuertas + ". ";
	}
	
	
}
