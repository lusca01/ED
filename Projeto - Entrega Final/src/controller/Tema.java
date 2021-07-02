//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

//Tema com os atributos: titulo, descricao e valor;
public class Tema {
	private String titulo, descricao;
	private double valor;
	
//Construtor do tema com titulo, descricao e valor
	public Tema(String titulo, String descricao, double valor) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
	}	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
//Mostra os dados do tema de forma organizada
	public String mostraTema() {
		String aux = "Título: " + this.titulo + " \nDescrição: " + this.descricao+ "\nValor: "
				+ this.valor + "\n";
		return aux;
	}
}
