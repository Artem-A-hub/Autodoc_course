package lessons.lesson7;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hi, my name is Alex";
        String[] words = str.split(" ");
        System.out.println(words[words.length - 1]);
        System.out.println(words[0]);
    }


//    Написать программу, в которой создаётся целочисленный массив из 8 случайных чисел из диапозона  [0, 100]
//    и выводит максимальный элемент массива в консоль.
}
