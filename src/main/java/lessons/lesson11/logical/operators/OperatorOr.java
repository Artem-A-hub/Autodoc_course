package lessons.lesson11.logical.operators;

public class OperatorOr {

    public static void main(String[] args) {
        int mouse = 5;
        int weight = 45;
        if (mouse > 6 | weight < 100) {
            System.out.println("Можно кормит кота! ");
        }
    }
}
