package polimorfismoAnimal;

public class main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo ();
		Preguica preguica = new Preguica ();
		
		System.out.println(emitirSomA(cachorro));
		System.out.println(emitirSomA(cavalo));
		System.out.println(emitirSomA(preguica));
		
		cachorro.setNome("Max");
		cachorro.setIdade(7);
		
		cavalo.setNome("Alipio");
		cavalo.setIdade(10);
		
		preguica.setNome("Adelaide");
		preguica.setIdade(5);
		
		Veterinario veterinario = new Veterinario();
		
		String exames = veterinario.examinar(cachorro, cavalo, preguica);
		System.out.println(exames);

	}
	
	public static String emitirSomA (Animal animal) {
		return animal.emitiSom();
	}
	
	

}
