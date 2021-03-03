//4)A classe Livro possu� os seguintes atributos que s�o criados na classe concreta e acessados  por  meio  dos  m�todos  p�blicos  da  classe  (getters  e  setters). 
//Dado  o cen�rio implemente uma Fila em que:
//Sejam  criados  em  uma  classe  os  atributos  t�tulo  do  tipo  de  dado  String  e quantidade  de  exemplares  do  tipo  de  dado  inteiro.
//Estes  atributos  devem  ser acessados por meio de seus m�todos p�blicos (getters e setters).
//Esta classe deve receber em seu m�todo construtor a quantidade de elementos que a Fila ter� em sua capacidade.
//Implemente uma classe que ter� os m�todos de enqueue e dequeue, para realizar as  opera��es  de  adicionar  e  remover  os  elementos  da  Fila.
//Esta  classe  dever� conter um vetor est�tico chamado Livro dados[ ]
//Crie um m�todo quereceba os dados de entrada para a Fila.
//Crie um m�todo que realize a exibi��o dos elementos da Fila.
//Realize o teste de mesa para os cen�rios de inclus�o e exclus�oda Fila.
package exerc�cio4;

import javax.swing.JOptionPane;

public class Fila {
	private Livro dados[];
	private int tamanho;
	
	public Fila (int capacidade) {
		dados = new Livro[capacidade];
		tamanho = 0;
	}

	public void adcionar(Livro e) {
		if (tamanho < dados.length) {
			dados[tamanho] = e;
			tamanho++;
		}
		else {
			JOptionPane.showMessageDialog(null,"N�o h� espa�o na fila.");
		}
	}
	
	public Livro tira() {
		Livro x = null;
		if (tamanho>= 1) {
			x = dados[0];
			for (int i=0;i<tamanho-1; i++) {
				dados[i] = dados [i+1];
			}
			tamanho--;
		}else {
			JOptionPane.showMessageDialog(null,"A fila n�o possui elementos.");
		}
		return x;
	}

	public String listar() {
		String aux = " ";
		for (int i=0; i < tamanho;i++) {
			aux = aux + "\n "+ dados[i].Estrutura();
		}
		return aux;
	}
}
