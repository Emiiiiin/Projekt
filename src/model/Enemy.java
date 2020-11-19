package model;

public class Enemy {
    private int hp=10;
    public Enemy(){
    }

    public void setHp(int x) {
        hp = hp - x;
    }

    public int getHp() {
        return hp;
    }
}
