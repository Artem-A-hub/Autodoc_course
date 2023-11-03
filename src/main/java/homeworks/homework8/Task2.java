package homeworks.homework8;



public class Task2 {
    public static void main(String[] args) {

        average(10);

    }

    public static void average(int size) {
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11) + 10;
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
}
