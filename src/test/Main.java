

//Написать метод вычисляющий выражение a * (b + (c / d)) и
// возвращающий результат, где a,b,c,d – входные параметры этого метода.
//        public class Main {
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        testOne(a,b,c,d);
//        System.out.println(testOne(a,b,c,d));
//
//    }
//    public static float testOne (int a,int b, int c, int d){
//        return a +(b+((float)c/d));
//
//    }
//}


//Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
//если да – вернуть true, в противном случае – false;
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("резултат " + testTwo(1, 18));
//    }
//    public static boolean testTwo(int oneNum, int twoNum) {
////        int sum = oneNum + twoNum;
//        return (oneNum + twoNum <= 20) && (oneNum + twoNum >= 10);
//
//    }
//}


//Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали,
//или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
//public class Main {
//    public static void main(String[] args) {
//        int s = 5;
//        if (tectThree(s)) {   //объявил метод
//            System.out.println("положительное ");
//        } else {
//            System.out.println("отрицательное");
//        }
//    }
//
//    public static boolean tectThree(int s) {
//        re0;turn s >=
//    }
//
//}

//Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное
//сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

//public class Main {
//    public static void main(String[] args) {
//        String v = "vlad";
//        System.out.println("Привет, " + v + "!");
//        testFour(v);
//    }
//    public static String testFour(String v) {
//        return "Привет" + v;
//
//    }
////}
//public class Main {
//    public static void main(String[] args) {
//        int year = 2028;
//        System.out.println(year + " -Высокосный ли год? " + testFive(year));
//    }
//    public static boolean testFive(int year) {
//        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
//    }
//}
// 1.Создать массив, состоящий из элементов 0 и 1,
//         * например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
//         * и условия заменить 0 на 1, 1 на 0;
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        int [] arr ={1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0};
//        System.out.println("было:" + Arrays.toString(arr));
//
//        testOne(arr);
//        System.out.println("стало" + Arrays.toString(arr));
//    }
//    private static void testOne(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
////            arr[i] = (arr[i] == 1) ? o : 1; то же самое что и if else
////            так же задачу можно было решить математическим способом
////            arr[i] = 1 - arr[i]; то есть из 1 мы отниамем тикущий элемент масива
//        }
//    }
//}
// 2. Создать пустой целочисленный массив размером 8.
//         * С помощью цикла заполнить его значениями
//         * 1, 4, 7, 10, 13, 16, 19, 22;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] arrInt = new int[8];
//        testTwo(arrInt);
//        System.out.println(Arrays.toString(arrInt));
//    }
//
//    private static void testTwo(int[] arrInt) {
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = i * 3 + 1;
//
//        }
//
//    }
//}
//3.   Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//         * пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
//         */
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        System.out.println("было" + Arrays.toString(mas));
//        testThree(mas);
//        System.out.println("стало" + Arrays.toString(mas));
//    }
//    public static void testThree(int[] mas){
//        for(int i  = 0; i < mas.length; i++)
//            if (mas[i] > 6){
//                mas[i] *=2;
//            }
//    }
//}
// 4.   Создать квадратный двумерный целочисленный
//         * массив (количество строк и столбцов одинаковое),
//         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//public class Main {
//    public static void main(String[] args) {
//         int side = 3;
//         int[][] darr = new int[side][side];
//         testFour(darr);
//         printArraySize2(darr);
//    }
//    private static void testFour(int[][] darr){
//        for (int i = 0; i < darr.length; i++) {
//            darr[i][i] = 1;
//            darr[i][darr.length-1-i] = 1;
//        }
//    }
//    private static void printArraySize2(int[][] inputArr){
//        for (int i = 0; i < inputArr.length; i++) {
//            for (int j = 0; j < inputArr[i].length; j++) {
//                System.out.print(inputArr[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//    }
//}
//*
//         * 5.	* Задать одномерный массив и найти в нем
//         * минимальный и максимальный элементы;
//         */
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        int[] mas = {589, 503, 98, 24, 13, 606, 1344};
//        System.out.println(Arrays.toString(mas));
//        System.out.println("Max " + findMax(mas));
//        System.out.println("Min " + findMin(mas));
//
//    }
//    public static int findMax(int[] array) {
//        Arrays.sort(array);
//        return array[array.length - 1];
////        int max = array[1];
////        for (int i = 0; i < array.length; i++) {
////            if (array[i] > max)
////                max = array[i];
//    }
////        return max;
////}
//
//
//    public static int findMin(int[] array) {
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min)
//                min = array[i];
//            }
//            return min;
//        }
//}


// 6.    *** Написать метод, которму на вход подаётся одномерный
//         * массив и число n (может быть положительным, или отрицательным),
//         * при этом метод должен сместить все элементы массива на n позиций.
//         *
//public class Main {
//    public static void main(String[] args) {
//        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        System.out.println( Arrays.toString(shiftArray));
//        shifter(shiftArray, -3);
//        System.out.println("-3 " + Arrays.toString(shiftArray));
//        shifter(shiftArray, 6);
//        System.out.println("+6 " + Arrays.toString(shiftArray));
//
//    }
//
//    private static void shifter(int[] array, int value) {
//        boolean direction;
//        if (value < 0) {
//            direction = true;
//            value = -value;
//        } else {
//            direction = false;
//        }
//        value %= array.length;
//        int lastIndex = array.length - 1;
//        for (int i = 0; i < value; i++) {
//            int temp = (direction) ? array[0] : array[lastIndex];
//            for (int j = 0; j < lastIndex; j++) {
//                if (direction)
//                    array[j] = array[j + 1];
//                else
//                    array[lastIndex - j] = array[lastIndex - j - 1];
//            }
//            if (direction)
//                array[lastIndex] = temp;
//            else array[0] = temp;
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int countDown = 10;
//
//        while (countDown >= 0) {
//            System.out.println("До старта: " + countDown);
//            countDown--;
//        }
//
//        System.out.println("Поехали !");
//
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        int a = 42;
//        int b = 100;
//        int c = 125;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a = 2;
//        int b = ++a;
//        System.out.println("a= " + a);
//        System.out.println("b= " + b);
//    }
//}
//public class Main {
//    String name;
//
//    public static void main(String[] args) {
//        int size = 3;
//        int z = 0;
//
//        Main [] h = new Main[size];
//
//        while (z < 3){
//            h[z] = new Main();
//            h[z].name = "бильбо";
//            if (z == 1){
//                h[z].name = "Фродо";
//            }
//            if (z == 2){
//                h[z].name = "Сэм";
//            }
//            System.out.println(h[z].name + " - ");
//            System.out.println("Имя хорошего хобита");
//            z++;
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int size = 4;
//        int y = 0;
//        int ref;
//
//        String [] islands = new String[size];
//
//        islands[0] = "Фиджи";
//        islands[1] = "Косумель";
//        islands[2] = "Бермуды";
//        islands[3] = "Азорские острова";
//
//        int [] index = new int[size];
//
//        index[0] = 0;
//        index[1] = 1;
//        index[2] = 2;
//        index[3] = 3;
//
//        while (y < 4){
//            ref = index[y];
//            System.out.print("Острова = ");
//            System.out.println(islands[ref]);
//            y++;
//
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        double nums [] = {10.1, 11.1, 12.1, 13.1, 14.1};
//        double result = 0;
//        for (int i = 0; i < 5; i++) {
//            result = result + nums[i];
//            System.out.println("среднее значение = " + result/5);
//
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int twoD[][] = new int[4][5];
//        int k = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                twoD[i][j] = k;
//                k++;
//
//            }
//
//        }
//
//
//        for (int i = 0; i < twoD.length; i++) {
//            for (int j = 0; j < twoD.length; j++) {
//                System.out.print(twoD[i][j] + " | ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;
//        d = a++;
//        c++;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int mas[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (mas[i][j] == 0)
//                    mas[i][j] = 1;
//                System.out.print(mas[i][j] + "|");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println(pow(7, 4));
//
//    }
//        public static int pow(int value, int powValue) {
//
//            return (int) Math.pow(value, powValue);
//
//        }
//}
//public class Main {
//    public static void main(String[] args) {
//        int i = 250;
//        int j = 350;
//
//        while (++i < --j);
//        System.out.println(i);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            if (mas[i] == 4)
//                mas[i]*=2;
//            System.out.println(mas[i]);
//            sum += mas[i];
//
//
//
//        }
//        System.out.println(sum);
//
//    }
//}

//использовать цикл в стиле for each для вывода и суммирования значений
//public class Main {
//    public static void main(String[] args) {
//         int nams[] = {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10};
//         int sum = 0;
//         for (int x : nams){
//
//             System.out.println("значение равно " + x);
////             sum = sum +x
//             sum +=x;
//         }
//        System.out.println("Сумма равна " + sum);
//    }
//}
//public class Main {
////    public static void main(String[] args) {
////        System.out.println("My name is " + name("Vlad"));
////        System.out.println( "Im " + age(2005,2022) + " yers old");
////
////    }
////    public static String name(String x){
////        return x;
////    }
////    public static int age (int a, int b){
////        return b - a ;
////    }
////}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(testSum(10,9));
//
//    }
//    public static boolean testSum (int count, int value){
//        int sum = count + value;
//        return (count + value >= 10 ) && ( count + value <=20);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(test(-1));
//
//    }
//    public static boolean test(int count){
//        return (count >= 0);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(checkSumSign(-1,-1));
//    }
//
//    public static int checkSumSign(int a, int b) {
//        int sum;
//        sum = a + b;
//        if (sum >= 0) {
//            System.out.println("сумма положительная");
//        } else {
//            System.out.println("сумма отрецательная");
//        }
//        return sum;
//    }
//}
//import java.util.Arrays;
//
//class Main{
//    public static void main(String[] args) {
//
//        int [] mas = {1,2,3,4,5,6,7,8,9};
//
//        test(mas, 10, 20);
//
//        System.out.println(Arrays.toString(mas));
//
//    }
//    private static void test (int [] mas, int a, int b) {
//        for ( int i = 0; i < mas.length; i++) {
//            if(mas[i] % 2 == 0){
//                mas[i]+=b;
//            } else{
//                mas[i]+=a;
//            }
//        }
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a namber: ");
//        int num = in.nextInt();
//
//        System.out.printf("Your number:", num);
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ввеедите сумму вклада: ");
//        float sum = in.nextFloat();
//        System.out.println("Введите срок вклада в месяцах: ");
//        int period = in.nextInt();
//
//        for (int i = 1; i <period ; i++) {
//            sum += sum * 0.07;
//        }
//        System.out.printf("После %d месяцев сумма вклада составит %f",period,sum);
//        in.close();
//    }
//}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите длину массива");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//        System.out.println("Введите эелменты массива");
//        for (int i = 0; i < length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("Массив: " + Arrays.toString(array));
//
//        int size = array.length;
//
//        for (int i = 0; i < size / 2; i++) {
//            int temp = array[i];
//            array[i] = array[size - 1 - i];
//            array[size - 1 - i] = temp;
//        }
//        System.out.println("Реверс масива" + Arrays.toString(array));
//    }
//}
//public  class Main {
//    public static void main(String[] args) {
//        int[] array = {1,2,3};
//
//        for ( int element: array){
//            System.out.println(element );
//        }
//    }
//}
//import java.util.Scanner;
//public  class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите длину массива");
//        int length = scanner.nextInt();
//    }
//}

//import java.util.Scanner;
//
//public  class Main {
//    public static void main(String[] args)  {
//
//        Scanner scanner = new Scanner(System.in);
//
//     testTryCath(scanner.nextInt(), scanner.nextInt());
//////            CreateWorld(0);
////            CreateWorld(6);
//    }
//    public static void testTryCath(int a, int b){
//        int oops = 0;
//        try {
//            oops = a/b;
//            System.out.println(oops);
//        }
//        catch (ArithmeticException e){
//            System.out.println("на ноль делить нельзя");
//
//        }
//    }
//
////    public static void CreateWorld(int n ) throws RuntimeException  {
////        if(n == 0)
////            throw new RuntimeException("мир пуст");
////        if (n > 1 && n < 10)
////            throw new RuntimeException("мир мал");
////    }
//}

//import java.util.Scanner;
//
//public class Main {
//
//    public static   int namber = 10;
//    public static Scanner scanner = new Scanner(System.in);
//
//
//    public static void main(String[] args) {
//        Check();
//
//    }
//    static void Check(){
//        System.out.println("У вас есть число: " + namber + "\nВыберете любое из предложанных дейсвий");
//        System.out.println("Введите один из вариантов: \nОбновить \nУдалить \nИзменить");
//        String varian = scanner.nextLine();
//        switch (varian){
//            case "Обновить":
//                Update();
//                break;
//            case "Удалить":
//                Deleted();
//                break;
//            case "Изменить":
//                Change();
//                break;
//            default:
//                System.out.println("не верное выбранное значение");
//                Check();
//        }
//    }
//    static void Update(){
//
//        System.out.println("напишите значение на которое хотите обновить");
//
//        namber = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("тепер ваше число выгляди так: " + namber );
//
//        Check();
//
//    }
//
//   static void Deleted(){
//       System.out.println("Вы хотите удалить число?");
//       System.out.println("Введите один из вариантов: \nДа \nНет ");
//       String varian2 = scanner.nextLine();
//       switch (varian2){
//           case "Да":
//               namber -= namber;
//               System.out.println("тепер ваше число выгляди так: " + namber );
//               break;
//           case "Нет":
//               System.out.println("тепер ваше число выгляди так: " + namber );
//               break;
//       }
//       Check();
//
//    }
//   static void Change(){
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        String test = Chek(a);
//        if(test == "число положительное"){
//            System.out.println("+");
//        }
//        else {
//            System.out.println("-");
//        }
//
//    }
//
//    public static String Chek(int a)
//    {
//        if(a >= 0){
//            return "число положительное";
//        }
//        else {
//            return "число отрицательное";
//        }
//    }
//
//}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}