package lessons.lesson7.switchexample;

public class SwitchWithJava12 {

    public static void main(String[] args) {
        String month = switchWithString(3);
        System.out.println(month);
    }

    public static String switchWithString(int month) {
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3, 4 -> "Март";
            default -> "Неизвестный месяц";
        };
    }
}
