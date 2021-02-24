package exercicios;
import javax.swing.JOptionPane;

public class Ex3 {
	static String lista[] = new String [4];
	static int tamanho = 0;
	
	public static void main(String[] args) {
		Ex3 ex = new Ex3();                   
		int opcao = 0, posicao;
		String letra;
		boolean test;
		while(opcao!=99){
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1 - Verificar se est� vazia \n2 - Verificar se est� cheia "
				+ "\n3 - Adicionar no in�cio \n4 - Adicionar no final \n5 - Adicionar em lugar determinado "
				+ "\n6 - Remover no in�cio \n7 - Remover no final \n8 - Remover em lugar determinado \n9 - Percorrer lista \n99 - Sair"));
			switch(opcao){
			case 1:
				test = ex.verificaVaz();
				if (test==true) {
					System.out.println("A lista est� vazia.");
				}else {
					System.out.println("A lista n�o est� vazia.");
				}
				break;
			case 2:
				test = ex.verificaChe();
				if (test==true) {
					System.out.println("A lista est� cheia.");
				}else {
					System.out.println("A lista n�o est� cheia.");
				}
				break;
			case 3:
				letra = JOptionPane.showInputDialog("Valor a ser adicionado no in�cio:");
				ex.adicionaInicio(letra);
				break;
			case 4:
				letra = JOptionPane.showInputDialog("Valor a ser adicionado no final:");
				ex.adicionaFinal(letra);
				break;
			case 5:
				letra = JOptionPane.showInputDialog("Valor a ser adicionado:");
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Posi��o onde vai ser adicionado:"));
				if (posicao > 4 || posicao < 1) {
					JOptionPane.showMessageDialog(null,"Posi��o inserida n�o existe.");
				}else {
					posicao = posicao -1;
					ex.adicionaPosicao(letra, posicao);
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"O valor removido no in�cio foi => " + ex.tiraInicio());
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"O valor removido no final foi => " + ex.tiraFinal());	
				break;
			case 8:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Posi��o onde vai ser removido:"));
				if (posicao > 4 || posicao < 1) {
					JOptionPane.showMessageDialog(null,"Posi��o inserida n�o existe.");
				}else {
					posicao = posicao -1;
					JOptionPane.showMessageDialog(null,"O valor removido no foi => " + ex.tiraPosicao(posicao));
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Percorre lista " + ex.percorre());
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Encerrando...");	
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o digitada inv�lida.");
				break;
			}
		}
	}
	public boolean verificaVaz() {
		if (tamanho==0) {
			return true;
		}
		return false;
	}
	
	public boolean verificaChe() {
		if (tamanho==lista.length) {
			return true;
		}
		return false;
	}
	
	public void adicionaInicio(String letra){   
		if (tamanho<lista.length){           
			for (int i=tamanho;i>0;i--){         
				lista[i]=lista[i-1];                 
			}
			lista[0]= letra;                          
			tamanho++;                           
		}else{
			System.out.println("N�o foi poss�vel. A lista est� cheia.");         
		}
	}
	
	public void adicionaFinal(String x){     
		if (tamanho<lista.length){
			lista[tamanho]=x;                     
			tamanho++;                            
		}
		else{
			System.out.println("A lista est� cheia.");    
		}
	}
	
	public void adicionaPosicao(String x, int posicao){
		int i;
		if ((tamanho<lista.length)&&(posicao<tamanho+1)&&(posicao>=0)){
			for (i=tamanho;i!=posicao;i--){                     
				if (i!=0){                                      
					lista[i]= lista[i-1];                            
				}
			}
			lista[i] = x;                                     
			tamanho++;                                      
		}
	}
	public String tiraInicio(){
		int  i;
		String volta =" ";
		if (tamanho>=1){                              
			volta = lista[0];
			for (i=1;i<tamanho;i++){                      
				lista[i-1] = lista[i];                          
			}
			tamanho--;                                   
		}
		return volta;
	}
	public String tiraFinal(){
		int  i;
		String volta = " ";
		if (tamanho>=1){                               
			volta = lista[tamanho-1];
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1) {                            
					tamanho--;     
				}
			}
		}
		return volta;
	}
	
	public String tiraPosicao(int posicao){
		int  i;
		String volta = " ";                                        
		if ((posicao<tamanho)&&(posicao>=0)&&(tamanho>=1)){
			volta = lista[posicao];
			for (i=posicao;i<tamanho-1;i++){                 
				lista[i] = lista[i+1];                         
			}
			tamanho--;                                   
		}
		return volta;
	}
	
	public String percorre(){                    
		String aux=" ";
		for (int i=0;i<tamanho;i++){
			aux = aux + "\n" + lista[i];
		}
		return aux;
	}
}

//3)  Implemente  uma  Lista  de  Strings  em  aloca��o  est�tica  com  todas  as  opera��es indicadas a seguir: 
//-verificar se a lista est� vazia, retornando true se estiver vazia e false se n�o estiver;
//-verificar se a lista est� cheia, retornando true se estiver cheia e false se n�o estiver;
//-adicionar  uma  String no  in�cio  da  lista,  caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
//-adicionar  uma  String  no  final  da  lista,  caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
//-adicionar  uma  String  em  determinada  posi��o  da  lista,  caso a  opera��o  n�o  possa  ser realizada, mostre mensagem avisando o motivo;
//-remover a String do in�cio da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-remover a String do final da lista, retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-remover a String de  determinada posi��o da lista,  retornando o elemento que foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-percorrer a lista concatenando os elementos em uma String que ser� devolvida no final.
