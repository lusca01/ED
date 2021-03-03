package exercício4;

import javax.swing.JOptionPane;

public class Opções {

	public static void main(String[] args) {
		String titulo; int qtde, op = 0;
		Fila dados = new Fila(5);
		while (op != 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro(s)\n2 - Remover livro \n"
					+ "3 - Ver lista de livros \n4 - Exit"));
			switch (op) {
			case 1:
				titulo = JOptionPane.showInputDialog("Qual o título do livro?");
				qtde = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
				dados.adcionar(new Livro(titulo, qtde));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "O livro removido foi: "+ dados.tira());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Livros que estão na fila são: "+ dados.listar());
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
