package exercicio3;

public class NOAluno {
	public Aluno aluno;
	public NOAluno prox;
	public NOAluno ant;

	public NOAluno (Aluno aluno){
		this.aluno = aluno;
		prox = null;
		ant = null;
	}
}
