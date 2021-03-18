//2. Implemente uma Lista de temperatura sem alocação dinâmicacom todas as operações indicadas a seguir:
//-verificar sea lista está vazia, retornando true se estiver vazia e false se nãoestiver;
//-adicionar uma temperaturano início da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturano final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturaem determinada posição da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado início da lista, retornando o valor que foi removido,caso a operação não possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
//-remover a temperaturade determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-percorrer e apresentar cada um dos elementos da lista.
package exercício2;

public class NO {
	public double temperatura;
	public NO prox;

	public NO (double x){
		temperatura = x;
		prox = null;
	}
}
