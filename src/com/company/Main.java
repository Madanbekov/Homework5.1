package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.Boss tramor = new com.company.Boss();
        ((com.company.Boss) tramor).setHealth(1000);
        ((com.company.Boss) tramor).setDamage(100);
        tramor.setProtection("Щит");
        System.out.println("tramor " + ((com.company.Boss) tramor).getHealth() + " XP " + ((com.company.Boss) tramor).getDamage() + " DD " + tramor.getProtection() + " PP");

        Hero[] desktop = creatHeroes();

        for (int i = 0; i < desktop.length; i++) {

            System.out.println(desktop[i].getName() + " " + desktop[i].getDamage() + " " + desktop[i].getHealth() + " " + desktop[i].getSuperpowers());


        }
    }


    public static Hero[] creatHeroes() {

        Hero deadpool = new Hero(320, 30, "regeneration", "deadpool");
        Hero koloss = new Hero(400, 50, "invulnerability", "koloss");
        Hero warhead = new Hero(300, 35, "explosion", "warhead");
        Hero[] desktop = {deadpool,koloss,warhead};

        return desktop;
    }
}