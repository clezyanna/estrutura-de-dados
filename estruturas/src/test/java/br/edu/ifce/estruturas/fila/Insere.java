package br.edu.ifce.estruturas.fila;



import br.edu.ifce.estrutura.fila.Fila;

public class Insere {
	
	public static void main(String[] args){
	
	Fila<String> nome = new Fila<String>();
	
	nome.inserir("Cleziana");
	nome.inserir("Nathan");
	nome.inserir("Jailsom");
	nome.inserir("Gustavo");
	
	
	System.out.println(nome.remove());
	System.out.println(nome.remove());
	System.out.println(nome.remove());
	System.out.println(nome.remove());
	
	
	System.out.println(nome.vazia());
	
	}
}
