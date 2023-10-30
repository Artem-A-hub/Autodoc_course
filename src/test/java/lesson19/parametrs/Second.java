package lesson19.parametrs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Second {

    @Parameters({"user", "password"})
    @Test
    public void testFromSecondClass(String user, String password) {
        System.out.println("first test from second class. Test running in thread " + Thread.currentThread().getId());
        System.out.println(user);
        System.out.println(password);
    }
}
