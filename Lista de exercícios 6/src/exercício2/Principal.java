//2. Implemente uma Lista de temperaturas em alocação dinâmicacom todas as operações indicadas a seguir e que utilize pelo menos um método recursivo.
//verificar se a lista está vazia, retornando true se estiver vazia e false se nãoestiver;
//adicionar uma temperatura no início da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura no final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//adicionar uma temperatura em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
//removera temperatura do início da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagemavisando;
//remover a temperatura do final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
//remover a temperatura de determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
//percorrer e apresentar cada um dos elementos da lista.
//Explique comoa recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta.
package exercício2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args){
		ListaTemperatura l = new ListaTemperatura();
		int op=0,pos=0;
		boolean vaz;
		double temp;
		while(op!=9){
			op=Integer.parseInt(JOptionPane.showInputDialog("1 - Verificar se está vazia\n2 - Adicionar temperatura no final\n"
					+ "3 - Adicionar temperatura no início\n4 - Adicionar temperatura na posição\n5 - Remover temperatura no final\n"
					+ "6 - Remover temperatura no início\n7 - Remover temperatura na posição\n8 - Exibir temperaturas\n9 - Sair"));
			switch(op){
			case 1:
				vaz = l.vazia();
				if(vaz == true) {
					JOptionPane.showMessageDialog(null, "A lista de temperatura está vazia.");
				}else {
					JOptionPane.showMessageDialog(null, "A lista de temperatura não está vazia.");					
				}
				break;
			case 2:
				temp = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura:"));
				l.adicionarFinal(temp);
				break;
			case 3:
				temp = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura:"));
				l.adicionarInicio(temp);
				break;
			case 4:
				temp = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura:"));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição:"));
				l.posAdiciona(temp, pos);
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"A temperatura removida foi:"+l.removerFinal()+"ºC");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"A temperatura removida foi:"+l.removerInicio());
				break;
			case 7:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição:"));
				JOptionPane.showMessageDialog(null, "A temperatura removida foi:"+l.posRemove(pos));
				break;
			case 8:
				JOptionPane.showMessageDialog(null,"Lista de Temperaturas:"+l.verTemperaturas());
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