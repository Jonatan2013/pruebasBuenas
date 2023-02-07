package POO;
//video 75: sobre Escritura de miembros

//sobre escityura de miembors es tanto un metodo como un atributo. sobrecarga de metodos ocurre cuando es de la mimmas clase
// pero sobre escritura de miembros es cuando heredas de una superclase/clase padre sus atributos y metodos y cambias algo de ese metodo para que salga mas " personalizado "

public class ATSSobreEscrituraDeMiembrosMain {

		
	public static void main(String[] args) {
	
		
		
		ATSSobreEscrituraDeMiembrosPersonA persona = new ATSSobreEscrituraDeMiembrosPersonA();
		ATSSobreEscrituraDeMiembrosPerrO perro = new ATSSobreEscrituraDeMiembrosPerrO();
		ATSSobreEscrituraDeMiembrosAnimaL animal = new ATSSobreEscrituraDeMiembrosAnimaL();
		
		
		persona.comer();//invoco a un metodo persona..estoy sobre escribiendo del metodo superclase
		perro.comer();//invoco a un metodo persona..estoy sobre escribiendo del metodo superclase
		
		animal.comer();//invoco al metodo super clase...
		
	}

}
