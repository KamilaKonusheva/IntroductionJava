package lesson8;

public class FinalExample {
    private final String name;
    private final String surname;
    private final int age;

    //public FinalExample() {} - если создать этот конструтор, то String будет null, а int будет 0.

    public FinalExample(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // можем создать только Getter, так как переменные final нельзя перезаписывать (это константы).

    @Override
    public String toString() {
        return "FinalExample{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
