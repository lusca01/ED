//2)  Implemente  uma  Lista  de  caracteres  em  aloca��o  est�tica  com  todas  as  opera��es indicadas a seguir: 
//-verificar se a lista est� vazia, retornando true se estiver vazia e false se n�o estiver;
//-verificar se a lista est� cheia, retornando true se estiver cheia e false se n�o estiver;
//-adicionar  caractere  no  in�cio  da  lista,  caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
//-adicionar  caractere  no  final  da  lista,  caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
//-adicionar  caractere  em  determinada  posi��o  da  lista,  caso  a  opera��o  n�o  possa  ser realizada, mostre mensagem avisando o motivo;
//-remover  caractere  do  in�cio  da  lista,  retornando  o  elemento  que  foi  removido,  caso  a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-remover  caractere  do  final  da  lista,  retornando  o  elemento  que  foi  removido,  caso  a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-remover   caractere   de   determinada   posi��oda   lista,   retornando   o   elemento   que   foi removido, caso a opera��o n�o possa ser realizada, mostre mensagem avisando;
//-percorrer a lista concatenando os elementos em uma String que ser� devolvida no final.

package exercicios;
import javax.swing.JOptionPane;

public class Ex2 {
	static Character lista[] = new Character [4];
	static int tamanho = 0;
	
	public static void main(String[] args) {
		Ex2 ex = new Ex2();                   
		int opcao = 0, posicao;
		Character letra;
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
				letra = JOptionPane.showInputDialog("Caractere a ser adicionado no in�cio:").charAt(0);
				ex.adicionaInicio(letra);
				break;
			case 4:
				letra = JOptionPane.showInputDialog("Caractere a ser adicionado no final:").charAt(0);
				ex.adicionaFinal(letra);
				break;
			case 5:
				letra = JOptionPane.showInputDialog("Caractere a ser adicionado:").charAt(0);
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
					JOptionPane.showMessageDialog(null,"O valor removido na posi��o selecionada foi => " + ex.tiraPosicao(posicao));
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
	
	public void adicionaInicio(Character letra){   
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
	
	public void adicionaFinal(Character letra){     
		if (tamanho<lista.length){
			lista[tamanho]= letra;                  
			tamanho++;                            
		}
		else{
			System.out.println("A lista est� cheia.");    
		}
	}
	
	public void adicionaPosicao(Character x, int posicao){
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
	public Character tiraInicio(){
		int  i;
		Character aux = ' ';
		if (tamanho>=1){                              
			aux = lista[0];					
			for (i=1;i<tamanho;i++){                      
				lista[i-1] = lista[i];                          
			}
			tamanho--;                                   
		}
		return aux;
	}
	
	public Character tiraFinal(){
		int  i;
		Character aux = ' ';
		if (tamanho>=1){                               
			aux = lista[tamanho-1];					
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1) {                            
					tamanho--;     					
				}
			}
		}
		return aux;
	}
	
	public Character tiraPosicao(int posicao){
		int  i;
		Character aux = ' ';
		if ((posicao<tamanho)&&(posicao>=0)&&(tamanho>=1)){     
			aux = lista[posicao];							
			for (i=posicao;i<tamanho-1;i++){                 
				lista[i] = lista[i+1];                         
			}
			tamanho--;                                   
		}
		return aux;
	}
	
	public Character percorre(){  
		Character aux = ' ';
		for (int i=0;i<tamanho;i++){
			System.out.println(lista[i]);
		}
		System.out.print("\n");
		return aux;
	}
}