//Desenvolvedores:
//Gabriel Evangelista Guarriero RA: 1110482013055
//Lucas de Lima Silva RA: 1110482013043
//Marcello Lima Bento RA: 1110482013057
//Carlos Henrique Mayer da Silva RA: 1110482013053
package controller;

import javax.swing.JOptionPane;

public class QuickSort{

	//M�todo que ordena em meses os valores dos ve
	public static Aluguel[] quickSort (Aluguel vet[], int ini, int fim){
		int divisao; 
		if (ini < fim) { 
			divisao = particao(vet, ini, fim);//Chama o m�todo de particionamento, passando como parametro o vetor e os �ndices do come�o e fim do vetor
			quickSort (vet, ini, divisao-1); //Chama o m�todo decrementando 1 no �ndice final do vetor particionado
			quickSort (vet, divisao+1, fim); //Chama o m�todo incrementando 1 no �ndice inicial do vetor particionado
		}
		return vet; //Retorna o vetor organizado
	}

	//M�todo que particiona, compara e organiza o vetor 
	public static int particao (Aluguel vet[], int ini, int fim){
		int i = ini+1, f = fim; //Definindo o �ndice inicial e final passados como parametro
		Aluguel pivo = vet[ini], aux;//Definindo o pivo como do tipo Aluguel
		while (i<=f) { 
			while (i <= fim && vet[i].getMesFesta() <= pivo.getMesFesta())//Comparando o m�s do aluguel que vem da "esquerda" (inicial)
				++i; 
			while (pivo.getMesFesta() < vet[f].getMesFesta())//Comparando o m�s do aluguel que vem da "direita" (final)
				--f; 
			if (i <= f){ //Caso o �ndice inicial seja menor ou igual ao �ndice final, faz a troca
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux; 
				++i; 
				--f;
			}	 
		} 
		if (ini != f){ //Caso o �ndice inicial seja diferente do �ndice final, troca o piv� para o do �ndice final
			vet[ini] = vet[f];
			vet[f] = pivo;
		} 
		return f; //Retorna o �ndice "final" para ser a nova divis�o do vetor
	}
	
	public static Aluguel[] quickSort2 (Aluguel vet[], int ini, int fim){
		int divisao; 
		if (ini < fim) { 
			divisao = particao2(vet, ini, fim); //Chama o m�todo de particionamento, passando como parametro o vetor e os �ndices do come�o e fim do vetor
			quickSort2 (vet, ini, divisao-1); //Chama o m�todo decrementando 1 no �ndice final do vetor particionado
			quickSort2 (vet, divisao+1, fim); //Chama o m�todo incrementando 1 no �ndice inicial do vetor particionado
		}
		return vet;
	}

	//M�todo que particiona, compara e organiza o vetor 
	public static int particao2 (Aluguel vet[], int ini, int fim){
		int i = ini+1, f = fim; //Definindo o �ndice inicial e final passados como parametro
		Aluguel pivo = vet[ini], aux;//Definindo o pivo como do tipo Aluguel
		while (i<=f) { 
			//Comparando o m�s e o dia do aluguel que vem da "esquerda" (inicial)
			while (i <= fim && vet[i].getMesFesta() <= pivo.getMesFesta() && vet[i].getDiaFesta() <= pivo.getDiaFesta()) 
				++i; 
			//Comparando o m�s e o dia do aluguel que vem da "direita" (final)
			while (pivo.getMesFesta() <= vet[f].getMesFesta() && pivo.getDiaFesta() < vet[f].getDiaFesta()) 
				--f; 
			if (i <= f){ //Caso o �ndice inicial seja menor ou igual ao �ndice final, faz a troca
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux; 
				++i; 
				--f;
			}	 
		} 
		if (ini != f){//Caso o �ndice inicial seja diferente do �ndice final, troca o piv� para o do �ndice final
			vet[ini] = vet[f];
			vet[f] = pivo;
		} 
		return f; //Retorna o �ndice "final" para ser a nova divis�o do vetor
	}
	
	//Inicia o quickSort neste m�todo
	public Aluguel[] Comeco(Aluguel vetor[], int op){//Recebido o vetor com os alugu�is
		Aluguel lista[]= vetor;
		int i;
		String r = "";
		lista = quickSort(lista,0,(lista.length)-1);//QuickSort para organizar os meses
		lista = quickSort2(lista,0,(lista.length)-1);//QuickSort para organizar os dias 
		if(op == 10) {
			for(i=0;i<lista.length;i++){
				r = r + "\n" + lista[i].mostraAluguel();//M�todo para exibir os alugu�is de forma estruturada
			}
			JOptionPane.showMessageDialog(null,"Os alugu�is cadastrados ordenados por dia e m�s s�o: \n" + r);
		}else {
			return vetor;
		}
		return vetor;
	}
}