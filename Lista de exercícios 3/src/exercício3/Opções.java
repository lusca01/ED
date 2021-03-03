//3)A  classe  Livro  possuí  atributos  que  são  criados  na  classe  concreta  e  acessados por  meio  dos  métodos  públicos  da  classe  (getters  e  setters). 
//Dado  o  cenário implemente uma Pilha em que:
//Sejam  criados  em  uma  classe  os  atributos  título  do  tipo  de  dado  String  e quantidade  de  exemplares  do  tipo  de  dado  inteiro.
//Estes  atributos  devem  ser acessados por meio de seus métodos públicos (getters e setters). 
//Esta classe deve receber em seu método construtor a quantidade de elementos que a Pilha terá em sua capacidade.
//Implemente  uma  classe  que  terá  os  métodos  de  push  e  pop,  para  realizar  as operações  de  adicionar  e  remover  os  elementos  da  Pilha. 
//Esta  classe  deverá conter um vetor estático chamado Livro dados[ ]
//Crie um método que receba os dados de entrada para a Pilha.
//Crie um método que realize a exibição dos elementos da Pilha.
//Realize o teste de mesa para os cenários de inclusão e exclusão da Pilha.

package exercício3;

import javax.swing.JOptionPane;


public class Opções {

	public static void main(String[] args) {
		String titulo; int qtde, op = 0;
		Pilha dadox = new Pilha(5);
		while (op != 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro(s)\n2 - Remover livro \n"
					+ "3 - Ver lista de livros \n4 - Exit"));
			switch (op) {
			case 1:
				titulo = JOptionPane.showInputDialog("Qual o título do livro?");
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
				dadox.adcionar(new Livros(titulo, qtde));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O livro removido foi: "+ dadox.tira());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Livros que estão na pilha são: "+ dadox.listar());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}
	}
}