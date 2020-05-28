package eletrodomesticos;

public class UtilizandoClasseEletrodomestico {
	public static void main (String[] args) {
		String marca = "Consul";
		String tipo = "Geladeira";
		Double preco = 1.500;
		
		Eletrodomestico eletro = new Eletrodomestico (marca, tipo, preco);
		
		
		eletro.mostraMarca();
		
		eletro.mostraTipo();
		
		
		eletro.mostraPreco();
		
	}
}
