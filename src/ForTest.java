import java.util.Arrays;

public class ForTest {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(changeArrays(array, 55)));

    }

    public static int[] changeArrays(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = num;

        return newArr;
    }
}



