package eletrodomesticos;

public class Eletrodomestico {
	private String marca;
	private String tipo;
	private Double preco;
	
	public Eletrodomestico(String marca, String tipo, Double preco) {
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void mostraMarca() {
		System.out.println("A marca é " + getMarca());
	}
	
	public void mostraTipo() {
		System.out.println("O eletrodomentico é um(a) " + getTipo());
	}
	
	public void mostraPreco() {
		System.out.printf("%s custa R$ %.3f", getTipo(), getPreco());
	}
	
	
}
