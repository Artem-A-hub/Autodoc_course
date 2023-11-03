package homeworks.homework13;

public class Task {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findLuckyNumber(arr);
    }

    public static void findLuckyNumber(int[] arr) {
        for(int num : arr){
            if(num == 3){
                System.out.println(num + " - Вот счастливое число!");
                break;
            }
        }
    }
}
