package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Dog extends Cat {
    public Dog() {
    }

    public Dog(ArrayList<Pet> pets, HashMap petMap, Set petSet) {
        super(pets, petMap, petSet);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "pets=" + pets +
                ", petMap=" + petMap +
                ", petSet=" + petSet +
                '}';
    }
}
