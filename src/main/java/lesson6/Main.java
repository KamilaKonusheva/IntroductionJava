package lesson6;

import org.w3c.dom.ls.LSOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static lesson6.Login.log;
import static lesson6.Registration.form;


public class Main {
    public static void main(String[] args) throws IOException {
        String str = " Hillel is my feature. I will be developer ";
        System.out.println(str.isEmpty());
        System.out.println("Длина текста:" + str.length());
        System.out.println("Длина без пробелов:" + str.trim().length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(33).trim());
        System.out.println(str.concat("!")); // либо sout(str + "!");
        String str1 = "Hillel is my feature. I will be DEVELOPER";
        System.out.println(str.equals(str1));
        System.out.println(str.trim().equalsIgnoreCase(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        char unicode = 3515;
        System.out.println(unicode);
        char unicode1 = 3404;
        System.out.println(unicode1);
        char unicode2 = 8536;
        System.out.println(unicode2);
        char unicode3 = 8604;
        System.out.println(unicode3);
        char unicode4 = 8555;
        System.out.println(unicode4);

        write();
        form();
        log();
    }

    private static void write() throws IOException {
        String path = "src/main/resources/files/poem/file.txt";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        FileWriter fileWriter = new FileWriter(path, false);
        fileWriter.write("В конце припоминается начало.\nПочти всё лето птица промолчала.\nЗато к зиме, очнувшись от забот,\nПо-прежнему, по-вешнему поёт.");
        fileWriter.close();
        System.out.println("Ваш стих записан");

        FileReader fileReader = new FileReader("src/main/resources/files/poem/file.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String poem = scanner.nextLine();
            System.out.println(poem);
        }
        scanner.close();
        fileReader.close();
    }
}









