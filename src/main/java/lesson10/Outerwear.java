package lesson10;

import java.util.Objects;

public abstract class Outerwear extends Clothes {
    private String style;
    private double price;
    private String color;
    private static final int CASUAL_STYLE = 1;
    private static final int CLASSIC_STYLE = 2;
    private static final int EVENING_STYLE = 3;

    public Outerwear() {
    }

    public Outerwear(String style, double price, String color) {
        this.style = style;
        this.price = price;
        this.color = color;
    }

    public Outerwear(int size, String season, String gender, String style, double price, String color) {
        super(size, season, gender);
        this.style = style;
        this.price = price;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Outerwear outerwear = (Outerwear) o;
        return Double.compare(outerwear.price, price) == 0 &&
                Objects.equals(style, outerwear.style) &&
                Objects.equals(color, outerwear.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), style, price, color);
    }

    @Override
    public String toString() {
        return "Outerwear{" +
                "style='" + style + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void outerwearChoice() {
        System.out.println("Coat - for autumn and spring.\n" +
                "Jacket - for spring, summer and spring.\n" +
                "Fur coat - for winter");
    }
}
