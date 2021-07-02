//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

public class NOTema {
	public Tema tema;
	public NOTema prox;//Ponteiro para o próximo tema
	public NOTema ant;//Ponteiro para o tema anterior

	public NOTema (Tema x){//Construtor do NOTema
		this.tema = x;
		prox = null;
		ant = null;		
	}
}