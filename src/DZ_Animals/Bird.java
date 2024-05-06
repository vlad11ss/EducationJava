package DZ_Animals;

public class Bird extends Animals {

    public Bird(String name, int run, int swim, float jump){
        super(name, run,swim, jump);
    }

    @Override
    public void swim(int value){
        System.out.println( getName() + " не умею плавать ");
    }
}
