package pattern.pagebject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public interface ICartPage {

    default void checkingCartI(WebDriver driver) {
        String actualText = driver.findElement(By.xpath("")).getAttribute("innerText");
        Assert.assertEquals(actualText, "ExpectedText");
    }
}