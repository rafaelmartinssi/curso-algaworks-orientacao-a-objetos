package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoPedido {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("item_pedido.txt")))){
			scanner.useDelimiter(";");
			Locale locale = new Locale("pt", "BR");
			scanner.useLocale(locale);
			
			NumberFormat format = NumberFormat.getCurrencyInstance(locale);
			
			while (scanner.hasNext()) {
				String produto = scanner.next();
				int quantidade = scanner.nextInt();
				double valor = scanner.nextDouble();
				scanner.nextLine();
				System.out.printf("Produto: %s. Quantidade: %d. Por: %s\n", produto, quantidade, format.format(valor));
			}
			
		}catch (IOException e) {
			System.err.print("Não conseguiu ler o arquivo.");
		}
	}
}
