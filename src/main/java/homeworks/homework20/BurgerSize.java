package homeworks.homework20;

enum BurgerSize {
    SMALL(5),
    MEDIUM(7.5),
    LARGE(10);
    private double price;
    BurgerSize(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

