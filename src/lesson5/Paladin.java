package lesson5;

import lesson5.hero.Hero;

public class Paladin extends Hero {


    public Paladin(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
//        System.out.println(" это конструктор поладин ");
    }

    public void defense() {
        System.out.println(this.name + " я умею защищаться " + this.defence);
    }
//    @Override
//    public void sleep(){
//        System.out.println(name + " sleep");
//    }
}
