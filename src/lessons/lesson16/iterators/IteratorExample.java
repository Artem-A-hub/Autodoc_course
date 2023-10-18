package lessons.lesson16.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            Integer nextValue = myIterator.next();
            System.out.println(nextValue);
        }
    }
}
