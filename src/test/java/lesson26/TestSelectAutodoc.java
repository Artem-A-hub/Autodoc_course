package lesson26;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class TestSelectAutodoc extends InitialWebDriver {
    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));                     //закрывает попап кук на Autodoc
        WebElement cookiesNotification = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if (cookiesNotification.isDisplayed()) {
            cookiesNotification.click();
        }
        WebElement makerList = driver.findElement(By.id("form_maker_id"));
        WebElement makerListOption = driver.
                findElement(By.xpath("//select[@id='form_maker_id']/optgroup[2]/option[@value=2]"));

        makerList.click();
        makerListOption.click();

        sleep(5000);
    }
}