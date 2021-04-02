//2. Implemente uma Lista de temperaturas em aloca��o din�micacom todas as opera��es indicadas a seguir e que utilize pelo menos um m�todo recursivo.
//verificar se a lista est� vazia, retornando true se estiver vazia e false se n�o estiver;
//adicionar uma temperatura no in�cio da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//adicionar uma temperatura no final da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//adicionar uma temperatura em determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//remover a temperatura do in�cio da lista, retornando o valor que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//remover a temperatura do final da lista, retornando o valor que foi removido, caso a opera��o n�o  possa ser realizada, mostre mensagem avisando;
//remover a temperatura de determinada posi��o da lista, retornando o valor que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//percorrer e apresentar cada um dos elementos da lista.
//Explique como a recursividade foi aplicada em cada um dos m�todos, detalhando se foi aplicada recursividade direta ou indireta.
package exerc�cio2;

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
		if(inicio == null) { // Verifica se o inicio � null, caso sim, adiciona no pr�prio, caso n�o d� continuidade na condi��o seguinte
			inicio = s;
			s.prox=null;
		}else {
			NO aux = verificaUltimo(inicio); //Passa o inicio como parametro e aux recebe o resultado do met�do
			aux.prox = s; //aux foi retornado como �ltimo n�mero, seu prox ser� o elemento a ser adicionado no final
		}
	}
	
	//RECURSIVIDADE DIRETA - POIS A FUN��O CHAMA ELA MESMA
	public NO verificaUltimo(NO aux) {
		if(aux.prox!=null) { // Verifica se o proximo n�mero de aux(que era inicio) � null para identificar se � o �ltimo
			return verificaUltimo(aux.prox); //Se n�o for, volta para o mesmo met�do com o prox da vari�vel
		}
		return aux;//Se o prox for null, retorna aux como o �ltimo n�mero
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
				JOptionPane.showMessageDialog(null, "Posi��o Inv�lida!");
			}            
		}
	}

	public double removerFinal(){
		double r = -1;
		if (inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Temperaturas est� vazia!");
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
			JOptionPane.showMessageDialog(null,"Lista de Temperaturas est� vazia!");
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
			JOptionPane.showMessageDialog(null, "Lista de Temperaturas est� vazia!");
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
			r = r + "\n" + aux.temperatura +"�C";
			aux = aux.prox;
		}
		return r;
	}
}