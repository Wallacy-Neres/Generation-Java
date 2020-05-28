package AtividadeGeneration;

public class UtilizandoClasseAeronave {
	public static void main (String[] args) {
		String modelo = "Boing 747";
		String cor = "Branca";
		
		Aeronave aeronave = new Aeronave(modelo, cor);
		
		aeronave.mostraModeloCor();
		
		aeronave.setCor("azul");
		
		aeronave.setModelo("Boing 777");
		
		aeronave.mostraModeloCor();
		
	}
}
