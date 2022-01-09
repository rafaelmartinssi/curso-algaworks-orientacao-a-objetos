package lambda.modelo;

public class Fatura {
	
	private String nome;
	private String email;
	private double valor;
	private boolean enviado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Fatura(String nome, String email, double valor) {
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}
	public boolean isEnviado() {
		return enviado;
	}
	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}
	public void enviar() {
		this.enviado = true;
	}
}
