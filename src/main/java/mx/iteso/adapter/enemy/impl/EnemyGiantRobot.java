package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public String smashWithHands() {
        //System.out.println("Enemy Robot Causes Damage With Its Hands");
        String s= "Enemy Robot Causes Damage With Its Hands";
        System.out.println(s);
        return s;
    }

    public String walkForward() {
        //System.out.println("Enemy Robot Walks Forward");
        String w="Enemy Robot Walks Forward";
        System.out.println(w);
        return w;
    }

    public String reactToHuman(String driverName) {
        //System.out.println("Enemy Robot Tramps on " + driverName);
        String r= "Enemy Robot Tramps on"+ driverName;
        System.out.println(r);
        return r;
    }

}
