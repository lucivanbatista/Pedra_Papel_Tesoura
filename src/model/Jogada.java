package model;

public class Jogada {
	
	private String jogada;
	
	public Jogada(String jogada) {
		this.jogada = jogada;
	}
	
	public void doJogada(String jogada){
		this.jogada = jogada;
	}
	
	public String getSJogada() {
		return jogada;
	}

	public void setSJogada(String jogada) {
		this.jogada = jogada;
	}
}
