package lessons.lesson6;

public class ClassWrapper {
    public static void main(String[] args) {
        int num = parseStringToInt();
        int sum = num + 10;
        System.out.println(sum);
    }

    public static int parseStringToInt() {
        String num = "1000";
        return Integer.parseInt(num);
    }
}
