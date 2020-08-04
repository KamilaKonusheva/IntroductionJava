package lesson11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        adding(arrayList);
        delete(arrayList);
        complexMethod(arrayList);
    }

    public static ArrayList adding(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            arrayList.add(0, new Cat());
            arrayList.add(1, new Cat());
            arrayList.add(2, new Cat());
            arrayList.add(3, new Cat());
            arrayList.add(4, new Cat());
            arrayList.add(5, new Cat());
            arrayList.add(0, new Dog());
            arrayList.add(1, new Dog());
            arrayList.add(2, new Dog());
            arrayList.set(6, new Parrot());
            arrayList.set(7, new Parrot());
            arrayList.set(8, new Parrot());
            System.out.println(Arrays.toString(arrayList.toArray()));
        }
        return arrayList;
    }

    public static ArrayList delete(ArrayList arrayList) {
        int catCounter = 0;
        int dogCounter = 0;
        int parrotCounter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Cat) {
                catCounter++;
                if (catCounter > 2) {
                    arrayList.remove(i);
                    i--;
                }
            }
            if (arrayList.get(i) instanceof Dog) {
                dogCounter++;
                if (dogCounter > 2) {
                    arrayList.remove(i);
                    i--;
                }
            }
            if (arrayList.get(i) instanceof Parrot) {
                parrotCounter++;
                if (parrotCounter > 2) {
                    arrayList.remove(i);
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arrayList.toArray()));

        return arrayList;
    }

    public static ArrayList complexMethod(ArrayList arrayList) {
        if (arrayList.contains(new Cat())) {
            Cat.catActivity();
        }
        if (arrayList.contains(new Dog())) {
            Dog.dogSay();
        }
        if (arrayList.contains(new Parrot())) {
            Parrot.fly();
        }
        arrayList.clear();
        return arrayList;
    }
}
