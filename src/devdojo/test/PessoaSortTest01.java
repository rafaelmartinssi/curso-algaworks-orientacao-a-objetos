package devdojo.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.dominio.Pessoa;

public class PessoaSortTest01 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "Rafael"));
		pessoas.add(new Pessoa(2L, "Marcos"));
		pessoas.add(new Pessoa(3L, "Marcelo"));
		pessoas.add(new Pessoa(4L, "Sandra"));
		pessoas.add(new Pessoa(5L, "Bruna"));
		
		pessoas.forEach(pessoa -> System.out.println(pessoa));
		
		System.out.println("----------------------");
		
		//Collections.sort(pessoas);
		
		
		pessoas
		.removeIf(pessoa -> pessoa.getId() == 1L);

		pessoas.forEach(pessoa -> System.out.println(pessoa));

	}
}
