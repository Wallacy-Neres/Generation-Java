package exVeiculo;

public class CarroPasseio extends Veiculo{
private String cor;
private String modelo;

public void EntrPass(String cor, String modelo) {
	this.cor = cor;
	this.modelo = modelo;
}

public void MostrPass() {
	System.out.println("A cor do veiculo �: " + this.cor);
	System.out.println("O modelo do veiculo �: " + this.modelo + "\n");
}
}
