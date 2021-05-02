//1) Implemente uma Lista de Alunos em alocação dinâmica de memória duplamente encadeada
//com os atributos id, nome e curso. Deve ser implementado pelo menos um método recursivo.
//Realize as seguintes operações 
//verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
//adicionar um aluno no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//adicionar um aluno no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
//remover um aluno do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando. 
//remover um alunodo final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando. 
//percorrer e apresentar cada um dos elementos da lista
package exercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args){
		ListaAlunos l = new ListaAlunos();
		int op=0, ID;
		String name, curso;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1 - Verifica fila \n2 - Adicionar aluno no Início\n3 - Adicionar aluno no Final\n"
					+ "4 - Remover aluno no Início\n5 - Remover aluno no Final\n6 - Exibir alunos\n9 - Sair"));
			switch(op){
			case 1:
				l.verificaVazio();
				break;
			case 2:
				ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:"));
				name = JOptionPane.showInputDialog("Digite o nome do Aluno:");
				curso = JOptionPane.showInputDialog("Digite o curso do Aluno:");
				l.adicionarInicio(new Aluno(ID, name, curso));
				break;
			case 3:
				ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:"));
				name = JOptionPane.showInputDialog("Digite o nome do Aluno:");
				curso = JOptionPane.showInputDialog("Digite o curso do Aluno:");
				l.adicionarFinal(new Aluno(ID, name, curso));
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O aluno removido no inicio foi:\n"+l.removerInicio().mostraAluno());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O aluno removido no final foi:\n"+l.removerFinal().mostraAluno());
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Lista de Alunos:"+l.verAlunos());
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida!");
			}
		}
	}
}