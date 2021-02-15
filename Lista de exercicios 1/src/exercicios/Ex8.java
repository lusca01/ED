//8) Realize recursivamente a soma de todos os números pares de 1 a 200
package exercicios;

public class Ex8 {
	static int soma = 0;
	public static void main(String[] args) {
		System.out.println("A soma de todos os números pares de 1 a 200 é => " + somaPares(soma));
	}
	public static int somaPares(int x) {
		if(x==200) {
			soma = (soma+200);
			return soma;
		}else {
			if(x % 2 == 0) {
				soma = (soma + x);
				somaPares(x + 1);
				return soma;
			}else {
				somaPares(x+1);
				return soma;
			}
		}
	}
}