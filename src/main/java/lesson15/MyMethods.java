package lesson15;

import java.io.IOException;

import static lesson15.MyExceptions.*;

public class MyMethods extends IOException {

    public static void firstMethod() throws Exception {
        firstException();
    }

    public static void secondMethod() throws Exception {
        secondException();
    }

    public static void thirdMethod() throws IOException {
        myExceptions();
    }
}
