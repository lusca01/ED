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
		+"\nMédia: " + this.media;
		return aux;
	}

}
