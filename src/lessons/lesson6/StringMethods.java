package lessons.lesson6;

public class StringMethods {

    public static void main(String[] args) {
        valueOfMethod();
        lastIndexOfMethod();
        equalsIgnoreCaseMethod();
    }

    public static void valueOfMethod() {
        int num = 56234;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }

    public static void lastIndexOfMethod() {
        String str = "Hello, my name is Alex";
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
    }

    public static void equalsIgnoreCaseMethod() {
        String str = "Hello, my name is Alex";

        if (str.equals("Hello, my name is ALEX")) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }

        if (str.equalsIgnoreCase("Hello, my name is ALEX")) {
            System.out.println("OK with Ignore Case");
        } else {
            System.out.println("Fail");
        }
    }
}


