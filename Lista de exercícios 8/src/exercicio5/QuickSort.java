package exercicio5;

public class QuickSort {

	/**
	Método Quicksort Recursivo
	 */
	public static void quickSort (int vet[], int ini, int fim)
	{
		int divisao; 
		if (ini < fim) { 
			divisao = particao(vet, ini, fim); 
			quickSort (vet, ini, divisao-1); 
			quickSort (vet, divisao+1, fim); 
		}
	}

	public static int particao (int vet[], int ini, int fim)
	{
		int pivo = vet[ini],i = ini+1, f = fim, aux; 
		while (i<=f) { 
			while (i <= fim && vet[i] <= pivo) 
				++i; 
			while (pivo < vet[f]) 
				--f; 
			if (i < f){ 
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux; 
				++i; 
				--f;
			}	 
		} 
		if (ini != f){
			vet[ini] = vet[f];
			vet[f] = pivo;
		} 
		return f; 
	}


	/**
		Principal
	 */

	public static void main(String[] args) {
		int lista[] = {149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105}, i;
		int lista2[] = lista, lista3[] = lista;
		System.out.println("Lista Inicial");
		for(i=0;i<lista.length;i++){
			System.out.print(lista[i]+"  ");
		}

		System.out.println("\n\nQuickSort - Lista Ordenada");
		quickSort(lista3,0,(lista2.length)-1);
		for(i=0;i<lista3.length;i++){
			System.out.print(lista3[i]+"  ");
		}
	}
}