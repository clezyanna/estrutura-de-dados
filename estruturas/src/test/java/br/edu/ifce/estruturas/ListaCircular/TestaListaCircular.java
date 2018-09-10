package br.edu.ifce.estruturas.ListaCircular;

import java.util.Scanner;

import br.edu.ifce.estruturas.listasligadas.Celula;
import br.edu.ifce.estruturas.listasligadas.ListaCircular;

public class TestaListaCircular {

	public static void main(String[] args) {
		ListaCircular ls = new ListaCircular();
		Scanner scan = new Scanner (System.in);
		int n;
		
		for(int i= 0 ; i <11; i++) {
			System.out.println("Digite o nome: "+i);
			String nome;
			nome =  scan.next();
			Celula c = new Celula(nome);
			
			ls.adiciona(c);
			
}

    System.out.println("Digite o numero de Saltos: ");
    n = scan.nextInt();
    
    ls.executar(n);
    
    System.out.println(ls.toString());

	}

}
