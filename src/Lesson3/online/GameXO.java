package Lesson3.online;

import java.util.Random;
import java.util.Scanner;

public class GameXO {

    public static char[][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static final char HUMAN_DOT = 'X';
    public static final char AI_DOT = '0';
    public static final char EMPTY_DOT = '_';
    public static int countV = 0;
    public static int countG = 0;
    public static int countD1 = 0;
    public static int countD2 = 0;

    public static void main(String[] args) {
        System.out.println("ведите количество столбцов и строк");
        sizeMapY = SCANNER.nextInt();

        sizeMapX = sizeMapY;
        initMap(sizeMapY, sizeMapX);
        printMap();

        while (true) {
            System.out.println("Ход игрока");
            humanTurn();
            printMap();
            if (checkWin(HUMAN_DOT)) {

                System.out.println("Human win!");
                break;
            }
            if (isMapFull()) {

                System.out.println("Draw!");
                break;
            }


            System.out.println("Ход компьютера");
            aiTurn();
            printMap();
            if (checkWin(AI_DOT)) {

                System.out.println("AI win!");
                break;
            }
            if (isMapFull()) {

                System.out.println("Draw!");
                break;
            }
        }
        SCANNER.close();
    }


    public static void initMap(int sizeMapY, int sizeMapX) {
        map = new char[sizeMapY][sizeMapX];
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {

                map[y][x] = EMPTY_DOT;
            }

        }
    }

    public static void printMap() {

        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + "|");

            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты хода X, Y (от 1 до " + sizeMapX + ") через пробел: ");
            y = SCANNER.nextInt() - 1;
            x = SCANNER.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));
        map[y][x] = HUMAN_DOT;
    }

    public static void aiTurn() {
       /* int x, y;
       int x_AI = 0, y_AI = 0;
        do {
           /* if (!checkWin(AI_DOT) && !isMapFull()) {
                for (y = 0; y < sizeMapY; y++) {
                    for (x = 0; x < sizeMapX; x++) {
                        if (map[y][x] == HUMAN_DOT) {
                            if (countV >= 2) {
                                y_AI = RANDOM.nextInt(sizeMapY);
                                x_AI = x;
                            } else if (countG >= 2){
                                x_AI = RANDOM.nextInt(sizeMapX);;
                                y_AI = y;
                            }
                        }

                    }
                }
            } else {

                y_AI = RANDOM.nextInt(sizeMapY);
                x_AI = RANDOM.nextInt(sizeMapX);
            }
        } while (!isEmptyCell(y_AI, x_AI));
        map[y][x] = AI_DOT;*/

        int x;
        int y;

        do {
            x = RANDOM.nextInt(sizeMapX);
            y = RANDOM.nextInt(sizeMapY);
        } while (!isEmptyCell(y, x));
        map[y][x] = AI_DOT;
    }


    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == EMPTY_DOT;
    }

    public static boolean checkWin(char symbol) {
        // проверка по горизонтали
        //  if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        // if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        // if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
// проверка по вертикали
        // if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        // if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        // if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
// проверка по диагонали
        // if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        //  if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
        // int countV = 0;
        //int countG = 0;
        // int countD1 = 0;
        //int countD2 = 0;
// проверка по горизонтали
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == symbol) countV++;
                if (map[x][y] == symbol) countG++;

            }
            if (map[y][sizeMapY - y - 1] == symbol) countD2++;
            if (map[y][y] == symbol) countD1++;
            if (countV == sizeMapX || countG == sizeMapX) {

                return true;
            } else {
                countV = 0;
                countG = 0;

            }
        }
        if (countD1 == sizeMapX || countD2 == sizeMapX) {

            return true;
        } else {
            countD1 = 0;
            countD2 = 0;
        }

        return false;
    }


    public static boolean isMapFull() {
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == EMPTY_DOT) return false;
            }
        }
        return true;
    }
}

