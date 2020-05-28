package polimorfismoAnimal;

public class Cavalo extends Animal{

	@Override
	public String emitiSom() {
		
		return "Relinchando";
	}

	@Override
	public String fazendo() {
		
		return "Correndo";
	}

}
