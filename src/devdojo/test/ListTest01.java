package devdojo.test;

import java.util.ArrayList;
import java.util.List;

import devdojo.dominio.Smartphone;

public class ListTest01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Rafael");
		nomes.add("João");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("---------------");
		nomes.remove("João");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("---------------");
		
		Smartphone s1 = new Smartphone("AB12DG", "IPhone");
		Smartphone s2 = new Smartphone("ADRT15", "Samsung");
		Smartphone s3 = new Smartphone("ITUDG1", "Motorola");
		
		List<Smartphone> smartphones = new ArrayList<>();
		smartphones.add(s1);
		smartphones.add(s2);
		smartphones.add(s3);
		
		for (Smartphone s : smartphones) {
			System.out.println(s);
		}
		
		Smartphone s4 = new Smartphone("AB12DG", "IPhone");
		System.out.println(smartphones.contains(s4));
	}
}
