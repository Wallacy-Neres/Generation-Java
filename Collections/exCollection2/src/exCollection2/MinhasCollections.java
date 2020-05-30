package exCollection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class MinhasCollections {
    public static void main(String[] args) {
    	
    	//Instaciando um arrayList que recebe inteiros.
        List<Integer> minhaLista = new ArrayList<Integer>();
        //Populando array com numeros inteiros.
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);
        // ForEach varrendo o array e printando na tela os elementos.
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }
        
        //Criando uma lista do tipo set 
        Set<Integer> meuSet = new HashSet<Integer>();
        
        // Adicionando numeros a lista do "meuSet"
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1);
        
        // Utilização de um iterador para pegar toda a lista de "meuSet"
        Iterator<Integer> iMeuSet = meuSet.iterator();
        //Através do hasNext percorre a lista enquando houver elementos e quando não houver mais retorna falso.
        while(iMeuSet.hasNext()){
        //Printa na tela todos os itens encontrados na lista.
            System.out.println(iMeuSet.next());
        }
 
 
 
    }
 
}

