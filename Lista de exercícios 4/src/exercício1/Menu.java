//1. O Detram necessita de uma aplicação que faça o gerenciamento das pessoas que se cadastraram de maneira online para o exame final.
//Dado o cenário implemente uma Fila Estática de Pessoas contendo as propriedades ID, nome, RG, telefone e data de nascimento.
//A aplicação deve:
//-verificar se a fila está vazia, retornando true se estiver vazia e false se não estiver X
//-adicionar uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-remover uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-adicionar todas as pessoas removidas em uma pilha de pessoas
//-pesquisar a ordem de espera de uma pessoa na fila X
//-percorrer e apresentar cada um dos elementos da fila X
//-comente no código os trechos de criação dos endereços de memória
//-comente no código todas as associações entre classes
package exercício1;
import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		Pessoas z = null;
		int id, telefone, rg, op = 0;
		String nome, datanasc; boolean vaz;
		FilaDetram fila = new FilaDetram(5);//Definindo o tamanho da FilaDetram e passando como parametro
		while (op != 8) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar pessoas\n2 - Verificar se a fila está vazia \n"
					+ "3 - Remover pessoa da fila (adicionar na pilha) \n4 - Ver ordem da fila \n5 - Ver pessoas e seus dados na fila \n"
					+ "\n* Seção da pilha dos elementos removidos * \n6 - Remover pessoas da pilha \n7 - Ver pessoas removidas da fila (na pilha) \n8 - Exit"));
			switch (op) {
			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:"));
				nome = JOptionPane.showInputDialog("Digite o nome:");
				rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG:"));
				datanasc = JOptionPane.showInputDialog("Digite a data de nascimento:");
				telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone:"));
				fila.cadastra(new Pessoas(id, rg, telefone, datanasc, nome)); //Chamando um metodo para adicionar Pessoas, passando suas info como parametro
				break;
			case 2:
				vaz = fila.vazia();//Chamando um metodo para verificar se a FilaDetram está vazia, que retorna valor booleano
				if (vaz == true) {
					JOptionPane.showMessageDialog(null,"A fila está vazia.");
				}else {
					JOptionPane.showMessageDialog(null,"A fila não está vazia.");
				}
				break;
			case 3:
				fila.adcionarP(fila.tira());//Chamando dois metodos aqui. O segundo retorna um elemento removido da fila (inicio) que é adicionado através do primeiro metodo à pilha.
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "A fila está ocupada em ordem por: " + fila.ordemEspera());//Chamando um metodo para verificar a ordem de espera da fila
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Os elementos e seus respectivos dados na fila são:" + fila.apresentaPessoas());//Chamando um metodo para verificar todas as info de todas as Pessoas da fila
				break;
			case 6:
				z = fila.tiraP();
				if(z !=null) {
					JOptionPane.showMessageDialog(null,"A pessoa removida da pilha removida foi => "+ z.removido());//O "removido" é uma classe criada em Pessoas para estruturar todas as info das Pessoas removidas
				}else {
					JOptionPane.showMessageDialog(null,"A Pilha não possui elementos.");
				}
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Os elementos que estão na pilha removida são:" + fila.apresentaPilha());//Chamando um metodo para verificar todas as info de todas as Pessoas da pilha
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
