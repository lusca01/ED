//3) Realize a implementa��o do Algoritmo Merge Sort para uma Lista Duplamente Ligada considerando o seguinte cen�rio: 
//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 
//Implemente a classe M�dia com os atributos ID do Aluno, ID da Disciplina e M�dia Final 
//As classes Aluno, Disciplina e M�dia devem realizar as seguintes opera��es: 
//Inserir um elemento no final da Lista 
//Inserir um elemento no in�cio da Lista 
//Remover um elemento do final da Lista 
//Remover um elemento do in�cio da Lista 
//Realize a ordena��o dos Alunos pela m�dia final utilizando o Algoritmo Merge Sort e apresente em console as seguintes informa��es: 
//Nome do Aluno 
//Disciplina Cursada 
//M�dia Final obtida 
//Apresente a quantidade de alunos com m�dia maior ou igual a 8.
package exercicio6;

public class Disciplina {
	private int IDdis;
	private String nomeDisc;
	
	public Disciplina(int IDdis, String nomeDisc) {
		this.IDdis = IDdis;
		this.nomeDisc = nomeDisc;
	}

	public int getIDdis() {
		return IDdis;
	}

	public void setIDdis(int iDdis) {
		IDdis = iDdis;
	}

	public String getNomeDisc() {
		return nomeDisc;
	}

	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}

	public String mostraDisciplina() {
		String aux = "ID: " + this.IDdis + "\nNome da disciplina: " + this.nomeDisc;
		return aux;
	}
}
