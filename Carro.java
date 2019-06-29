package projeto;

public abstract class Carro {
	private String cor;
	private String modelo;
	private double valor=-1;
	private String recado1;
	private String recado2;
	private String recado3;
	private String recado4;
	private String recado5;
	
	
	public String getCor() {
		return cor;
	}
	public abstract void ipva();
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getRecado1() {
		return recado1;
	}
	public void setRecado1(String recado1) {
		this.recado1 = recado1;
	}
	public String getRecado2() {
		return recado2;
	}
	public void setRecado2(String recado2) {
		this.recado2 = recado2;
	}
	public String getRecado3() {
		return recado3;
	}
	public void setRecado3(String recado3) {
		this.recado3 = recado3;
	}
	public String getRecado4() {
		return recado4;
	}
	public void setRecado4(String recado4) {
		this.recado4 = recado4;
	}
	public String getRecado5() {
		return recado5;
	}
	public void setRecado5(String recado5) {
		this.recado5 = recado5;
	}
}
