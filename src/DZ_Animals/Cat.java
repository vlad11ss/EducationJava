package DZ_Animals;

public class Cat extends Animals {

    public Cat(String name, int run, int swim, float jump){
        super(name, run,swim, jump);
    }

   @Override
   public void swim(int value){
       System.out.println( getName() + " не умею плавать ");
    }
}
