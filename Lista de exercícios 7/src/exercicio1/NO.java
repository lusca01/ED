//1) Implemente uma Lista de Alunos em alocação dinâmica de memória duplamente encadeada
//com os atributos id, nome e curso. Deve ser implementado pelo menos um método recursivo.
//Realize as seguintes operações 
//verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
//adicionar um aluno no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//adicionar um aluno no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//remover um aluno do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando. 
//remover um alunodo final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando. 
//percorrer e apresentar cada um dos elementos da lista
package exercicio1;

public class NO {
	public Aluno aluno;
	public NO prox;
	public NO ant;

	public NO (Aluno aluno){
		this.aluno = aluno;
		prox = null;
		ant = null;
	}
}