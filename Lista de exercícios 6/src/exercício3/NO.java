//3. A  classe  Aluno possuiatributos  que  s�o  criados  na  classe  concreta e  acessados  por meio  dos  m�todos  p�blicos  da  classe
//(getters  e  setters).  Dado  o  cen�rio  implemente uma Lista Encadeadaque utilize pelo menos umm�todo recursivo.
//Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro, nome de tipo  de  dado  String,  turma  do  tipo  de  dado  String  e
//semestre  do  tipode  dado String.  Estes  atributos  devem  ser  acessados  por  meio  de  seus  m�todos  p�blicos (getters e setters).
//Implemente um m�todo que adicione um aluno no final da lista
//Implemente um m�todo que adicione um  aluno no in�cio da lista
//Implemente um m�todo que adicione um aluno no meio da lista
//Implemente um m�todo que remova um aluno no final da lista
//Implemente um m�todo que remova um aluno no in�cio da lista
//Implemente um m�todo que remova um aluno no meio da lista
//Implemente um m�todo que apresente cada umdos elementos da lista
//Explique comoa recursividade foi aplicada em cada um dos m�todos, detalhando se foi aplicada recursividade direta ou indireta
package exerc�cio3;

public class NO {
	public Aluno aluno;
	public NO prox;

	public NO (Aluno aluno){
		this.aluno = aluno;
		prox = null;
	}
}