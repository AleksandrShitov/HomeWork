package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = -2;

        if ((a + b) >= 0) {
            System.out.println("РЎСѓРјРјР° РїРѕР»РѕР¶РёС‚РµР»СЊРЅР°СЏ");
        } else {
            System.out.println("РЎСѓРјРјР° РѕС‚СЂРёС†Р°С‚РµР»СЊРЅР°СЏ");
        }

    }

    public static void printColor() {
        int value = 45;

        if (value <= 0) {
            System.out.println("РљСЂР°СЃРЅС‹Р№");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Р–РµР»С‚С‹Р№");
        } else { /*value > 100*/
            System.out.println("Р—РµР»РµРЅС‹Р№");
        }
    }

    public static void compareNumbers() {
        int a = 78;
        int b = 89;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
