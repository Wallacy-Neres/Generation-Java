package AtividadeGeneration;

public class Aeronave {
	//atributos
	
	private String modelo;
	private String cor;
	
	
	public Aeronave (String cor, String modelo) {
		this.modelo = modelo;
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void mostraModelo() {
		System.out.println("O modelo da aeronave é " +getModelo());
	}
	
	public void mostraModeloCor() {
		System.out.println("A aeronave é: " + getCor() + " e o modelo é: " +getModelo());
	}
}
