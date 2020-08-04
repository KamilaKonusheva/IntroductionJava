package lesson14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //задание 1
        Form fist = new Form();
        fist.form();

        //задание 2

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();
        wildCardsMethod(dogs, pets);
    }

    public static void wildCardsMethod(ArrayList<? extends Cat> cats, ArrayList<? super Cat> cats1) {
    }
}
