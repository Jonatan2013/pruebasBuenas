package POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class pVehiculoMain {

	
	
	public static void main(String[] args) {
		
	
		pVehiculo misVehiculos [] = new pVehiculo [4 ];
	
		misVehiculos [0] = new pVehiculo("1324gdd", "Citroen", "C4");
		misVehiculos[1] = new pVehiculoTurismo("1324gdd", "Citroen", "C4", 4);
		misVehiculos [2] = new pVehiculoDeportivo("1324gdd", "Citroen", "C4", 1600);
		misVehiculos [3] = new pVehiculoFurgoneta("1324gdd", "Citroen", "C4", 880);
		
		for(pVehiculo vehiculos : misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
			}
			

	}

}
