package lessons.lesson17.soting.comparator;

import java.util.Comparator;

public class CarComparatorByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o2.getYear(), o1.getYear());
    }
}
