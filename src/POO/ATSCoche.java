package POO;
// video 61 POO
//COMO CREAR CLASES Y OBJETOS


public class ATSCoche {

	//ATRIBUTOS - caracteristicas
	
	String color;
	String marca;
	int km;
	
	
	
	
	public static void main(String [] args) {
	
		//metodo - acciones
		
		ATSCoche coche = new ATSCoche (); // crear el obejto coche
		
		System.out.println("Primer objeto: Coche: ");
		
		coche.color ="Blanco";
		coche.marca = "Audi";
		coche.km =0;
		
		System.out.println("\nEl color del coche es: " + coche.color);
		System.out.println("La marca del coche es: " + coche.marca);
		System.out.println("El kilometraje del coche es: " + coche.km);
		
		System.out.println("");
		
		//OTRO OBJETO
		
		System.out.println("Segundo objeto: Coche2: ");
		ATSCoche coche2 = new ATSCoche();
		
		coche2.color = "Rojo";
		coche2.marca = "Mercedes";
		coche2.km = 100;
		
		System.out.println("\nEl color del coche es: " + coche2.color);
		System.out.println("La marca del coche es: " + coche2.marca);
		System.out.println("El kilometraje del coche es: " + coche2.km);
		
		
	}
}
