//5. Criar e carregar  uma matriz [4 x 4] inteiro,
//onde os valores da diagonal principal ser�o carregados pela aplica��o conforme o gr�fico e os demais dados ser�o digitados pelo usu�rio
// 1
//     3 
//         9
//             27
package exercicios;
import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		double x; int i, j;
		int matriz [][] = new int [4][4];
		for (i = 0; i < 4 ; i++) {
			for (j = 0; j < 4 ; j++) {
				if (i == j) {
					x = Math.pow(3, i) ;
					matriz[i][j] = (int)x;
				}else {
					matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o �ndice "+ i +" "+ j+" :"));
				}
			}
		}
		for (i = 0; i < 4 ; i++) {
			for (j = 0; j < 4 ; j++) {
				System.out.println("O valor do �ndice "+ i+ ":"+j+" �: " + matriz[i][j]);
			}
		}
	}
}
