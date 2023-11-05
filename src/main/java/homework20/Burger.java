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
}
