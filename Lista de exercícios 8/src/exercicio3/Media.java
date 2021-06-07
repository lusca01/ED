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

public class Media {
	private Aluno aluno;
	private Disciplina disciplina;
	private double media;
	
	public Media(Aluno aluno, Disciplina disciplina, double media) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.media = media;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public String mostraMedia() {
		String aux = "IDAluno: "+ this.aluno.getIDalu()+ " IDDisciplina: "+ this.disciplina.getIDdis()
		+"\nM�dia: " + this.media;
		return aux;
	}

}
