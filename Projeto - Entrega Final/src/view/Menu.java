//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package view;
import java.io.IOException;

import javax.swing.JOptionPane;

import controller.Aluguel;
import controller.ListaAluguel;
import controller.ListaCliente;
import controller.ListaTema;
import controller.QuickSort;

public class Menu{
	public static ListaCliente c = new ListaCliente();//Referenciando c como a classe ListaCliente
	public static ListaTema t = new ListaTema();//Referenciando t como a classe ListaTema
	public static ListaAluguel a = new ListaAluguel();//Referenciando a como a classe ListaAluguel

	public static void main(String[]args){
		QuickSort q = new QuickSort();
		Aluguel[] x;
		int op=0;
		while(op != 99) {
			try{
			//Tabelinha que mostra o menu de op��es
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Tema  | 4 - Adicionar Cliente  | 7 - Adicionar Aluguel"
					+ "\n2 - Remover Tema   | 5 - Remover Cliente   | 8 - Remover Aluguel\n3 - Exibir Temas       "
					+ "| 6 - Exibir Clientes       | 9 - Exibir Alugu�is\n"
					+ "����������������������������������������������������������������������������������������\n"
					+ "10 - Ordenar Alugu�is         | 11 - Imprimir Alugu�is\n"
					+ "����������������������������������������������������������������������������������������\n"
					+ "99 - Sair"));
			switch(op){
			case 1:
				t.cadastroTema();//Adiciona Cliente
				break;
			case 2:
				t.filtroRemove();//Remove Tema
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Lista de Temas:"+ t.verTemas());//Exibe Temas
				break;
			case 4:
				c.cadastroCliente();//Adiciona Cliente
				break;
			case 5: 
				c.filtroRemove();//Remove Cliente
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Lista de Clientes:"+ c.verClientes());//Exibe Clientes 
				break;
			case 7:
				if(c.verClientes() == " ") {
					JOptionPane.showMessageDialog(null, "N�o h� clientes cadastrados!");
				}else if(t.verTemas() == " ") {
					JOptionPane.showMessageDialog(null, "N�o h� temas cadastrados!");
				}else {
					a.cadastroAluguel();//Adiciona Aluguel					
				}
				break;
			case 8:
				a.filtroRemove();//Remove Aluguel
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Lista de Alugueis:"+ a.verAlugueis());//Exibe Alugu�is
				break;
			case 10:
				x = a.pegaVetor();//Transforma a lista de alugu�is em um vetor
				if(x == null) {
					JOptionPane.showMessageDialog(null,"A lista de alugu�is est� vazia! N�o h� o que organizar!");
					break;
				}
				q.Comeco(x, op);//Ordena com QuickSort e exibe os alugu�is ordenados por dia e m�s (o "op" � para apenas exibi��o)
				break;
			case 11:
				
				x = a.pegaVetor();//Transforma a lista de alugu�is em um vetor
				if(x == null) {
					JOptionPane.showMessageDialog(null,"A lista de alugu�is est� vazia! N�o h� o que organizar/Imprimir!");
					break;
				}
				x = q.Comeco(x, op);//Ordena com QuickSort e exibe os alugu�is ordenados por dia e m�s (o "op" � para impress�o organizada)
				
				try {
					a.createFile(x);//Armazena os alugu�is em um arquivo txt
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida!");
			}	
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO! \n" + e.getClass() + "\n" + e.getLocalizedMessage());
				e.printStackTrace();
			}
		}
	}
}