package homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BurgerBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в Burger Builder!");
        BurgerSize selectedSize = selectSize(scanner);
        MeatType selectedMeatType = selectMeatType(scanner);
        Ingredient[] selectedIngredients = selectIngredients(scanner);
        Burger burger = new Burger(selectedSize, selectedMeatType, selectedIngredients);
        burger.printInfo();
        scanner.close();
    }
    private static BurgerSize selectSize(Scanner scanner) {
        System.out.println("Выберите размер бургера:");
        for (BurgerSize size : BurgerSize.values()) {
            System.out.println(size.ordinal() + ". " + size + " - $" + size.getPrice());
        }
        int sizeChoice = scanner.nextInt();
        return BurgerSize.values()[sizeChoice];
    }
    private static MeatType selectMeatType(Scanner scanner) {
        System.out.println("Выберите тип мяса:");
        for (MeatType meatType : MeatType.values()) {
            System.out.println(meatType.ordinal() + ". " + meatType + " - $" + meatType.getPrice());
        }
        int meatChoice = scanner.nextInt();
        return MeatType.values()[meatChoice];
    }
    private static Ingredient[] selectIngredients(Scanner scanner) {
        List<Ingredient> selectedIngredients = new ArrayList<>();
        System.out.println("Добавьте ингредиенты:");
        while (true) {
            for (Ingredient ingredient : Ingredient.values()) {
                System.out.println(ingredient.ordinal() + ". " + ingredient + " - $" + ingredient.getPrice());
            }
            String ingredientChoice = scanner.next();
            if (ingredientChoice.equalsIgnoreCase("Готово")) {
                break;
            }
            int ingredientIndex = Integer.parseInt(ingredientChoice);
            if (ingredientIndex >= 0 && ingredientIndex < Ingredient.values().length) {
                selectedIngredients.add(Ingredient.values()[ingredientIndex]);
            }
        }
        return selectedIngredients.toArray(new Ingredient[0]);
    }
}