//2. Implemente uma Lista de temperaturas em alocação dinâmicacom todas as operações indicadas a seguir e que utilize pelo menos um método recursivo.
//verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
//adicionar uma temperatura no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//adicionar uma temperatura no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//adicionar uma temperatura em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//remover a temperatura do início da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//remover a temperatura do final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
//remover a temperatura de determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//percorrer e apresentar cada um dos elementos da lista.
//Explique como a recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta.
package exercício2;

import javax.swing.JOptionPane;

public class ListaTemperatura {
	private NO inicio;

	public ListaTemperatura(){
		inicio = null;
	}
	
	public boolean vazia() {
		if (inicio == null) {
			return true;
		}else {
			return false;
		}
	}

	public void adicionarFinal(double x){
		NO s = new NO(x); // O elemento s recebe o valor de x
		if(inicio == null) { // Verifica se o inicio é null, caso sim, adiciona no próprio, caso não dá continuidade na condição seguinte
			inicio = s;
			s.prox=null;
		}else {
			NO aux = verificaUltimo(inicio); //Passa o inicio como parametro e aux recebe o resultado do metódo
			aux.prox = s; //aux foi retornado como último número, seu prox será o elemento a ser adicionado no final
		}
	}
	
	//RECURSIVIDADE DIRETA - POIS A FUNÇÃO CHAMA ELA MESMA
	public NO verificaUltimo(NO aux) {
		if(aux.prox!=null) { // Verifica se o proximo número de aux(que era inicio) é null para identificar se é o último
			return verificaUltimo(aux.prox); //Se não for, volta para o mesmo metódo com o prox da variável
		}
		return aux;//Se o prox for null, retorna aux como o último número
	}

	public void adicionarInicio(double x){
		NO n = new NO(x);
		n.prox = inicio;
		inicio = n;
	}
	
	public void posAdiciona(double x, int pos){
		NO novo = new NO(x);
		if(pos == 1){
			adicionarInicio(x);
		}else{       
			NO aux = inicio;
			int count = 1;

			while(aux.prox != null && count < pos-1){
				aux = aux.prox;
				count++;
			}
			if(count == pos-1){
				novo.prox = aux.prox;
				aux.prox = novo;
			}else{
				JOptionPane.showMessageDialog(null, "Posição Inválida!");
			}            
		}
	}

	public double removerFinal(){
		double r = -1;
		if (inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Temperaturas está vazia!");
		}
		else{
			if (inicio.prox == null){
				r = inicio.temperatura;
				inicio = null;
			}
			else{
				NO aux1 = inicio;
				NO aux2 = inicio;

				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}

				r = aux1.temperatura;
				aux2.prox = null;
			}
		}
		return r;
	}

	public double removerInicio(){
		double r = -1;
		if (inicio == null){
			JOptionPane.showMessageDialog(null,"Lista de Temperaturas está vazia!");
		}
		else{
			r = inicio.temperatura;
			inicio=inicio.prox;
		}
		return r;
	}

	public double posRemove(int pos){
		double x =-1;
		int i = 1;
		NO aux = inicio;

		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Temperaturas está vazia!");
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
				x = aux.temperatura;
				aux2.prox = aux.prox;
				return x;
			}
		}        
	}

	public String verTemperaturas(){
		NO aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.temperatura +"ºC";
			aux = aux.prox;
		}
		return r;
	}
}