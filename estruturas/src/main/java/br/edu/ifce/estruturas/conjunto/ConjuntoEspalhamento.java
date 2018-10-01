package br.edu.ifce.estruturas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento<T> {
	
	private ArrayList<LinkedList<T>> tabela = new ArrayList<LinkedList<T>>();
	
	private int tamanhoDoConjunto = 0;
	
	public void Conjunto() {
		for(int i = 0; i<26; i++) {
			LinkedList<T> lista = new LinkedList<T>();
			tabela.add(lista);
		}
	}
	
	private void verificaCarga() {
		double carga = (double) this.tamanhoDoConjunto / this.tabela.size();
		
		if(carga>0.75) {
			this.redimensionaTabela(this.tabela.size()*2);
		}else if(carga < 0.25) { 
			this.redimensionaTabela(Math.max(this.tabela.size()/2, 10));
		}
	}
	
	private void redimensionaTabela(int novoTamanho) {
		List<T> objeto = this.pegaTodas();
		this.tabela.clear();
		this.tamanhoDoConjunto = 0;
		for(int i = 0; i<novoTamanho; i++) {
			LinkedList<T> lista = new LinkedList<T>();
			tabela.add(lista);
		}		
		//for each
		for(T o : objeto) {
			this.adiciona(o);
		}
	}
		
	//FUNÇÃO HASH
	private int calculaIndiceDaTabela(T objeto) {
		
		
		int codigoDeEspalhamento = objeto.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	
	
	public void adiciona(T objeto) {
		if(this.contem(objeto)) {
			System.out.println("Objeto já existente");
		}else {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> list = this.tabela.get(indice);
			list.add(objeto);	
			this.tamanhoDoConjunto++;
		}
	}
	
	public void remove(T objeto) {
		if(!this.contem(objeto)) {
			System.out.println("Objeto não existente");
		}else {
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> list = this.tabela.get(indice);
			list.remove(objeto);
			this.tamanhoDoConjunto--;
			this.verificaCarga();
		}
	}
	
	public boolean contem(T objeto) {
		int indice = this.calculaIndiceDaTabela(objeto);
		List<T> list = this.tabela.get(indice);
		
		return list.contains(objeto);
	}
	
	public List<T> pegaTodas(){
		
		List<T> lista = new LinkedList<T>();
		
		for(int i=0; i<this.tabela.size(); i++ ) {
			lista.addAll(this.tabela.get(i));
		}
		return lista;
	}
	
	public int tamanho() {
		return tamanhoDoConjunto;
	}
}