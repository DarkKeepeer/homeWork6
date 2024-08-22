public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("Итеракция цикла " + i);
        }
        {
            for (int r = 10; r >= 0; r = r - 1) {
                System.out.println("Итеракция цикла " + r);
            }
        }
        {
            for (int t = 0; t < 17; t = t + 2)
                System.out.println("Чётное число " + t);
        }
        {
            for (int a = 10; a >= -10; a = a - 1)
                System.out.println(a);
        }
        {
            for (int p = 1904; p <= 2096; p = p + 4)
                System.out.println(p + " Год является високосным!");
        }
        {
            for (int y = 7; y <= 98; y = y + 7)
                System.out.println(y);
        }
        {
            for (int o = 1; o <= 512; o = o * 2)
                System.out.println(o);
        }
        int postponed = 29000;
        int total = 0;
        for (int h = 0; h <= 12; h = h + 1) {
            total = total + postponed;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total);
        }
        int postponed1 = 29000;
        int total1 = 0;
        for (int h = 0; h <= 12; h = h + 1) {
            total1 = total1 + total1 / 100;
            total1 = total1 + postponed1;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total1);
        }
        int number = 2;
        for (int s = 1; s <= 10; s = s + 1)
            System.out.println(number + " * " + s + " = " + number * s);
    }
}
