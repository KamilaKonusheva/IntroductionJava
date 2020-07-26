package lesson10;

import java.util.Objects;

public final class Basketballer extends Player {
    private String basketballClub;
    private int growth;

    public void basketballerSay() {
        System.out.println("I can put a lot of balls in the basket!");
    }

    public Basketballer() {
    }

    public Basketballer(String basketballClub, int growth) {
        this.basketballClub = basketballClub;
        this.growth = growth;
    }

    public Basketballer(int age, String country, double salary, String basketballClub, int growth) {
        super(age, country, salary);
        this.basketballClub = basketballClub;
        this.growth = growth;
    }

    public Basketballer(String name, String surname, String gender, int age,
                        String country, double salary, String basketballClub, int growth) {
        super(name, surname, gender, age, country, salary);
        this.basketballClub = basketballClub;
        this.growth = growth;
    }

    public String getBasketballClub() {
        return basketballClub;
    }

    public void setBasketballClub(String basketballClub) {
        this.basketballClub = basketballClub;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Basketballer that = (Basketballer) o;
        return growth == that.growth &&
                Objects.equals(basketballClub, that.basketballClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basketballClub, growth);
    }

    @Override
    public String toString() {
        return "Basketballer{" +
                "basketballClub='" + basketballClub + '\'' +
                ", growth=" + growth +
                '}';
    }

    @Override
    public void relaxDays() {
        System.out.println("I'm going to relax!");
    }

    @Override
    public void relaxDays(int days) {
        System.out.println(days + " days for relax");

    }

    @Override
    public void trainingType(String type) {
        System.out.println("Type of training - " + type);

    }

    @Override
    public void trainingPlace(String place) {
        System.out.println("Place of training - " + place);

    }

    @Override
    public void training(int days) {
        System.out.println("The number of trainings per week:" + days);

    }

    @Override
    public void trainingHours(double hours) {
        System.out.println("The number of training hours per day:" + hours);
    }
}
