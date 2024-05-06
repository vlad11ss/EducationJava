package lesson3;

import java.util.Random;
import java.util.Scanner;

public class XO {

    public static char[][] field;
    public static int fieldSixeX;
    public static int fieldSixeY;

    public static char human = 'X';
    public static char ai = '0';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    private static void createField() {
        fieldSixeX = 3;
        fieldSixeY = 3;
        field = new char[fieldSixeX][fieldSixeY];

        for (int x = 0; x < fieldSixeX; x++) {
            for (int y = 0; y < fieldSixeY; y++) {
                field[x][y] = empty;

            }
        }
    }

    public static void viewField() {
        for (int x = 0; x < fieldSixeX; x++) {
            for (int y = 0; y < fieldSixeY; y++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Введите координаты клетки: ");
            cellX = scanner.nextInt();
            cellY = scanner.nextInt();
            break;

        } while (!(validCell(cellX, cellY)) || emptyCell(cellX, cellY));
        field[cellX][cellY] = human;


    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSixeX && cellY >= 0 && cellY < fieldSixeY;
    }

    public static boolean emptyCell(int cellY, int cellX) {

        return field[cellY][cellX] == empty;
    }

    public static void turnAI() {
        int cellX;
        int cellY;

        do {
            cellX = random.nextInt(fieldSixeX);
            cellY = random.nextInt(fieldSixeY);
        } while (!emptyCell(cellX, cellY));
        field[cellX][cellY] = ai;
    }

    public static boolean winGame(char player) {

        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player) return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][0] == player && field[2][0] == player) return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player) return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) return true;
        if (field[0][2] == player && field[1][1] == player && field[2][0] == player) return true;

        return false;
    }

    public static boolean draw() {
        for (int y = 0; y < fieldSixeY; y++) {
            for (int x = 0; x < fieldSixeX; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createField();
        viewField();

        while (true) {

            turnHuman();
            viewField();

            if (winGame(human)) {
                System.out.println("human win!!!");
                break;
            }
            if (draw()) {
                System.out.println("ничья");
                break;
            }
            turnAI();
            viewField();
            if (winGame(ai)) {
                System.out.println("робот win!!!");
                break;
            }
            if (draw()) {
                System.out.println("ничья");
                break;

            }
        }
    }
}


