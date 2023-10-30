package lessons.lesson13.abstractExample;

import lessons.lesson13.interfaceExample.IParts;

public class Launcher {

    public static void main(String[] args) {
        Car toyota = new Toyota("Diesel");
        aboutCar(toyota);
        toyota.getFuel();
        Car bmw = new Bmw();
        aboutCar(bmw);
        Car nissan = new Nissan("Diesel");
        aboutCar(nissan);

    }

    static void aboutCar(Car car) {
        System.out.println(
                "Макстмальная скорость автомобиля "
                        + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
