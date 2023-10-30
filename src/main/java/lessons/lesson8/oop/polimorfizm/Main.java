package lessons.lesson8.oop.polimorfizm;

public class Main {

    public static void main(String[] args) {
        System.out.println(add(5));

        System.out.println(add(10, 10));

        System.out.println(add(23.2, 25.5));

        System.out.println(add("Alex", 34));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a) {
        return a + 10;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, int b) {
        return a + " " + b;
    }
    
}
