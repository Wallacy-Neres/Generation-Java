package polimorfismoAnimal;

public class Veterinario {

	
	public String examinar(Animal cachorro, Animal cavalo, Animal preguica) {
		String exameCachorro = "O (a)" + cachorro.getNome() + " idade " + cachorro.getIdade() + " " +  cachorro.emitiSom(); 
		String exameCavalo = "\n O (a)" + cavalo.getNome() + " idade " + cavalo.getIdade() + " " + cavalo.emitiSom();
		String examePreguica = "\n O (a)" + preguica.getNome() + " idade " + preguica.getIdade() + " " + preguica.emitiSom();
		
		return exameCachorro + " " + exameCavalo + " " + examePreguica;
	}
}
