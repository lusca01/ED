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

import javax.swing.JOptionPane;

public class ListaAlunos {
	private NO inicio;

	public ListaAlunos(){
		inicio = null;
	}
	
	public void verificaVazio() {
		if(inicio == null) {
			JOptionPane.showMessageDialog(null,"A lista de alunos está vazia!");
		}else {
			JOptionPane.showMessageDialog(null,"A lista de alunos não está vazia!");
		}
	}
	
	public void adicionarFinal(Aluno x){
		NO s = new NO(x); // O elemento s recebe o valor de x
		if(inicio == null) { // Verifica se o inicio é null, caso sim, adiciona no próprio, caso não dá continuidade na condição seguinte
			inicio = s;
			s.ant = null;
			s.prox=null;
		}else {
			NO aux = verificaUltimo(inicio); //Passa o inicio como parametro e aux recebe o resultado do metodo
			aux.prox = s; //aux foi retornado como último número, seu prox será o elemento a ser adicionado no final
			s.ant = aux;
			s.prox = null;
		}
	}
	
	//RECURSIVIDADE DIRETA - POIS A FUNÇÃO CHAMA ELA MESMA
	public NO verificaUltimo(NO aux) {
		if(aux.prox!=null) { // Verifica se o proximo elemento de aux(que era inicio) é null para identificar se é o último
			return verificaUltimo(aux.prox); //Se não for, volta para o mesmo metodo com o prox elemento
		}
		return aux;//Se o prox for null, retorna aux como o último elemento
	}

	public void adicionarInicio(Aluno x){
		NO s = new NO(x);
		if( inicio!=null) {
			s.prox = inicio;
			inicio.ant = s;
		}
		inicio = s;
	}

	public Aluno removerFinal(){
		Aluno r = null;
		if (inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Alunos está vazia!");
		}else
			if (inicio.prox == null){
				r = inicio.aluno;
				inicio = null;
			}
			else{
				NO aux1 = inicio;
				NO aux2 = inicio;
				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.aluno;
				aux1.ant = null;
				aux2.prox = null;
			}
		return r;
	}

	public Aluno removerInicio(){
		Aluno r = null;
		if (inicio == null){
			JOptionPane.showMessageDialog(null,"Lista de Alunos está vazia!");
		}
		else{
			r = inicio.aluno;
			inicio = inicio.prox;
			if(inicio != null) {
				inicio.ant = null;
			}
		}
		return r;
	}

	public String verAlunos(){
		NO aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.aluno.mostraAluno();
			aux = aux.prox;
		}
		return r;
	}
}