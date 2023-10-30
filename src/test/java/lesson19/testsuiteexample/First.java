package lesson19.testsuiteexample;

import org.testng.annotations.Test;

public class First {

    @Test
    public void testFromFirstClass() {
        System.out.println("first test from first class. Test running in thread " + Thread.currentThread().getId());
    }

    @Test
    public void secondTestFromFirstClass() {
        System.out.println("second test from first class. Test running in thread " + Thread.currentThread().getId());
    }

    @Test
    public void thirdTestFromFirstClass() {
        System.out.println("third test from first class. Test running in thread " + Thread.currentThread().getId());
    }
}
