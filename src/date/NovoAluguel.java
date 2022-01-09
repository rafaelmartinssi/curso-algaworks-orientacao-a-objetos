package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import date.modelo.Aluguel;
import date.modelo.Carro;
import date.modelo.Cliente;

public class NovoAluguel {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Rafael Martins", LocalDate.of(1988, Month.NOVEMBER, 27));
		Carro carro = new Carro("Gol", 40.0, Year.of(2002));
		
		LocalDateTime dataHoraRetirada = LocalDateTime.now();
		LocalDateTime dataHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataHoraRetirada, dataHoraPrevistaDevolucao);
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(">>>>>>>>>>>>>>>>RECIBO<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Data e hora da retirada: " + aluguel.getDataHoraRetirada().format(formater));
		System.out.println("Data e hora prevista de devolução: " + aluguel.getDataHoraPrevistaDevolucao().format(formater));
	}
}
