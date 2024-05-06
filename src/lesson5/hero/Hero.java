package lesson5.hero;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defence;

    public Hero(String name, int health, int power, int attack, int defence){
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defence = defence;
//        System.out.println(" это конструктор героя ");
    }
     public void speak(){
        System.out.println(name + " привет всем ");
    }
   public void dealDamage(){

        System.out.println(name + " домаг " + power * attack);
    }
   public void healSelf (){
        health += 20;
        System.out.println(name + " я полечился " + health);
    }

//    public abstract void sleep();



}
