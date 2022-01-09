package lambda.util;

import lambda.modelo.Fatura;

public class EnviadorEmail {

	public static void enviar(Fatura fatura) {
		System.out.println("Email enviado para: " + fatura.getEmail() + " para o Sr(a) " + fatura.getNome() + ", referente ao valor de " + fatura.getValor());
	}
	
}
