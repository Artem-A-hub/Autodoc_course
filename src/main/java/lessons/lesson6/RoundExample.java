package lessons.lesson6;

public class RoundExample {
    public static void main(String[] args) {
        double num = 22.50;

        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));

        int  a = (int) Math.floor(num);
        System.out.println(a);
    }
}
