package homeworks.homework4;

public class HomeworkMultiplication {

    public static void main(String[] args) {

        //TaskСonsoleСalculator 4
        int initialVariable = 1;
        int multiplicationVariable = 2;
        int maximum = (int) Math.pow(multiplicationVariable, 9);

        multiplicationByVariable(initialVariable,
                multiplicationVariable,
                maximum);
        System.out.println();


        //Task5
        int multiplicationTableVariable = 3;

        displayingTheMultiplicationTableOfVariable(
                multiplicationTableVariable);

    }

    /**
     * вывод последовательности чисел с помощью цикла while
     * метод умножения на какое-то число для выполнения таска 4
     */
    public static void multiplicationByVariable(int start, int multiplicationVariable, int max) {

        while (start <= max) {
            System.out.print(start + " ");
            start *= multiplicationVariable;
        }
    }

    /**
     * метод для таска 5 вывод таблицы умножения циклом for
     */
    public static void displayingTheMultiplicationTableOfVariable(int multiplicationVariable) {
        for (int i = 1; i <= 10; i++) {
            int multiplicationResult = multiplicationVariable * i;
            System.out.println(multiplicationVariable + "*" + i + "=" + multiplicationResult);
        }
    }
}
