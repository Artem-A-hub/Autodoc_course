package lessons.lesson9.override;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Gav gav");
    }
    public void aboutDog() {
        eat();
    }
}
