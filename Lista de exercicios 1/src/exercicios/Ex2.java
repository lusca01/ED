//2. Carregar um vetor [5] inteiro. 
//Enviar cada elemento para uma fun��o e esta ir� retornar o seu fatorial que ser� armazenado em um outro vetor.
//Exibir os dados dos vetores
package exercicios;
import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 ex = new Ex2 ();
		int vet [] = new int [5], vetfin [] = new int [5], i;
		Random aleatorio = new Random();							
		for (i = 0; i < 5; i++) {
			vet[i] = aleatorio.nextInt(10) + 1;										//Limitei para n�o dar n�meros gigantescos
			System.out.println("N�mero " + vet[i] + " para ver sua fatorial.");		//Verificar qual n�mero � para saber se o fatorial est� certo
		}
			System.out.print("\n");
		for (i = 0; i < 5; i++) {
			vetfin[i]= ex.Fatorial(vet[i]);
			System.out.println("Fatorial do valor da posi��o "+i+" � => " + vetfin[i]);
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

