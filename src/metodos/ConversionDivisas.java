package metodos;

import javax.swing.JOptionPane;

public class ConversionDivisas {

	public static void main(String[] args) {
		
		String texto=JOptionPane.showInputDialog("Escribe una cantidad en euros");
        double cantidad=Double.parseDouble(texto);
        
        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
        conversor(cantidad, moneda);
    }
	
	
   public static void conversor (double cantidad, String moneda){
	   
        double resultado=0;
 
        //Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de moneda correcto
        boolean correcto = true;
 
        //Segun la moneda, calculamos la cantidad
        
        switch (moneda){
        case "libras":
            resultado=cantidad*0.86;
            break;
        case "dolares":
            resultado=cantidad*1.29;
            break;
        case "yenes":
            resultado=cantidad*129.852;
            break;
        default:
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        //Solo si es correcto muestra el mensaje
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +resultado);
        }
		
		
		

	}

}
