package homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static homework20.BurgerConstructor.*;

public class BurgerBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BurgerSize selectedSize = selectSize(scanner);
        MeatType selectedMeatType = selectMeatType(scanner);
        Ingredient[] selectedIngredients = selectIngredients(scanner);
        Burger burger = new Burger(selectedSize, selectedMeatType, selectedIngredients);
        burger.printInfo();
        scanner.close();d
    }
}