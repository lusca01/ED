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

import javax.swing.JOptionPane;

public class ListaAlunos {
	private NO inicio;

	public ListaAlunos(){
		inicio = null;
	}
	
	public void adicionarFinal(Aluno x){
		NO s = new NO(x); // O elemento s recebe o valor de x
		if(inicio == null) { // Verifica se o inicio � null, caso sim, adiciona no pr�prio, caso n�o d� continuidade na condi��o seguinte
			inicio = s;
			s.prox=null;
		}else {
			NO aux = verificaUltimo(inicio); //Passa o inicio como parametro e aux recebe o resultado do metodo
			aux.prox = s; //aux foi retornado como �ltimo n�mero, seu prox ser� o elemento a ser adicionado no final
		}
	}
	
	//RECURSIVIDADE DIRETA - POIS A FUN��O CHAMA ELA MESMA
	public NO verificaUltimo(NO aux) {
		if(aux.prox!=null) { // Verifica se o proximo elemento de aux(que era inicio) � null para identificar se � o �ltimo
			return verificaUltimo(aux.prox); //Se n�o for, volta para o mesmo metodo com o prox elemento
		}
		return aux;//Se o prox for null, retorna aux como o �ltimo elemento
	}

	public void adicionarInicio(Aluno x){
		NO n = new NO(x);
		n.prox = inicio;
		inicio = n;
	}
	
	public void posAdiciona(Aluno x, int pos){
		NO novo = new NO(x);
		if(pos == 1){          
			adicionarInicio(x);
		}else{       
			NO aux = inicio;
			int cont = 1;
			while(aux.prox != null && cont < pos-1){
				aux = aux.prox;
				cont++;
			}
			if(cont == pos-1){
				novo.prox = aux.prox;
				aux.prox = novo;
			}else{
				JOptionPane.showMessageDialog(null, "Posi��o Inv�lida!");
			}            
		}
	}

	public Aluno removerFinal(){
		Aluno r = null;
		if (inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Alunos est� vazia!");
		}
		else{
			if (inicio.prox == null){
				r = inicio.aluno;
				inicio = null;
			}
			else{
				NO aux1 = inicio;
				NO aux2 = inicio;
				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.aluno;
				aux2.prox = null;
			}
		}
		return r;
	}

	public Aluno removerInicio(){
		Aluno r = null;
		if (inicio == null){
			JOptionPane.showMessageDialog(null,"Lista de Alunos est� vazia!");
		}
		else{
			r = inicio.aluno;
			inicio = inicio.prox;
		}
		return r;
	}

	public Aluno posRemove(int pos){
		Aluno x = null;
		int i = 1;
		NO aux = inicio;
		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Alunos est� vazia!");
			return x;
		}    
		if(pos == 1){
			x = removerInicio();
			return x;
		}else{           
			while(aux.prox != null){
				aux = aux.prox;
				i++;
			}
			if(pos > i || pos <= 0){
				JOptionPane.showMessageDialog(null, "Posi��o Invalida!");
				return x;
			}else if(pos == i){
				x = removerFinal();
				return x;
			}else{
				aux = inicio;
				NO aux2 = aux;
				while(pos > 1){
					aux2 = aux;
					aux = aux.prox;
					pos--;
				}
				x = aux.aluno;
				aux2.prox = aux.prox;
				return x;
			}
		}        
	}

	public String verAlunos(){
		NO aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.aluno.mostraAluno();
			aux = aux.prox;
		}
		return r;
	}
}