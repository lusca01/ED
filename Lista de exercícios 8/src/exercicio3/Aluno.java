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

package exercicio3;

public class Aluno {
	private int IDalu, sem;
	private String nomeAluno, curso;
	
	public Aluno(int IDalu, int sem, String nomeAluno, String curso) {
		this.IDalu = IDalu;
		this.sem = sem;
		this.nomeAluno = nomeAluno;
		this.curso = curso;
	}

	public int getIDalu() {
		return IDalu;
	}

	public void setIDalu(int iDalu) {
		IDalu = iDalu;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String mostraAluno() {
		String aux = "ID: " + this.IDalu + " Semestre: " + this.sem +
				"\nNome: " + this.nomeAluno + " Curso: " + this.curso;
		return aux;
	}
}
