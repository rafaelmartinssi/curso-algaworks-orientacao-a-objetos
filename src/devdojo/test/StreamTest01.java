package devdojo.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import devdojo.dominio.Pessoa;
import devdojo.repository.PessoaRepository;
import devdojo.repository.PessoaRepositoryImpl;

public class StreamTest01 {
	public static void main(String[] args) {
		PessoaRepository pessoaRepository = new PessoaRepositoryImpl();
		
		List<Pessoa> pessoas = pessoaRepository.findAll();

		List<String> nomes = pessoas.stream()
			.sorted(Comparator.comparing(Pessoa::getNome))
			.filter(p -> p.getId() > 5)
			.limit(3)
			.map(Pessoa::getNome)
			.collect(Collectors.toList());
		nomes.forEach(System.out::println);
		
		Optional<Long> teste = pessoas.stream()
		.map(Pessoa::getId)
		.reduce(Long::sum);
		System.out.println("--------------");
		System.out.println(teste.get());
		
	}
}
