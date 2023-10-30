package lessons.lesson14.innerclasses.anonymous;

public class Launcher {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String helloMessage() {
                return "Hello guys";
            }
        });
    }
}
