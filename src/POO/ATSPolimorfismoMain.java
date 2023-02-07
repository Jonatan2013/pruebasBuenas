package POO;

//Video 77: Polimorfismo

//Es una relacion de tipo herencia, un objeto de la superclase/clasePadre puede almacenar un objeto de cualquiera de sus subclases
//Esto significa que la clase padre i superclase es compatible con los tipos que derivan de ella.Pero no al reves
 //
public class ATSPolimorfismoMain {

	public static void main(String[] args) {

		
		ATSPolimorfismoVehiculo misVehiculos [] = new ATSPolimorfismoVehiculo [4];//un array de objetos y reservo memoria para cuatro objetos
		
		//ubicando en posicion y creando objeto
		misVehiculos[0] = new ATSPolimorfismoVehiculo("GH67","Ferrari", "F12" );//superclase
		misVehiculos [1] = new  ATSPolimorfismoVehiculoTurismo("GH67","Ferrari", "F12", 4);//turismo
		misVehiculos [2] = new  ATSPolimorfismoVehiculoFurgoneta("GH67","Ferrari", "F12", 125);
		misVehiculos [3] = new ATSPolimorfismoVehiculoDeportivo("GH67","Ferrari", "F12", 125);		
				

		//for each
			for(ATSPolimorfismoVehiculo vehiculos : misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
			}
			
			
		

//		for(int i = 0; i < misVehiculos.length;i++) {
//			System.out.println(misVehiculos[i].mostrarDatos());
//			System.out.println("");
//		}
//		
		
			
			//otra forma para poder verla tabla seria con un mostrarDatos() desde la superclase y llamarlo desde aqui
	}

}
