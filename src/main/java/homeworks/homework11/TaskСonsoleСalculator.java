package homeworks.homework11;

import java.util.Scanner;

public class TaskСonsoleСalculator {
    public static void main(String[] args) {
        int numer1 = getInt();
        char operetion = getOperation();
        int numer2 = getInt();
        int result = calc(numer1, numer2, operetion);
        System.out.println("Результат операции: "
                + numer1 + " "
                + operetion + " "
                + numer2 + " = "
                + result);
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> throw new IllegalStateException("Некорректное значение: " + operation);
        }
        return result;
    }

    public static char getOperation() {
        System.out.println("Введите символ с операцией (+, -, * или /)");
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/') {
            System.out.println("Перезапустите программу " +
                    "и введите символ с операцией (+, -, * или /)");
            System.exit(1);
        }
        return symbol;
    }

    public static int getInt() {
        System.out.println("Введите целочисленное число: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Это не целочисленное число. " +
                    "Пожалуйста, введите целочисленное число: ");
            scanner.next();
        }
        int a = scanner.nextInt();
        return a;
    }


}
