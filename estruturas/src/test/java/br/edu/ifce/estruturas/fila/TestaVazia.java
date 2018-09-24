package br.edu.ifce.estruturas.fila;

import java.util.LinkedList;
import java.util.List;

public class TestaVazia {
	private List<String> alunos = new LinkedList<String>();
	
	public boolean vazia() {
	return this.alunos.size() == 0;
	}
	

}
