package lesson4;

public class MyExamples {
    public static void whileExample() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i); // если сделать print , то числа будут в линию
            i++;
        }
    }

    public static void forExample() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void whileExample1() {
        int i = 100;
        while (i - 10 >= 0) {
            System.out.println(i);
            i -= 10;
        }
        System.out.println(i + " ");
    }

    public static void forExample1() {
        for (int i = 100; i >= 0 ; i -= 10) {
            System.out.println(i + " ");
        }
    }
}






