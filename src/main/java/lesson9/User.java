package lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class User<write> {
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String gender;
    private String country;

    public User() {
    }

    public User(String name, String surname, String mail, String password, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getMail() {

        return mail;
    }

    public void setMail(String mail) {

        this.mail = mail;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(mail, user.mail) &&
                Objects.equals(password, user.password) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, mail, password, gender, country);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public User(String text) {

        System.out.println("Inner text:" + text);
    }

    public static void write() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String innerText = scanner.nextLine();
        String path = "src/main/resources/files/user.txt";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) ;
        Files.createDirectories(pathToFile.getParent());
        FileWriter fileWriter = new FileWriter(path, true);
        fileWriter.write(innerText + "\n");
        fileWriter.close();
    }
}



