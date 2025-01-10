package homeworks.homework7;

public class Homework {
    public static void main(String[] args) {

        getLargerRandomNumFromArray();

    }

    public static void getLargerRandomNumFromArray() {

        int maximum = 0;
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  (int) (Math.random() * 101);
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + maximum);


    }
}
