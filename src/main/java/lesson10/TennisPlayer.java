package lesson10;

import java.util.Objects;

public final class TennisPlayer extends Player {
    private boolean award;
    private boolean singles;

    public void tennisPlayerAim() {
        System.out.println("I want to get as many points as possible!");
    }

    public TennisPlayer() {
    }

    public TennisPlayer(boolean award, boolean singles) {
        this.award = award;
        this.singles = singles;
    }

    public TennisPlayer(int age, String country, double salary, boolean award, boolean singles) {
        super(age, country, salary);
        this.award = award;
        this.singles = singles;
    }

    public TennisPlayer(String name, String surname, String gender, int age,
                        String country, double salary, boolean award, boolean singles) {
        super(name, surname, gender, age, country, salary);
        this.award = award;
        this.singles = singles;
    }

    public boolean isAward() {
        return award;
    }

    public void setAward(boolean award) {
        this.award = award;
    }

    public boolean isSingles() {
        return singles;
    }

    public void setSingles(boolean singles) {
        this.singles = singles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        TennisPlayer that = (TennisPlayer) o;
        return award == that.award &&
                singles == that.singles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), award, singles);
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "award=" + award +
                ", singles=" + singles +
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
