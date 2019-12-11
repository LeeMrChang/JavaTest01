package com.itheima._Demo05;

public class Role {
    private String name;
    private String weapon;
    private int hp;
    private int mp;
    private int power;

    public Role() {
    }

    public Role(String name, String weapon, int hp, int mp, int power) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.mp = mp;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", power=" + power +
                '}';
    }
}
