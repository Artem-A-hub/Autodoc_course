package lessons.lesson12.staticExample.staticChanging;

public class Launcher {

    public static void main(String[] args) {
        Car.myStatic += 20;
        System.out.println(Car.myStatic);

        Car car = new Car();
        System.out.println("Static field " + Car.myStatic);
        car.nonStatic += 20;
        System.out.println("Non static field " + car.nonStatic);


        System.out.println("-----------------------------------");


        Car car1 = new Car();
        System.out.println("Static field " + Car.myStatic);
        System.out.println("Non static field " + car1.nonStatic);
    }
}
