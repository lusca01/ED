package exercício2;

import javax.swing.JOptionPane;

public class Pilha2 {
	static int pilha[] = new int [4];
	static int tamanho = 0;
	
	public void adicionaPilha(int x){     
		if (tamanho<pilha.length){
			pilha[tamanho]=x;                     
			tamanho++;                            
		}
		else{
			JOptionPane.showMessageDialog(null, "A pilha está cheia.");    
		}
	}
	
	public int tiraPilha(){
		int  i, x;
		x = pilha[tamanho-1];
		if (tamanho>=1){                               
			x = pilha[tamanho-1];
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1) {                            
					tamanho--;     
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "Não há elementos na pilha para remover.");
		}
		return x;
	}
	
	public String verPilha(){                    
		String aux = " ";
		for (int i=0;i<tamanho;i++){
			aux = aux + "\n" + pilha[i];
		}
		return aux;
	}	
}
