package ejercicios_random;

public class RandomEnArrays {

	public static void main(String[] args) {

		

//		int [] matriz_aleatorios = new int [50];
//		
//		for(int i = 0; i < matriz_aleatorios.length;i++) {
//			matriz_aleatorios[i]=(int)Math.round(Math.random()*100); // esto te crea los numeros aleatorios y el round es para redondear el numero Y EL *100 SON NUMEROS ENTRE 0Y 100.
//			
//		}
//		
//		for(int numeros:matriz_aleatorios) { // numeros = la variable que hay que crear en el for each del mismo tipo que la matriz, INT.
//			System.out.print(numeros + " "); // no es un println... es para que no me salga hacia abajo
//			
//		}
//		
		
//		System.out.println(java.time.LocalTime.now());
//		
//		
//		int [] aleatorio = new int[20];
//		
//		for(int i = 0; i < aleatorio.length; i++) {
//			
//			aleatorio[i] = (int)Math.round(Math.random()*100);
//		}
//		
//		String separador = "-";
//		
//		for(int numero:aleatorio) {
//			System.out.print("[" + numero + "]" + separador);
//		}
//		
		
		
		int edad = 5;
		String resultado;
		
		resultado = (edad > 18) ? "eres nayor de edad" : "eres menor de edad";
		System.out.println(resultado);
		
		
		int precio = 5;
		
		String precio_final;
		precio_final = (precio > 10 || precio >1 && precio <5 || precio >5 && precio <10) ? "es muy caro" : "precio barato";
				
		

		
		
		

	}

}
