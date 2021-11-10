package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superpowers;
    private String name;

    public String getName(){
        return name;
    }

    public Hero(int health, int damage,String superpowers, String name){
        this.health = health;
        this.damage = damage;
        this.superpowers = superpowers;
        this.name = name;
    }
    public Hero(int health,int damage){
        this.health = health;
        this.damage = damage;
}
public int getHealth(){
        return health;
}
public int getDamage(){
        return damage;
}
public String getSuperpowers(){
        return superpowers;
}
}
