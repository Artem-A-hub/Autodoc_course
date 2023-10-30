package lessons.lesson3.conditional;

import java.util.Scanner;

public class SimpleExample {

    public static void main(String[] args) {
        difficult();
    }

    public static void difficult() {
        int num1 = 6;
        int num2 = 5;

        if (num1 == num2) {
            System.out.println("Числа равны");
        } else if (num1 > num2) {
            System.out.println("Первое число больше второго ");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго ");
        } else {
            System.out.println("Числа не равны");
        }
    }

    public static void simple() {
        int num1 = 6;
        int num2 = 6;
        if (num1 != num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}


//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
// а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 и в том случаи,
// если пользователь ввёл какое-либо другое число программа должна отвечать „Вы ввели число не равное 1, 2 или 3“
