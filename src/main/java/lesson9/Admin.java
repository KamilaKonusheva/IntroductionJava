package lesson9;

import java.io.File;
import java.io.IOException;

public class Admin extends Support {
    public Admin() {
    }

    public Admin(String name, String surname, String mail, String password, String gender, String country) {
        super(name, surname, mail, password, gender, country);
    }

    public void fileDelete(boolean existence) {
        File file = new File("user.txt");
        fileDelete(true);
    }
}


