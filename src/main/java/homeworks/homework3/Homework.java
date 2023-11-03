package homeworks.homework3;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число равное 1, 2 или 3: ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Вы ввели число равное 1");
        } else if (num == 2) {
            System.out.println("Вы ввели число равное 2");
        } else if (num == 3) {
            System.out.println("Вы ввели число равное 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }

    }
}
