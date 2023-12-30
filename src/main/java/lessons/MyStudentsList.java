package lessons;

import java.util.List;
import java.util.Random;

public class MyStudentsList {
    public static void main(String[] args) {
        List<String> students = List.of(
                "Anna Glovatska",
                "Artem Avanian",
                "Ihor Kulyomza",
                "Kateryna Artiushenko",
                "Kateryna Cheliadina",
                "Konstantyn Hutsaliuk",
                "Maksym Styosov",
                "Mykhailo Volchanov",
                "Nikita Vengrin"
        );
        System.out.println(students.get(new Random().nextInt(students.size())));
    }
}