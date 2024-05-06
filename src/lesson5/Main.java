package lesson5;

public class Main {
    public static void main(String[] args) {

        Paladin paladin = new Paladin("paladin",100,50,25,10);
        Archer archer = new Archer("archer",50,100,50,1);
        Mage mage = new Mage("mage",20,120,120,0);
        Titan titan = new Titan("titan",20000,999,999,999);
        SuperArcher superArcher = new SuperArcher("superArcher", 150,150,500,20,280);

        paladin.speak();
        paladin.dealDamage();
        paladin.healSelf();
        paladin.defense();
//        paladin.sleep();

        System.out.println();

        archer.speak();
        archer.dealDamage();
        archer.healSelf();

        System.out.println();

        mage.speak();
        mage.dealDamage();
        mage.healSelf();

        System.out.println();

        titan.speak();
        titan.dealDamage();
        titan.healSelf();
        titan.defense();

        System.out.println();

        superArcher.superAttack();

//        Hero[] army = {paladin, archer, mage, titan, superArcher};
//        for (int i = 0; i < army.length; i++) {
////            army[i].speak();
////            army[i].dealDamage();
////            army[i].healSelf();
//            if(army[i] instanceof SuperArcher ) {
////                SuperArcher tmp = (SuperArcher) army[i];
////                tmp.superAttack();
//                ((SuperArcher) army[i]).superAttack();
//            }
//            if(army[i] instanceof Paladin){
//                ((Paladin)  army[i]).defense();
//            }
//        }

//        Object[] myArray = new Object[4];
//
//        int a = 10;
//        String myString = "hello";
//        char b = 'H';
//
//        myArray[0] = a;
//        myArray[1] = myString;
//        myArray[2] = b;
//        myArray[3] = paladin;
//
//        for (int i = 0; i < myArray.length; i++) {
//            if(myArray[i] instanceof Paladin){
//                ((Paladin) myArray[i]).dealDamage();
//            }
//            if(myArray[i] instanceof String){
//                System.out.println(((String) myArray[i]).length());
//            }
//        }
    }
}
