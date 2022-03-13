package lesson3;

public class HomeWorkApp {

    public static void main(String[] arg) {

        /*task 1*/
        int a[] = {0, 1, 0, 1, 0, 1, 1, 1, 0};

        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.print("\n");

        replaceDigit(a);
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println("\n"); /*2 line ending*/
        /*end task 1*/

        /*task 2*/
        int c[] = new int[100];
        for (int i = 0; i < 100; i++) {
            c[i] = i + 1;
        }
        /*end task 2*/

        /*task 3*/
        int b[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int item : b) {
            System.out.print(item + " ");
        }
        System.out.print("\n");

        multiplyArray(b);
        for (int item : b) {
            System.out.print(item + " ");
        }
        System.out.println("\n"); /*2 line ending*/
        /*end task 3*/

        /*task 4*/
        int n = 10;
        int[][] d = new int[n][n];
        boolean res4 = setDiagonal(d);
        if (res4) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d.length; j++) {
                    System.out.print(d[i][j] + " ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Ошибка: двумерный массив не квадратный.");
        }
        System.out.print("\n");
        /*end task4*/

        /*task 5*/
        int f[];
        f = initArray(10, 7);
        for (int item : f) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
        /*end task 5*/

        /*task 6*/
        int g[] = {1, 2, 3, 4, -5, 8, 9};

        int minItem = g[0];
        int maxItem = g[0];

        for (int item : g) {
            if (minItem > item) {
                minItem = item;
            }

            if (maxItem < item) {
                maxItem = item;
            }
        }

        System.out.println("min = " + minItem + " max = " + maxItem + "\n");
        /*end task 6*/

        /*task 7*/
        int h[] = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(isExistsBorder(h) + "\n");
        /*end task 7*/

        /*task 8*/
        int r[] = {3, 5, 6, 1};
        shiftArray(r, -2);

        for (int item : r) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
        /*end task 8*/
    }

    public static void replaceDigit(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
    }

    public static void multiplyArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
    }

    public static boolean setDiagonal(int a[][]) {

        boolean isMArraySquare;

        isMArraySquare = a.length == a[0].length;

        if (isMArraySquare) {
            for (int i = 0; i < a.length; i++) {
                a[i][i] = 1;
                a[i][a.length - 1 - i] = 1;
            }
        }

        return isMArraySquare;
    }

    public static int[] initArray(int len, int initialValue) {
        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
        }

        return a;
    }

    public static boolean isExistsBorder(int a[]) {
        boolean retValue;

        int commonSum = 0;
        for (int item : a) {
            commonSum += item;
        }

        if ((commonSum & 1) != 0) {
            /*Общая сумма элементов является нечетным значением, значит границы точно нет*/
            retValue = false;
        } else {
            int halfCommonSum = commonSum / 2;
            int currentSum = 0;

            retValue = false;

            for (int item : a) {
                currentSum += item;
                if (currentSum == halfCommonSum) {
                    retValue = true;
                    break;
                }
            }
        }

        return retValue;
    }

    public static void shiftArray(int a[], int n) {

        boolean positiveSign = n > 0;

        int mn;

        if (n < 0) {
            mn = n * -1;
        } else {
            mn = n;
        }

        for (int i = 0; i < mn; i++) {
            int spareItem;
            if (positiveSign) {
                spareItem = a[a.length - 1];
            } else {
                spareItem = a[0];
            }

            for (int j = 1; j < a.length; j++) {
                if (positiveSign) {
                    a[a.length - j] = a[a.length - j - 1];
                } else {
                    a[j - 1] = a[j];
                }
            }
            if (positiveSign) {
                a[0] = spareItem;
            } else {
                a[a.length - 1] = spareItem;
            }
        }
    }
}
