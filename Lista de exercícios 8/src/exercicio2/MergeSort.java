package exercicio2;

public class MergeSort {

	public static void mergeSortRecursivo(int lista[], int inicio, int fim){
		if (inicio < fim){
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista,inicio, meio);
			mergeSortRecursivo(lista,meio + 1, fim);
			mesclar(lista,inicio, meio, meio+1,fim); 
		}
	}	

	public static void mesclar(int lista[], int inicioA, int fimA, int inicioB, int fimB){
		int i1 = inicioA; 
		int i2 = inicioB;
		int iaux = inicioA;
		int aux[] = new int[lista.length];
		while (i1 <= fimA && i2 <= fimB){
			if(lista[i1] <= lista[i2])
				aux[iaux++]=lista[i1++];
			else
				aux[iaux++]=lista[i2++];
		}	
		while (i1 <=fimA)
			aux[iaux++]=lista[i1++];
		while (i2 <=fimB)
			aux[iaux++]=lista[i2++];
		for (int i=inicioA;i<=fimB;i++)
			lista[i] = aux[i];
	}

	public static void main(String[] args) {
		int lista[] = {26, 69, 25, 53, 59, 27, 41, 0, 33, 16, 35, 43};
		int lista2[] = lista, i;
		System.out.println("Lista Inicial");
		for(i=0;i<lista.length;i++){
			System.out.print(lista[i]+"  ");
		}

		System.out.println("\nMergeSort - Lista Ordenada");
		mergeSortRecursivo(lista2,0,(lista2.length)-1);
		for(i=0;i<lista2.length;i++){
			System.out.print(lista2[i]+"  ");
		}
	}
}