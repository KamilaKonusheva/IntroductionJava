package lesson9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Support extends User {
    public Support() {
    }

    public Support(String name, String surname, String mail, String password, String gender, String country) {
        super(name, surname, mail, password, gender, country);
    }

    public boolean stringCheck() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String innerText = scanner.nextLine();
        FileReader fileReader = new FileReader("src/main/resources/files/user.txt");
        Scanner scanner1 = new Scanner(fileReader);
        while (scanner1.hasNextLine()) {
            String scannedText = scanner1.nextLine();
            if (innerText.equals(scannedText)) {
                return true;
            }
            scanner1.close();
            fileReader.close();
        }
        return false;
    }
}

