package entidades;

import java.util.Scanner;

public class Veiculo {
private String marca;
private String modelo;
private String cor;
private int velMax;




public Veiculo() {
	
}

public Veiculo(String marca, String modelo, String cor, int velMax) {
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
	this.velMax = velMax;
	
	
}



public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
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

public int getvelMax() {
	return velMax;
}

public void setvelMax(int velMax) {
	this.velMax = velMax;
}

public void acelerar() {
	int velo = 0;
	Scanner teste = new Scanner(System.in);
	System.out.println("aperte 1 para acelerar: ");
	
	
	while(teste.nextInt() != 0 && velo < velMax) {
		velo+=10;
		System.out.println(velo);
		
	}
		
}


public void frear() {
	int velo = velMax;
	Scanner teste = new Scanner(System.in);
	System.out.println(velo);
	System.out.println("aperte 1 para frear: ");
	
	
	
	while(teste.nextInt() != 0 && velo != 0) {
		velo-=10;
		System.out.println("Velocidade Atual " + velo);
	}
	
	if(velo == 0) {
		System.out.println("Veiculo Parado");
	}
	
		
}


public int curva() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a velocidade do veiculo");
	int velocidade = entrada.nextInt();
	if(velocidade >=70 ) {
		System.out.println("Veiculo capotou");
	return velocidade;
	}else {
		System.out.println("Curva realizada com sucesso");
		return velocidade;
	}
	
}

}
