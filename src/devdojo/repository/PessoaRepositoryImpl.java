package devdojo.repository;

import java.util.ArrayList;
import java.util.List;

import devdojo.dominio.Pessoa;

public class PessoaRepositoryImpl implements PessoaRepository{

    List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	@Override
	public Pessoa findById(Long id) {
		Pessoa result = new Pessoa();
		
		for (Pessoa pessoa: getList()) {
			if(pessoa.getId().equals(id)) {
				result = pessoa;
			}
		}
		return result;
	}

	@Override
	public List<Pessoa> findByName(String nome) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for (Pessoa pessoa: getList()) {
			if(pessoa.getNome().equals(nome)) {
				pessoas.add(pessoa);
			}
		}
		return pessoas;
	}
	
	@Override
	public List<Pessoa> findAll() {		
		return getList();
	}
	
	private List<Pessoa> getList(){
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1l, "Rafael"));
		pessoas.add(new Pessoa(2l, "Marcos"));
		pessoas.add(new Pessoa(3l, "João"));
		pessoas.add(new Pessoa(4l, "Maria"));
		pessoas.add(new Pessoa(5l, "Bruno"));
		pessoas.add(new Pessoa(6l, "Jéssica"));
		pessoas.add(new Pessoa(7l, "Otavio"));
		pessoas.add(new Pessoa(8l, "Carlos"));
		pessoas.add(new Pessoa(9l, "Daniel"));
		pessoas.add(new Pessoa(10l, "Farley"));
		pessoas.add(new Pessoa(11l, "Pablo"));
		return pessoas;
	}

}
