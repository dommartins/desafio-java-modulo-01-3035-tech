package com.gamestreetfighter;

public class Special {
	private String name;
    private int valueSpecial;
    public Special(String name, int valueSpecial) {
        this.name = name;
        this.valueSpecial = valueSpecial;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValueSpecial() {
        return valueSpecial;
    }
    public void setValueSpecial(int valueSpecial) {
        this.valueSpecial = valueSpecial;
    }
}
