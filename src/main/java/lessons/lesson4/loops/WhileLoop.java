package lessons.lesson4.loops;

public class WhileLoop {
    public static void main(String[] args) {
        doWhileExample();

    }

    public static void doWhileExample() {
        int i = 1;
        do {
            System.out.println("Я выполнюсь " + i + " раз");
            i++;
        } while (i < 8);
    }

    public static void whileExample() {
        int i = 1;
        while (i <= 8) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void whileReverse() {
        int i = 100;
        while (i >= 10) {
            System.out.println("Обратный отсчет " + i);
            i -= 10;
        }
    }
}

