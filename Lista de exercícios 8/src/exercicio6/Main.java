//3) Realize a implementa��o do Algoritmo Merge Sort para uma Lista Duplamente Ligada considerando o seguinte cen�rio: 
//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 
//Implemente a classe M�dia com os atributos ID do Aluno, ID da Disciplina e M�dia Final 
//As classes Aluno, Disciplina e M�dia devem realizar as seguintes opera��es: 
//Inserir um elemento no final da Lista 
//Inserir um elemento no in�cio da Lista 
//Remover um elemento do final da Lista 
//Remover um elemento do in�cio da Lista 
//Realize a ordena��o dos Alunos pela m�dia final utilizando o Algoritmo Merge Sort e apresente em console as seguintes informa��es: 
//Nome do Aluno 
//Disciplina Cursada 
//M�dia Final obtida 
//Apresente a quantidade de alunos com m�dia maior ou igual a 8.
package exercicio6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		int op=0;
		while(op!=99){
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Aluno (Final)\n2 - Adicionar Aluno (come�o)\n3 - Remover Aluno (final)\n"
					+ "4 - Remover Aluno (come�o)\n5 - Exibir Alunos \n6 - Adicionar Disciplina (Final)\n7 - Adicionar Disciplina (come�o)\n8 - Remover Disciplina (final)"
					+ "\n9 - Remover Discplina (come�o)\n10 - Exibir Disciplinas\n11 - Adicionar Media (Final)\n12 - Adicionar Media (come�o)\n13 - Remover Media (final) "
					+ "\n14 - Remover Media(come�o)\n15 - Exibir m�dias\n16 - QuickSort \n99 - Sair"));
			switch(op){
			case 1:
				l.dadosAlunos(op);
				break;
			case 2:
				l.dadosAlunos(op);
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"O aluno removido no final foi:\n"+ l.removerFinalAluno().mostraAluno());
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O aluno removido no final foi:\n"+l.removerInicioAluno().mostraAluno());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Lista de Alunos:"+l.verAluno());
				break;
			case 6:
				l.dadosDisciplina(op);
				break;
			case 7:
				l.dadosDisciplina(op);
				break;
			case 8:
				JOptionPane.showMessageDialog(null,"A disciplina removida no final foi:\n"+ l.removerFinalDisciplina().mostraDisciplina());
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"A disciplina removida no come�o foi:\n"+ l.removerInicioDisciplina().mostraDisciplina());
				break;
			case 10:
				JOptionPane.showMessageDialog(null,"Lista de Disciplinas:"+l.verDisciplina());
				break;
			case 11:
				l.dadosMedia(op);
				break;
			case 12:
				l.dadosMedia(op);
				break;
			case 13:
				JOptionPane.showMessageDialog(null,"A media removida no final foi:\n"+ l.removerFinalMedia().mostraMedia());
				break;
			case 14:
				JOptionPane.showMessageDialog(null,"A media removida no come�o foi:\n"+ l.removerInicioMedia().mostraMedia());
				break;
			case 15:
				JOptionPane.showMessageDialog(null,"Lista de Medias:"+l.verMedia());
				break;
			case 16:
				
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida!");
			}
		}
	}

}
