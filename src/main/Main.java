package main;

import model.Computer;
import model.ManagerGame;
import model.Player;

public class Main {

	public static void main(String[] args) {
		
		ManagerGame mg = new ManagerGame(); // Inicio Jogo
		Player j1 = new Player("Pedra"); // Criação do Player
		Computer c1 = new Computer("Papel"); // Criação doo Computer
		j1.jogada.doJogada("Pedra"); // Realizando Jogada
		c1.jogada.doJogada("Papel"); // Realizando Jogada
		mg.startRodada(j1, c1); // Iniciando Jogada
		mg.startRodada(j1, c1); // Iniciando Jogada
		mg.generetePlacar(); // Gerando Placar
	}

}
