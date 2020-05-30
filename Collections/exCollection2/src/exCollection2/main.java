package exCollection2;

import java.util.ArrayList;

public class main {
	public static class TestandoListas {
		 
	    public static void main(String[] args) {
	    	
	    	// Declaração de variaveis do tipo String e preenchimento das mesmas.
	        String aula1 = "Modelando a classe Aula";
	        String aula2 = "Conhecendo mais de listas";
	        String aula3 = "Trabalhando com Cursos e Sets";
	 
	        //Instaciando um arrayList 
	        ArrayList<String> aulas = new ArrayList<>();
	        
	        //Populando o array.
	        aulas.add(aula1);
	        aulas.add(aula2);
	        aulas.add(aula3);        
	 
	        	//Imprimindo array e seu tamanho;
	        System.out.println(aulas);
	        System.out.println(aulas.size());
	 
	        // cuidado! <= faz sentido aqui?
	        for (int i = 0; i <= aulas.size(); i++) {
	            System.out.println("Aula: " + aulas.get(i));
	        }
	    }
	}
}

