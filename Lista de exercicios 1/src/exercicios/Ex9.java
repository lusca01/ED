//9) Realize recursivamente a soma de todos os n�meros �mpares de 1 a 300
package exercicios;

public class Ex9 {
	static int soma = 1;
	public static void main(String[] args) {
		System.out.println("A soma de todos os n�mero �mpares de 1 a 300 � => " + somaImpares(soma));
	}
	public static int somaImpares(int x) {
		if (x==300) {
			return soma;
		}else {
			if (x%2==1) {
				soma = (soma + x);
				somaImpares(x+1);
				return soma;
			}else {
				somaImpares(x+1);
				return soma;
			}
		}
	}
}
