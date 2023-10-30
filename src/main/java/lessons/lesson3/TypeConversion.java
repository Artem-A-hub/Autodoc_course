package lessons.lesson3;

public class TypeConversion {

    public static void main(String[] args) {
        implicit();
        explicit();
        doubleToInt();
    }

    public static void doubleToInt() {
        double a = 128.233;
        int b = (int) a;
        System.out.println(b);
    }

    public static void explicit() {
        int a = 128;
        byte b = (byte) a;
        System.out.println(b);
    }

    public static void implicit() {
        byte a = 127;
        int b = a;
        System.out.println(b);
    }
}
