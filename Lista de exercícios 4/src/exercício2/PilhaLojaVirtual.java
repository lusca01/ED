//2. Uma Loja Virtual necessita de uma aplicação que faça o gerenciamento de suas vendas por meio de uma Pilha que retire
//os produtos removidos que não existam em estoque.
//A classe Produtos possui os atributos ID, nome, valor e quantidade. X
//A aplicação deve:
//-verificar se a pilha está vazia, retornando true se estiver vazia e false se não estiver; V
//-adicionar um produto na pilha, caso a operação não possa ser realizada, mostre mensagem avisando; V
//-remover um produto na pilha, caso a operação não possa ser realizada, mostre mensagem avisando; V
//-remover uma pesquisa por nome do produto V
//-adicionar todos os produto removidos em uma pilha de produtos V
//-pesquisar a ordem de espera de uma pessoa na pilha 
//-percorrer e apresentar cada um dos elementos da pilha V
//-comente no código os trechos de criação dos endereços de memória
//-comente no código todas as associações entre classes
package exercício2;

import javax.swing.JOptionPane;

public class PilhaLojaVirtual {
	private Produtos pilhaP[];//Definindo o vetor pilhaP como tipo Produtos, criado em outra classe(pilha principal)
	private Produtos pilhaR[];//Definindo o vetor pilhaR como tipo Produtos, criado em outra classe(pilha removida)
	private int tamanho, tamanhoR;
	
	
	public PilhaLojaVirtual(int capacidade) {
		pilhaP = new Produtos[capacidade];	//Cria novos Produtos com a capacidade que foi passada no parametro
		pilhaR = new Produtos[capacidade];
		tamanho = 0;
	}
	
	//Chamada pela classe principal para verificar se a pilha principal está vazia ou não
	public boolean vazia() {
		if (tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//Chamada pela classe principal para adicionar Produtos no vetor. 
	public void adicionaPilha(Produtos x){     
		if (tamanho<pilhaP.length){
			pilhaP[tamanho]= x;                     
			tamanho++;      
			JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
		}
		else{
			JOptionPane.showMessageDialog(null, "A pilha está cheia.");    
		}
	}

	//Chamada pela classe principal para remover produtos da pilha principal (que pode ir para a pilha removida)
	public Produtos tiraPilha(){
		Produtos x = null;
		if (tamanho>0){                               
			x = pilhaP[tamanho-1];
			tamanho--;
		}
		return x;
	}
	
	//Chamada pela classe principal para remover produtos de acordo com o nome
	public Produtos removeProdutoNome(String nomeR) {//"nomeR" é o nome do produto que foi passado como parametro para ser removido
		Produtos x = null;
		int i;
		for(i = 0; i <= tamanho; i++) {
			if(pilhaP[i]==null) {
				//Nada
			}else
				if(pilhaP[i].getName().contains(nomeR)) {
					x = pilhaP[i];
					for(int j = i; j < tamanho; j++) {
						pilhaP[j] = pilhaP[j+1];
					}
					tamanho--;
				}
		}
		return x;
	}
	
	//Chamada pela classe principal para mostrar todos os produtos armazenados na pilha principal
	public String verPilhaDeProdutos(){                    
		String aux = " ";
		for (int i=0;i<tamanho;i++){
			aux = aux + "\n" + pilhaP[i].removido();//Removido está na classe "Produtos" para estruturar as informações do produto que será removido
		}
		return aux;
	}
	
	//Chamada pela classe principal onde se tem a remoção de produtos na pilha principal para adicionar na pilha removida
	public void adcionarProdutosRemovidos(Produtos x) {
		if (tamanhoR < pilhaR.length) {
			pilhaR[tamanhoR] = x;
			tamanhoR++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Não há espaço na Pilha dos produtos removidos.");
		}
	}
	
	//Chamada pela classe principal para ver todos os produtos que estão na pilha removida
	public String verPilhaDeProdutosRemovidos(){                    
		String aux = " ";
		for (int i=0;i<tamanhoR;i++){
			aux = aux + "\n" + pilhaR[i].removido();//Removido está na classe "Produtos" para estruturar as informações do produto que será removido
		}
		return aux;
	}
	
	//Chamada pela classe principal para remover produtor da pilha removida
	public Produtos tiraPilhaRemovida(){
		Produtos x = null;
		if (tamanhoR>0){                               
			x = pilhaR[tamanhoR-1];
			tamanhoR--;
		}
		return x;
	}
}