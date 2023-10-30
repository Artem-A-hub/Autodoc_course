package lessons.lesson11.constructors;

public class Launch {

    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "6");
        animal.sayAnimalName();
        animal.sayAge();

        Animal animal1 = new Animal("dog", "15");
        animal1.sayAnimalName();

        Animal animal2 = new Animal();
        animal2.animalCountry();

    }
}
