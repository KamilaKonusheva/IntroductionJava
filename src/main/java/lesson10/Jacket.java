package lesson10;

import java.util.Objects;
import java.util.Scanner;

public final class Jacket extends Outerwear {
    private boolean prints;
    private String material;

    private static final int CASUAL_STYLE = 1;
    private static final int CLASSIC_STYLE = 2;
    private static final int EVENING_STYLE = 3;

    public Jacket() {
    }

    public Jacket(boolean prints, String material) {
        this.prints = prints;
        this.material = material;
    }

    public Jacket(int size, String season, String gender,
                  String style, double price, String color, boolean prints, String material) {
        super(size, season, gender, style, price, color);
        this.prints = prints;
        this.material = material;
    }

    public boolean isPrints() {
        return prints;
    }

    public void setPrints(boolean prints) {
        this.prints = prints;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Jacket jacket = (Jacket) o;
        return prints == jacket.prints &&
                Objects.equals(material, jacket.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prints, material);
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "prints=" + prints +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void styleRecommendation() {
        System.out.println("We will be glad to help you with your jacket. Please, select your event:\n " +
                "1- meeting with friends,a walk to the movies\n" +
                "2- business meeting,interview\n " +
                "3- date, someone's birthday\n" + "Your choice:");
        Scanner scanner = new Scanner(System.in);
        int style = scanner.nextInt();
        if (style == CASUAL_STYLE) {
            System.out.println("We recommend you to pay attention to clothes in Casual style!");
        }
        if (style == CLASSIC_STYLE) {
            System.out.println("We recommend you to pay attention to clothes in Classic style!");
        }
        if (style == EVENING_STYLE) {
            System.out.println("We recommend you to pay attention to clothes in Evening style!");
        }
    }

    @Override
    public void sizeRecommendation() {
        System.out.println("We will be glad to help you with your size!\n" +
                "How To Measure: " +
                "Using a cloth measuring tape, " +
                "measure over the undergarments you will be wearing with the styles you are ordering.\n" +
                "\n" +
                "Chest: Lift your arms slightly and measure across the fullest part of your chest.\n" +
                "\n" +
                "Natural Waist: Measure around your waist at its most narrow point.\n" +
                "After that, look the Size Chart.");
    }

    @Override
    public void weekendDiscount() {
        System.out.println("At the weekend there is a 15% discount on all Jacket!");
    }

    @Override
    public void cardDiscount() {
        System.out.println("Do you have our discount client card:\n" +
                "Write '1' for yes or '2' for no : ");
        int clientAnswer1 = 1;
        int clientAnswer2 = 2;
        Scanner scanner = new Scanner(System.in);
        int clientAnswer = scanner.nextInt();
        if (clientAnswer == clientAnswer1) {
            System.out.println("Your discount = 5%");
        }
        if (clientAnswer == clientAnswer2) {
            System.out.println("We recommend you to apply for our discount client card!");
        }
    }

    public void jacketDefinition() {
        System.out.println("A jacket is a mid-stomach–length garment for the upper body.");
    }
}
