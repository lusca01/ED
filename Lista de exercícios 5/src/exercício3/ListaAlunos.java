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

import javax.swing.JOptionPane;

public class ListaAlunos {
	private NO inicio;

	public ListaAlunos(){
		inicio = null;
	}
	
	public void adicionarFinal(Aluno x){
		if (inicio == null){
			NO n = new NO(x);
			inicio = n;
		}
		else{
			NO aux = inicio;
			while(aux.prox != null){
				aux = aux.prox;
			}
			NO n = new NO(x);
			aux.prox = n;
		}
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
				JOptionPane.showMessageDialog(null, "Posição Inválida!");
			}            
		}
	}

	public Aluno removerFinal(){
		Aluno r = null;
		if (inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Alunos está vazia!");
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
			JOptionPane.showMessageDialog(null,"Lista de Alunos está vazia!");
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
			JOptionPane.showMessageDialog(null, "Lista de Alunos está vazia!");
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
				JOptionPane.showMessageDialog(null, "Posição Invalida!");
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

