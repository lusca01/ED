//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

//Cliente com os atributos: nome, endereço e telefone
public class Cliente {
	private String nome, endereco, telefone;
	private int alugueis;

//Construtor do Cliente com nome, endereço, telefone e alugueis
	public Cliente(String nome, String endereco, String telefone, int alugueis) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.alugueis = alugueis;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
//Organiza e mostra os dados do cliente.
	public String mostraCliente() {
		String aux = "Nome: " + this.nome + " \nEndereço: " + this.endereco+ "\nTelefone: "
				+ this.telefone + " Aluguéis feitos: " + this.alugueis + "\n";
		return aux;
	}
	public int getAlugueis() {
		return alugueis;
	}
	public void setAlugueis(int alugueis) {
		this.alugueis = alugueis;
	}
}
