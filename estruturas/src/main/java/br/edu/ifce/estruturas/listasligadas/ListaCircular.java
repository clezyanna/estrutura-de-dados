package br.edu.ifce.estruturas.listasligadas;


public class ListaCircular {

	private Celula primeira;
	private Celula ultima;
	
	
	private int totalDeElementos;
	//add no fim
	public void adiciona(Celula elemento ) {
		if (totalDeElementos == 0) {
			Celula unico = elemento;
			this.primeira = unico;
			this.ultima = unico;
			
			unico.setAnterior(this.ultima);
			unico.setProxima(primeira);
			
			this.totalDeElementos++;
		}
		else{
			Celula novoUlt = elemento;
			novoUlt.setProxima(primeira);
		    novoUlt.setAnterior(ultima);
		    this.ultima.setProxima(novoUlt);
		    this.ultima = novoUlt;
		    this.totalDeElementos++;
		    
	
	 }
	}
	/*public void adiciona(int posicao, Object elemento) {
		Celula nova = new Celula(o1);
		Celula atual  = primeira;
		
		for (int i = 1; i< posicao -1 ;i++) {
			atual=atual.setProxima;
			
		}
		
		nova.setProxima = atual.setProxima();
		atual.setProxima = nova;
		this.totalDeElementos++;
		
	}*/

	
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
	

	public void executar(int n) {
		Celula atual  = this.primeira;

			int aux = 0;
			do {
				if(aux == n) {
					Celula anterior = atual.getAnterior();
					Celula proxima = atual.getProxima();
					
					anterior.setProxima(proxima);
					proxima.setAnterior(anterior);
					
					this.totalDeElementos--;
					aux = 0;
					
					
			}
				atual = atual.getProxima();
				aux++;
		} while(totalDeElementos !=1);
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo até o penúltimo elemento
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getNome());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//último elemento
		builder.append(atual.getNome());
		builder.append("]");
		
		return builder.toString();
	}
}


