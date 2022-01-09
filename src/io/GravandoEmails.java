package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmails {
	public static void main(String[] args) {
		String[] emails = {"abc@gmail.com", "def@gmail.com", "ghi@gmail.com"};
		

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))){
			
			for (String email : emails) {
				writer.write(email);
				writer.newLine();
			}
			
		} catch (IOException e) {
			System.err.print("Não conseguiu gravar o arquivo.");
		}
	}
}
