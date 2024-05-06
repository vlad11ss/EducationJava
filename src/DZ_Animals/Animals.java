package DZ_Animals;

public abstract class Animals {
    private String name;
    private int run;
    private int swim;
    private float jump;



    public Animals(String name, int run, int swim, float jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

//    public Animals(String name, int run, float jump) {
//        this.name = name;
//        this.run = run;
//        this.jump = jump;
//    }

    String getName(){
        return this.name;
    }
    int getRun(){
        return this.run;
    }

    int getSwim(){
        return this.swim;
    }
    float getJump(){
        return this.jump;
    }

    public void run(int value) {
        if (this.run >= value) {
            System.out.println(name + " пробежал");

        } else {
            System.out.println(name + " не пробежал");
        }

    }

    public void swim(int value) {
        if (this.swim >= value) {
            System.out.println(name + " проплыл");

        } else {
            System.out.println(name + " не проплыл");
        }
    }

    public void jump(int value) {
        if (this.jump >= value) {
            System.out.println(name + " перепрыгнул");

        } else {
            System.out.println(name + " не перепрыгнул ");
        }
    }


}
