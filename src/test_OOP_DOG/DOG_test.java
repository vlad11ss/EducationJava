package test_OOP_DOG;

public class DOG_test {
    public static void main(String[] args) {
        DOG dog1 = new DOG("Граф", "Черный", 10);
        DOG dog2 = new DOG("Муса", "Черно-белый", 5);

//        dog1.name = "Граф";
//        dog1.color = "Черный";
//        dog1.age = 10;

//        dog2.name = "Муса";
//        dog2.color = "Черно-белый";
//        dog2.age = 5;
        System.out.println("Первый пес");
        System.out.println(" Имя " + dog1.name + " цвет " + dog1.color + " " + dog1.age + " лет ");
        System.out.println("Второй пес");
        System.out.println(" Имя  " + dog2.name + " цвет  " + dog2.color + " " + dog2.age + " лет ");
    }
}
