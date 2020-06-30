package lesson4;


import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        MyExamples.whileExample();
        MyExamples.forExample();
        MyExamples.whileExample1();
        MyExamples.forExample1();

        int[] array = {12, 13, 23, 26, 38, 19};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Наибольшее число:" + max);

        int[] array1 = {35, 48, 98, 100, 38};
        int min = array1[0];
        for (int i = 1; i > array.length; i++) {
            if (array1[i] < min){
                min = array[i];
            }
        }
        System.out.println("Наименьшее число:" + min);

        int a = 5;
        do {
            a--;
        } while (a < 0);
        System.out.println("Hillel the best");

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                System.out.println(array2[i] + "-четное число");
            } else {
                System.out.println(array2[i] + "-нечетное число");
            }
        }
    }
}








