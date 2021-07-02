//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;
import javax.swing.JOptionPane;

public class ListaCliente {
	
	//Define inicio como tipo NOCliente
	private NOCliente inicio;

	//Atribui nulo para inicio
	public ListaCliente(){
		inicio = null;
	}
	
	//Recebe os dados do cliente para adicionar na lista
	public void cadastroCliente() {
		String fone,nome,endereco;
		do {
			nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		}while(nome.isBlank());//Verifica se o campo está vazio
		do {
			endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");			
		}while(endereco.isBlank());//Verifica se o campo está vazio
		do {
			fone = JOptionPane.showInputDialog("Digite o número de telefone do cliente:");
		}while(ChecaNumeros(fone));//Verifica se o campo possui números 
		int alugueis = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos aluguéis o cliente já fez:"));
		adicionar(new Cliente(nome, endereco, fone, alugueis));//Chama o método que adiciona cliente passando um novo cliente como parametro
		JOptionPane.showMessageDialog(null,"Cliente adicionado com sucesso!");
	}
	
	//Método usado para verificar e notificar se o campo possui apenas números positivos
    public boolean ChecaNumeros (String entrada){
        if(!entrada.matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"O campo deve possuir apenas números positivos!");
            return true;
        }
        else{
            return false;
        }
    }
	
    //Método para adicionar cliente
	public void adicionar(Cliente x){
		NOCliente s = new NOCliente(x);
		if(inicio == null) {
			inicio = s;
			s.prox = null;
			s.ant = null;
		}else {
			NOCliente aux = verificaUltimo(inicio);//Chama o método que verifica o último cliente da lista recursivamente
			aux.prox = s;
			s.ant = aux;
			s.prox = null;
		}
	}
	
	//Método que verifica o último cliente da lista recursivamente
	public NOCliente verificaUltimo(NOCliente aux) {
		if(aux.prox!=null) { 
			return verificaUltimo(aux.prox); 
		}
		return aux;
	}
	
	//Método que inicia o processo de remoção do cliente
	public void filtroRemove() {
		String remover = JOptionPane.showInputDialog("Informe o nome do cliente que quer remover:");
		Cliente p = posRemove(remover);//Chama o método para procurar se há cliente com o nome solicitado para ser removido
		if (p == null) {
			JOptionPane.showMessageDialog(null,"Cliente informado não encontrado para remover!");
		}else {
			JOptionPane.showMessageDialog(null,"O cliente "+ p.mostraCliente() + " foi removido");
		}		
	}

	//Método que verifica se há o cliente solicitado para ser removido
	public Cliente posRemove(String remove){
		Cliente x = null;
		NOCliente aux = inicio;
		if(inicio == null){
			JOptionPane.showMessageDialog(null, "Lista de clientes está vazia, não há o que remover!");
			return x;
		}
		//Caso o cliente esteja no ínicio, remove e define outro como primeiro
		if(inicio.cliente.getNome().equalsIgnoreCase(remove)) {
			x = inicio.cliente;
			inicio = inicio.prox;
			return x;
		}
		//Caso o cliente esteja pós o primeiro
		NOCliente aux2 = aux, aux3 = aux;
		while (aux != null) {
			if(aux.cliente.getNome().equalsIgnoreCase(remove)) {
				x = aux.cliente;
				aux3.prox = aux.prox;
				aux2 = aux.prox;
				aux2.ant = aux.ant;		//Atualiza os ponteiros do item removido
				return x;	
			}
			aux2 = aux;
			aux3 = aux;
			aux = aux.prox;
		}
		return x; 
	}

	//Método que exibe os clientes em sequência
	public String verClientes(){
		NOCliente aux = inicio;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.cliente.mostraCliente();//Chama um método da classe para estruturar os dados exibidos
			aux = aux.prox;
		}
		return r;
	}
	
	//Método que verifica se há clientes na lista para poder alugar
	public boolean verificaCliente(String nome) {
		NOCliente aux = inicio;
		if(aux == null) {
			JOptionPane.showMessageDialog(null,"Cliente não cadastrado! \nInforme um cliente cadastrado para poder alugar.");
			return true;
		}
		while (aux != null) {
			if(aux.cliente.getNome().equalsIgnoreCase(nome)) {
				return false;
			}
			aux = aux.prox;
		}
		JOptionPane.showMessageDialog(null,"Cliente não cadastrado! \nInforme um cliente cadastrado para poder alugar.");
		return true;
	}

	//Método usado para pegar um cliente solicitado pelo nome
	public Cliente pegaCliente(String nome) {
		NOCliente aux = inicio;
		while(aux != null) {
			if(aux.cliente.getNome().equalsIgnoreCase(nome)) {
				return aux.cliente;
			}
			aux = aux.prox;
		}
		return null;
	}

	
	//Método utilizado para verificar se o cliente possui desconto
	public double verificaDesconto(Cliente x) {
//		Clientes com mais de 1 ano de cadastro e que alugaram de 5 a 9 vezes possuem 5% de desconto, 
//		com mais de 2 anos de cadastro e de 10 a 14 aluguéis possuem 10% de desconto e com mais de 3 anos de cadastro e 
//		mais de 15 aluguéis possuem 15% de desconto no valor total do aluguel.
//		Um tema não pode estar alugado para diferentes clientes na mesma data.
//		Um aluguel de tema só poderá ser cadastrado assim que for pago um sinal de 50% do valor total.
		if(x.getAlugueis() >= 5 && x.getAlugueis() < 10) {
			return 0.05;
		}
		if(x.getAlugueis() >= 10 && x.getAlugueis() < 15) {
			return 0.10;
		}
		if(x.getAlugueis() >= 15) {
			return 0.15;
		}
		return 0;
	}
}
