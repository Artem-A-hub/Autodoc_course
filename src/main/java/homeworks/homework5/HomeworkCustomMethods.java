package homeworks.homework5;

public class HomeworkCustomMethods {
    public static void main(String[] args) {

        System.out.println("TASK 1");
        int result = getSmallerNumber(3, 7);
        System.out.println("Result of first method with \"if\":");
        System.out.println(result);

        int result2 = getSmallerNumberWithTernaryOperator(7, 3);
        System.out.println("Result of second method with \"Ternary Operator\":");
        System.out.println(result2);

        System.out.println("\nTASK 2");
        char symbol = '*';
        System.out.println("Result of third method, \"character matrix\":");
        outputtingCharacterMatrixToConsole(symbol);




    }

    public static int getSmallerNumber(int first, int second) {
        if (first > second) {
            return second;
        } else {
            return first;
        }
    }

    public static int getSmallerNumberWithTernaryOperator(int first, int second) {
        return first > second ? second : first;
    }

    public static void outputtingCharacterMatrixToConsole(char symbol) {
        char[][] arr = new char[3][5];
        for (char[] lines : arr) {
            for (Character columns : lines) {
                columns = symbol;
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }





}
