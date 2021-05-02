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

public class Aluno {
	private int ID;
	private String name, curso;
	
	public Aluno (int ID, String name, String curso) {
		this.ID = ID;
		this.name = name;
		this.curso = curso;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String mostraAluno() {
		String aux = "ID: " + this.ID + " Nome: " + this.name + "\nCurso: "
				+ this.curso;
		return aux;
	}
}