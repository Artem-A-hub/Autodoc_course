package lessons.lesson12.finalExample;

final class ClassFinal { //нельзя наследоваться

    public void sayHello() { // запрещает переопределение
        System.out.println("Hello");
    }

    public void sayAge() {
        System.out.println("23");
    }
}
