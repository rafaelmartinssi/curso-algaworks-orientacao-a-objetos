package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoEmails {
	public static void main(String[] args) {
		try(BufferedReader read = new BufferedReader(new FileReader("emails.txt"))){
			String email = null;
			while ((email = read.readLine()) != null) {
				System.out.println("Enviando e-mail para: " + email);
			}
		}catch (IOException e) {
			System.err.print("Não conseguiu ler o arquivo.");
		}
	}
}
