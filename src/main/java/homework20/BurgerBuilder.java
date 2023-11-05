package homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BurgerBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в Burger Builder!");
        System.out.println("Выберите размер бургера:");
        for (BurgerSize size : BurgerSize.values()) {
            System.out.println(size.ordinal() + ". " + size + " - $" + size.getPrice());
        }
        int sizeChoice = scanner.nextInt();
        System.out.println("Выберите тип мяса:");
        for (MeatType meatType : MeatType.values()) {
            System.out.println(meatType.ordinal() + ". " + meatType + " - $" + meatType.getPrice());
        }
        int meatChoice = scanner.nextInt();
        List<Ingredient> selectedIngredients = new ArrayList<>();
        System.out.println("Добавьте ингредиенты:");
        while (true) {
            for (Ingredient ingredient : Ingredient.values()) {
                System.out.println(ingredient.ordinal() + ". " + ingredient + " - $" + ingredient.getPrice());
            }
            System.out.println("Введите 'Готово' для завершения.");
            String ingredientChoice = scanner.next();
            if (ingredientChoice.equalsIgnoreCase("Готово")) {
                break;
            }
            int ingredientIndex = Integer.parseInt(ingredientChoice);
            if (ingredientIndex >= 0 && ingredientIndex < Ingredient.values().length) {
                selectedIngredients.add(Ingredient.values()[ingredientIndex]);
            }
        }
        BurgerSize selectedSize = BurgerSize.values()[sizeChoice];
        MeatType selectedMeatType = MeatType.values()[meatChoice];
        Ingredient[] finalIngredients = selectedIngredients.toArray(new Ingredient[0]);
        // Рассчитываем стоимость бургера с использованием BurgerCalculator
        double totalPrice = BurgerCalculator.calculatePrice(selectedSize, selectedMeatType, finalIngredients);
        System.out.println("Total Price: $" + totalPrice);
        scanner.close();
    }
}