package br.edu.ifce.estruturas.lista;

public class TesteAdicionaNoFim {
	
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista);
	}
}


