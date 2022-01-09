import com.google.gson.Gson;

public class Principal {
	public static void main (String [] args) {
		Pessoa pessoa = new Pessoa("Rafael", 32, 
				new Endereco("Praça Rio Branco, 56", "Centro", "Belo Horizonte", "MG"),  
				new Telefone("CELULAR", "(31)99490-5907"));
		Gson gson = new Gson();
		String json = gson.toJson(pessoa);
		
		System.out.println(json);
	}
}
