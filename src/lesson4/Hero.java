package lesson4;

public class Hero {

    private String name;
    private int age;
    private int health;
    private int speed;
    private Sword sword;

    public Hero(int valueAge){
        age = valueAge;
    }

    public Hero( String name, int age, int health, int speed){
        this.name = name;
        this.age = age;
        this.health = health;
        this.speed = speed;
        sword = new Sword(2,"Sword",6,99);
    }

     static class Sword{
        int atk;
       static String name;
        int dex;
        int atkSpd;

        public Sword(int ark, String name,int dex, int atkSpd ){
            this.atk = ark;
            this.name = name;
            this.dex = dex;
            this.atkSpd = atkSpd;
            System.out.println(name + " Наш мечь был создан ");

        }
    }

    void getDamage(){
        System.out.println("Наш герой " + name + " наносит урон " + sword.atk);
    }

    void speak(){
        System.out.println(name + " всем привет ");
    }

    void run(){
        System.out.println(name + " моя скорость " + speed + " очков ");
    }

    void healSelf(int value){
        System.out.println("было здоровья " + health + " очков " );
        health += value;
        System.out.println("стало  здоровья " + health + " очков " );
    }

    //Getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getHealth(){
        return this.health;
    }

    public int getSpeed(){
        return this.speed;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }

    public static void voice(){
        System.out.println("Герой говорит");
    }
}
