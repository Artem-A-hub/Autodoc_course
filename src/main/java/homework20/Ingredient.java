package homework20;

enum Ingredient {
    CHEESE(1),
    TOMATO(3),
    LETTUCE(5);
    private double price;
    Ingredient(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
