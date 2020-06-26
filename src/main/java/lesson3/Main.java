package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("Введите Вашу фамилию:");
        String surname = scanner.next();
        System.out.println(surname);

        System.out.println("Укажите сколько Вам полных лет:");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("Введите Вашу почту для регистрации:");
        String mail = scanner.next();
        System.out.println(mail);

        System.out.println("Напишите несколько слов о себе:");
        scanner.nextLine();
        String about = scanner.nextLine();
        System.out.println(about);

        Random random = new Random();
        int a = 20;
        int intRandom1 = random.nextInt(a);
        int intRandom2 = random.nextInt(a);
        int intRandom3 = random.nextInt(a);

        System.out.println(intRandom1);
        System.out.println(intRandom2);
        System.out.println(intRandom3); // вывела, чтоб потренироваться

        System.out.println(intRandom1 + intRandom2 + intRandom3);

        double b = random.nextDouble();
        double c = random.nextDouble();
        double d = random.nextDouble();
        System.out.println(b + c + d);
        // Попробовала сложить отдельно int и отдельно double

        System.out.println(intRandom1 + intRandom2 + intRandom3 + b + c + d);

        int max = Math.max(289,367);
        System.out.println(max);
        int s = Math.abs(567);
        System.out.println(s);
        double q = Math.sqrt(36);
        System.out.println(q);
        double min = Math.min(12.34,13.56);
        System.out.println(min);
        int r = (int) Math.random();
        System.out.println(r);
        double t = Math.random();
        System.out.println(t);
        double u = Math.cos(1.5);
        System.out.println(u);
        double k = Math.round(15.8);
        System.out.println(k);

       MethodWinner.winner();
        int amount = scanner.nextInt();
        int ran = random.nextInt(amount) + 1;
        System.out.println("Поздравляем победителя под номером " + ran + "!");

        MyMoneyRandom.money();

        MySalaryMath sal = new MySalaryMath();
        double result = sal.salary();

        Employee emp = new Employee();
        emp.salary = 22000;
        emp.position = "менеджер";
        emp.age = 24;
        Employee emp1 = new Employee();
        emp1.salary = 22000;
        emp1.position = "менеджер";
        emp1.age = 24;

        System.out.println(emp.equals(emp1));
        System.out.println(emp == emp1);

        MyMath.dil(389,7);
        MyMath.plus(363,2829);

        MyMath pp = new MyMath();
        double result1 = pp.minus(34.8,30.2);

        double result2 = pp.mul(45.8,93.5);





































    }
}
