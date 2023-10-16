package lessons.lesson11;

public class ThisExample {

    int num = 20;

    public void example() {
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
    }
}
