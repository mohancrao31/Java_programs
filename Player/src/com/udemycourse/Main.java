package com.udemycourse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player sebastian = new Player();
        sebastian.name = "Seb";
        sebastian.health = 20;
        sebastian.weapon = "gun";
        int damage = 10;
        sebastian.losehealth(damage);
        System.out.println(sebastian.healthremaining());

         damage = 11;
         sebastian.losehealth(damage);
        System.out.println(sebastian.healthremaining());
    }
}
