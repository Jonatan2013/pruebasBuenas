package POO;
//video 67: Modificadores de ACCESO y 
// LOS MODIFICADORES ES PREVIO AL ENCAPSULAMIENTO..YA QUE SI ES PRIVATE/PUBLIC

//video 68: encapsulamientos GETTERS/SETTERS

public class ATSGettersYSettersEncapsulamientoMain {

	
	
	
	public static void main(String[] args) {
		
		ATSEncapsulamientoGettersYSetterBis persona = new ATSEncapsulamientoGettersYSetterBis();
		
		persona.setEdad(34);
		persona.setNombre("JONATAN");
		
		System.out.println("La persona se llama: " + persona.getNombre());
		System.out.println("Tiene la edad de: " + persona.getEdad());
		

	}

}
