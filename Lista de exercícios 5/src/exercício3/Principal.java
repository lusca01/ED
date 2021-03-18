//3. A  classe Aluno possui atributos  que  s�o  criados  na  classe  concreta e  acessados  por meio  dos  m�todos  p�blicos  da  classe 
//(getters  e  setters).  Dado  o  cen�rio implemente uma Lista Encadeada: Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro,
//nome de tipo  de  dado String,  turma  do  tipo  de  dado  String  e  semestre  do  tipo  de  dado String. 
//Estes  atributos  devem  ser  acessados  por  meio  de  seus  m�todos  p�blicos (getters e setters).
//Implemente um m�todo que adicione um aluno no final da lista
//Implemente um m�todo que adicione um  aluno no in�cio da lista
//Implemente um m�todo que adicione um aluno no meio da lista
//Implemente um m�todo que remova um aluno no final da lista
//Implemente um m�todo que remova um aluno no in�cio da lista
//Implemente um m�todo que remova um aluno no meio da lista
//Implemente um m�todo que apresente cada um dos elementos da lista
//Realize  pelo  menos um  teste  de  mesa  para  cada  estrutura  com  15  elementos como conjunto deentrada
package exerc�cio3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args){
		ListaAlunos l = new ListaAlunos();
		int op=0,pos=0, ra;
		String name, turma, semestre;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar aluno no final\n2 - Adicionar aluno no in�cio\n"
					+ "3 - Adicionar aluno na posi��o\n4 - Remover aluno no final\n5 - Remover aluno no in�cio\n6 - Remover aluno na posi��o\n"
					+ "7 - Exibir alunos\n9 - Sair"));
			switch(op){
			case 1:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
				name = JOptionPane.showInputDialog("Digite o nome do Aluno:");
				turma = JOptionPane.showInputDialog("Digite a turma do Aluno:");
				semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
				l.adicionarFinal(new Aluno(ra, name, turma, semestre));
				break;
			case 2:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
				name = JOptionPane.showInputDialog("Digite o nome do Aluno:");
				turma = JOptionPane.showInputDialog("Digite a turma do Aluno:");
				semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
				l.adicionarInicio(new Aluno(ra, name, turma, semestre));
				break;
			case 3:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
				name = JOptionPane.showInputDialog("Digite o nome do Aluno:");
				turma = JOptionPane.showInputDialog("Digite a turma do Aluno:");
				semestre = JOptionPane.showInputDialog("Digite o semestre do aluno:");
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posi��o em que queira inserir o aluno:"));
				l.posAdiciona(new Aluno(ra, name, turma, semestre),pos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O aluno removido no final foi:\n"+l.removerFinal().mostraAluno());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O aluno removido no come�o foi:\n"+l.removerInicio().mostraAluno());
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o:"));
				JOptionPane.showMessageDialog(null, "O aluno removido foi:\n"+l.posRemove(pos).mostraAluno());
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Lista de Alunos:"+l.verAlunos());
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida!");
			}
		}

	}
}