package lessons.lesson3.scanner;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {
        System.out.println("Введите ваши данные:");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        System.out.println("Вы ввели " + data);
    }
}
