//10) Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci recursivamente at� o n�mero recebido
package exercicios;
import javax.swing.JOptionPane;

public class Ex10 {
	static int n1 =0, n2 = 1, x=0, F;
	public static void main(String[] args) {
		F = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que queira saber da s�rie Fibonacci: "));
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
