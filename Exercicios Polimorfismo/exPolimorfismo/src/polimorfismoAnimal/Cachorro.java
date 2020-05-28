package polimorfismoAnimal;

public class Cachorro extends Animal{

	@Override
	public String emitiSom() {
		
		return "Latindo";
	}

	@Override
	public String fazendo() {
		
		return "Correndo";
	}

}
