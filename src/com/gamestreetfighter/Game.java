package com.gamestreetfighter;

import com.gamestreetfighter.characters.Ken;
import com.gamestreetfighter.characters.Ryu;

public class Game {
	public Player player1;
    public Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Começando o jogo...");
        System.out.println(player1.getName() + " vs " + player2.getName());

        while (player1.getFighter().getLife() > 0 && player2.getFighter().getLife() > 0) {
            player1.getFighter().attack(player2.getFighter());
            System.out.println(player1.getName() + " atacou " + player2.getName() + " com " + player1.getFighter().getName() + "! " + player2.getName() + " perdeu " + player1.getFighter().getPower() + " de vida.");

            if (player2.getFighter().getLife() <= 0) {
                System.out.println(player2.getName() + " foi derrotado! " + player1.getName() + " venceu!");
                break;
            }

            player2.getFighter().attack(player1.getFighter());
            System.out.println(player2.getName() + " atacou " + player1.getName() + " com " + player2.getFighter().getName() + "! " + player1.getName() + " perdeu " + player2.getFighter().getPower() + " de vida.");

            if (player1.getFighter().getLife() <= 0) {
                System.out.println(player1.getName() + " foi derrotado! " + player2.getName() + " venceu!");
                break;
            }
        }

        System.out.println("Fim do jogo.");
        
    }
    public static void main(String[] args) {
    	Special hadoken = new Special("Hadoken", 20);
        Fighter ryu = new Ryu("player1.Ryu", 10, 100, hadoken);
        Player player1 = new Player("player1", ryu);

        Special shoryuken = new Special("Shoryuken", 25);
        Fighter ken = new Ken("player2.Ken", 12, 100, shoryuken);
        Player player2 = new Player("player2", ken);

        Game game = new Game(player1, player2);
        game.startGame();
	}
}
