//2. Implemente uma Lista de temperaturas em aloca��o din�micacom todas as opera��es indicadas a seguir e que utilize pelo menos um m�todo recursivo.
//verificar se a lista est� vazia, retornando true se estiver vazia e false se n�oestiver;
//adicionar uma temperatura no in�cio da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura no final da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura em determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//removera temperatura do in�cio da lista, retornando o valor que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//remover a temperatura do final da lista, retornando o valor que foi removido, caso a opera��o n�o  possa ser realizada, mostre mensagem avisando;
//remover a temperatura de determinada posi��o da lista, retornando o valor que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//percorrer e apresentar cada um dos elementos da lista.
//Explique comoa recursividade foi aplicada em cada um dos m�todos, detalhando se foi aplicada recursividade direta ou indireta.
package exerc�cio2;

public class NO {
	public double temperatura;
	public NO prox;

	public NO (double x){
		temperatura = x;
		prox = null;
	}
}