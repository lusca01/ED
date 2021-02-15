//6) Receba um número inteiro. Calcule e mostre o seu fatorial recursivamente.
package exercicios;
import javax.swing.JOptionPane;
public class Ex6 {
	static int f;
	public static void main(String[] args) {
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que queira saber sua fatorial"));
		f = x;
		fatorial(x);
		System.out.println("A fatorial do número digitado é => " + f);

	}
	public static int fatorial(int c) {
		if(c == 1) {
			return f;
		}else {
			f = f * (c-1);
			fatorial(c-1);
			return f;
		}
	}
}