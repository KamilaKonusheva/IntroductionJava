package lesson8;

public class Chairs {
    private int amount;
    private String colour;

    public Chairs() {
    }

    public Chairs(int amount, String colour) {
        this.amount = amount;
        this.colour = colour;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Chairs{" +
                "amount=" + amount +
                ", colour='" + colour + '\'' +
                '}';
    }
}
