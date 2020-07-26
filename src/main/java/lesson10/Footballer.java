package lesson10;

import java.util.Objects;

public final class Footballer extends Player {
    private String footballClub;
    private int squadNumber;

    public void footballerCan() {
        System.out.println("This footballer can run very fast");
    }

    public Footballer() {
    }

    public Footballer(String footballClub, int squadNumber) {
        this.footballClub = footballClub;
        this.squadNumber = squadNumber;
    }

    public Footballer(int age, String country, double salary, String footballClub, int squadNumber) {
        super(age, country, salary);
        this.footballClub = footballClub;
        this.squadNumber = squadNumber;
    }

    public Footballer(String name, String surname, String gender, int age, String country,
                      double salary, String footballClub, int squadNumber) {
        super(name, surname, gender, age, country, salary);
        this.footballClub = footballClub;
        this.squadNumber = squadNumber;
    }

    public String getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(String footballClub) {
        this.footballClub = footballClub;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Footballer that = (Footballer) o;
        return squadNumber == that.squadNumber &&
                Objects.equals(footballClub, that.footballClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), footballClub, squadNumber);
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "footballClub='" + footballClub + '\'' +
                ", squadNumber=" + squadNumber +
                '}';
    }

    @Override
    public void relaxDays() {
        System.out.println("I'm going to relax");
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
