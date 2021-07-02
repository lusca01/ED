//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;
import javax.swing.JOptionPane;

public class ListaTema {
	//Define inicio como tipo NOTema
	private NOTema inicio;

	//Atribui nulo para inicio
	public ListaTema(){
		inicio = null;
	}
	
	//M�todo que recebe os dados e passa como parametro o tema a ser adicionado na lista
	public void cadastroTema() {
		String titulo,descricao, aux;
		double valor;
		do {
			titulo = JOptionPane.showInputDialog("Digite o titulo do Tema:");			
		}while(titulo.isBlank());//Verifica se o campo est� vazio
		do {
			descricao = JOptionPane.showInputDialog("Digite a descricao do Tema:");				
		}while(descricao.isBlank());//Verifica se o campo est� vazio
		do {
			aux = JOptionPane.showInputDialog("Digite o valor do Tema:");
			valor = Double.parseDouble(aux);
			if(valor <= 0) {//Verifica se o campo � nulo ou negativo
				JOptionPane.showMessageDialog(null, "O valor n�o pode ser nulo nem negativo!");
			}
		}while(aux.isBlank() || valor <= 0 || !aux.matches("[.0-9]+"));//Verifica se o campo est� vazio, possui valor nulo ou negativo 
			adicionar(new Tema(titulo, descricao, valor));
			JOptionPane.showMessageDialog(null,"Tema adicionado com sucesso!");			
		}
	
	//M�todo que adicionar o tema passado como parametro
	public void adicionar(Tema x){
		NOTema s = new NOTema(x);
		if(inicio == null) {
			inicio = s;
			s.prox = null;
			s.ant = null;
		}else {
			NOTema aux = verificaUltimo(inicio);//M�todo que chama verficaUltimo Tema da lista de temas recursivamente
			aux.prox = s;
			s.ant = aux;
			s.prox = null;
		}
	}
	
	//M�todo que verifica o �ltimo elemento da lista de temas recursivamente
	public NOTema verificaUltimo(NOTema aux) {
		if(aux.prox!=null) { 
			return verificaUltimo(aux.prox); //Retorna �ltimo valor da lista de temas
		}
		return aux;
	}

	//M�todo que verifica se possui o elemento a ser removido
	public void filtroRemove() {
		String remover = JOptionPane.showInputDialog("Informe o titulo do tema que quer remover:");
		Tema q = posRemove(remover);//Chama o m�todo para remover o item definido, caso tenha
		if (q == null) {
			JOptionPane.showMessageDialog(null,"Tema informado n�o encontrado para remover!");
		}else {
			JOptionPane.showMessageDialog(null,"O tema "+ q.mostraTema() + " foi removido");
		}
	}
	
	//M�todo que remove o tema com o titulo passado como parametro, caso tenha
	public Tema posRemove(String remove){
		Tema x = null;
		NOTema aux = inicio;
		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de Temas est� vazia, n�o h� o que remover!");
			return x;
		}
		//Caso o tema esteja no �nicio, remove e define outro como primeiro
		if(inicio.tema.getTitulo().equalsIgnoreCase(remove)) {
			x = inicio.tema;
			inicio = inicio.prox;
			return x;
		}
		//Caso o tema esteja ap�s o primeiro
		NOTema aux2 = aux, aux3 = aux;
		while (aux != null) {
			if(aux.tema.getTitulo().equalsIgnoreCase(remove)) {
				x = aux.tema;
				aux3.prox = aux.prox;
				aux2.prox = aux.prox;
				aux2.ant = aux.ant;				//Atualiza os ponteiros do item removido
				return x;	
			}
			aux2 = aux;
			aux3 = aux;
			aux = aux.prox;
		}
		return x; 
	}

	//M�todo que exibe os temas em sequ�ncia
	public String verTemas(){
		NOTema aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.tema.mostraTema();
			aux = aux.prox;
		}
		return r;
	}

	//M�todo que verifica se h� temas na lista para poder alugar
	public boolean verificaTema(String tema) {
		NOTema aux = inicio;
		if(aux == null) {
			JOptionPane.showMessageDialog(null,"Tema n�o cadastrado! \nInforme um tema cadastrado para poder alugar.");
			return true;
		}
		while (aux != null) {
			if(aux.tema.getTitulo().equalsIgnoreCase(tema)) {
				return false;
			}
			aux = aux.prox;
		}
		JOptionPane.showMessageDialog(null,"Tema n�o cadastrado! \nInforme um tema cadastrado para poder alugar.");
		return true;
	}

	//M�todo usado para pegar um tema solicitado pelo t�tulo
	public Tema pegaTema(String tema) {
		NOTema aux = inicio;
		while(aux != null) {
			if(aux.tema.getTitulo().equalsIgnoreCase(tema)) {
				return aux.tema;
			}
			aux = aux.prox;
		}
		return null;
	}
	
	//M�todo usado para calcular o valor final do tema, passado como parametro o desconto que o cliente possui
	public double calculaValor(Tema t, double d) {
		double valorFinal = t.getValor() - (t.getValor()*d);
		return valorFinal;
	}
}