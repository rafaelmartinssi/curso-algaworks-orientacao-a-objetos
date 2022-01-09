package devdojo.test;

import java.util.HashMap;
import java.util.Map;

import devdojo.dominio.Pessoa;
import devdojo.dominio.Produto;

public class MapTest01 {
	public static void main(String[] args) {
		Map<Pessoa, Produto> compras = new HashMap<>();
		
		Pessoa pessoa1 = new Pessoa(1L, "Rafael");
		Pessoa pessoa2 = new Pessoa(2L, "Milena");
		
		Produto produto1 = new Produto(1L, "Arroz");
		Produto produto3 = new Produto(3L, "Milho");
		
		compras.put(pessoa1, produto1);
		compras.put(pessoa2, produto3);
		
		compras.entrySet().forEach(compra -> System.out.println(compra.getKey() + " = " + compra.getValue()));
		

	}
}
