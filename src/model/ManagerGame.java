package model;

public class ManagerGame {
	
	private int scoreJogador;
	private int scoreComputer;
	
	public ManagerGame() {
		this.setScoreJogador(0);
		this.setScoreComputer(0);
	}

	public int getScoreJogador() {
		return scoreJogador;
	}

	public void setScoreJogador(int scoreJogador) {
		this.scoreJogador = scoreJogador;
	}

	public int getScoreComputer() {
		return scoreComputer;
	}

	public void setScoreComputer(int scoreComputer) {
		this.scoreComputer = scoreComputer;
	}
	
	public void generetePlacar(){
		System.out.println("Jogador " + this.getScoreJogador() + " x " + this.getScoreComputer() + " Computador");
	}
	
	public void addPonto(){
		
	}
	
	public void startRodada(Player jogadaPlayer, Computer jogadaComputer){
		Round r = new Round(jogadaPlayer, jogadaComputer);
		Ator vencedor = r.checkVencedor();
		if(vencedor.getClass().equals(jogadaPlayer)){
			scoreJogador++;
		}else{
			scoreComputer++;
		}
	}
	
}
