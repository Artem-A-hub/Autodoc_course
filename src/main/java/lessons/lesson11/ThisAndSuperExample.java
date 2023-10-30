package lessons.lesson11;

public class ThisAndSuperExample {

    int value = 10;

}

class Child extends ThisAndSuperExample {
    int value = 20;

    public void print() {
        int value = 30;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);
    }
}
