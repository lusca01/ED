//2. Carregar um vetor [5] inteiro. 
//Enviar cada elemento para uma função e esta irá retornar o seu fatorial que será armazenado em um outro vetor.
//Exibir os dados dos vetores
package exercicios;
import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 ex = new Ex2 ();
		int vet [] = new int [5], vetfin [] = new int [5], i;
		Random aleatorio = new Random();							
		for (i = 0; i < 5; i++) {
			vet[i] = aleatorio.nextInt(10) + 1;										//Limitei para não dar números gigantescos
			System.out.println("Número " + vet[i] + " para ver sua fatorial.");		//Verificar qual número é para saber se o fatorial está certo
		}
			System.out.print("\n");
		for (i = 0; i < 5; i++) {
			vetfin[i]= ex.Fatorial(vet[i]);
			System.out.println("Fatorial do valor da posição "+i+" é => " + vetfin[i]);
		}
	}

	public int Fatorial(int n) {
		int c, f = 1;
	    c = n;
	    while(c >= 1) {
	    	f = f * c;
	    	c = c - 1;
	    }
	    return f;
	}
}

