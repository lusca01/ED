//2. Uma Loja Virtual necessita de uma aplica��o que fa�a o gerenciamento de suas vendas por meio de uma Pilha que retire
//os produtos removidos que n�o existam em estoque.
//A classe Produtos possui os atributos ID, nome, valor e quantidade. V
//A aplica��o deve:
//-verificar se a pilha est� vazia, retornando true se estiver vazia e false se n�o estiver;
//-adicionar um produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-removerum produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-adicionar todos os produto removidos em uma pilha de produtos-remover uma pesquisa por nome do produto
//-pesquisar a ordem de espera de uma pessoa na pilha-percorrer e apresentarcada um dos elementos da pilha
//-comente noc�digo os trechos de cria��o dos endere�os de mem�ria-comente noc�digo todas as associa��es entre classes
package exerc�cio2;

public class Produtos {
	private int ID, quantidade;
	private double valor;
	private String name;
	
	public Produtos(int ID, int quantidade, double valor, String name) {
		this.ID = ID;
		this.quantidade = quantidade;
		this.valor = valor;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String removido(){
		String aux = "ID: " +this.ID + " Nome: "+ this.name + "\nValor: "
				+ this.valor + " Quantidade: " +this.quantidade +"\n";
		return aux;
	}
}
