package homeworks.homework20;

enum MeatType {
    BEEF(0.5),
    CHICKEN(1),
    FISH(2);
    private double price;
    MeatType(double price) {
        price = price;
    }
    public double getPrice() {
        return price;
    }
}
