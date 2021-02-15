//11) Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N Recursivamente.
package exercicios;

import javax.swing.JOptionPane;

public class Ex11 {
	static double res = 1;
	public static void main(String[] args) {
		int ser;
		ser = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		serie(ser);
		System.out.println("O resultado da s�rie � => " + res);
	}
	public static double serie(double x) {
		if (x == 0) {
			return res;
		}else {
			res = (res + (1/x));
			serie(x-1);
			return res;
		}
	}
}
