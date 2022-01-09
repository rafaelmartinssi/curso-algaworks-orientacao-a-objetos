package serialezandoobjetos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rafael");
		pessoa.setIdade(32);
		pessoa.setProfissao("Técnico");
		
		try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("object.txt"))){
			output.writeObject(pessoa);
			System.out.println("Salvo com sucesso");
			
		} catch (IOException e) {
			System.err.println("Erro salvando objeto. " + e.getMessage());
			e.printStackTrace();
		}
	}
}
