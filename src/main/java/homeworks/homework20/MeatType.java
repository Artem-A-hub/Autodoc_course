package homeworks.homework20;

enum MeatType {
    BEEF(0.0),
    CHICKEN(1.0),
    FISH(2.0);
    private double price;
    MeatType(double price) {
        price = price;
    }
    public double getPrice() {
        return price;
    }
}
