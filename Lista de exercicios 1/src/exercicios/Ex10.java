//10) Receba um número inteiro. Calcule e mostre a série de Fibonacci recursivamente até o número recebido
package exercicios;
import javax.swing.JOptionPane;

public class Ex10 {
	static int n1 =0, n2 = 1, x=0, F;
	public static void main(String[] args) {
		F = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que queira saber da série Fibonacci: "));
		fibonacci(F, x);
	}
	public static int fibonacci(int f, int c) {
		if(x >= f) {
			return x;
		}else {
			System.out.println(x);
			n1 = n2;
			n2 = x;
			x = n1 + n2;
			fibonacci(f, c+1);
			return x;
		}
	}
}
