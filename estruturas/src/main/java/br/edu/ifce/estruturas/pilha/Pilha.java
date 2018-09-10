package br.edu.ifce.estruturas.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	List<Peca> pecas = new LinkedList<Peca>();
	
	public void inserir(Peca p1) {
		this.pecas.add(p1);
	}
	
	public Peca remover() {
		return this.pecas.remove(this.pecas.size() - 1);
		
	}
	
	public boolean vazia() {
		return this.pecas.size() == 0;

		
	}

}

