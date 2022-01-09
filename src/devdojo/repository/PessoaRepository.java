package devdojo.repository;

import java.util.List;

import devdojo.dominio.Pessoa;

public interface PessoaRepository {
	
	Pessoa findById (Long id);
	List<Pessoa> findByName (String nome);
	List<Pessoa> findAll ();
	
}
