package br.edu.ifce.estrutura.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<C> {

	
	private List<C> alunos = new LinkedList<C>();
		
		public void inserir(C c) {
			this.alunos.add(c);
			
		}

		public C remove() {
			return this.alunos.remove(this.alunos.size() - 1);
			
			}
		public boolean vazia() {
			return this.alunos.size() == 0;
			
			}

		
		}
