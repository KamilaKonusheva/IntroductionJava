package lesson9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        User.write();
        new User("hello");
        // проверяла для себя
    }

    public static void userWrite(User user) throws IOException {
        user.write();
    }

    public static void complexSupport(User user) throws IOException {
        if (user instanceof Support) {
            ((Support) user).write();
            ((Support) user).stringCheck();
        }
    }

    public static void complexAdmin(User user) throws IOException {
        if (user instanceof Admin) {
            ((Admin) user).write();
            ((Admin) user).stringCheck();
            ((Admin) user).fileDelete(true);
        }
    }
}

