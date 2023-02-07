package interfacesGraficasDeUsuario;
//video 86/87/88/ 89/ 90 : creacion de una ventana..

//cuando creamos una ventana, despues creamos un panel y en este panel es dodnde pondremos todos nuestros componentes, es decir, los botones, color del fondo, etiquetas,etc..
//crear una venta depues al crear esa ventana es como si por encima colocamos el panel y despues ese panel con todos sus componentes..algo asi... no se pone los componentes sobre la ventana si no el panel.
//se puede escribir y hacer todos los graficos sobre la ventana, pero no es recomendable hacerlo,,para ellos esta los paneles.


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ATSCreacionDeUnaVentana extends JFrame {


				//CONSTRUCTOR
	
	public ATSCreacionDeUnaVentana() {
		this.setSize(500, 500);    //ESTABLECEMOS EL TAMAÑO DE LA VENTANA: 1º PARAMETRO/ANCHO--2º PARAMETRO: LARGO..  //**this es opcional ponerlo**
//		this.setLocation(100,200);  // establecemos la posicion inicial de la ventana
//		
		//**setbounds equivale en un solo metodo a setsize y setlocation
		//this.setBounds(100, 200, 500, 500);
		//this.setResizable(false); // establecemos si la ventana puede cambiar de tamaño o no
		
		
		
		this.setTitle("El mejor titulo");   //establecemos el titulo de la ventana
		
		this.setLocationRelativeTo(null);  //establecemos la ventana en el centro de la pantalla //**por eso he dejado comentado ambos metodos de posicionamiento dela ventana xq ya lo hace este metodo
		
		this.setMinimumSize(new Dimension(200, 200)); // establecemos el tamaño minimo
		
		//this.getContentPane().setBackground(Color.BLUE); //establecemos el color del fondo
		
		
		iniciarComponentes();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //HACE QUE CUANDO CIERRE LA VENTANA QUE HE CREADO EL PROGRAMA FINALICE AUTOMATICAMENTE Y NO LO TENGA QUE HACER A MANO.
		
	}
	
	
	
	private void iniciarComponentes() {  //iniciamos los diferentes componentes: panel, botones, etiquetas, etc.
		
		JPanel panel = new JPanel(); // creacion del panel...pero todavia no esta encima de mi ventana..
		//panel.setBackground(Color.green);//estabñecemos el color del panel
		this.getContentPane().add(panel); //agregamos el panel a la ventana
		panel.setLayout(null);  //Desactivando el Diseño (Layout) del panel
		
		//creaar una etiqueta de texto 
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Hola  ");//establecemos el texto de la etiqueta o tambien podemos ponerlo en el JLabel etiqueta = new JLabel("hola");
		etiqueta.setBounds(10, 10, 50, 30);
		panel.add(etiqueta); //agregamos la etiqueta al panel	
		
	}
	
	
	
}
