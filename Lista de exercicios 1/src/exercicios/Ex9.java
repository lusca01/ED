//9) Realize recursivamente a soma de todos os números ímpares de 1 a 300
package exercicios;

public class Ex9 {
	static int soma = 1;
	public static void main(String[] args) {
		System.out.println("A soma de todos os número ímpares de 1 a 300 é => " + somaImpares(soma));
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
