package lesson5;

import lesson5.hero.Hero;

public class Archer extends Hero {

    protected  int speed;

    public Archer(String name, int health, int power, int attack, int defence){
       super(name, health, power, attack, defence);
    }

    public Archer(String name, int health, int power, int attack, int defence, int speed) {
        super(name, health, power, attack, defence);
        this.speed = speed;
    }
//    @Override
//    public void sleep(){
//        System.out.println(name + " sleep");
//    }


}

