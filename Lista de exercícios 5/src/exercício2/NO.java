//2. Implemente uma Lista de temperatura sem aloca��o din�micacom todas as opera��es indicadas a seguir:
//-verificar sea lista est� vazia, retornando true se estiver vazia e false se n�oestiver;
//-adicionar uma temperaturano in�cio da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturano final da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturaem determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado in�cio da lista, retornando o valor que foi removido,caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado final da lista, retornando o valor que foi removido, caso a opera��o n�o  possa ser realizada, mostre mensagem avisando;
//-remover a temperaturade determinada posi��o da lista, retornando o valor que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-percorrer e apresentar cada um dos elementos da lista.
package exerc�cio2;

public class NO {
	public double temperatura;
	public NO prox;

	public NO (double x){
		temperatura = x;
		prox = null;
	}
}
