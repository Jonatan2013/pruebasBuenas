package POO;
//video 70: Miembros estaticos de una clase (STATIC)

// cuando pones static en un atributo el atributo ya no pertenece al objeto si no a la clase.... frase(segunda frase) saldra para los dos objetos 
//ya que es lo ultimo para este atributo y para ambos objetos
//cuando los atributos son STATIC no hace falta crear objetos ya que la dueña es la CLASE...POR LO TANTO AQUI POR EJEMPLO SERIA (ATSMiembrosEstaticosDeUnaClase )
//con los Metodos pasa igual,STATIC, YA NO PERTENECE A LOS OBJETOS SINO A LA CLASE


public class ATSMiembrosEstaticosDeUnaClase {

	private static String frase ="Primera frase"; //atributo static
	
	private static int sumar(int n1, int n2) {  //metodo static
		int suma = n1 + n2;
		return suma;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
		System.out.println(ATSMiembrosEstaticosDeUnaClase.frase); // al poner STATIC en el atributo la dueño de ellos es la propia clase....
		System.out.println("La suma es:" + ATSMiembrosEstaticosDeUnaClase.sumar(3, 4));
		
		

	}

}
