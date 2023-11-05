package homework20;

enum Ingredient {
    CHEESE(1.0),
    TOMATO(0.5),
    LETTUCE(0.3);
    private double price;
    Ingredient(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
