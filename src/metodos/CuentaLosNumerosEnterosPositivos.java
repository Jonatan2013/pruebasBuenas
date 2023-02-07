package metodos;

import javax.swing.JOptionPane;

public class CuentaLosNumerosEnterosPositivos {

	public static void main(String[] args) {

		int numero=0;
		
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero positivo");
            numero=Integer.parseInt(texto);
            
            
        }while(numero<0);
        
        int numCifras=cuentaCifras(numero);
        //Controlamos en el caso de que haya una cifra o mas
        if (numCifras==1){
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifras");
        }
    }
	
	
	
    public static int cuentaCifras (int numero){
         int contador=0;
         for (int i=numero;i>0;i/=10){
             //Incrementamos el contador
             contador++;
         }
         return contador;
		
		
		
		

	}

}
