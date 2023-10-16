package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextDouble {
    public static void main(String[] args) {
        System.out.println("Введите любое дробное число:");
        Scanner scanner = new Scanner(System.in);
        double someDouble = scanner.nextDouble();
        System.out.println("Вы ввели " + someDouble);

    }
    // byte -> short -> int -> long
    // byte <- short <- int <- long

}
