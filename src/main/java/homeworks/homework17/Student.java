package homeworks.homework17;

public class Student {
    public String name;
    public double averageGrade;
    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }
    public String getName() {
        return name;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
}