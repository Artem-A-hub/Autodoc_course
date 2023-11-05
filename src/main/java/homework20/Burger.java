package homework20;

class Burger {
    private BurgerSize size;
    private MeatType meatType;
    private Ingredient[] ingredients;
    public Burger(BurgerSize size, MeatType meatType, Ingredient[] ingredients) {
        this.size = size;
        this.meatType = meatType;
        this.ingredients = ingredients;
    }
    public double calculatePrice() {
        double price = size.getPrice() + meatType.getPrice();
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }
    public void printInfo() {
        System.out.println("Размер бургера: " + size);
        System.out.println("Тип мяса: " + meatType);
        System.out.println("Набор ингредиентов:");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Сумма: $" + calculatePrice());
    }
}
