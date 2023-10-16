package lessons.lesson12.finalExample;

public class SomeClass extends MethodFinal {

    @Override
    public void sayAge() {
        super.sayAge();
    }


    public void aboutPerson() {
        sayAge();
        sayHello();
    }

}
