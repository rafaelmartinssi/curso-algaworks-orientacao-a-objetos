package lambda;

import java.util.ArrayList;
import java.util.List;

import lambda.modelo.Fatura;

public class FaturaDao {

	public static List<Fatura> getFaturas() {
		Fatura fatura = new Fatura("Rafael", "rafael@gmail.com", 150.00);
		Fatura fatura1 = new Fatura("João", "joao@gmail.com", 290.00);
		Fatura fatura2 = new Fatura("Maria", "maria@gmail.com", 320.00);
		List<Fatura> faturas = new ArrayList<Fatura>();
		faturas.add(fatura);
		faturas.add(fatura1);
		faturas.add(fatura2);
		return faturas;
	}
	
}
