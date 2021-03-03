//2)Implemente uma Pilha para o problema apresentado no Exercício 1.
//Implemente também uma  classe  de  teste  que  possui  uma  instância  da  classe Fila e  uma instância  da  classe  Pilha.
//Cada  elemento  removido  da Fila deve  ser  adicionado no topo da Pilha. 
//Cada elemento removido da Pilha deve ser adicionado no final da Fila.
package exercício2;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		Pilha2 pilha = new Pilha2();
		Fila2 fila = new Fila2();
		int op = 0, fil, pil;
		while (op != 7) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar na pilha\n2 - Adicionar na fila \n3 - Remover da pilha (adicionar na fila)"
					+ "\n4 - Remover da fila (adicionar na pilha) \n5 - Ver pilha \n6 - Ver fila \n7 - Exit"));
			switch (op) {
			case 1:
				pil = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que queira colocar na pilha."));
				pilha.adicionaPilha(pil);
				break;
			case 2:
				fil = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que queira colocar na fila."));
				fila.adicionaFila(fil);
				break;
			case 3:
				pil = pilha.tiraPilha();
				JOptionPane.showMessageDialog(null, "O valor retirado da pilha foi =>"+ pil +" e irá para o fim da fila(se tiver espaço).");
				fila.adicionaFila(pil);
				break;
			case 4:
				fil = fila.tiraFila();
				JOptionPane.showMessageDialog(null, "O valor retirado da fila foi =>"+ fil +" e irá para o fim da pilha(se tiver espaço).");
				pilha.adicionaPilha(fil);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Os elementos que estão na pilha são: "+ pilha.verPilha());
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Os elementos que estão na fila são: "+ fila.verFila());
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}
	}

}
