//2. Implemente uma Lista de temperaturas em alocação dinâmicacom todas as operações indicadas a seguir e que utilize pelo menos um método recursivo.
//verificar se a lista está vazia, retornando true se estiver vazia e false se nãoestiver;
//adicionar uma temperatura no início da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura no final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//removera temperatura do início da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagemavisando;
//remover a temperatura do final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
//remover a temperatura de determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//percorrer e apresentar cada um dos elementos da lista.
//Explique comoa recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta.
package exercício2;

public class NO {
	public double temperatura;
	public NO prox;

	public NO (double x){
		temperatura = x;
		prox = null;
	}
}