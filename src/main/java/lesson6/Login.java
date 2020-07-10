package lesson6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void log() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш логин:");
        String name = scanner.next();
        System.out.println("Введите Ваш пароль:");
        String pass = scanner.next();

        FileReader fileReader = new FileReader("src/main/resources/files/users.txt");
        Scanner scanner1 = new Scanner(fileReader);
        while (scanner1.hasNextLine()) {
            String scan = scanner.nextLine();
            String scan1 = null;
            if (name.equals(scan)) {
                scan1 = scanner.nextLine();
                if (pass.equals(scan1)) {
                    System.out.println("Добро пожаловать!");
                }
            } else {
                System.out.println("Логин или пароль не верный! Попробуйте еще раз!");
                int count = 0;
                System.out.println("Введите логин:");
                String name1 = scanner.nextLine();
                System.out.println("Введите пароль:");
                String pass1 = scanner.nextLine();
                while (count < 3 && ((!name1.equals(scan)) || ((!pass1.equals(scan1))))) {
                    count++;
                }
                System.out.println("Вы 3 раза ввели неверный пароль.Повторите попытку позже!");
            }
            System.exit(0);
        }
        scanner.close();
        fileReader.close();
    }
}







