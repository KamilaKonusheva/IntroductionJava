package lesson8;

public class Person {
    String name;
    int code;
    byte age;
    float height;
    float weight;
    int card;
    int phone;
    short flatNumber;
    int insurance;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public Person(String name, int code, byte age) {
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public Person(String name, int code, byte age, float height) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int code, byte age, float height, float weight) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int code, byte age, float height, float weight, int card) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.card = card;
    }

    public Person(String name, int code, byte age, float height, float weight, int card, int phone) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.card = card;
        this.phone = phone;
    }

    public Person(String name, int code, byte age, float height, float weight, 
                  int card, int phone, short flatNumber) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.card = card;
        this.phone = phone;
        this.flatNumber = flatNumber;
    }

    public Person(String name, int code, byte age, float height, float weight, 
                  int card, int phone, short flatNumber, int insurance) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.card = card;
        this.phone = phone;
        this.flatNumber = flatNumber;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public short getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(short flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", card=" + card +
                ", phone=" + phone +
                ", flatNumber=" + flatNumber +
                ", insurance=" + insurance +
                '}';
    }
}
