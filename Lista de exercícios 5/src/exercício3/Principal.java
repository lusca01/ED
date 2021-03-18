//3. A  classe Aluno possui atributos  que  são  criados  na  classe  concreta e  acessados  por meio  dos  métodos  públicos  da  classe 
//(getters  e  setters).  Dado  o  cenário implemente uma Lista Encadeada: Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro,
//nome de tipo  de  dado String,  turma  do  tipo  de  dado  String  e  semestre  do  tipo  de  dado String. 
//Estes  atributos  devem  ser  acessados  por  meio  de  seus  métodos  públicos (getters e setters).
//Implemente um método que adicione um aluno no final da lista
//Implemente um método que adicione um  aluno no início da lista
//Implemente um método que adicione um aluno no meio da lista
//Implemente um método que remova um aluno no final da lista
//Implemente um método que remova um aluno no início da lista
//Implemente um método que remova um aluno no meio da lista
//Implemente um método que apresente cada um dos elementos da lista
//Realize  pelo  menos um  teste  de  mesa  para  cada  estrutura  com  15  elementos como conjunto deentrada
package exercício3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args){
		ListaAlunos l = new ListaAlunos();
		int op=0,pos=0, ra;
		String name, turma, semestre;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar aluno no final\n2 - Adicionar aluno no início\n"
					+ "3 - Adicionar aluno na posição\n4 - Remover aluno no final\n5 - Remover aluno no início\n6 - Remover aluno na posição\n"
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
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição em que queira inserir o aluno:"));
				l.posAdiciona(new Aluno(ra, name, turma, semestre),pos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"O aluno removido no final foi:\n"+l.removerFinal().mostraAluno());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"O aluno removido no começo foi:\n"+l.removerInicio().mostraAluno());
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição:"));
				JOptionPane.showMessageDialog(null, "O aluno removido foi:\n"+l.posRemove(pos).mostraAluno());
				break;
			case 7:
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