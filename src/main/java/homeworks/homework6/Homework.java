package homeworks.homework6;

public class Homework {

    public static void main(String[] args) {
        getPyramidOfSymbol(5, '*');
        getInfoCompletedTasks(3);
    }

    public static void getPyramidOfSymbol(int height, char symbol) {
        if (height > 0) {
            for (int i = 0; i < height; i++) {
                for (int j = 1; j < height - i; j++) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= i + 1; y++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        }
    }

    public static void getInfoCompletedTasks(int numberOfTask) {
        System.out.println();
        if (numberOfTask > 0) {
            for (int i = 1; i <= numberOfTask; i++) {
                String numTask = "Это " + i + "-й урок!";
                String numOfTask = i + "-го урока.";
                String statusOfСomplet;


                if (i < numberOfTask) {
                    statusOfСomplet = "выполнил все";
                } else {
                    statusOfСomplet = "не выполнил";
                }

                System.out.println(numTask);
                System.out.println("       Я " + statusOfСomplet + " домашние задания " + numOfTask);

            }

        }
    }

}
