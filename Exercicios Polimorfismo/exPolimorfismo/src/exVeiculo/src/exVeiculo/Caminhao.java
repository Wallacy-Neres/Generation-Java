package exVeiculo;

public class Caminhao extends Veiculo {
private int toneladas;
private int alturaMax;
private int comprimento;

public void EntrCam(int toneladas, int alturaMax, int comprimento) {
	this.toneladas = toneladas;
	this.alturaMax = alturaMax;
	this.comprimento = comprimento;
}

public void MostrCam() {
	System.out.println("Carga maxima do veiculo: " + this.toneladas + "Ton");
	System.out.println("Altura maxima: " + this.alturaMax);
	System.out.println("Comprimento: " + this.comprimento + "metros");
}

}
