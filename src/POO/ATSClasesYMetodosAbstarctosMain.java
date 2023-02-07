package POO;
//video 76: clases y metodos abstactos
public class ATSClasesYMetodosAbstarctosMain {

	public static void main(String[] args) {

		
		ATSClasesYMetodosAbstarctosPlanta planta = new ATSClasesYMetodosAbstarctosPlanta();
		ATSClasesYMetodosAbstarctosAnimalCarnivoro animalCarnivoro = new ATSClasesYMetodosAbstarctosAnimalCarnivoro();
		ATSClasesYMetodosAbstarctosAnimalHerbiboro animalHerbivoro = new ATSClasesYMetodosAbstarctosAnimalHerbiboro ();
		
		//no se puede crear objeto ni de servivo ni de animal porque no especifican,,no se puede definir metodo en la clase.
		
		
		
		
		planta.alimentarse();
		animalCarnivoro.alimentarse();
		animalHerbivoro.alimentarse();
		
		
		
	}

}
