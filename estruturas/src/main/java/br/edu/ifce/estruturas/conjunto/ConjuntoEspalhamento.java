package br.edu.ifce.estruturas.conjunto;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	
	private int tamanhoDoConjunto = 0;
	
	LinkedList<String> tabela = new LinkedList<String>();
	
	private ArrayList<LinkedList<String>>tabelaEspalhamento = 
			new ArrayList<LinkedList<String>>();
	
	public ConjuntoEspalhamento() {
		for(int i = 0; i<26 ; i++) {
			LinkedList<String>lista = new LinkedList<String>();
			tabelaEspalhamento.add(lista);
		}
	}
	public int funcaoEspalhamento(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
		
	}
    private int calculaIndiceDaTabela(String palavra) {
		
		int codigoDeEspalhamento = palavra.hashCode();
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabelaEspalhamento.size();
	}
	public void adiciona(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabelaEspalhamento.get(indice);
		lista.add(palavra);
		
	}
	
	public boolean remove (String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> list = this.tabelaEspalhamento.get(indice);
		
		return list.contains(palavra);
	}
		

	
	public boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabelaEspalhamento.get(indice);
		return lista.contains(palavra);
		
		
	}
	
	public List<String> pegaTodasPalavras(){
        List<String> lista = new LinkedList<String>();
		
		for(int i=0; i<this.tabela.size(); i++ ) {
			lista.addAll(this.tabelaEspalhamento.get(i));
		}
		return lista;
		
	}
	public int tamanho() {
		return tamanhoDoConjunto;
	}
	
	
	

}
