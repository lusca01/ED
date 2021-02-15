//5. Criar e carregar  uma matriz [4 x 4] inteiro,
//onde os valores da diagonal principal serão carregados pela aplicação conforme o gráfico e os demais dados serão digitados pelo usuário
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
					matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o índice "+ i +" "+ j+" :"));
				}
			}
		}
		for (i = 0; i < 4 ; i++) {
			for (j = 0; j < 4 ; j++) {
				System.out.println("O valor do índice "+ i+ ":"+j+" é: " + matriz[i][j]);
			}
		}
	}
}
