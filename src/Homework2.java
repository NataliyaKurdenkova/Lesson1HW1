import java.util.Arrays;

public class Homework2 {

    public static void main(String args[]) {
        int arrInt[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int arrInt2[] = new int[8];
        int arrInt3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrInt4[][] = new int[5][5];
        int arrInt5[] = {1, 1, 1, 2, 1};
        int arrInt7[] = {1, 2, 3, 4, 5};
        int arrInt8[] = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив - " + Arrays.toString(arrInt));
        System.out.println("Измененный массив - " + Arrays.toString(changeArr(arrInt)));
        System.out.println("Заполненный массив - " + Arrays.toString(pillArray(arrInt2)));
        System.out.println("Умноженный массив - " + Arrays.toString(multiArr(arrInt3)));
        maxAndMin(arrInt3);
        fullOne(arrInt4);
        System.out.println("Сумма правой и левой частей массива равны? " + checkBalance(arrInt5));
        System.out.println("Переданный массив:  " + Arrays.toString(arrInt7) + "\n" + "Полученный массив: " + Arrays.toString(offsetArr(arrInt7, -2)));

    }

    // Метод, заменяющий 1 на 0, 0 на 1
    private static int[] changeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
        }
        return arr;
    }

// Метод, заполняющий массив числасми 1,4,7,10,13,16,19,22

    private static int[] pillArray(int[] arr) {
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += 3;
        }
        return arr;
    }

    // Метод, принимающий на вход массив и умножающий числа меньше 6 на 2
    private static int[] multiArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        return arr;
    }

    // Метод поиска минимального и максимального элемента
    private static void maxAndMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Минимальное число массива: " + min);
    }

    // Метод заполняющий диагональные элементы массива "1!
    private static void fullOne(int[][] arr) {
        int l = arr.length;
        System.out.println("Массив ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) arr[i][j] = 1;
                arr[i][l - i - 1] = 1;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    /*Метод, который возвращает true,
     если в массиве есть место, в котором сумма левой и правой части массива равны.*/
    private static boolean checkBalance(int[] arr) {
        int l = arr.length;
        int sumLeft[] = new int[l];
        int sumRight[] = new int[l];
        int sumL = 0;
        int sumR = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            sumLeft[i] = sumL + arr[i];
            sumL = sumLeft[i];
            for (int j = i + 1; j < arr.length; j++) {
                sumR += arr[j];
            }
            sumRight[i] = sumR;
            sumR = 0;
            if (sumLeft[i] == sumRight[i]) {
                check = true;
                break;
            }

        }

       /* System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sumLeft));
        System.out.println(Arrays.toString(sumRight));*/
        return check;
    }

    //Методы, смещающий числа массива на n чисел
    private static int[] offsetArr(int[] arr, int n) {
        int l = arr.length;
        int chislo = 0;
        //int[] arrNew = new int[l];
        if (n < 0) {
            n = n * (-1);

            for (int i = 0; i < n; i++) {
                chislo = arr[0];
                for (int j = 0; j < l - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[l - 1] = chislo;
            }
        }
        else if (n > 0) {

            for (int i = 0; i < n; i++) {
                chislo = arr[l-1];
                for (int j = l - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = chislo;
            }

        }


        return arr;

    }


}



