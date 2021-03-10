//2. Uma Loja Virtual necessita de uma aplicação que faça o gerenciamento de suas vendas por meio de uma Pilha que retire
//os produtos removidos que não existam em estoque.
//A classe Produtos possui os atributos ID, nome, valor e quantidade.
//A aplicação deve:
//-verificar se a pilha está vazia, retornando true se estiver vazia e false se não estiver;
//-adicionar um produto na pilha, caso a operação não possa ser realizada, mostre mensagemavisando;
//-removerum produto na pilha, caso a operação não possa ser realizada, mostre mensagemavisando;
//-adicionar todos os produto removidos em uma pilha de produtos-remover uma pesquisa por nome do produto
//-pesquisar a ordem de espera de uma pessoa na pilha-percorrer e apresentarcada um dos elementos da pilha
//-comente nocódigo os trechos de criação dos endereços de memória-comente nocódigo todas as associações entre classes
package exercício2;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Produtos z = null;
		int id, qtde, op = 0;
		String nome, tira; boolean vaz;
		double val;
		PilhaLojaVirtual pilha = new PilhaLojaVirtual(5);
		while (op != 8) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar produtos\n2 - Verificar se a pilha está vazia \n"
					+ "3 - Remover produtos da pilha (adicionar na pilha de produtos removidos) \n4 - Remover da pilha de produtos por nome(adicionar na pilha de produtos removidos)\n"
					+ "5 - Ver pilha de produtos  \n\n* Seção da pilha dos produtos removidos *\n"
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
					JOptionPane.showMessageDialog(null, "A Pilha está vazia.");
				}else {
					JOptionPane.showMessageDialog(null, "A Pilha não está vazia.");					
				}
				break;
			case 3:
				z = pilha.tiraPilha();
				if(z == null) {
					JOptionPane.showMessageDialog(null, "Não há produto para ser removido da pilha.");
				}else {
					JOptionPane.showMessageDialog(null, "O produto removido da pilha é:" + z.removido() + "\n" //Removido está na classe "Produtos" para estruturar as informações do produto que será removido
							+ "E será adicionado na pilha dos Produtos removidos(se tiver espaço).");
					pilha.adcionarProdutosRemovidos(z);
				}
				break;
			case 4:
				tira = JOptionPane.showInputDialog("Digite o nome do produto que queira remover:");
				z = pilha.removeProdutoNome(tira);
				if(z != null) {
					JOptionPane.showMessageDialog(null,"O Produto removido da pilha foi => "+ z.removido() + "\n" //Removido está na classe "Produtos" para estruturar as informações do produto que será removido
							+ "E será adicionado na pilha dos Produtos removidos(se tiver espaço).");
					pilha.adcionarProdutosRemovidos(z);
				}else {
					JOptionPane.showMessageDialog(null,"Não há produto com esse nome para ser removido.");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Os produtos que estão na pilha são:" + pilha.verPilhaDeProdutos());
				break;
			case 6:
				z = pilha.tiraPilhaRemovida();
				if(z == null) {
					JOptionPane.showMessageDialog(null, "Não há produto para ser removido da pilha removida.");
				}else {
					JOptionPane.showMessageDialog(null, "O produto removido da pilha removida é:" + z.removido());//Removido está na classe "Produtos" para estruturar as informações do produto que será removido
				}
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Os elementos que estão na pilha removida são:" + pilha.verPilhaDeProdutosRemovidos());
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}
	}

}
