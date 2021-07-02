//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import view.Menu;	//
public class ListaAluguel {
	
	private NOAluguel inicio;//Define "inicio" como tipo NOAluguel
	Cliente p = null;//Define uma v�riavel "p" como tipo Cliente
	Tema q = null;//Define uma v�riavel "q" como tipo Tema


	public ListaAluguel(){
		inicio = null; //Atribui nulo ao NOAluguel inicio
	}
	
	//M�todo que recebe e trata alguns dados para cadastro
	public void cadastroAluguel() {
		//Criando v�riaveis que ser�o usadas para receber os dados do aluguel
		int diaFesta, mesFesta, hrFesta, hrFimFesta, id;
		String nome, nome_tema;
		do {
			id = Integer.parseInt(JOptionPane.showInputDialog("Forne�a um ID para o aluguel a ser cadastrado:"));
		}while(verificaID(id));//Chama o m�todo que verifica se o ID j� est� sendo por outro aluguel
		do {
			nome = JOptionPane.showInputDialog("Digite o nome do cliente que ir� alugar:");
		}while(Menu.c.verificaCliente(nome));//Chama o m�todo que verifica se h� cliente com esse nome para cadastrar o aluguel
		p = Menu.c.pegaCliente(nome);//Atribui o Cliente com o nome passado como parametro
		do {
			nome_tema = JOptionPane.showInputDialog("Digite o tema a ser alugado: ");
		}while(Menu.t.verificaTema(nome_tema));//Chama o m�todo que verifica se h� tema com esse t�tulo para cadastrar o aluguel
		q = Menu.t.pegaTema(nome_tema);//Atribui o Tema com o t�tulo passado como parametro
		String enderecoFesta = JOptionPane.showInputDialog("Digite o endere�o da festa:");
	    do {
	    	diaFesta = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da festa:"));// Recebendo dia da festa
        if (diaFesta > 31 || diaFesta < 1){
            JOptionPane.showMessageDialog(null,"Dia digitado inv�lido! Tente novamento com um dia correto.");}// Exibindo mensagem de erro caso dia n�o seja v�lido
	    }while(diaFesta > 31 || diaFesta < 1);// Condicionando para receber apenas dias > 1 e < 31
	
	    do{
	    	mesFesta = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s da festa:"));// Recebendo m�s da festa
	        if (mesFesta > 12 || mesFesta < 1){
	            JOptionPane.showMessageDialog(null,"M�s digitado inv�lido! Tente novamento com um m�s correto.");}// Exibindo mensagem de erro caso m�s n�o seja v�lido
	    }while(mesFesta > 12 || mesFesta < 1);// Condicionando para receber apenas mes > 1 e < 13
	
	    do {
	    	hrFesta = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora(apenas a hora) do in�cio da festa:"));// Recebendo hora da festa
	        if (hrFesta > 23 || hrFesta < 0){
	            JOptionPane.showMessageDialog(null,"Hora digitada inv�lida! Tente novamente com uma hora correta.");}// Exibindo mensagem de erro caso hora n�o seja v�lida
	    }while(hrFesta > 23 || hrFesta < 0);// Condicionando para receber apenas horas > 0 e < 24
		
	    do {
	      hrFimFesta = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora(apenas a hora) do fim da festa:"));// Recebendo hora do fim da festa
	  	  if (hrFimFesta > 23 || hrFimFesta < 0){
	  		  JOptionPane.showMessageDialog(null,"Hora digitada inv�lida! Tente novamente com uma hora correta.");}// Exibindo mensagem de erro caso hora n�o seja v�lida
		  }while(hrFimFesta > 23 || hrFimFesta < 0 || testarHora(hrFesta, hrFimFesta));// Condicionando para receber apenas horas > 0 e < 24
	    //Condi��o para tratar se h� aluguel com mesmo tema para a mesma hora
	    if(testarAluguel(diaFesta, mesFesta, hrFesta, hrFimFesta,nome_tema)) {
	    	double desconto = Menu.c.verificaDesconto(p);
	    	double valorFinal = Menu.t.calculaValor(q, desconto);
	    	adicionar(new Aluguel(id, enderecoFesta, diaFesta, mesFesta, hrFesta, hrFimFesta, valorFinal, p, q));//Passa o novo aluguel para o m�todo que ir� adicionar na lista de alugu�is
	    	JOptionPane.showMessageDialog(null,"Aluguel adicionado com sucesso!");	    	
	    }else {
	    	JOptionPane.showMessageDialog(null, "Este tema n�o est� dispon�vel para o hor�rio especificado!");
	    }
	}

	//M�todo que verifica se h� tema alugado no mesmo dia e hor�rio
	private boolean testarAluguel(int diaFesta, int mesFesta, int hrFesta, int hrFimFesta,String nome_tema) {
		Aluguel[] vetor = pegaVetor();
		if(vetor != null) {
			for(int i = 0; i < vetor.length; i++) {
				if((vetor[i].getTema().getTitulo().contentEquals(nome_tema)) && (vetor[i].getDiaFesta() == diaFesta) && (vetor[i].getMesFesta() == mesFesta) && ((vetor[i].getHrFesta() == hrFesta) || (vetor[i].getHrFimFesta() == hrFimFesta))) {
					return false;
				}
			}			
		}
		return true;
	}
	//M�todo que verifica se a hora final da festa � posterior o do in�cio da festa
	private boolean testarHora(int hrFesta, int hrFimFesta) {
		if(hrFesta >= hrFimFesta) {
			JOptionPane.showMessageDialog(null,"Hor�rio inv�lido! Digite uma hora de fim de festa posterior a hora de in�cio.");
			return true;
		}
		return false;
	}

	//M�todo que adciona o Aluguel na lista de alugu�is
	public void adicionar(Aluguel x){
		NOAluguel s = new NOAluguel(x);
		//Caso n�o tenha nada no in�cio, in�cio receber� aluguel
		if(inicio == null) {
			inicio = s;
			s.prox = null;
			s.ant = null;
		}else {
			NOAluguel aux = verificaUltimo(inicio); //Chama o m�todo para verificar o ultimo aluguel da lista recursivamente
			aux.prox = s;
			s.ant = aux;
			s.prox = null;
		}
	}
	
	//M�todo recursivo que verifica o �ltimo aluguel da lista
	public NOAluguel verificaUltimo(NOAluguel aux) {
		if(aux.prox!=null) { 
			return verificaUltimo(aux.prox); 
		}
		return aux;
	}

	//M�todo que remove o aluguel pelo ID
	public Aluguel posRemove(int remove){
		Aluguel x = null;
		NOAluguel aux1 = inicio;
		//Verifica se inicio � nulo, se for, n�o h� o que remover
		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de alugu�is est� vazia, n�o h� o que remover!");
			return x;
		}
		//Verifica se inicio tem o Aluguel a ser removido, se sim, apenas subtitui pelo pr�x
		if(inicio.aluguel.getID()==remove) {
			x = inicio.aluguel;
			inicio = inicio.prox;
			return x;
		}
		NOAluguel aux3 = aux1, aux2 = aux1;
		//Percorre os alugu�is at� achar o aluguel a ser removido
		while (aux1 != null) {
			if(aux1.aluguel.getID() == remove) {
				x = aux1.aluguel;// x recebe o aluguel verificado
				aux3.prox = aux1.prox;// aux3.prox recebe o prox do aluguel verificado
				aux2 = aux1.prox; //aux2 recebe o prox do aluguel verificado
				aux2.ant = aux1.ant;//aux.ant recebe o ant do aluguel verificado
				return x;	//retorna o aluguel verificado
			}
			aux2 = aux1; 
			aux3 = aux1; 
			aux1 = aux1.prox; 
		}
		return x; 
	}

	//M�todo que mostra os Alugu�is de maneira estruturada
	public String verAlugueis(){
		NOAluguel aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.aluguel.mostraAluguel();
			aux = aux.prox;
		}
		return r;
	}

	//M�todo que verifica se o ID j� est� sendo usado em outro aluguel
	public boolean verificaID(int id) {
		NOAluguel aux = inicio;
		if(aux == null) {
			return false;
		}
		while(aux != null) {
			if(aux.aluguel.getID() == id) {
				JOptionPane.showMessageDialog(null,"ID j� cadastrado, tente novamente com outro ID.");
				return true;
			}
			aux = aux.prox;
		}
		return false;
	}

	//M�todo que recebe o ID do aluguel que quer remover, verifica com outro m�todo e remove se estiver ok
	public void filtroRemove() {
		int remove = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do aluguel que quer remover:"));
		Aluguel z = posRemove(remove);//Chama o m�todo para verificar se h� aluguel com o ID a ser removido
		if (z == null) {//Se n�o tiver, o valor retornado � nulo, ent�o n�o remover� nada
			JOptionPane.showMessageDialog(null,"ID de aluguel informado n�o encontrado para remover!");
		}else {
			JOptionPane.showMessageDialog(null,"O aluguel "+ z.mostraAluguel() + " foi removido");
		}
	}
	
	//M�todo que pega todos os alugu�is da lista de Alugu�is e coloca em um vetor
	public Aluguel[] pegaVetor() {
		NOAluguel aux = inicio;
		int i = 0;
		//Se n�o houver elementos na lista, retorna nulo
		if(inicio == null) {
			return null;
		}
		//Verifica quantos alugu�is est�o na lista e conta para criar um vetor com tamanho correto
		while(aux != null) {
			i++;
			aux = aux.prox;
		}
		//Cria um vetor do tipo Aluguel
		Aluguel vetor[] = new Aluguel[i];
		aux = inicio;
		//Preenche o vetor com os Alugueis
		for(int j = 0; j < i; j++) {
			vetor[j] = aux.aluguel;
			aux = aux.prox;
		}
		return vetor;//Retorna o vetor com todos os alugu�is preenchidos
	}
	
	//M�todo que imprime os alugu�is
	public void createFile(Aluguel[] vetor) throws IOException {
		if(inicio == null) {
			JOptionPane.showMessageDialog(null,"N�o h� alugu�is para imprimir!");
		}else {
			String fileName = "Alugueis.txt";//Cria um arquivo txt
	        BufferedWriter gravaralugueis = new BufferedWriter(new FileWriter(fileName));
			for(int i = 0; i < vetor.length; i++) {
				gravaralugueis.write(vetor[i].mostraAluguel());
				gravaralugueis.newLine();
			}
			gravaralugueis.close();
			JOptionPane.showMessageDialog(null,"Impress�o feita com sucesso! Confira no diret�rio do projeto.");
		}
	}
}