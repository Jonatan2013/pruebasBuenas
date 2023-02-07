package POO;

import java.util.Scanner;

//video 73: area y perimetro d eun triangulo isosceles

public class ATSAreaYPerimetroDeUnTrianguloIsosceles {

	
	
	//ATRIBUTOS
	private double base;
	private double lado;
	

	
	//CONSTUCTOR
	public ATSAreaYPerimetroDeUnTrianguloIsosceles(double base, double lado) {
	
		this.base = base;
		this.lado = lado;
	}

	
	
	//METODOS

	public double obtenerPerimetro() {
		double perimetro = 2*lado+base;
		return perimetro;
	}


	public double obtenerArea() {
		double area = (base * Math.sqrt((lado *lado) - (base *base) / 4  ))/2;
		return area;
	}

	
	public String mostrarDatos() {
		return "Base:" +  base + "\n Lado: " + lado + "\nPerimetro:  " + obtenerPerimetro() + "\nArea: " + obtenerArea() + "\n";
	}
	
	
	//metodo para devolver el triangulo mas grande
	
	public static double mayorArea(ATSAreaYPerimetroDeUnTrianguloIsosceles triangulos []) {
		double area;
		
		area = triangulos[0].obtenerArea();
		for(int i = 1; i < triangulos.length;i++) {
			if(triangulos[i].obtenerArea() > area) {
				area = triangulos[i].obtenerArea();
				
			}
		}
		return area;
	}
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		double base, lado;
		int numeroTriangulos;
		
		System.out.print("Digite el numero de triangulos a ingresar: ");
		numeroTriangulos = scanner.nextInt();
		
		ATSAreaYPerimetroDeUnTrianguloIsosceles triangulos [] = new ATSAreaYPerimetroDeUnTrianguloIsosceles[numeroTriangulos];
		
		
			///Rellenar el array de objetos
		
		for(int i = 0; i < triangulos.length;i++) {
			System.out.println("\nDigite los valores para el triangulo " + (i+1)+ ": ");
			System.out.print("Intorduzca la base: ");
			base = scanner.nextDouble();
			System.out.print("Introduzca el lado: ");
			lado = scanner.nextDouble();
			
			
			triangulos[i] = new ATSAreaYPerimetroDeUnTrianguloIsosceles(base, lado);
			
			System.out.println("\nEl perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
			System.out.println("El area del tringulo es: " + triangulos[i].obtenerArea());
			
		}
	
		
		System.out.println("\n El area del triangulo de mayor superficie es:  " + mayorArea(triangulos));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//***EJERCICIO6****////
//		
//		/*
//		Ejercicio: Construir un programa para trabajar con dos numeros complejos, implemente
//		el siguiente menu:
//		1. Sumar 2 numeros complejos.
//		2. Multiplicar 2 numeros complejos.
//		3. Comparar 2 numeros comlejos. (iguales o no)
//		4. Multiplicar un numero complejo por un numero.
//		*/
//		package ejercicio;
//
//		public class NumeroComplejo {
//		    private final int real;
//		    private final int imaginaria;
//		    
//		    public NumeroComplejo(int real, int imaginaria){
//		        this.real = real;
//		        this.imaginaria = imaginaria;
//		    }
//
//		    public int getReal() {
//		        return real;
//		    }
//
//		    public int getImaginaria() {
//		        return imaginaria;
//		    }
//		    
//		    public NumeroComplejo calcularSuma(NumeroComplejo num){
//		        NumeroComplejo suma = new NumeroComplejo(real + num.getReal(), imaginaria+ num.getImaginaria());
//		        return suma;
//		    }
//		   
//		    
//		    public NumeroComplejo calcularProducto(NumeroComplejo num){
//		        NumeroComplejo mult = new NumeroComplejo((real * num.getReal()) - (imaginaria * num.getImaginaria()), (real * num.getImaginaria()) + (imaginaria * num.getReal()));
//		        return mult;
//		    }
//		    
//		    public boolean comprobarIgualdad(NumeroComplejo num){
//		        boolean igualdad = false;
//		        
//		        if((real == num.getReal()) && (imaginaria == num.getImaginaria())){
//		            igualdad = true;
//		            
//		        }
//		        return igualdad;
//		    } 
//		    
//		    public NumeroComplejo calcularProductoEC(int num){
//		        NumeroComplejo prod = new NumeroComplejo((real * num), (imaginaria * num));
//		        return prod;
//		    }
//		    
//		}
//
//
//
//		/CLASE MAIN/
//
//
//		package ejercicio;
//
//		import java.util.Scanner;
//
//
//		public class main {
//
//		    public static void main(String[] args) {
//		        Scanner sc = new Scanner(System.in);
//		        NumeroComplejo nc1, nc2;
//		        NumeroComplejo suma, mult, prod;
//		        int  opc, entero;
//		        int realN1, realN2, imagN1, imagN2;
//		        boolean salir = false;
//		        
//		        while(!salir){
//		            System.out.print("\n----------SELECCIONA UNA OPCION-----------");
//		            System.out.println("\n\n1. Sumar dos numeros complejos");
//		            System.out.println("2. Multiplicar dos numeros complejos");
//		            System.out.println("3. Comparar dos numeros complejos");
//		            System.out.println("4. Multiplicar un numero complejo por un entero");
//		            System.out.println("5. Salir\n");
//		            System.out.print("OPCION: ");
//		            opc = sc.nextInt();
//		            
//		            switch (opc){
//		                case 1:
//		                    System.out.print("\nDigite el primer numero real del numero complejo: ");
//		                    realN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el primer numero imaginario del numero complejo: ");
//		                    imagN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero real del numero complejo: ");
//		                    realN2 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero imaginario del numero complejo: ");
//		                    imagN2 = sc.nextInt();
//		                    
//		                    nc1 = new NumeroComplejo(realN1, imagN1);
//		                    nc2 = new NumeroComplejo(realN2, imagN2);
//		                    
//		                    suma = nc1.calcularSuma(nc2);
//		                    System.out.println("\nEl resultado de la suma es: " +suma.getReal() +" + "+suma.getImaginaria()+"i");
//		                    break;
//		                    
//		                case 2:
//		                    System.out.print("\nDigite el primer numero real del numero complejo: ");
//		                    realN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el primer numero imaginario del numero complejo: ");
//		                    imagN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero real del numero complejo: ");
//		                    realN2 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero imaginario del numero complejo: ");
//		                    imagN2 = sc.nextInt();
//		                    
//		                    nc1 = new NumeroComplejo(realN1, imagN1);
//		                    nc2 = new NumeroComplejo(realN2, imagN2);
//		                    
//		                    mult = nc1.calcularProducto(nc2);
//		                    System.out.println("\nEl resultado del producto es: "+mult.getReal()+" + "+mult.getImaginaria()+"i");
//		                    break;
//		                    
//		                case 3:
//		                    System.out.print("\nDigite el primer numero real del numero complejo: ");
//		                    realN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el primer numero imaginario del numero complejo: ");
//		                    imagN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero real del numero complejo: ");
//		                    realN2 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el segundo numero imaginario del numero complejo: ");
//		                    imagN2 = sc.nextInt();
//		                    
//		                    nc1 = new NumeroComplejo(realN1, imagN1);
//		                    nc2 = new NumeroComplejo(realN2, imagN2);
//		                    
//		                    if (nc1.comprobarIgualdad(nc2)){
//		                        System.out.println("\nLos numeros complejos son iguales");
//		                    }
//		                    else {
//		                        System.out.println("\nLos numeros complejos no son iguales");
//		                    }
//		                    
//		                    
//		                    break;
//		                    
//		                case 4:
//		                    System.out.print("\nDigite el numero real del numero complejo: ");
//		                    realN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el numero imaginario del numero complejo: ");
//		                    imagN1 = sc.nextInt();
//		                    
//		                    System.out.print("Digite el numero entero: ");
//		                    entero = sc.nextInt();
//		                    
//		                    nc1 = new NumeroComplejo(realN1, imagN1);;
//		                    
//		                    prod = nc1.calcularProductoEC(entero);
//		                    System.out.println("\nEl producto del numero complejo por el entero es: "+prod.getReal()+" + "+prod.getImaginaria()+"i");
//		                    
//		                    break;
//		                case 5:
//		                    salir = true;
//		                    System.out.println("\nAdios.");
//		                    break; 
//		                default:
//		                    System.out.println("\nOpcion Erronea, intente de nuevo");
//		            }
//		            
//		        }
	}

}
