package lessons;

import java.util.List;
import java.util.Random;

public class MyStudentsList {
    public static void main(String[] args) {
        List<String> students = List.of(
//                "Anna Glovatska",
//                "Artem Avanian",
//                "Ihor Kulyomza",
//                "Kateryna Artiushenko",
//                "Kateryna Cheliadina",
//                "Konstantyn Hutsaliuk",
                "Maksym Styosov",
//                "Mykhailo Volchanov",
                "Nikita Vengrin"
        );
        System.out.println(students.get(new Random().nextInt(students.size())));

        String name = "Alex";
        name.toUpperCase();
        name = "Anna".trim();
        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Alex");
        stringBuilder.append(" 34 yeasr");

        //Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
        //Массив от 1 до 10!

    }
}
