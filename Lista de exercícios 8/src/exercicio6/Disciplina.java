//3) Realize a implementação do Algoritmo Merge Sort para uma Lista Duplamente Ligada considerando o seguinte cenário: 
//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 
//Implemente a classe Média com os atributos ID do Aluno, ID da Disciplina e Média Final 
//As classes Aluno, Disciplina e Média devem realizar as seguintes operações: 
//Inserir um elemento no final da Lista 
//Inserir um elemento no início da Lista 
//Remover um elemento do final da Lista 
//Remover um elemento do início da Lista 
//Realize a ordenação dos Alunos pela média final utilizando o Algoritmo Merge Sort e apresente em console as seguintes informações: 
//Nome do Aluno 
//Disciplina Cursada 
//Média Final obtida 
//Apresente a quantidade de alunos com média maior ou igual a 8.
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
