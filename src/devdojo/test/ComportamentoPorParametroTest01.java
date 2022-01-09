package devdojo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import devdojo.dominio.Pessoa;

public class ComportamentoPorParametroTest01 {
	

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "Rafael"));
		pessoas.add(new Pessoa(2L, "Mateus"));
		pessoas.add(new Pessoa(3L, "Bruno"));
		
		List<Pessoa> result = filter(pessoas, pessoa -> pessoa.getId() > 1);
		
		System.out.println(result);
		
		List<Pessoa> resultList = pessoas.stream().filter(pessoa -> pessoa.getId() > 1)
			.collect(Collectors.toList());
		
		System.out.println(resultList);
	}
	
	public static List<Pessoa> filter(List<Pessoa> pessoas, Predicate<Pessoa> predicate){
		List<Pessoa> list = new ArrayList<>();
		
		for(Pessoa pessoa: pessoas) {
			if(predicate.test(pessoa)) {
				list.add(pessoa);
			}
		}
		return list;
	}
}
