//3)A  classe  Livro  possu�  atributos  que  s�o  criados  na  classe  concreta  e  acessados por  meio  dos  m�todos  p�blicos  da  classe  (getters  e  setters). 
//Dado  o  cen�rio implemente uma Pilha em que:
//Sejam  criados  em  uma  classe  os  atributos  t�tulo  do  tipo  de  dado  String  e quantidade  de  exemplares  do  tipo  de  dado  inteiro.
//Estes  atributos  devem  ser acessados por meio de seus m�todos p�blicos (getters e setters). 
//Esta classe deve receber em seu m�todo construtor a quantidade de elementos que a Pilha ter� em sua capacidade.
//Implemente  uma  classe  que  ter�  os  m�todos  de  push  e  pop,  para  realizar  as opera��es  de  adicionar  e  remover  os  elementos  da  Pilha. 
//Esta  classe  dever� conter um vetor est�tico chamado Livro dados[ ]
//Crie um m�todo que receba os dados de entrada para a Pilha.
//Crie um m�todo que realize a exibi��o dos elementos da Pilha.
//Realize o teste de mesa para os cen�rios de inclus�o e exclus�o da Pilha.

package exerc�cio3;

import javax.swing.JOptionPane;


public class Op��es {

	public static void main(String[] args) {
		String titulo; int qtde, op = 0;
		Pilha dadox = new Pilha(5);
		while (op != 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro(s)\n2 - Remover livro \n"
					+ "3 - Ver lista de livros \n4 - Exit"));
			switch (op) {
			case 1:
				titulo = JOptionPane.showInputDialog("Qual o t�tulo do livro?");
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
				dadox.adcionar(new Livros(titulo, qtde));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O livro removido foi: "+ dadox.tira());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Livros que est�o na pilha s�o: "+ dadox.listar());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente.");
			}
		}
	}
}