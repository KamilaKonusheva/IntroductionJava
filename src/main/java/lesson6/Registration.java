package lesson6;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Registration {
    public static void form() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш логин:");
        String login = scanner.next();
        System.out.println("Введите Ваш пароль:");
        String pas = scanner.next();
        System.out.println("Повторите Ваш пароль:");
        String pas1 = scanner.next();

        String path = "src/main/resources/files/users.txt";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        FileWriter fileWriter = new FileWriter(path, true);

        if (pas.equals(pas1)) {
            fileWriter.write(login + "\n" + pas);
        } else {
            System.out.println("Вы ввели неверный пароль!");
        }
        fileWriter.close();
    }
}


