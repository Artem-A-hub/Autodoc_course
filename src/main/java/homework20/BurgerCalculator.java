package homework20;

class BurgerCalculator {
    public static double calculatePrice(BurgerSize size, MeatType meatType, Ingredient[] ingredients) {
        double price = size.getPrice() + meatType.getPrice();
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }
}
