package homeworks.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Василь", 1.2));
        students.add(new Student("Катерина", 5));
        students.add(new Student("Макс", 4.5));
        students.add(new Student("Анна", 3.0));
        students.add(new Student("Вікторія", 4.7));
        students.add(new Student("Вероніка", 1.2));
        students.add(new Student("Станіслав", 2));
        students.add(new Student("Олександр", 0.5));
        students.add(new Student("Маргарита", 4.0));
        students.add(new Student("Влада", 3.7));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Double.compare(student2.getAverageGrade(), student1.getAverageGrade());
            }
        });
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAverageGrade());
        }
    }
}
