package polimorfismoAnimal;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public abstract String emitiSom();
	public abstract String fazendo();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
