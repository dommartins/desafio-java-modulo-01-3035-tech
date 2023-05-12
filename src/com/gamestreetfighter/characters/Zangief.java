package com.gamestreetfighter.characters;

import com.gamestreetfighter.Fighter;
import com.gamestreetfighter.Special;

public class Zangief extends Fighter {
	public Zangief(String name, int power, int life, Special special) {
        super(name, power, life, special);
    }
    @Override
    public void takeLife(int damage) {
        int currentLife = getLife();
        currentLife -= damage;
        setLife(currentLife);
    }
    @Override
    public void attack(Fighter opponent) {
        int damage = getPower();
        opponent.takeLife(damage);
    }
    @Override
    public void specialPower(Fighter opponent) {
        int damage = getSpecial().getValueSpecial();
        opponent.takeLife(damage);
    }
}
