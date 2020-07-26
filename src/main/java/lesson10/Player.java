package lesson10;

import java.util.Objects;

public abstract class Player extends Human {
    private int age;
    private String country;
    private double salary;

    public void motto() {
        System.out.println("I'm the best");
    }

    public Player() {
    }

    public Player(int age, String country, double salary) {
        this.age = age;
        this.country = country;
        this.salary = salary;
    }

    public Player(String name, String surname, String gender, int age,
                  String country, double salary) {
        super(name, surname, gender);
        this.age = age;
        this.country = country;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Player player = (Player) o;
        return age == player.age &&
                Objects.equals(country, player.country) &&
                Objects.equals(salary, player.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, country, salary);
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", country='" + country + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
