package date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import date.modelo.Cliente;

public class CadastroCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Rafael Martins", LocalDate.of(1988, Month.NOVEMBER, 27));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		System.out.println(idade);
		
	}
}
