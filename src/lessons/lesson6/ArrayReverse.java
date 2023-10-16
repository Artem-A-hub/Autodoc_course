package lessons.lesson6;

public class ArrayReverse {

    public static void main(String[] args) {
        arrRev();
    }

    public static void arrRev() {
        String[] arr = {"Каждый", "охитник", "хочет", "знать", "где", "сидит", "фазан"};
        int arrLen = arr.length;

        String temp;
        //length/2
        //a-i-1

        for (int i = 0; i < arrLen / 2; i++) { // 3 итерации
            temp = arr[arrLen - i - 1];// temp = arr[6] = фазан
            arr[arrLen - i - 1] = arr[i];// arr[6] = arr[0] фазан = Каждый
            arr[i] = temp; // arr[0] = temp
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
