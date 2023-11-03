package homeworks.homework10;

public class Homework {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        changeWithString(data);
        changeWithChar(data);
    }

    public static void changeWithString(int[] arr) {
        String[] arrOfString = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arrOfString[i] = "Y";
            else
                arrOfString[i] = String.valueOf(arr[i]);
        }
        for (String c : arrOfString) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void changeWithChar(int[] arr) {
        char[] arrOfChar = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arrOfChar[i] = 'Y';
            else
                arrOfChar[i] = (char) ('0' + arr[i]);

        }
        for (Character c : arrOfChar) {
            System.out.print(c + " ");
        }
    }

}
