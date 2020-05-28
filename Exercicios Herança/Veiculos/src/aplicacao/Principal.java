package aplicacao;

import java.util.Scanner;

import entidades.Moto;
import entidades.Carro;
import entidades.Veiculo;

public class Principal {
	public static void main (String[] args) {
		
		Carro carro = new Carro();
		
		carro.setMarca("GM");
		carro.setModelo("Corsa");
		carro.setCor("Vermelho");
		carro.setNumPortas(4);
		carro.setvelMax(200);
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("CBX");
		moto.setCor("Preta");
		moto.setQuantidadeRodas(2);
		moto.setvelMax(180);
		
		carro.acelerar();
		carro.frear();
		carro.curva();
		
		moto.acelerar();
		moto.frear();
		moto.curva();		
		
		
	}
	
	
}
