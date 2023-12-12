package homework30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        // Создайте список объектов класса Person.
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 28),
                new Person("David", 26)
        );

        // a. Отфильтруйте людей старше 25 лет.
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());

        // b. Отсортируйте результат по имени в алфавитном порядке.
        filteredPeople.sort((person1, person2) -> person1.getName().compareTo(person2.getName()));

        // c. Преобразуйте каждый объект Person в строку в формате "Имя - Возраст" с использованием map.
        List<String> formattedStrings = filteredPeople.stream()
                .map(Person::toString)
                .collect(Collectors.toList());

        // d. Выведите полученные строки в консоль.
        formattedStrings.forEach(System.out::println);
    }
}