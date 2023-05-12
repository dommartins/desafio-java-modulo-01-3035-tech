package com.gamestreetfighter.test;

import com.gamestreetfighter.Game;
import com.gamestreetfighter.Fighter;
import com.gamestreetfighter.Special;
import com.gamestreetfighter.Player;
import com.gamestreetfighter.characters.*;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestGame {
	@Test
    public void testStartGame() {
        Special hadoken = new Special("Hadoken", 20);
        Fighter ryu = new Ryu("gamestreetfighterv1.Ryu", 10, 100, hadoken);
        Player player1 = new Player("gamestreetfighterv1.Player 1", ryu);

        Special shoryuken = new Special("Shoryuken", 25);
        Fighter ken = new Ken("gamestreetfighterv1.Ken", 12, 100, shoryuken);
        Player player2 = new Player("gamestreetfighterv1.Player 2", ken);

        Game game = new Game(player1, player2);
        game.startGame();

        assertTrue(player1.getFighter().getLife() <= 0 || player2.getFighter().getLife() <= 0);
    }
}
