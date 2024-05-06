package DZ_Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog",500,10,0.5f);
        Cat cat = new Cat("cat", 200,0,2);
        Horse horse = new Horse("horse", 1500,100,3);
        Bird bird = new Bird("bird", 5,0,0.2f);

        dog.run(300);
        cat.run(200);
        horse.run(300);
        bird.run(1);

        System.out.println();

        dog.swim(5);
        cat.swim(5);
        horse.swim(60);
        bird.swim(4);

        System.out.println();

        dog.jump(1);
        cat.jump(2);
        horse.jump(3);
        bird.jump(1);

    }
}
