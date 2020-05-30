package exVeiculo;

public abstract class Veiculo {
private float pesoKg;
private float velocMax;
private float preco;

public void EntrVeic(float pesoKg, float velocMax, float preco) {
	this.pesoKg = pesoKg;
	this.velocMax = velocMax;
	this.preco = preco;
}

public void MostrVeic() {
	System.out.println("O peso do veiculo é: " + this.pesoKg + "Kg");
	System.out.println("A velocidade maxima do veiculo é: " + velocMax + "Km");
	System.out.println("O preço do veiculo é R$ " + this.preco);
}

}


