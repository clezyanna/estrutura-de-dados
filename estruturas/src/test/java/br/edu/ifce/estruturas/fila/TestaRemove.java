package br.edu.ifce.estruturas.fila;

import java.util.LinkedList;
import java.util.List;

import br.edu.ifce.estrutura.fila.Fila;

public class TestaRemove {
	public static void main(String[] args) {
		
		
		Fila fila = new Fila();
		
		
		
		fila.insere("Cleziana");
		fila.insere("Gustavo");
		fila.insere("Renata");
		fila.insere("Naelia");
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
		
	}
		

}
