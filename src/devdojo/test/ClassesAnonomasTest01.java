package devdojo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import devdojo.dominio.Pessoa;

public class ClassesAnonomasTest01 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "Rafael"));
		pessoas.add(new Pessoa(2L, "Mateus"));
		pessoas.add(new Pessoa(3L, "Bruno"));
		
		//utilizando classes anônimas 
		pessoas.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa arg0, Pessoa arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}
		});
		
		//utilizando expresso~es lambda
		pessoas.sort((arg0, arg1) -> arg0.getNome().compareTo(arg1.getNome()));
		
		pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
	}
}
