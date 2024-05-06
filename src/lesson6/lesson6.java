package lesson6;

import java.util.Scanner;

public class lesson6 {

    private static Scanner scanner = new Scanner(System.in);
    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {

//        String s0 = "Hello test";
//        String s1 = "Hello ";
//        s1 += "test";
//
//        String s2 = scanner.nextLine();
//        String s3 = "Hello test";
//
//        // сравнение по ссылкам
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//        System.out.println("*****************");
//
//        Object[] abc = new Object[1];
//        abc[0] = s0;
//
//        System.out.println(abc);
//        System.out.println("*****************");
//
//        // сравнение не только по ссылкам, но и по значению
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

//        String exampleString = "Example"; // String exampleString = new String("Example")
//
//        StringBuilder stringBuilder = new StringBuilder("Example");
//
//        long startTime = System.nanoTime();
//
//
//        for (int i = 0; i < 5; i++) {
//            exampleString += i;
//        }
//
//        float deltaTime = System.nanoTime() - startTime;
//        System.out.println(exampleString);
//        System.out.println("Work time string " + deltaTime * 0.000001f + " millisec");
//
//        startTime = System.nanoTime();
//        for (int i = 0; i < 5; i++) {
//            stringBuilder.append(i);
//        }
//        deltaTime = System.nanoTime() - startTime;
//        System.out.println(stringBuilder.toString());
//        System.out.println("Work time stringBilder " + deltaTime * 0.000001f + " millisec");
//        System.out.println(exampleString.equals(stringBuilder.toString()));
//
//        StringBuffer stringBuffer = new StringBuffer();

        LightHero lightHero = new LightHero("lightHero",5,100,20);
        DarkHero darkHero = new DarkHero("darkHero",10,150,5);

        while (!lightHero.isDead() || !darkHero.isDead()){

            System.out.println("***** Round " + round + "*****" );

            System.out.println( lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());

            lightHero.attack(darkHero);

            if(darkHero.isDead()){
                System.out.println("lightHero win");
                break;
            }
            darkHero.attack(lightHero);

            if(lightHero.isDead()){
                System.out.println("darkHero win");
                break;
            }

            lightHero.healSelf();
            darkHero.healSelf();
            round++;

            Thread.sleep(3000);

        }



//        System.out.println( lightHero.getHeroInfo());
//        System.out.println(darkHero.getHeroInfo());


//        while (!lightHero.isDead() || !darkHero.isDead() ){
//            lightHero.attack(darkHero);
//            System.out.println( lightHero.getHeroInfo());
//
//
//            darkHero.attack(lightHero);
//            System.out.println(darkHero.getHeroInfo());
//
//            if(lightHero.isDead()){
//                break;
//            }

        }






    }

