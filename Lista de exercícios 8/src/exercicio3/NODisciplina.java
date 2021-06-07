package exercicio3;

public class NODisciplina {
	public Disciplina disciplina;
	public NODisciplina prox;
	public NODisciplina ant;

	public NODisciplina (Disciplina disciplina){
		this.disciplina = disciplina;
		prox = null;
		ant = null;
	}
}