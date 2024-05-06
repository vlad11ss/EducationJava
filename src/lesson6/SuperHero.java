package lesson6;

public abstract class SuperHero {
    protected String name;
    protected int attack;
    protected float health;
    protected int defence;

    public SuperHero( String name, int attack, float health, int defence){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defence = defence;

    }

    public void attack(SuperHero hero){
        float dealDamage = this.attack - ((float)this.attack / hero.defence);
        if(!hero.isDead()){
            hero.health -= dealDamage;
            System.out.println(this.name + " нанес домаг " + hero.name + " >>  " + dealDamage + " dmg. HP " + hero.name + " = " + hero.health);
        } else {
            System.out.println(hero.name + " мертв " + hero.isDead());
        }

    }

    public void healSelf(){
        float summaryHeal = 0.1f * this.defence;
        this.health += summaryHeal;
        System.out.println( this.name + " я полечились " + summaryHeal + ". Now HP =  " + this.health);

    }

    public boolean isDead(){
        return this.health <= 0;
    }

    public String getHeroInfo(){
        return name + " HP: " + health;
    }

    public int getAttack(){
        return attack;
    }

}
