package POO;
//video 76: clases y metodos abstactos


public class ATSClasesYMetodosAbstarctosAnimalCarnivoro extends ATSClasesYMetodosAbstarctosAnimal {

	
	//sobre escribo metodo abstaracto de la clase animal
	
	@Override
	public void alimentarse() {
		System.out.println("El animal carnivoro se alimenta de carne.");
	}
}
