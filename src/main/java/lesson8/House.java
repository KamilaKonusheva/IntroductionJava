package lesson8;

public class House {
    public static void main(String[] args) {
        Table table = new Table(1, "round", "white");
        System.out.println(table);

        Chairs chairs = new Chairs(4, "white");
        System.out.println(chairs);

        Bed bed = new Bed(2, "double", "brown");
        System.out.println(bed);
    }
}
