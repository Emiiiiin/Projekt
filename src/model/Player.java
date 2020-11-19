package model;

public class Player {
    private int atck=10;
    private int hp=100;

    public Player(){

    }

    public int getAtck() {
        return atck;
    }
    public int getHp() {
        return hp;
    }

    public void setAtck(int atck) {
        this.atck = atck;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
