
public class Pessoa {
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private Telefone telefone;
	
	public Pessoa() {}
	public Pessoa(String nome, int idade, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
}
