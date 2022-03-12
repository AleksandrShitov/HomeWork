package lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {

        int a = 78, b = 23;
        boolean rez1 = belongRange(78, 23);
        System.out.println(a + " + " + b + " - " + (rez1 ? "" : "не ") + "принадлежит [10; 20]");

        printSign(-3);

        int c = 3;
        boolean rez2 = isNegativeSign(c);
        System.out.println(c + (rez2 ? " отрицательное" : " положительное") + " число");

        mPrint("Hello, World!", 4);

        int year = 2100;
        boolean rez3 = isLeapYear(year);
        System.out.println(year + " - " + (rez3 ? "високосный" : "невисокосный") + " год");

    }

    public static boolean belongRange(int a, int b) {
        int c;
        boolean retValue;

        c = a + b;

        if (c >= 10 && c <= 20) {
            retValue = true;
        } else {
            retValue = false;
        }
        return retValue;
    }

    public static void printSign(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.");
        } else {
            System.out.println("Число " + a + " отрицательное.");
        }
    }

    public static boolean isNegativeSign(int a) {
        boolean retValue;

        if (a < 0) {
            retValue = true;
        } else {
            retValue = false;
        }

        return retValue;
    }

    public static void mPrint(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean retValue;

        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 != 0)) {
                retValue = false;
            } else {
                retValue = true;
            }
        } else {
            retValue = false;
        }

        return retValue;
    }
}
