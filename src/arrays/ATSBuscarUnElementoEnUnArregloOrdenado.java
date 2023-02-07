package arrays;

import java.util.Scanner;

public class ATSBuscarUnElementoEnUnArregloOrdenado {

	public static void main(String[] args) {
// lerr 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostar la posicion en que se encuenta. Si no está, indicarlo con un mensaje.  video 51 
		
		Scanner scanner = new Scanner (System.in);
		
		int [] arreglo;
		int numero;
		boolean creciente = true;
		
		arreglo = new int[10];// creamos el arreglo con 10 posiciones
		
		
		do {
			
			//pedimos el arreglo
			System.out.println("Rellene el arreglo ordenado: ");
			for(int i = 0; i < 10;i++) {
				System.out.print(i + ". Digite un numero: ");
				arreglo [i] = scanner.nextInt();
			}
				
				//Verificar si el arreglo esta ordenado
			
				for(int i = 0; i < 9;i++) {
					if(arreglo[i] < arreglo[i + 1] ) {
						creciente = true;
					}
					if (arreglo [i] > arreglo [i + 1]){
						creciente = false;
						break; // salimos del bucle for y como el while es creciente == false, vovlera a pedirnos el do/while
					}
				}
			
			
			if(creciente == false) {
				System.out.println("\nEl arreglo esta desordenado, digite nuevamente: \n");
			}
		}while(creciente == false);
		//hasta aqui es el codigo para hacer la tabla ordenada
		
		
		//pedimos el numero a buscar
		
		System.out.println("\n Digite el numero a buscar en el arreglo: ");
		numero = scanner.nextInt();
		
		// Buscamos el numero en el arreglo
		
		int i = 0;
		while(i<10 && arreglo[i] < numero) {
			i++;
		}
		
		if(i==10) {//hemos recorrido todo el arreglo y no encontamos nada
			System.out.println("\n Número no encontrado");
		}else if(arreglo[i] == numero) {
			System.out.println("\n Número encontrado, en la posicion: " + i);
		}else {
			System.out.println("\\nNumero no encontrado");
		}
		
		
		
		
		
		
		
		
		//ejercicio 16: **Queremos desarrollar una aplicación que nos ayude gestionar las notas de un centro educativo. 
		//Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo 
		//y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, 
		//y la media del alumno que se encuentra en la posición N (N se lee por teclado)**
		
		
//		int Grupo[] = new int[5];// haciendo arreglo para los 5 alumnos.
//	       String Materias[]= {"Matematicas","Lenguaje","Quimica","Biologia","Fisica","Historia"};// Haciendo arreglo para las materias
//	       Scanner entrada = new Scanner(System.in);
//	       
//	       float notas1[] = new float[6];// notas de cada materia alumno 1.
//	       float notas2[] = new float[6];// notas de cada materia alumno 2.
//	       float notas3[] = new float[6];// notas de cada materia alumpo 3.
//	       float notas4[] = new float[6];// notas de cada materia alumno 4.
//	       float notas5[] = new float[6];// notas de cada materia alumno 5.
//	      
//	       float Trimestre1[] = new float[3];// haciendo arreglo para promedios de trimestre del alumno 1.
//	       float Trimestre2[] = new float[3];// haciendo arreglo para promedios de trimestre del alumno 2.
//	       float Trimestre3[] = new float[3];// haciendo arreglo para promedios de trimestre del alumno 3.
//	       float Trimestre4[] = new float[3];// haciendo arreglo para promedios de trimestre del alumno 4.
//	       float Trimestre5[] = new float[3];// haciendo arreglo para promedios de trimestre del alumno 5.
//	       float TrimestreG[] = new float[3];// haciendo arreglo para promedio del grupo en general.
//	       
//	       int N;// bueno esto esa obvio para que sirve.
//	       
//	       String Nombre[]= new String[5]; // para los nombres de los alumnos.
//	        
//	       
//	        System.out.print("\nPor favor djite los nombres de los estudiantes: \n");//pidiendo nombres
//	        for (int i = 0; i < 5;i++){
//	            System.out.print("alumno n°"+(i+1)+": ");
//	            Nombre[i] = entrada.nextLine();
//	         }
//	        int c = 0; //iterador
//	        int ct = 0;// contador de trimestres 
//	        
//	        for (int a = 0; a < 3; a++) {// llenando notas de los tres trimestres repitiendo el proceso 3 veces
//	        switch (ct){
//	            case 0:
//	                System.out.print("\nNotas primer trimestre\n");//Haciendo saber en que trimestre se encuentra
//	                break;
//	            case 1:
//	                System.out.print("\nNotas segundo trimestre\n");
//	                break;
//	            case 2:
//	                System.out.print("\nNotas tercer trimestre\n");
//	                break;
//	         
//	        
//	        } 
//	        System.out.print("Por favor Digite las notas de los alumnos: ");
//	            do {
//	          
//	             for(int i = 0; i < 5; i++){
//	              System.out.println("\nDigite las notas de "+Nombre[i]);// digitando notas de cada materia de cada alumno
//	               for (int j = 0; j < 6; j++) {
//	               //pidiendo notas     
//	                  if(c == 0){                            
//	                    System.out.print(Materias[j]+": ");
//	                      notas1[j] = entrada.nextFloat();}
//	                  if(c == 1){
//	                    System.out.print(Materias[j]+": ");
//	                      notas2[j] = entrada.nextFloat();}
//	                  if(c == 2){
//	                     System.out.print(Materias[j]+": ");
//	                      notas3[j] = entrada.nextFloat();}
//	                  if(c == 3){
//	                    System.out.print(Materias[j]+": ");
//	                      notas4[j] = entrada.nextFloat();}
//	                  if(c == 4){
//	                    System.out.print(Materias[j]+": ");
//	                      notas5[j] = entrada.nextFloat();}}
//	                 c++;
//	             
//	                 
//	                 switch (c){// sumando calificaciones de cada alumno para sacar sus promedios
//	             
//	                 case 1:
//	                     
//	                     for (int k = 0; k < 6; k++) {
//	                         Trimestre1[ct] += notas1[k];
//	                         
//	                     }
//	                     break;
//	                  case 2:
//	                     
//	                     for (int k = 0; k < 6; k++) {
//	                         Trimestre2[ct] += notas2[k];
//	                        
//	                     }
//	                     break;
//	                   case 3:
//	                     
//	                     for (int k = 0; k < 6; k++) {
//	                         Trimestre3[ct] += notas3[k];
//	                         
//	                     }
//	                     break;
//	                    case 4:
//	                     
//	                     for (int k = 0; k < 6; k++) {
//	                         Trimestre4[ct] += notas4[k];
//	                         
//	                     }
//	                     break;
//	                    case 5:
//	                     
//	                     for (int k = 0; k < 6; k++) {
//	                         Trimestre5[ct] += notas5[k];
//	                         
//	                     }
//	                     break;
//	                     }}} 
//	                     while (c < 5); 
//	                     c = 0;
//	                     Trimestre1[ct] /= 6f;//sacando el promedio de cada alumno
//	                     Trimestre2[ct] /= 6f;
//	                     Trimestre3[ct] /= 6f;
//	                     Trimestre4[ct] /= 6f;
//	                     Trimestre5[ct] /= 6f;
//	                     ct++;}         
//	                      
//	                     for (int i = 0; i < 3; i++) {
//	                         TrimestreG[i] +=  Trimestre1[i];// sacando promedio general del grupo
//	                         TrimestreG[i] +=  Trimestre2[i];  
//	                         TrimestreG[i] +=  Trimestre3[i];
//	                         TrimestreG[i] +=  Trimestre4[i];
//	                         TrimestreG[i] +=  Trimestre5[i];
//	                         TrimestreG[i] /= 5f;
//	                     }
//	                    
//	                    System.out.print("\nLos promedios del grupo son: \n");// mostrando promedio general
//	                    for (int i = 0; i < 3; i++) {
//	                        System.out.println("Trimestre n°"+(i+1)+": "+TrimestreG[i]);
//	        }
//	                    do{
//	                    System.out.print("\nPor favor digite el numero (1-5) del alumno que desea ver los promedios: ");// eligiendo alumno para mostrar promedios
//	                    N = entrada.nextInt();
//	                        if (N < 1 || N > 5) {
//	                            System.out.print("\nEsa posicion no existe intentelo de nuevo");
//	                        }
//	                    }
//	                    while(N < 1 || N > 5);
//	                    
//	                    switch (N){// mostrando promedios de alumno seleccionado
//	                        case 1:
//	                           System.out.print("Promedios de "+Nombre[0]+"\n");
//	                            for (int i = 0; i < 3; i++) {
//	                               System.out.println("Trimestre n°"+(i+1)+": "+Trimestre1[i]);} 
//	                            break;   
//	                        case 2:
//	                           System.out.print("Promedios de "+Nombre[1]);
//	                            for (int i = 0; i < 3; i++) {
//	                               System.out.println("Trimestre n°"+(i+1)+": "+Trimestre2[i]);}
//	                            break;   
//	                        case 3:
//	                           System.out.print("Promedios de "+Nombre[2]);
//	                            for (int i = 0; i < 3; i++) {
//	                               System.out.println("Trimestre n°"+(i+1)+": "+Trimestre3[i]);}
//	                            break;
//	                        case 4:
//	                           System.out.print("Promedios de "+Nombre[3]);
//	                            for (int i = 0; i < 3; i++) {
//	                               System.out.println("Trimestre n°"+(i+1)+": "+Trimestre4[i]);}
//	                            break;
//	                        case 5:
//	                           System.out.print("Promedios de "+Nombre[4]);
//	                            for (int i = 0; i < 3; i++) {
//	                               System.out.println("Trimestre n°"+(i+1)+": "+Trimestre5[i]);}
//	                             break;
//	                           }}}
		
	}

}
