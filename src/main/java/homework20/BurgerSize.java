package homework20;

enum BurgerSize {
    SMALL(5.99),
    MEDIUM(7.99),
    LARGE(9.99);
    private double price;
    BurgerSize(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
