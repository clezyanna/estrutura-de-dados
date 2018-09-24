package br.edu.ifce.estruturas.conjunto;



public class TestaFuncaoEspalhamento {

	public static void main(String[] args) {
		ConjuntoEspalhamento ce1 = new ConjuntoEspalhamento();
	    
		
		//System.out.println(ce1.funcaoEspalhamento("george"));
		
	
		
		       
		        ce1.adiciona("[H] -> [Hélio, Heitor, Humberto]");
		        ce1.adiciona("[I] -> [Ilclemar]");
				ce1.adiciona("[J] -> [Jabesmar]");
				ce1.adiciona("[K] -> [Keroleen]");
				ce1.adiciona("[L] -> [Leomildo]");
				ce1.adiciona("[M] -> [Maruinalva]");
				ce1.adiciona("[N] -> [Nataly]");
				ce1.adiciona("[F] -> [Fologênio]");
				ce1.adiciona("[G] -> [Grivelda, Gladistone, Gêngis]");
				
				
				
				
				System.out.println(ce1.tamanho());
				
				System.out.println(ce1.contem("Nataly"));
				ce1.remove("Ilclemar");
				System.out.println(ce1.contem("Ilclemar"));
				System.out.println(ce1.tamanho());
				
			

		


	}

}
