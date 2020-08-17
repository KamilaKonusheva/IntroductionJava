package lesson15;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLOutput;

import static lesson15.MyMethods.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("10");
        try {
            System.out.println("20");
            firstMethod();
            secondMethod();
            thirdMethod();
            System.out.println("30");
        } catch (MyExceptions | MyMethods e) {
            System.out.println("40");
        } catch (Exception e) {
            System.out.println("50");
        } finally {
            System.out.println("60");
        }

        try {
            System.out.println("1");
            firstMethod();
            secondMethod();
            thirdMethod();
            System.out.println("2");
        } catch (MyExceptions | MyMethods exception) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("4");
        } finally {
            System.out.println("5");
        }

        try {
            System.out.println("100");
            firstMethod();
            secondMethod();
            thirdMethod();
            System.out.println("200");
        } catch (MyExceptions e) {
            System.out.println("300");
        } catch (MyMethods e) {
            System.out.println("400");
        } catch (Exception e) {
            System.out.println("500");
        } finally {
            System.out.println("600");
        }

        try (FileWriter writer = new FileWriter("new.txt")) {
            firstMethod();
            secondMethod();
            thirdMethod();
        } catch (MyExceptions | MyMethods e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }

        try {
            System.out.println("It is very hard");
            try {
                firstMethod();
                secondMethod();
                thirdMethod();
            } catch (MyExceptions | MyMethods e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("Already done");
        }
    }
}

