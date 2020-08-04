package lesson14;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Form {
    private String name;

    public Form() {
    }

    public Form(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Form form = (Form) o;
        return Objects.equals(name, form.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void form (){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String question1 = "1.Do you like our school?";
        System.out.println("Please, answer the questions: chose 1-'yes' , 2 - 'no' , 3 - 'don't know \n"+
                question1);
        int answer1 = scanner.nextInt();
        String question2 = "2.Do you enjoy the study?";
        System.out.println(question2);
        int answer2 = scanner.nextInt();
        HashMap map = new HashMap();
        HashMap map1 = new HashMap();
        map1.put(question1,answer1);
        map1.put(question2,answer2);
        map.put(name,map1);
    }
}
