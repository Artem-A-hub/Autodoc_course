package lessons.lesson13.interfaceExample;


import static lessons.lesson13.interfaceExample.ICar.OTHER_TYPE_FUEL;

public class Launcher {
    public static void main(String[] args) {
        ICar bmw = new Bmw();
        aboutCar(bmw);
        bmw.getFuel(OTHER_TYPE_FUEL);
        bmw.partsPrice(23);
        bmw.otherMethodMethod();
    }

    static void aboutCar(ICar car) {
        System.out.println(
                "Макстмальная скорость автомобиля "
                        + car.maxSpeed());
        car.drive();
        car.brake();
    }

}
