package exerc�cio4;

public class Livro {
	private String titulo;
	private int qtde;
	
	public Livro(String titulo, int qtde) {
		this.titulo = titulo;
		this.qtde = qtde;
	}
	
	public String getTitulo() {
		return (titulo);
	}
	
	public int getQuantidade() {
		return (qtde);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setQuantidade(int qtde) {
		this.qtde = qtde;
	}
	
	public String Estrutura() {
		String aux = "Titulo: "+this.titulo+" \nQuantidade de livros: "+this.qtde+"\n";
		return aux;
	}
}