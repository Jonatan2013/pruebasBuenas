package POO;
//Video 77: Polimorfismo

public class ATSPolimorfismoVehiculoFurgoneta extends ATSPolimorfismoVehiculo{
	
	private int carga;//nuevo atributos mas los heradados de la clase vehiculo
	
	public ATSPolimorfismoVehiculoFurgoneta( String matricula, String marca, String modelo, int carga) {
		super(matricula, marca,modelo);
		this.carga = carga;
	}
	
	
	public int getCarga() {
		return carga;
	}
	
	@Override //introduzco nPuertas ya que ese no lo heredo
	public String mostrarDatos() {
		return "La marca: " + marca + "\nLa matricula es: " + matricula + "\nEl modelo es: " + modelo + "\nPeso de la carga: " + carga + ". ";
	}
	

}
