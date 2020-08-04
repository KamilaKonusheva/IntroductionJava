package lesson11;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private String colour;
    private String ownerName;
    private String gender;
    private String breed;

    public Cat() {
    }

    public Cat(String name, int age, String colour, String ownerName, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.ownerName = ownerName;
        this.gender = gender;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public String getOwnerName() {

        return ownerName;
    }

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(colour, cat.colour) &&
                Objects.equals(ownerName, cat.ownerName) &&
                Objects.equals(gender, cat.gender) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour, ownerName, gender, breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void catActivity() {
        System.out.println("The cat wants to sleep all day!");
    }
}
