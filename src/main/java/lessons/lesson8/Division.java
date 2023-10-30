package lessons.lesson8;

public class Division {

    public static void main(String[] args) {
        divisionExample2();
    }

    public static void divisionExample2() {
        int year = 2013;
        int divisionResult = year % 100;
        System.out.println(divisionResult);

    }
    public static void divisionExample() {
        // 9 - 4 = 5 - 4 = 1
        int a = 9;
        int b = 4;
        System.out.println(a % b);
    }
}
