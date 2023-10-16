package lessons.lesson9.override;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("May may");
    }

    public void voice(String str) {
        System.out.println(str);
    }
}
