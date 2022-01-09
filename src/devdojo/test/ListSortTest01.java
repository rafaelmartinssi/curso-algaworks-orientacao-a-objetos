package devdojo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Rafael");
		nomes.add("Mateus");
		nomes.add("Milena");
		nomes.add("Sandra");
		nomes.add("João");
		
		Collections.sort(nomes);
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
	}

}
