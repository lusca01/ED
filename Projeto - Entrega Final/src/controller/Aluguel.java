//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

//Aluguel com os atributos: ID, endereço da festa, dia da festa, mes da festa, horários de início e fim, valorfinal, cliente e tema.
public class Aluguel {
	private String enderecoFesta;
	private int diaFesta, mesFesta, hrFesta, hrFimFesta, ID;
	private double valorFinal;
	private Cliente cliente;
	private Tema tema;

//Contrututor com ID, EnderecoFesta, diaFesta, mesFesta, hrFesta, hrFimFesta, valorFinal, Cliente e Tema.
	public Aluguel(int ID, String enderecoFesta, int diaFesta, int mesFesta, int hrFesta, int hrFimFesta, double valorFinal, Cliente cliente, Tema tema) {
		this.ID = ID;
		this.enderecoFesta = enderecoFesta;
		this.diaFesta = diaFesta;
		this.mesFesta = mesFesta;
		this.hrFesta = hrFesta;
		this.hrFimFesta = hrFimFesta;
		this.valorFinal = valorFinal;
		this.cliente = cliente;
		this.tema = tema;
	}
	public String getEnderecoFesta() {
		return enderecoFesta;
	}
	public void setEnderecoFesta(String enderecoFesta) {
		this.enderecoFesta = enderecoFesta;
	}
	public int getDiaFesta() {
		return diaFesta;
	}
	public void setDiaFesta(int diaFesta) {
		this.diaFesta = diaFesta;
	}
	public int getMesFesta() {
		return mesFesta;
	}
	public void setMesFesta(int mesFesta) {
		this.mesFesta = mesFesta;
	}
	public int getHrFesta() {
		return hrFesta;
	}
	public void setHrFesta(int hrFesta) {
		this.hrFesta = hrFesta;
	}
	public int getHrFimFesta() {
		return hrFimFesta;
	}
	public void setHrFimFesta(int hrFimFesta) {
		this.hrFimFesta = hrFimFesta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Tema getTema() {
		return tema;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
//Mostra o aluguel de forma organizada e estruturada
	public String mostraAluguel() {
		String aux = "ID: " + this.ID + " Data: " + this.diaFesta +"/"+ this.mesFesta +"/2021  \nEndereço: " + this.enderecoFesta+ "\nHora início: "
				+ this.hrFesta + "h Hora fim: " + this.hrFimFesta +"h \nCliente:" +this.cliente.getNome()
				+ " Tema: " + this.tema.getTitulo() + " \nValor: " + this.valorFinal + "\n";
		return aux;
	}
}
