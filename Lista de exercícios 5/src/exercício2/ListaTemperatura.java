//2. Implemente uma Lista de temperatura sem alocação dinâmicacom todas as operações indicadas a seguir:
//-verificar se a lista está vazia, retornando true se estiver vazia e false se nãoestiver;
//-adicionar uma temperaturano início da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturano final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar uma temperaturaem determinada posição da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado início da lista, retornando o valor que foi removido,caso a operação não possa ser realizada, mostre mensagemavisando;
//-remover a temperaturado final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
//-remover a temperaturade determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//-percorrer e apresentar cada um dos elementos da lista.
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
		if (inicio == null){
			NO n = new NO(x);
			inicio = n;
		}
		else{
			NO aux = inicio;
			while(aux.prox != null){
				aux=aux.prox;
			}
			NO n = new NO(x);
			aux.prox = n;
		}
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