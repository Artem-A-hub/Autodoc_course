package lesson28;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test(enabled = false)
    public void testWithoutSoftAssert() {
        System.out.println("Test started");
        Assert.assertEquals(5, 4, "First hard assert failed");
        System.out.println("First hard assert success");
        Assert.assertEquals("Hello", "Hello", "Second hard assert");
        System.out.println("End of test");
    }

    @Test
    public void testWithSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test started");
        softAssert.assertEquals(5, 4, "First hard assert failed");
        System.out.println("First hard assert success");
        softAssert.assertEquals("Hello", "Hello", "Second hard assert");
        System.out.println("End of test");
        softAssert.assertAll();
    }
}