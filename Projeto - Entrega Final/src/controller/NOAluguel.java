//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

public class NOAluguel {
	public Aluguel aluguel;
	public NOAluguel prox;//Ponteiro para o próximo tema
	public NOAluguel ant;//Ponteiro para o aluguel anterior

	public NOAluguel (Aluguel x){//Construtor do NOAluguel
		this.aluguel = x;
		prox = null;
		ant = null;
	}
}
