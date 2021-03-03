//Fila [4]
package exercício1;

import javax.swing.JOptionPane;

public class Ex1 {
	static int fila [] = new int [4];
	static int tamanho = 0;
	
	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		int op = 0, fil;
		while (op != 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar na fila\n2 - Remover na fila \n"
					+ "3 - Ver fila \n4 - Exit"));
			switch (op) {
			case 1:
				fil = Integer.parseInt(JOptionPane.showInputDialog("Qual valor quer inserir na fila?"));
				ex.adicionaFila(fil);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Elemento da fila removido foi: "+ ex.tiraFila());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Elemento(s) que estão na fila são: "+ ex.verFila()+"\nTamanho => " + tamanho);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
			}
		}
	}

	public void adicionaFila(int x){     
		if (tamanho<fila.length){
			fila[tamanho] = x;                     
			tamanho++;                            
		}
		else{
			JOptionPane.showMessageDialog(null, "A fila está cheia.");    
		}
	}
	
	public int tiraFila(){
		int  i, aux;
		aux = fila[tamanho-1];
		if (tamanho>=1){                              
			aux = fila[0];					
			for (i=1;i<tamanho;i++){                      
				fila[i-1] = fila[i];                          
			}
			tamanho--;                                   
		}else {
			JOptionPane.showMessageDialog(null, "Fila não possui elementos para serem removidos.");
		}
		return aux;
	}
	
	public String verFila(){  
		String aux = " ";
		for (int i=0;i<tamanho;i++){
			aux = aux + "\n" + fila[i];
		}
		return aux;
	}
}
