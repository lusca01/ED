//1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
//Média dos saldos positivos entre 100 à 1000
//Média geral dos saldos
//Soma dos saldos negativos

package exercicios;
import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 ex = new Ex1(); 
		int saldos[] = new int [100];
		Random aleatorio = new Random();
		for (int i=0;i<100;i++){
			saldos[i]= aleatorio.nextInt((5000 - (-5000))+1) - 5000; //Coloquei uma margem de -5000 à 5000
//			System.out.println(saldos[i]);   Caso queira ver os números gerados
		}	
		ex.mediaPos(saldos);
		ex.mediaGer(saldos);
		ex.somaNeg(saldos);
	}
	
	public void mediaPos (int vet []){
		int mediaP = 0, m = 0;
		for (int i = 0; i < 100; i++) {
			if (vet [i] > 100 && vet[i] < 1000) {
				mediaP = mediaP + vet[i];
				m = m + 1;
			}
		}
		System.out.println("Media dos saldos positivos entre 100 à 1000 é => " + mediaP/m);
	}

	public void mediaGer(int vet[]) {
		double mediaGer = 0;
		for (int i = 0; i < 100; i++) {
			mediaGer = mediaGer + vet[i];
		}
		mediaGer = mediaGer / 100;
		System.out.println("Media geral dos saldos é => " + mediaGer);
	}

	public void somaNeg(int vet[]) {
		double mediaNeg = 0;
		for (int i = 0; i < 100; i++) {
			if (vet [i] < 0) {
				mediaNeg = mediaNeg + (vet[i]);
			}
		}
		System.out.println("Soma dos saldos negativos é => " + mediaNeg);
	}
}
