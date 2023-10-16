package lessons.lesson12.recursion;

public class RecursionExample {
    public static void main(String[] args) {
//        System.out.println(simpleFactorial(3));
        System.out.println(recursionFactorial(3));
    }

    public static int recursionFactorial(int x) {
        int result;
        if (x < 0) {
            return 0;
        }

        if (x < 1) {
            return 1;
        }

        result = recursionFactorial(x - 1) * x;
        return result;
    }

    public static int simpleFactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
