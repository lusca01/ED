//4. Carregar uma matriz [4 x 4 inteiro]. 
//Apresentar:Soma dos valores no intervalo de 1 a 100
//Quantidade de números impares entre 30 a 50
//Quantidade de números divisíveis por 8
//Quantidade de números ímpares divisíveis por 3
//Fatorial do maior número informado na matriz


package exercicios;
import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		Ex4 ex = new Ex4();
		int matriz[][] = new int [4][4];
		Random aleatorio = new Random();
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				matriz[i][j]= aleatorio.nextInt(101); //Coloquei novamente uma margem(apenas com números positivos) até 100
				System.out.println(matriz[i][j]);
			}
		}
		ex.somaVal(matriz);
		ex.impVal(matriz);
		ex.divEight(matriz);
		ex.impDivThree(matriz);
		ex.fatorial(matriz);
		
	}
	public void somaVal(int matriz [][]) {
		int soma = 0;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] > 1 && matriz[i][j] < 100) {
					soma = soma + matriz[i][j];
				}
			}
		}
		System.out.println("A soma dos valores no intervalo de 1 a 100 é => "+ soma);
	}
	public void impVal(int matriz[][]) {
		int qtd = 0;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] > 30 && matriz [i][j] < 50) {
					if (matriz[i][j] % 2 == 1) {
						qtd = qtd + 1;
					}
				}
			}
		}
		System.out.println("A quantidade de números impares entre 30 e 50 é => "+ qtd);
	}
	public void divEight(int matriz [][]) {
		int qtd = 0;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] % 8 == 0) {
					qtd = qtd + 1;
				}
			}
		}
		System.out.println("A quantidade de números divisiveis por 8 é => "+ qtd);
	}
	public void impDivThree(int matriz [][]) {
		int qtd = 0;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] % 2 == 1) {
					if (matriz[i][j] % 3 == 0) {
						qtd = qtd + 1;
					}
				}
			}
		}
		System.out.println("A quantidade de números impares divisiveis por 3 é => "+ qtd);		
	}
	public void fatorial(int matriz[][]) {
		int maior = 0, c; double f = 1;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		System.out.println("O maior número na matriz é => "+ maior);	
		c = maior;
		while(c >= 1) {
			f = f * c;
			c = c -1;
		}
		System.out.println("A fatorial do maior número é => "+ f);
	}
}
