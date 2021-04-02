//3. A  classe  Aluno possuiatributos  que  são  criados  na  classe  concreta e  acessados  por meio  dos  métodos  públicos  da  classe
//(getters  e  setters).  Dado  o  cenário  implemente uma Lista Encadeadaque utilize pelo menos ummétodo recursivo.
//Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro, nome de tipo  de  dado  String,  turma  do  tipo  de  dado  String  e
//semestre  do  tipode  dado String.  Estes  atributos  devem  ser  acessados  por  meio  de  seus  métodos  públicos (getters e setters).
//Implemente um método que adicione um aluno no final da lista
//Implemente um método que adicione um  aluno no início da lista
//Implemente um método que adicione um aluno no meio da lista
//Implemente um método que remova um aluno no final da lista
//Implemente um método que remova um aluno no início da lista
//Implemente um método que remova um aluno no meio da lista
//Implemente um método que apresente cada umdos elementos da lista
//Explique comoa recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta
package exercício3;

public class NO {
	public Aluno aluno;
	public NO prox;

	public NO (Aluno aluno){
		this.aluno = aluno;
		prox = null;
	}
}