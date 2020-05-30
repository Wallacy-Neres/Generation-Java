package exCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Telefone> lista = new ArrayList<Telefone>();
		
		Telefone numero1 = new Telefone("95730-3599", 1);
		Telefone numero2 = new Telefone("93035-4540", 2);
		
		lista.add(numero1);
		lista.add(numero2);
		
		
		Telefone telefone;
		
		Iterator<Telefone> itr = lista.iterator();
			while (itr.hasNext()) {
				telefone = itr.next();
			System.out.println(telefone.getNrTelefone());
			}
}
	
}
