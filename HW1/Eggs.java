package HW1;

public class Eggs extends Food {
    private String birdType;

    public Eggs(String name, double price, double amount, String unit, int day, int month, int year, String birdType) {
        super(name, price, amount, unit, day, month, year);
        this.birdType = birdType;
    }

    public Eggs() {
        super("Домашнее", 89, 10, "шт", 8, 3, 2023);
    }

    public String getBirdType() {
        return this.birdType;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nОт птицы: %s", this.getClass().getSimpleName(), super.toString(), this.birdType);
        return result;
    }

}