//7) Realize recursivamentea soma de todos os números de 1 a 100.
package exercicios;

public class Ex7 {
	static int soma = 0;
	public static void main(String[] args) {
		System.out.println("A soma dos primeiros 100 valores é =>" + somaValores(soma));
	}
	static int somaValores(int x) {
		if(x==100){ 
			soma = (soma+100);
			return 10;
		}
		else{
			somaValores(x+1);
			soma = (soma+x);
			return soma;
		}
	}
}
