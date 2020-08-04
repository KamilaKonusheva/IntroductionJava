package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(ArrayList<Pet> pets, HashMap petMap, Set petSet) {
        super(pets, petMap, petSet);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "pets=" + pets +
                ", petMap=" + petMap +
                ", petSet=" + petSet +
                '}';
    }
}
