//3) Realize a implementação do Algoritmo Merge Sort para uma Lista Duplamente Ligada considerando o seguinte cenário: 
//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 
//Implemente a classe Média com os atributos ID do Aluno, ID da Disciplina e Média Final 
//As classes Aluno, Disciplina e Média devem realizar as seguintes operações: 
//Inserir um elemento no final da Lista 
//Inserir um elemento no início da Lista 
//Remover um elemento do final da Lista 
//Remover um elemento do início da Lista 
//Realize a ordenação dos Alunos pela média final utilizando o Algoritmo Merge Sort e apresente em console as seguintes informações: 
//Nome do Aluno 
//Disciplina Cursada 
//Média Final obtida 
//Apresente a quantidade de alunos com média maior ou igual a 8.

package exercicio3;

import javax.swing.JOptionPane;


public class Lista {
	private NOAluno inicioAluno;
	private NODisciplina inicioDisc;
	private NOMedia inicioMedia; 

	public Lista(){
		inicioAluno = null;
		inicioDisc = null;
		inicioMedia = null;
		
	}
//DISCIPLINA 
	public void dadosDisciplina(int op) {
//Implemente a classe Disciplina com os atributos ID, Nome da Disciplina 	
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da disciplina: "));
		String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		if(op == 6) {
			adicionarFinalDisciplina(new Disciplina(ID, nomeDisciplina));
		}else {
			adicionarInicioDisciplina(new Disciplina(ID, nomeDisciplina));
		}
	}
	
	public void adicionarFinalDisciplina(Disciplina x){
		NODisciplina s = new NODisciplina(x); 
		if(inicioDisc == null) {
			inicioDisc = s;
			s.ant = null;
			s.prox=null;
		}else {
			NODisciplina aux = verificaUltimoDisciplina(inicioDisc); 
			aux.prox = s; 
			s.ant = aux;
			s.prox = null;
		}
	}
	
	public NODisciplina verificaUltimoDisciplina(NODisciplina aux) {
		if(aux.prox!=null) {
			return verificaUltimoDisciplina(aux.prox);
		}
		return aux;
	}

	public void adicionarInicioDisciplina(Disciplina x){
		NODisciplina s = new NODisciplina(x);
		if( inicioDisc != null) {
			s.prox = inicioDisc;
			inicioDisc.ant = s;
		}
		inicioDisc = s;
	}

	public Disciplina removerFinalDisciplina(){
		Disciplina r = null;
		if (inicioDisc == null){
			JOptionPane.showMessageDialog(null, "Lista de Disciplina está vazia!");
		}else
			if (inicioDisc.prox == null){
				r = inicioDisc.disciplina;
				inicioDisc = null;
			}
			else{
				NODisciplina aux1 = inicioDisc;
				NODisciplina aux2 = inicioDisc;
				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.disciplina;
				aux1.ant = null;
				aux2.prox = null;
			}
		return r;
	}

	public Disciplina removerInicioDisciplina(){
		Disciplina r = null;
		if (inicioDisc == null){
			JOptionPane.showMessageDialog(null,"Lista de Disciplina está vazia!");
		}
		else{
			r = inicioDisc.disciplina;
			inicioDisc = inicioDisc.prox;
			if(inicioDisc != null) {
				inicioDisc.ant = null;
			}
		}
		return r;
	}

	public String verDisciplina(){
		NODisciplina aux = inicioDisc;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.disciplina.mostraDisciplina();
			aux = aux.prox;
		}
		return r;
	}
//ALUNO
	public void dadosAlunos(int op) {
		//Implemente a classe Aluno com os atributos ID, Nome completo, Curso e Semestre 
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno: "));
		int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno: "));
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		String curso = JOptionPane.showInputDialog("Digite o curso do aluno: ");
		if (op == 1) {
			adicionarFinalAluno(new Aluno(ID, semestre, nomeAluno, curso));
		}else {
			adicionarInicioAluno(new Aluno(ID, semestre, nomeAluno, curso));
		}
	}
	
	public void adicionarFinalAluno(Aluno x){
		NOAluno s = new NOAluno(x); 
		if(inicioAluno == null) {
			inicioAluno = s;
			s.ant = null;
			s.prox=null;
		}else {
			NOAluno aux = verificaUltimoAluno(inicioAluno); 
			aux.prox = s; 
			s.ant = aux;
			s.prox = null;
		}
	}
	
	public NOAluno verificaUltimoAluno(NOAluno aux) {
		if(aux.prox!=null) {
			return verificaUltimoAluno(aux.prox);
		}
		return aux;
	}

	public void adicionarInicioAluno(Aluno x){
		NOAluno s = new NOAluno(x);
		if( inicioAluno != null) {
			s.prox = inicioAluno;
			inicioAluno.ant = s;
		}
		inicioAluno = s;
	}

	public Aluno removerFinalAluno(){
		Aluno r = null;
		if (inicioAluno == null){
			JOptionPane.showMessageDialog(null, "Lista de Alunos está vazia!");
		}else
			if (inicioAluno.prox == null){
				r = inicioAluno.aluno;
				inicioAluno = null;
			}
			else{
				NOAluno aux1 = inicioAluno;
				NOAluno aux2 = inicioAluno;
				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.aluno;
				aux1.ant = null;
				aux2.prox = null;
			}
		return r;
	}

	public Aluno removerInicioAluno(){
		Aluno r = null;
		if (inicioAluno == null){
			JOptionPane.showMessageDialog(null,"Lista de Alunos está vazia!");
		}
		else{
			r = inicioAluno.aluno;
			inicioAluno = inicioAluno.prox;
			if(inicioAluno != null) {
				inicioAluno.ant = null;
			}
		}
		return r;
	}
	
	public String verAluno(){
		NOAluno aux = inicioAluno;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.aluno.mostraAluno();
			aux = aux.prox;
		}
		return r;
	}
//MEDIA
	public void verificaVazioMedia() {
		if(inicioMedia == null) {
			JOptionPane.showMessageDialog(null,"A lista de Media está vazia!");
		}else {
			JOptionPane.showMessageDialog(null,"A lista de Media não está vazia!");
		}
	}
	
	public void adicionarFinalMedia(Media x){
		NOMedia s = new NOMedia(x); 
		if(inicioMedia == null) {
			inicioMedia = s;
			s.ant = null;
			s.prox=null;
		}else {
			NOMedia aux = verificaUltimoMedia(inicioMedia); 
			aux.prox = s; 
			s.ant = aux;
			s.prox = null;
		}
	}
	
	public NOMedia verificaUltimoMedia(NOMedia aux) {
		if(aux.prox!=null) {
			return verificaUltimoMedia(aux.prox);
		}
		return aux;
	}

	public void adicionarInicioMedia(Media x){
		NOMedia s = new NOMedia(x);
		if( inicioMedia != null) {
			s.prox = inicioMedia;
			inicioMedia.ant = s;
		}
		inicioMedia = s;
	}

	public Media removerFinalMedia(){
		Media r = null;
		if (inicioMedia == null){
			JOptionPane.showMessageDialog(null, "Lista de Media está vazia!");
		}else
			if (inicioMedia.prox == null){
				r = inicioMedia.media;
				inicioMedia = null;
			}
			else{
				NOMedia aux1 = inicioMedia;
				NOMedia aux2 = inicioMedia;
				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.media;
				aux1.ant = null;
				aux2.prox = null;
			}
		return r;
	}

	public Media removerInicioMedia(){
		Media r = null;
		if (inicioMedia == null){
			JOptionPane.showMessageDialog(null,"Lista de Media está vazia!");
		}
		else{
			r = inicioMedia.media;
			inicioMedia = inicioMedia.prox;
			if(inicioMedia != null) {
				inicioMedia.ant = null;
			}
		}
		return r;
	}
	
	public String verMedia(){
		NOMedia aux = inicioMedia;
		String r = " ";
		while(aux != null){
			r = r + "\n" + aux.media.mostraMedia();
			aux = aux.prox;
		}
		return r;
	}
	public void dadosMedia(int op) {
		//Implemente a classe Média com os atributos ID do Aluno, ID da Disciplina e Média Final 
		int IDAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno: "));
		Aluno aluno = verificaAluno(IDAluno);
		int IDDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da disciplina: "));
		Disciplina disciplina = verificaDisciplina(IDDisciplina);
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
		double media = (n1+n2)/2;
		if(op == 11) {
			adicionarFinalMedia(new Media(aluno, disciplina, media));
		}else {
			adicionarInicioMedia(new Media(aluno, disciplina, media));
		}
		
	}
	
	private Disciplina verificaDisciplina(int id) {
		NODisciplina aux = inicioDisc;
		while (aux != null) {
			if(aux.disciplina.getIDdis()==id) {
				return aux.disciplina;
			}
			aux = aux.prox;
		}
		JOptionPane.showMessageDialog(null,"Não tem nenhuma disciplina com esse ID, vai dar ruim!");
		return null;
	}
	
	private Aluno verificaAluno(int id) {
		NOAluno aux = inicioAluno;
		while (aux != null) {
			if(aux.aluno.getIDalu() == id) {
				return aux.aluno;
			}
			aux = aux.prox;
		}
		JOptionPane.showMessageDialog(null,"Não tem nenhum aluno com esse ID, vai dar ruim!");
		return null;
	}
	
	public static void mergeSortRecursivo(Media lista[], int inicio, int fim){
		if (inicio < fim){
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista,inicio, meio);
			mergeSortRecursivo(lista,meio + 1, fim);
			mesclar(lista,inicio, meio, meio+1,fim); 
		}
	}	

	public static void mesclar(Media lista[], int inicioA, int fimA, int inicioB, int fimB){
		int i1 = inicioA; 
		int i2 = inicioB;
		int iaux = inicioA;
		Media aux[] = new Media[lista.length];
		while (i1 <= fimA && i2 <= fimB){
			if(lista[i1].getMedia() <= lista[i2].getMedia())
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

	public static void mergeSort(Media vetor[]) {
		Media lista[] = vetor;
		Media lista2[] = lista; int i;
		System.out.println("Lista Inicial");
		for(i=0;i<lista.length;i++){
			System.out.print(lista[i].mostraFim()+"  ");
		}

		System.out.println("\nMergeSort - Lista Ordenada");
		mergeSortRecursivo(lista2,0,(lista2.length)-1);
		for(i=0;i<lista2.length;i++){
			System.out.print(lista2[i].mostraFim()+"  ");
		}
	}
	
	public void pegaVetor() {
		NOMedia aux = inicioMedia;
		int i=0;
		while(aux != null) {
			i++;
			aux = aux.prox;
		}
		Media vet[] = new Media[i];
		aux = inicioMedia;
		for (int j = 0; j < i; j++) {
			vet[j] = aux.media;
			aux = aux.prox;
		}
		mergeSort(vet);
	}
}