package lesson15;

import java.io.IOException;

public class MyExceptions extends IOException {

    public static void firstException() throws IOException {
        throw new IOException();
    }

    public static void secondException() throws Exception {
        throw new Exception();
    }

    public static void myExceptions() throws IOException {
        throw new MyExceptions();
    }
}
