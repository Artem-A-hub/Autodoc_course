package lessons.lesson12.breakExample;

public class BreakExample {

    public static void main(String[] args) {
        breakForInnerLoop();
    }

    public static void breakForInnerLoop() {
        outer:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Я первый цикл и выполняюсь " + i + " раз");
            outer1:
            for (int a = 1; a <= 5; a++) {
                System.out.println("Я второй внутрений цикл и выполняюсь " + a + " раз");
                if (a == 2) {
                    break outer1;
                }
            }
        }

    }

    public static void breakForWhile() {
        int a = 3;
        int i = 1;

        while (i <= 5) {
            System.out.println("Цикл выполняется " + i + " раз");
            if (i == a) {
                break;
            }
            i++;
        }
    }
}
