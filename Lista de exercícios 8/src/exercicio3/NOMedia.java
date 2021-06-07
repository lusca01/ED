package exercicio3;

public class NOMedia {
	public Media media;
	public NOMedia prox;
	public NOMedia ant;

	public NOMedia (Media media){
		this.media = media;
		prox = null;
		ant = null;
	}
}
