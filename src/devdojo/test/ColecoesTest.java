package devdojo.test;

import devdojo.dominio.Smartphone;

public class ColecoesTest {
	public static void main(String[] args) {
		Smartphone smartphone1 = new Smartphone("AB12DG", "IPhone");
		Smartphone smartphone2 = new Smartphone("AB12DG", "IPhone");
		
		boolean res1 = smartphone1 == smartphone2;
		boolean res2 = smartphone1.equals(smartphone2);
		smartphone1 = smartphone2;
		boolean res3 = smartphone1.equals(smartphone2);
		
		System.out.println("Resultado da comparação 1: " + res1);
		System.out.println("Resultado da comparação 2: " + res2);
		System.out.println("Resultado da comparação 3: " + res3);

	}

}
