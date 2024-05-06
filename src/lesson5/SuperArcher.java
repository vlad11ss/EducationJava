package lesson5;

public class SuperArcher extends Archer {

    public SuperArcher(String name, int health, int power, int attack, int defence, int speed) {
        super(name, health, power, attack, defence, speed);
    }

    public void superAttack() {
        System.out.println(name + " сцупер атака " + this.attack * this.speed);
    }
}
