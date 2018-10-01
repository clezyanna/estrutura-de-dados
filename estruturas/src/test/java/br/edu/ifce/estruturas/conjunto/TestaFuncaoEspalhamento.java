package br.edu.ifce.estruturas.conjunto;



public class TestaFuncaoEspalhamento {


		public static void main(String[] args) {
			ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<String>();
			
			conjunto.adiciona("Gustavo");
			conjunto.adiciona("Herleson");
			conjunto.adiciona("George");
			conjunto.adiciona("Daniel");
			conjunto.adiciona("Guilherme");
			
			System.out.println(conjunto.tamanho());
			
			System.out.println(conjunto.contem("Daniel"));
			conjunto.remove("Daniel");
			System.out.println(conjunto.contem("Daniel"));
			System.out.println(conjunto.tamanho());
			
		}

	}