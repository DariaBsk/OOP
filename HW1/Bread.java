package HW1;

public class Bread extends Food {
    private String flour;

    public Bread(String name, double price, double amount, String unit, int day, int month, int year, double fatness,
            String flour) {
        super(name, price, amount, unit, year, month, day);
        this.flour = flour;
    }

    public Bread() {
        super("Бородинский", 60, 300, "г", 8, 3, 2023);
        this.flour = "ржаная";
    }

    public String getFlour() {
        return this.flour;
    }

    @Override
    public String toString() {
        String result = String.format("%s\n%s\nМука: %s", this.getClass().getSimpleName(), super.toString(),
                this.flour);
        return result;
    }

}