package lessons.lesson13.abstractExample;

abstract class Car {

    private String typeFuel;

    public Car(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    void getFuel() {
        System.out.println(this.typeFuel);
    }
}
