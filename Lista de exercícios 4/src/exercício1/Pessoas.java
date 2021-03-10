//1. O Detram necessita de uma aplicação que faça o gerenciamento das pessoas que se cadastraram de maneira online para o exame final.
//Dado o cenário implemente uma Fila Estática de Pessoas contendo as propriedades ID, nome, RG, telefone e data de nascimento.
//A aplicação deve:
//-verificar se a fila está vazia, retornando true se estiver vazia e false se não estiver X
//-adicionar uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-remover uma pessoa, caso a operação não possa ser realizada, mostre mensagem avisando X
//-adicionar todas as pessoas removidas em uma pilha de pessoas
//-pesquisar a ordem de espera de uma pessoa na fila X
//-percorrer e apresentar cada um dos elementos da fila X
//-comente no código os trechos de criação dos endereços de memória
//-comente no código todas as associações entre classes
package exercício1;

public class Pessoas {
	private int ID, RG, Telefone;
	private String Nome, dataNasc;
	
	public Pessoas(int ID, int RG, int Telefone, String dataNasc, String Nome){ //Inicializando Pessoas
		this.ID = ID;
		this.RG = RG;
		this.Telefone = Telefone;
		this.dataNasc = dataNasc;
		this.Nome = Nome;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String ordemWait(int pos){//Estruturando apenas info básicas para mostrar ordem quando solicitada(na classe FilaDetram)
		String aux="Posição "+ pos +"  \nNome : "+this.Nome+"\n";
		return aux;
	}
	public String apresenta(int pos){//Estruturando todas info para apresentar quando solicitada(na classe FilaDetram)
		String aux = "Posição: "+ pos+" ID: " +this.ID + " Nome:"+ this.Nome + "\nRG: "
				+ this.RG + " Telefone: " +this.Telefone + "\nData: " +this.dataNasc+"\n";
		return aux;
	}
	public String removido(){//Estruturando as info para apresentar quando solicitada (na classe FilaDetram)
		String aux = "ID: " +this.ID + " Nome: "+ this.Nome + "\nRG: "
				+ this.RG + " Telefone: " +this.Telefone + "\nData: " +this.dataNasc+"\n";
		return aux;
	}
}