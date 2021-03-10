//2. Uma Loja Virtual necessita de uma aplica��o que fa�a o gerenciamento de suas vendas por meio de uma Pilha que retire
//os produtos removidos que n�o existam em estoque.
//A classe Produtos possui os atributos ID, nome, valor e quantidade.
//A aplica��o deve:
//-verificar se a pilha est� vazia, retornando true se estiver vazia e false se n�o estiver;
//-adicionar um produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-removerum produto na pilha, caso a opera��o n�o possa ser realizada, mostre mensagemavisando;
//-adicionar todos os produto removidos em uma pilha de produtos-remover uma pesquisa por nome do produto
//-pesquisar a ordem de espera de uma pessoa na pilha-percorrer e apresentarcada um dos elementos da pilha
//-comente noc�digo os trechos de cria��o dos endere�os de mem�ria-comente noc�digo todas as associa��es entre classes
package exerc�cio2;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Produtos z = null;
		int id, qtde, op = 0;
		String nome, tira; boolean vaz;
		double val;
		PilhaLojaVirtual pilha = new PilhaLojaVirtual(5);
		while (op != 8) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar produtos\n2 - Verificar se a pilha est� vazia \n"
					+ "3 - Remover produtos da pilha (adicionar na pilha de produtos removidos) \n4 - Remover da pilha de produtos por nome(adicionar na pilha de produtos removidos)\n"
					+ "5 - Ver pilha de produtos  \n\n* Se��o da pilha dos produtos removidos *\n"
					+ "6 - Remover produto da pilha de produtos removidos \n7 - Ver produtos removidos (na pilha de produtos removidos) \n8 - Exit"));
			switch (op) {
			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:"));
				nome = JOptionPane.showInputDialog("Digite o nome do produto:");
				val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
				pilha.adicionaPilha(new Produtos(id, qtde, val, nome)); 
				break;
			case 2:
				vaz = pilha.vazia();
				if(vaz == true) {
					JOptionPane.showMessageDialog(null, "A Pilha est� vazia.");
				}else {
					JOptionPane.showMessageDialog(null, "A Pilha n�o est� vazia.");					
				}
				break;
			case 3:
				z = pilha.tiraPilha();
				if(z == null) {
					JOptionPane.showMessageDialog(null, "N�o h� produto para ser removido da pilha.");
				}else {
					JOptionPane.showMessageDialog(null, "O produto removido da pilha �:" + z.removido() + "\n" //Removido est� na classe "Produtos" para estruturar as informa��es do produto que ser� removido
							+ "E ser� adicionado na pilha dos Produtos removidos(se tiver espa�o).");
					pilha.adcionarProdutosRemovidos(z);
				}
				break;
			case 4:
				tira = JOptionPane.showInputDialog("Digite o nome do produto que queira remover:");
				z = pilha.removeProdutoNome(tira);
				if(z != null) {
					JOptionPane.showMessageDialog(null,"O Produto removido da pilha foi => "+ z.removido() + "\n" //Removido est� na classe "Produtos" para estruturar as informa��es do produto que ser� removido
							+ "E ser� adicionado na pilha dos Produtos removidos(se tiver espa�o).");
					pilha.adcionarProdutosRemovidos(z);
				}else {
					JOptionPane.showMessageDialog(null,"N�o h� produto com esse nome para ser removido.");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Os produtos que est�o na pilha s�o:" + pilha.verPilhaDeProdutos());
				break;
			case 6:
				z = pilha.tiraPilhaRemovida();
				if(z == null) {
					JOptionPane.showMessageDialog(null, "N�o h� produto para ser removido da pilha removida.");
				}else {
					JOptionPane.showMessageDialog(null, "O produto removido da pilha removida �:" + z.removido());//Removido est� na classe "Produtos" para estruturar as informa��es do produto que ser� removido
				}
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Os elementos que est�o na pilha removida s�o:" + pilha.verPilhaDeProdutosRemovidos());
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente.");
			}
		}
	}

}
