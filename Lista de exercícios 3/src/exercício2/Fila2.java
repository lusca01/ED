package exercício2;

import javax.swing.JOptionPane;

public class Fila2 {
	static int fila [] = new int [4];
	static int tamanho = 0;
	
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
