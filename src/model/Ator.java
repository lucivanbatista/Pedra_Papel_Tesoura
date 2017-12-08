package model;

public class Ator {
	
	public Jogada jogada;
	
	public Ator(String jogada) {
		this.jogada = new Jogada(jogada);
	}

	public Jogada getJogada() {
		return this.jogada;
	}
	
	
}
