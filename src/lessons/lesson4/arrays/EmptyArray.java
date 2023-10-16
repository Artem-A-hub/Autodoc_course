package lessons.lesson4.arrays;

public class EmptyArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 9;

        System.out.println(arr[arr.length - 1]);

        boolean[] names = new boolean[10];
        System.out.println(names[0]);
    }
}
