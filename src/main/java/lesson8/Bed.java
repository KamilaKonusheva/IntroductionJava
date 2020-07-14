package lesson8;

public class Bed {
    private int amount;
    private String type;
    private String colour;

    public Bed() {
    }

    public Bed(int amount, String type, String colour) {
        this.amount = amount;
        this.type = type;
        this.colour = colour;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
