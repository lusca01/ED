//3. Carregar um vetor [100] inteiros positivos ou negativos.
//Classificar este vetor em ordem crescente e apresentar os valores.

package exercicios;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		Ex3 ex = new Ex3(); 
		int vetor[] = new int [100];
		Random aleatorio = new Random();
		for (int i=0;i<100;i++){
			vetor[i]= aleatorio.nextInt((5000 - (-5000))+1) - 5000; //Coloquei novamente uma margem de -5000 à 5000
		}
		ex.bubblesort(vetor);
	}
	
	public void bubblesort(int vet[]) {
		int aux, i;
	    for(i = 0 ; i < 99 ; i++) {
	        for(int j = i+1 ; j < 100 ; j++) {
	            if(vet[i] > vet[j]) {
	                aux = vet[i];
	                vet[i] = vet[j];					//BubbleSort
	                vet[j] = aux;
	            }
	        }
	    }
	    System.out.println("*** Ordem Crescente ***");
	    for (i = 0; i < 100; i++) {
	    	System.out.println(vet[i]);
	    }
	}
}
