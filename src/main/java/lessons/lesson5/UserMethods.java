package lessons.lesson5;

import java.util.Scanner;

public class UserMethods {
    public static void main(String[] args) {
        sayHello();
        getStrAndPrint("Hello world");
        getStrAndPrint("Hello guys");
        System.out.println(sum(5, 5));
        int res = sum(10, 7);
        System.out.println(res);

        String aboutYou = getNameAndSurname("Alex", "Mushkambarian", 34);
        System.out.println(aboutYou);

        sumFromConsole();

        int sumOfOrder = 100;

        int finalSum = returnSumFromConsole() + sumOfOrder;
        System.out.println(finalSum);

    }


    public static int returnSumFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }

    public static void sumFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println(result);
    }

    public static String getNameAndSurname(String name, String surname, int age) {
        return name + " " + surname + " " + age;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void getStrAndPrint(String str) {
        System.out.println("You enter " + str);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
