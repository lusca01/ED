package exercício3;

import javax.swing.JOptionPane;

public class Pilha {
	static Livros dadox[];
	static int tamanho;
	
	public Pilha (int capacidade) {
		dadox = new Livros[capacidade];
		tamanho = 0;
	}

	public void adcionar(Livros e) {
		if (tamanho < dadox.length) {
			dadox[tamanho] = e;
			tamanho++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Não há espaço na Pilha.");
		}
	}
	
	public Livros tira() {
		Livros x = null;
		if (tamanho >= 1) {
			x = dadox[tamanho-1];
			tamanho--;
		}else {
			JOptionPane.showMessageDialog(null,"A Pilha não possui elementos.");
		}
		return x;
	}

	public String listar() {
		String aux = " ";
		for (int i=0; i < tamanho;i++) {
			aux = aux + "\n "+ dadox[i].Estrutura();
		}
		return aux;
	}
}
