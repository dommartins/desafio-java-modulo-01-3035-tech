package com.gamestreetfighter;

public class Player {
	private String name;
    private Fighter fighter;

    public Player(String name, Fighter fighter) {
        this.name = name;
        this.fighter = fighter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Fighter getFighter() {
        return fighter;
    }
    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
}
