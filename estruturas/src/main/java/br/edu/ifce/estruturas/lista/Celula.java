package br.edu.ifce.estruturas.lista;

public class Celula {

	private Celula proxima;
	private Celula anterior;
	
	private Object elemento;
	
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	public void setAnterior(Celula proxima) {
		this.anterior = proxima;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	public Object getElemento() {
		return elemento;
	}

	public Celula getProxima() {
		// TODO Auto-generated method stub
		return null;
	}
}
