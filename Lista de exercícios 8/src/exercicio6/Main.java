//3) Realize a implementação do Algoritmo Merge Sort para uma Lista Duplamente Ligada considerando o seguinte cenário: 
//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 
//Implemente a classe Média com os atributos ID do Aluno, ID da Disciplina e Média Final 
//As classes Aluno, Disciplina e Média devem realizar as seguintes operações: 
//Inserir um elemento no final da Lista 
//Inserir um elemento no início da Lista 
//Remover um elemento do final da Lista 
//Remover um elemento do início da Lista 
//Realize a ordenação dos Alunos pela média final utilizando o Algoritmo Merge Sort e apresente em console as seguintes informações: 
//Nome do Aluno 
//Disciplina Cursada 
//Média Final obtida 
//Apresente a quantidade de alunos com média maior ou igual a 8.
package exercicio6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		int op=0;
		while(op!=99){
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Aluno (Final)\n2 - Adicionar Aluno (começo)\n3 - Remover Aluno (final)\n"
					+ "4 - Remover Aluno (começo)\n5 - Exibir Alunos \n6 - Adicionar Disciplina (Final)\n7 - Adicionar Disciplina (começo)\n8 - Remover Disciplina (final)"
					+ "\n9 - Remover Discplina (começo)\n10 - Exibir Disciplinas\n11 - Adicionar Media (Final)\n12 - Adicionar Media (começo)\n13 - Remover Media (final) "
					+ "\n14 - Remover Media(começo)\n15 - Exibir médias\n16 - QuickSort \n99 - Sair"));
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
				JOptionPane.showMessageDialog(null,"A disciplina removida no começo foi:\n"+ l.removerInicioDisciplina().mostraDisciplina());
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
				JOptionPane.showMessageDialog(null,"A media removida no começo foi:\n"+ l.removerInicioMedia().mostraMedia());
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
				JOptionPane.showMessageDialog(null,"Opção inválida!");
			}
		}
	}

}
