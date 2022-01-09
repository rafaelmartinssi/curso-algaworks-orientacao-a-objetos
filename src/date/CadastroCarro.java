package date;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import date.modelo.Carro;

public class CadastroCarro {
	public static void main(String[] args) {
		Carro gol = new Carro("Gol", 40.0, Year.of(2002));
		Carro cruze = new Carro("Cruze", 90.0, Year.parse("2006"));
		Carro celta = new Carro("Celta", 20.0, Year.of(2004));
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(gol);
		carros.add(cruze);
		carros.add(celta);
		
		carros.stream()
		.filter(carro -> carro.getAno().isAfter(Year.of(2003)))
		.forEach(carro -> System.out.println(carro.getModelo()));
	}
}
