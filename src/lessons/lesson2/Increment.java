package lessons.lesson2;

public class Increment {

    public static void main(String[] args) {
        int i = 2;
        i++;
        System.out.println(i);

        int k = 2;
        int b = 2;
        int posfix = 2 * k++;
        System.out.println(posfix);
        System.out.println(k);

        int prefix = 2 * ++b;
        System.out.println(prefix);
    }
}
