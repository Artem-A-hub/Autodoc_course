package lessons.lesson14.initialblocks;

public class StaticExample {

    static String name;

    static {
        name = "Alex";
        age = 34;
        isWork = true;
    }

    public StaticExample() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    static int age;
    static boolean isWork;
}
