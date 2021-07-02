//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

public class NOCliente {
	public Cliente cliente;
	public NOCliente prox;//Ponteiro para o próximo tema
	public NOCliente ant;//Ponteiro para o cliente anterior

	public NOCliente (Cliente x){//Construtor do NOCliente
		this.cliente = x;
		prox = null;
		ant = null;
	}
}