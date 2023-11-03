package homeworks.homework12;

public class Task {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;
        printArray(changeArray(arr, num));
    }

    public static int[] changeArray(int[] arr, int num) {

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                newArray[i] = num;
            } else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
