package br.edu.ifce.estruturas.listasligadas;

public class Celula {
	private Celula proxima;
	private Celula anterior;
	private String nome;
	
public Celula(String nomeentrada) {
	this.nome = nomeentrada;
	
}
public Celula(Celula proxima,String nome) {

}

public Celula getProxima() {
	return proxima;
}

public void setProxima(Celula proxima) {
	this.proxima = proxima;
}

public Celula getAnterior() {
	return anterior;
}

public void setAnterior(Celula anterior) {
	this.anterior = anterior;
}

public String getNome() {
	return nome;
}


}