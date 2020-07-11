package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Richy";
        cat.age = 2;
        cat.colour = "black";

        Cat cat1 = new Cat("Alex");
        Cat cat2 = new Cat("Flex", 4);
        Cat cat3 = new Cat("Milka", 2, "white");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        // вывела для себя

        Dog dog = new Dog();
        dog.name = "Harvey";
        dog.age = 1;
        dog.colour = "black";

        Dog dog1 = new Dog("Jack");
        Dog dog2 = new Dog("Jassica", 3);
        Dog dog3 = new Dog("Nick", 1, "brown");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        // опять таки вывела для себя)

        cat.setName("Barsik");
        System.out.println("Cat's name:" + cat.getName());
        cat.setAge(4);
        System.out.println("Cat's age:" + cat.getAge());
        cat.setColour("black");
        System.out.println("Cat's colour:" + cat.getColour());

        dog.setName("Bagira");
        System.out.println("Dog's name:" + dog.getName());
        dog.setAge(3);
        System.out.println("Dog's age:" + dog.getAge());
        dog.setColour("white");
        System.out.println("Dog's colour:" + dog.getColour());

    }
}
