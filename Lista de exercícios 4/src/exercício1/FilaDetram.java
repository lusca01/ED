//1. O Detram necessita de uma aplica��o que fa�a o gerenciamento das pessoas que se cadastraram de maneira online para o exame final.
//Dado o cen�rio implemente uma Fila Est�tica de Pessoas contendo as propriedades ID, nome, RG, telefone e data de nascimento.
//A aplica��o deve:
//-verificar se a fila est� vazia, retornando true se estiver vazia e false se n�o estiver X
//-adicionar uma pessoa, caso a opera��o n�o possa ser realizada, mostre mensagem avisando X
//-remover uma pessoa, caso a opera��o n�o possa ser realizada, mostre mensagem avisando X
//-adicionar todas as pessoas removidas em uma pilha de pessoas X
//-pesquisar a ordem de espera de uma pessoa na fila X
//-percorrer e apresentar cada um dos elementos da fila X
//-comente no c�digo os trechos de cria��o dos endere�os de mem�ria X
//-comente no c�digo todas as associa��es entre classes X
package exerc�cio1;

import javax.swing.JOptionPane;

public class FilaDetram {
	private Pessoas info[]; //Definindo o vetor info como tipo Pessoas, criado em outra classe
	private Pessoas pilha[];//Definindo o vetor pilha como tipo Pessoas, criado em outra classe
	private int tamanho, tamanhop;
	
	public FilaDetram(int capacidade) {
		info = new Pessoas[capacidade];	//Cria novas "Pessoas" com a capacidade que foi passada no parametro
		pilha = new Pessoas[capacidade];
		tamanho = 0;
	}
	
	//Chamada pela classe principal para verificar se a fila est� vazia
	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//Chamada pela classe principal para cadastrar Pessoas com as informa��es que foram passadas como parametro
	public void cadastra(Pessoas x){
		if (tamanho<info.length) {
			info[tamanho]= x;
			tamanho++;
			JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null,"A fila j� est� cheia.");
		}
	}
	
	//Chamada pela classe principal para remover Pessoas da fila e adicionar na pilha (ela est� sendo chamada dentro do adicionarP)
	public Pessoas tira() {
		Pessoas x = null;
		if(tamanho>=1) {
			x = info[0];
			for(int i = 0; i <= tamanho-1; i++) {
				info[i]= info[i+1];
			}
			tamanho--;
			JOptionPane.showMessageDialog(null,"A pessoa removida da fila foi => "+ x.removido() + "\n" //O "removido" � uma classe criada em Pessoas para estruturar todas as info das Pessoas removidas
					+ "E ser� adicionada na pilha(se tiver espa�o).");
		}else {
			JOptionPane.showMessageDialog(null,"A fila est� vazia.");
		}
		return x;
	}
	
	//Chamada pela classe principal para exibir ordenadamente os elementos da fila
	public String ordemEspera() {
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux = aux+"\n"+ info[i].ordemWait(i+1);//O ordemWait � uma classe criada em Pessoas para estruturar as info b�sicas da pessoa apenas para ordernar
		}
		return aux;
	}
	
	//Chamada pela classe principal para apresentar todos os elementos da fila
	public String apresentaPessoas() {
		String aux = " ";
		for (int i=0;i<tamanho;i++){
			aux = aux+"\n"+ info[i].apresenta(i+1);//O "apresenta" � uma classe criada em Pessoas para estruturar todas as info das Pessoas para apresent�-las completamente
		}
		return aux;
	}	
	
	//Chamada pela classe principal para adicionar Pessoas na pilha que foram removidas da fila
	public void adcionarP(Pessoas x) {
		if (tamanhop < pilha.length) {
			pilha[tamanhop] = x;
			tamanhop++;
		}
		else {
			JOptionPane.showMessageDialog(null,"N�o h� espa�o na Pilha.");
		}
	}
	
	//Chamada pela classe principal para remover Pessoas da pilha
	public Pessoas tiraP() {
		Pessoas x = null;
		if (tamanhop >= 1) {
			x = pilha[tamanhop-1];
			tamanhop--;
		}
		return x;
	}
	
	//Chamada pela classe principal para apresentar todos as info das Pessoas que est�o na pilha removida
	public String apresentaPilha() {
		String aux = " ";
		for (int i=0; i < tamanhop;i++) {
			aux = aux + "\n "+ pilha[i].apresenta(i+1);//O "apresenta" � uma classe criada em Pessoas para estruturar todas as info das Pessoas para apresent�-las completamente
		}
		return aux;
	}
}