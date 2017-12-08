package model;

public class Round {

	private Ator jogadaPlayer;
	private Ator jogadaComputer;
	
	public Round(Ator jogadaPlayer, Ator jogadaComputer) {
		this.jogadaPlayer = jogadaPlayer;
		this.jogadaComputer = jogadaComputer;
	}
	
	public Ator getJogadaPlayer() {
		return jogadaPlayer;
	}

	public void setJogadaPlayer(Ator jogadaPlayer) {
		this.jogadaPlayer = jogadaPlayer;
	}

	public Ator getJogadaComputer() {
		return jogadaComputer;
	}

	public void setJogadaComputer(Ator jogadaComputer) {
		this.jogadaComputer = jogadaComputer;
	}
	
	public Ator checkVencedor(){
		if(jogadaPlayer.getJogada().getSJogada() == "Pedra"){
			if(jogadaComputer.getJogada().getSJogada() == "Papel"){
				return jogadaComputer;
			}
			if(jogadaComputer.getJogada().getSJogada() == "Tesoura"){
				return jogadaPlayer;
			}
		}
		
		if(jogadaPlayer.getJogada().getSJogada() == "Papel"){
			if(jogadaComputer.getJogada().getSJogada() == "Pedra"){
				return jogadaPlayer;
			}
			if(jogadaComputer.getJogada().getSJogada() == "Tesoura"){
				return jogadaComputer;
			}
		}
		
		if(jogadaPlayer.getJogada().getSJogada() == "Tesoura"){
			if(jogadaComputer.getJogada().getSJogada() == "Pedra"){
				return jogadaComputer;
			}
			if(jogadaComputer.getJogada().getSJogada() == "Papel"){
				return jogadaPlayer;
			}
		}
		return null;
	}
	
	
}
