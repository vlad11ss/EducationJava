package lesson5;

import lesson5.hero.Hero;

public class Mage extends Hero {


    public Mage(String name, int health, int power, int attack, int defence){
        super(name, health, power, attack, defence);

    }
    @Override
    public void speak(){
        super.speak();
        System.out.println(name + " привет всем говорит что то свое полиморфизм ");

    }
//    @Override
//    public void sleep(){
//        System.out.println(name + " sleep");
//    }
}

