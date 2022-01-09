package lambda;

import java.util.List;

import lambda.modelo.Fatura;
import lambda.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturas = FaturaDao.getFaturas();
		
		//forma padrão
		for(Fatura fatura : faturas) {
			EnviadorEmail.enviar(fatura);
		}
		
		//interface com default methods
		faturas.forEach(fatura -> EnviadorEmail.enviar(fatura));
		
		//interface com default methods passando lambda como parámetro
		faturas.forEach(f -> {
			EnviadorEmail.enviar(f);
			f.setEnviado(true);
		});
		
		//interface com default methods chamando Methods References
		faturas.forEach(Fatura::enviar);
		
		//um pouco sobre stream
		faturas.stream()
			.filter(f -> f.getValor() > 200.00)
			.forEach(f -> System.out.println(f.getNome()));
	
	}
	
}
