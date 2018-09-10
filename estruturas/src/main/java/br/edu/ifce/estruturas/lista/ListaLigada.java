package br.edu.ifce.estruturas.lista;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	
	
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento);
		if (totalDeElementos == 0) {
			this.primeira = nova;
			this.ultima = nova;
		}
		else{
			
		this.ultima.setProxima(nova);
		this.ultima = nova;
		
		this.totalDeElementos++;
	
	 }
	}
	public void adiciona(int posicao, Object elemento) {
		Celula nova = new Celula(1);
		Celula atual  = primeira;
		
		for (int i = 1; i< posicao -1 ;i++) {
			atual=atual.setProxima;
			
		}
		
		nova.setProxima = atual.setProxima();
		atual.setProxima = nova;
		this.totalDeElementos++;
		
	}
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	public Object pega(int posicao) {
		// implementacao
		return null;
	}
	
	public void remove(int posicao) {
		// implementacao
	}
	
	public void removeDoComeco() {
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
			}

	}
	
	public void removeDoFim() {
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		}
			Celula ultima = this.ultima.getAnterior();
			this.ultima.setProxima(null);//Set -
			this.totalDeElementos--;
			
	}
	
	public int tamanho() {
		// implementacao
		return 0;
	}
	public boolean contem(Object o) {
		// implementacao
		return false;
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo até o penúltimo elemento
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
}