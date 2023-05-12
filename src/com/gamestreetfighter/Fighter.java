package com.gamestreetfighter;

public abstract class Fighter {
	private String name;
    private int power;
    private int life;
    private Special special;

    public Fighter(String name, int power, int life, Special special) {
        this.name = name;
        this.power = power;
        this.life = life;
        this.special = special;
    }

    public abstract void takeLife(int damage);
    public abstract void attack(Fighter opponent);
    public abstract void specialPower(Fighter opponent);
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public Special getSpecial() {
        return special;
    }
    public void setSpecial(Special special) {
        this.special = special;
    }
}
