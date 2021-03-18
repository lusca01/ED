//3. A  classe Aluno possui atributos  que  são  criados  na  classe  concreta e  acessados  por meio  dos  métodos  públicos  da  classe 
//(getters  e  setters).  Dado  o  cenário implemente uma Lista Encadeada: Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro,
//nome de tipo  de  dado String,  turma  do  tipo  de  dado  String  e  semestre  do  tipo  de  dado String. 
//Estes  atributos  devem  ser  acessados  por  meio  de  seus  métodos  públicos (getters e setters).
//Implemente um método que adicione um aluno no final da lista
//Implemente um método que adicione um  aluno no início da lista
//Implemente um método que adicione um aluno no meio da lista
//Implemente um método que remova um aluno no final da lista
//Implemente um método que remova um aluno no início da lista
//Implemente um método que remova um aluno no meio da lista
//Implemente um método que apresente cada um dos elementos da lista
//Realize  pelo  menos um  teste  de  mesa  para  cada  estrutura  com  15  elementos como conjunto deentrada
package exercício3;

public class Aluno {
	private int RA;
	private String name, turma, semestre;
	
	public Aluno(int RA, String name, String turma, String semestre) {
		this.RA = RA;
		this.name = name;
		this.turma = turma;
		this.semestre = semestre;
	}
	
	public int getRA() {
		return RA;
	}
	public void setRA(int RA) {
		this.RA = RA;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String mostraAluno() {
		String aux = "RA: " + this.RA + " Nome: " + this.name + "\nTurma: "
				+ this.turma +" Semestre: " +this.semestre;
		return aux;
	}
}
