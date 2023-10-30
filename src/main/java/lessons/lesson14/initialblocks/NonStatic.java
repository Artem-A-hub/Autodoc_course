package lessons.lesson14.initialblocks;

public class NonStatic {

    String name;

    {
        name = "Alex";
        age = 34;
        isWork = true;
    }

    public NonStatic() {

    }

    public NonStatic(String name, int age, boolean isWork) {
        this.name = name;
        this.age = age;
        this.isWork = isWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    int age;
    boolean isWork;
}
