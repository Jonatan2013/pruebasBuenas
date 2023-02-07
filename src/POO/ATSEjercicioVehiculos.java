package POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

//video: 72
// EJERCICIO 3: cPNSTRUIR UN PROGRAMA QUE DAD UNA SERIE DE VEHICULOS CARACTERIZADOS POR SU MARCA, MODELO Y PRECIO, IMPRIMA LAS PROPIEDADES DEL VEHICULOS
//MAS BARATO. pARA ELLO.SE DEBERAN LEER POR TECLADO LAS CARACTERISTICAS DE CADA VEHICULO Y CREAR UNA CLASE QUE REPRESENTE A CADA UNO DE ELLOS.

public class ATSEjercicioVehiculos {

				//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private float precio;
	
	
	
			
	
			 //CONSTRUCTORES
	
	public ATSEjercicioVehiculos(String marca, String modelo, float precio) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	
	
	
	
			//METODOS
	


	public String getMarca() {
		return marca;
	}




	public String getModelo() {
		return modelo;
	}



	public float getPrecio() {
		return precio;
	}



	public String mostrarDatos() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio + "\n";
	}
	
	
	
	//crear metodo para saber que coche es el mas barato
	
	public static int indiceCocheMBarato(ATSEjercicioVehiculos coches []) {
		float precio;
		int indice=0;
		
		precio = coches[0].getPrecio();
		for(int i = 1; i < coches.length;i++) {
			if(coches [i].getPrecio() < precio) {
				precio = coches [i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
		
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculos;
		int indiceBarato;
		
		System.out.print("Digite la cantidad de vehiculos: ");//cada vehiculo es un objeto
		numeroVehiculos = scanner.nextInt();
		
		//creamos los objetos para los coches***es un arrays de objetos***
		ATSEjercicioVehiculos coches[] = new ATSEjercicioVehiculos[numeroVehiculos];
		
		
		for(int i = 0; i < coches.length;i++) { // tipo a los Arrays,, asi recorro todos los objetos
			
			scanner.nextLine();//ponemos esto para que se imprima bien,,,,esto es debido a que el buffer no ha quedado vacio,,a quedado con un salto de linea
			
			System.out.println("\nDigite las caracteristicas del cohe " + (i+1)+ ": ");
			System.out.print("Introduce Marca: ");
			marca= scanner.nextLine();
			System.out.print("Introduce el modelo del coche: ");
			modelo =  scanner.nextLine();
			System.out.print("Introduce precio: ");
			precio = scanner.nextFloat();
			
			coches[i] = new ATSEjercicioVehiculos(marca, modelo, precio);
		}
		
		
		indiceBarato = indiceCocheMBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
	}







	
	
	
	
	
	
	
//	////**EJERCICIO 4:
//	  //Construir un programa para una competencia de atletismo
//    //el programa debe gestionar una serie de atletas caracterizados por
//    //su número de atleta, su nombre y tiempo de carrera, al final el 
//    //programa debe mostrar los datos del atleta ganador de la carrera
//    
//    //primero, hacer el objeto atleta con sus atributos: numero de atleta,
//    //nombre, y tiempo de carrera. luego, la clase en la que se ingresarán el numero
//    //de atletas y los datos de cada uno. En esa misma clase se hará el método que 
//    //determinará cual fué el atleta ganador.
//    
//    //Atributos
//    private String nombre;
//    private int numeroDeAtleta;
//    private int tiempo;
//    
//    //metodos
//    public Atleta(String nombre, int numeroDeAtleta, int tiempo){
//        this.nombre = nombre;
//        this.numeroDeAtleta = numeroDeAtleta;
//        this.tiempo = tiempo;
//    }
//
//    public int getTiempo() {
//        return tiempo;
//    }
//    
//    
//    
//    public String mostrarDatos(){
//        return "Nombre: " + nombre + "\nnúmero de atleta: " + numeroDeAtleta + "\nTiempo de carrera: " + tiempo;
//    }
//}
//
//
//
////Clase main.
//
//
//package POO;
//
//import java.util.Scanner;
//
//public class Principal {
//    
//    public static int Ganador(Atleta atletas[]){
//        int mejorTiempo = atletas[0].getTiempo();
//        int ganador = 0;
//        
//        for(int i = 1; i < atletas.length; i++){
//            if(mejorTiempo > atletas[i].getTiempo()){
//                mejorTiempo = atletas[i].getTiempo();
//                ganador = i;
//            }
//        }
//        
//        return ganador;
//    }
//    
//    public static void main(String args[]){
//        Scanner entrada = new Scanner(System.in);
//        String nombre;
//        int numeroDeAtleta;
//        int tiempo;
//        int cuantosAtletas;
//        int atletaGanador;
//        
//        //se hace un arreglo con el numero de atletas que compitieron
//        System.out.println("Ingrese el número de atletas que han competido: ");
//        cuantosAtletas = entrada.nextInt();
//        Atleta atletas[] = new Atleta[cuantosAtletas];
//        
//        for(int i = 0; i < cuantosAtletas; i++){
//            entrada.nextLine();
//            
//            System.out.println("Ingrese el nombre del atleta nro " + (i + 1) + ":");
//            nombre = entrada.nextLine();
//            
//            System.out.println("Ingrese el número de competidor del atleta nro " + (i + 1) + ":");
//            numeroDeAtleta = entrada.nextInt();
//            
//            System.out.println("Ingrese el tiempo de carrera del atleta nro " + (i + 1) + ":");
//            tiempo = entrada.nextInt();
//            
//            
//            atletas[i]= new Atleta(nombre, numeroDeAtleta, tiempo);
//        }
//        
//        atletaGanador = Ganador(atletas);
//        System.out.println("El atleta ganador es el atleta nro " + (atletaGanador + 1) + "\n" + atletas[atletaGanador].mostrarDatos()) ;
//    }
//}
	
	
	
}