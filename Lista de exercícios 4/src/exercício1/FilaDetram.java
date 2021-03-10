//1. O Detram necessita de uma aplicação que faça o gerenciamento das pessoas que se cadastraram de maneira online para o exame final.
//Dado o cenário implemente uma Fila Estática de Pessoas contendo as propriedades ID, nome, RG, telefone e data de nascimento.
//A aplicação deve:
//-verificar se a fila está vazia, retornando true se estiver vazia e false se não estiver X
//-adicionar uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-remover uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-adicionar todas as pessoas removidas em uma pilha de pessoas X
//-pesquisar a ordem de espera de uma pessoa na fila X
//-percorrer e apresentar cada um dos elementos da fila X
//-comente no código os trechos de criação dos endereços de memória X
//-comente no código todas as associações entre classes X
package exercício1;

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
	
	//Chamada pela classe principal para verificar se a fila está vazia
	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//Chamada pela classe principal para cadastrar Pessoas com as informações que foram passadas como parametro
	public void cadastra(Pessoas x){
		if (tamanho<info.length) {
			info[tamanho]= x;
			tamanho++;
			JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null,"A fila já está cheia.");
		}
	}
	
	//Chamada pela classe principal para remover Pessoas da fila e adicionar na pilha (ela está sendo chamada dentro do adicionarP)
	public Pessoas tira() {
		Pessoas x = null;
		if(tamanho>=1) {
			x = info[0];
			for(int i = 0; i <= tamanho-1; i++) {
				info[i]= info[i+1];
			}
			tamanho--;
			JOptionPane.showMessageDialog(null,"A pessoa removida da fila foi => "+ x.removido() + "\n" //O "removido" é uma classe criada em Pessoas para estruturar todas as info das Pessoas removidas
					+ "E será adicionada na pilha(se tiver espaço).");
		}else {
			JOptionPane.showMessageDialog(null,"A fila está vazia.");
		}
		return x;
	}
	
	//Chamada pela classe principal para exibir ordenadamente os elementos da fila
	public String ordemEspera() {
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux = aux+"\n"+ info[i].ordemWait(i+1);//O ordemWait é uma classe criada em Pessoas para estruturar as info básicas da pessoa apenas para ordernar
		}
		return aux;
	}
	
	//Chamada pela classe principal para apresentar todos os elementos da fila
	public String apresentaPessoas() {
		String aux = " ";
		for (int i=0;i<tamanho;i++){
			aux = aux+"\n"+ info[i].apresenta(i+1);//O "apresenta" é uma classe criada em Pessoas para estruturar todas as info das Pessoas para apresentá-las completamente
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
			JOptionPane.showMessageDialog(null,"Não há espaço na Pilha.");
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
	
	//Chamada pela classe principal para apresentar todos as info das Pessoas que estão na pilha removida
	public String apresentaPilha() {
		String aux = " ";
		for (int i=0; i < tamanhop;i++) {
			aux = aux + "\n "+ pilha[i].apresenta(i+1);//O "apresenta" é uma classe criada em Pessoas para estruturar todas as info das Pessoas para apresentá-las completamente
		}
		return aux;
	}
}