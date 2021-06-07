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
