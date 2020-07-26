package lesson10;

import java.util.Objects;
import java.util.Scanner;

public final class FurCoat extends Outerwear {
    private boolean naturalFur;
    private String clasp;

    private static final int CASUAL_STYLE = 1;
    private static final int CLASSIC_STYLE = 2;
    private static final int EVENING_STYLE = 3;

    public FurCoat() {
    }

    public FurCoat(boolean naturalFur, String clasp) {
        this.naturalFur = naturalFur;
        this.clasp = clasp;
    }

    public FurCoat(int size, String season, String gender,
                   String style, double price, String color, boolean naturalFur, String clasp) {
        super(size, season, gender, style, price, color);
        this.naturalFur = naturalFur;
        this.clasp = clasp;
    }

    public boolean isNaturalFur() {
        return naturalFur;
    }

    public void setNaturalFur(boolean naturalFur) {
        this.naturalFur = naturalFur;
    }

    public String getClasp() {
        return clasp;
    }

    public void setClasp(String clasp) {
        this.clasp = clasp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        FurCoat furCoat = (FurCoat) o;
        return naturalFur == furCoat.naturalFur &&
                Objects.equals(clasp, furCoat.clasp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), naturalFur, clasp);
    }

    @Override
    public String toString() {
        return "FurCoat{" +
                "naturalFur=" + naturalFur +
                ", clasp='" + clasp + '\'' +
                '}';
    }

    @Override
    public void styleRecommendation() {
        System.out.println("We will be glad to help you with your Fur coat. Please, select your event:\n " +
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
        System.out.println("At the weekend there is a 25% discount on all Fur coats!");
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
            System.out.println("Your discount = 15%");
        }
        if (clientAnswer == clientAnswer2) {
            System.out.println("We recommend you to apply for our discount client card!");
        }
    }

    public void furDefinition() {
        System.out.println("Fur coat is clothing made of furry animal hides.");
    }
}
