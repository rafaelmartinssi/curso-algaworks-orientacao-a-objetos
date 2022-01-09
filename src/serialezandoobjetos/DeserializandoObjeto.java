package serialezandoobjetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {
	public static void main(String[] args) {
		try (ObjectInput input = new ObjectInputStream(new FileInputStream("object.txt"))) {
			Pessoa pessoa = (Pessoa) input.readObject();
			System.out.println(pessoa);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.err.println("Erro convertendo para a classe Pessoa");
			e.printStackTrace();
		}
		
	}
}
