//4)A classe Livro possuí os seguintes atributos que são criados na classe concreta e acessados  por  meio  dos  métodos  públicos  da  classe  (getters  e  setters). 
//Dado  o cenário implemente uma Fila em que:
//Sejam  criados  em  uma  classe  os  atributos  título  do  tipo  de  dado  String  e quantidade  de  exemplares  do  tipo  de  dado  inteiro.
//Estes  atributos  devem  ser acessados por meio de seus métodos públicos (getters e setters).
//Esta classe deve receber em seu método construtor a quantidade de elementos que a Fila terá em sua capacidade.
//Implemente uma classe que terá os métodos de enqueue e dequeue, para realizar as  operações  de  adicionar  e  remover  os  elementos  da  Fila.
//Esta  classe  deverá conter um vetor estático chamado Livro dados[ ]
//Crie um método quereceba os dados de entrada para a Fila.
//Crie um método que realize a exibição dos elementos da Fila.
//Realize o teste de mesa para os cenários de inclusão e exclusãoda Fila.
package exercício4;

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
			JOptionPane.showMessageDialog(null,"Não há espaço na fila.");
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
			JOptionPane.showMessageDialog(null,"A fila não possui elementos.");
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
